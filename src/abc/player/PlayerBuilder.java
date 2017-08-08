package abc.player;

import abc.music.*;
import abc.sound.Pitch;
import abc.sound.SequencePlayer;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class PlayerBuilder {
    private final Header header;
    private final Body body;
    private final int ticksPerBeat;

    private SequencePlayer player = null;
    //The starting tick for the next MeasureElement
    private int nextTick = 0;
    //The last tick played (may be later than starting tick if notes overlap)
    private int lastTick = 0;

    PlayerBuilder(Header header, Body body, int ticksPerBeat) {
        this.header = header;
        this.body = body;
        this.ticksPerBeat = ticksPerBeat;
        try {
            this.player = new SequencePlayer(header.getTempo().getBeatsPerMinute(), ticksPerBeat);
        } catch (MidiUnavailableException | InvalidMidiDataException e) {
            e.printStackTrace();
        }

        buildPlayer();
    }

    public SequencePlayer getPlayer() {
        return player;
    }
    
    public Header getHeader() {
    	return header;
    }

    private void buildPlayer() {
        for (Section section : body.getSections()) {
            nextTick = buildSection(section, nextTick);
        }
    }

    private int buildSection(Section section, int nextTick) {
        for (SectionElement element : section.getElements()) {
            switch(element.getType()) {
                case VOICEPART:
                    int voicePartTick = buildVoicePart((VoicePart) element, nextTick);
                    break;
                case REPEAT:
                    nextTick = buildRepeat((Repeat) element, nextTick);
                    break;
                case LINE:
                    nextTick = buildLine((Line) element, nextTick);
                    break;
            }
        }
        return nextTick;
    }

    private int buildVoicePart(VoicePart voicePart, int nextTick) {
        for (VoicePartElement element : voicePart.getElements()) {
            switch(element.getType()) {
                case REPEAT:
                    nextTick = buildRepeat((Repeat) element, nextTick);
                    break;
                case LINE:
                    nextTick = buildLine((Line) element, nextTick);
                    break;
            }
        }
        return nextTick;
    }

    private int buildRepeat(Repeat repeat, int nextTick) {
        if (repeat.hasEndings()) {
            for (Line ending : repeat.getEndings()) {
                for (Line repeated : repeat.getRepeatedLines()) {
                    nextTick = buildLine(repeated, nextTick);
                }
                nextTick = buildLine(ending, nextTick);
            }
        } else {
            for (int i = 0; i < 2; i++) {
                for (Line repeated : repeat.getRepeatedLines()) {
                    nextTick = buildLine(repeated, nextTick);
                }
            }
        }

        return nextTick;
    }

    private int buildLine(Line line, int nextTick) {
        for (Measure measure : line.getMeasures()) {
            nextTick = buildMeasure(measure, nextTick);
        }
        return nextTick;
    }

    private int buildMeasure(Measure measure, int nextTick) {
        for (MeasureElement element : measure.getElements()) {
            switch(element.getType()) {
                case TUPLET:
                    nextTick = buildTuplet((Tuplet) element, nextTick);
                    break;
                case CHORD:
                    nextTick = buildChord((Chord) element, nextTick);
                    break;
                case NOTE:
                    nextTick = buildNote((Note) element, nextTick);
                    break;
                case REST:
                    nextTick = buildRest((Rest) element, nextTick);
                    break;
            }
        }
        return nextTick;
    }

    private int buildTuplet(Tuplet tuplet, int nextTick) {
        for (TupletElement element : tuplet.getElements()) {
            switch (element.getType()) {
                case CHORD:
                    nextTick = buildChord((Chord) element, nextTick, tuplet.getSpecMultiplier());
                    break;
                case NOTE:
                    nextTick = buildNote((Note) element, nextTick, tuplet.getSpecMultiplier());
                    break;
                case REST:
                    nextTick = buildRest((Rest) element, nextTick, tuplet.getSpecMultiplier());
                    break;
            }
        }
        return nextTick;
    }

    private int buildChord(Chord chord, int nextTick) {
        for (Note note : chord.getNotes()) {
            buildNote(note, nextTick);
        }
        nextTick += getNoteTicks(chord.getLength());
        updateLastTick(nextTick);
        return nextTick;
    }

    private int buildChord(Chord chord, int nextTick, NoteLength tupletSpecMultiplier) {
        for (Note note : chord.getNotes()) {
            buildNote(note, nextTick, tupletSpecMultiplier);
        }

        nextTick += getNoteTicks(chord.getLength(), tupletSpecMultiplier);

        updateLastTick(nextTick);
        return nextTick;
    }

    private int buildNote(Note note, int nextTick) {
        int numTicks = getNoteTicks(note.getLength());

        player.addNote(buildPitch(note.getPitch(), header.getKey()).toMidiNote(), nextTick, numTicks);

        nextTick += numTicks;
        updateLastTick(nextTick);

        return nextTick;
    }

    private int buildNote(Note note, int nextTick, NoteLength tupletSpecMultiplier) {
        int numTicks = getNoteTicks(note.getLength(), tupletSpecMultiplier);

        player.addNote(buildPitch(note.getPitch(), header.getKey()).toMidiNote(), nextTick, numTicks);

        nextTick += numTicks;
        updateLastTick(nextTick);

        return nextTick;
    }

    private int buildRest(Rest rest, int nextTick) {

        nextTick += getNoteTicks(rest.getLength());
        updateLastTick(nextTick);

        return nextTick;
    }

    private int buildRest(Rest rest, int nextTick, NoteLength tupletSpecMultiplier) {
        nextTick += getNoteTicks(rest.getLength(), tupletSpecMultiplier);
        updateLastTick(nextTick);

        return nextTick;
    }

    private void updateLastTick(int nextTick) {
        if (lastTick < nextTick-1) {
            lastTick = nextTick-1;
        }
    }

    private int getNoteTicks(NoteLength parsed) {
        //numTicks = ticksPerBeat * (NoteLength * DefaultNoteLength / BeatLength)
        double working = parsed.getNoteLength() * header.getLength().getDefaultNoteLength();
        working = working/header.getTempo().getBeatLength().getNoteLength();
        int numTicks = (int) (working*ticksPerBeat);
        return numTicks;
    }

    private int getNoteTicks(NoteLength parsed, NoteLength tupletSpecMultiplier) {
        NoteLength length = new NoteLength(parsed.getNumerator() * tupletSpecMultiplier.getNumerator(), parsed
                .getDenominator() * tupletSpecMultiplier.getDenominator());
        return getNoteTicks(length);
    }

    private Pitch buildPitch(abc.music.Pitch parsed, abc.music.Key key) {
        abc.music.Pitch actual = key.getPitch(parsed);
        Pitch pitch = new Pitch(actual.getBaseNoteChar());
        pitch = pitch.transpose(actual.getSemitonesUp());
        return pitch;
    }
}

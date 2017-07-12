package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Adapted from https://ocw.mit.edu/ans7870/6/6.005/s16/projects/abcplayer/spec/
 * <p>
 * One or more notes may be played simultaneously in a chord. In abc, a chord is denoted by a group of notes between
 * square brackets ( [ and ] ): [CEG] Notes within a chord may be embellished with an accidental or a multiplicative
 * factor. If the notes in a chord have different durations, the duration of the chord is determined by the duration of
 * the first note specified in the chord. For example, in [C2E4]G2 , there would first be an E note and a C note playing
 * together, and then an E note and a G note playing together.
 * <p>
 * A chord may not contain any rests or tuplets.
 * <p>
 * The chord forms a syntactic grouping, to which the same prefixes and postfixes can be attached as to an ordinary note
 * (except for accidentals which should be attached to individual notes within the chord and decorations which may be
 * attached to individual notes within the chord.  When both inside and outside the chord length modifiers are used,
 * they should be multiplied. Example: [C2E2G2]3 has the same meaning as [CEG]6.
 */
public class Chord implements TupletElement {
    private final List<Note> notes;
    private final NoteLength length;

    public Chord(List<Note> notes, NoteLength length) {
        this.notes = Collections.unmodifiableList(new ArrayList<>(notes));
        this.length = length;

        checkRep();
    }

    public NoteLength getLength() {
        return length;
    }

    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Chord that = (Chord) obj;

        if (!notes.equals(that.notes)) return false;
        return length.equals(that.length);
    }

    @Override
    public int hashCode() {
        int result = notes.hashCode();
        result = 31 * result + length.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (Note n : notes) {
            result.append(n.toString());
        }
        result.append("]");
//        if (length != null) {
//            result.append(length.toString());
//        }
        return result.toString();
    }

    private void checkRep() {
        assert this.notes != null;
        assert this.notes.size() > 0;
        for (Note n : this.notes) {
            assert n != null;
        }
        assert this.length != null;
    }

    @Override
    public Components getType() {
        return Components.CHORD;
    }
}
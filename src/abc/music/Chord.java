package abc.music;

import java.util.Arrays;

/**
 * Adapted from https://ocw.mit.edu/ans7870/6/6.005/s16/projects/abcplayer/spec/
 *
 * One or more notes may be played simultaneously in a chord. In abc, a chord is denoted by a group of notes between
 * square brackets ( [ and ] ):
 *  [CEG]
 * Notes within a chord may be embellished with an accidental or a multiplicative factor.
 * If the notes in a chord have different durations, the duration of the chord is determined by the duration of the
 * first note specified in the chord. For example, in [C2E4]G2 , there would first be an E note and a C note playing together, and then an E note and a G note playing together.
 *
 * A chord may not contain any rests or tuplets.
 *
 * The chord forms a syntactic grouping, to which the same prefixes and postfixes can be attached as to an ordinary
 * note (except for accidentals which should be attached to individual notes within the chord and decorations which
 * may be attached to individual notes within the chord.  When both inside and outside the chord length modifiers are
 * used, they should be multiplied. Example: [C2E2G2]3 has the same meaning as [CEG]6.
 */
public class Chord implements TupletElement {
    private final Note[] notes;
    private final NoteLength length;

    public Chord(Note[] notes, NoteLength length) {
        this.notes = notes;
        this.length = length;
    }

    public NoteLength getLength() {
        return length;
    }

    public Note[] getNotes() {
        return Arrays.copyOf(notes, notes.length);
    }

    @Override
    public String toString() {
        String result = "[";
        for (Note n : notes) {
            result = result + n.toString();
        }
        result = result + "]";
        if(length != null) {
            result = result + length.toString();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Chord) {
            Chord that = (Chord) obj;
            if (!this.length.equals(that.length)) {
                return false;
            }
            if(this.notes.length == that.notes.length) {
                for (int i = 0; i < notes.length; i++) {
                    if (!this.notes[i].equals(that.notes[i])) {
                        return false;
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(notes);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        return result;
    }
}
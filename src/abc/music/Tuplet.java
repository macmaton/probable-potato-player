package abc.music;

import java.util.Arrays;

/**
 * Adapted from https://ocw.mit.edu/ans7870/6/6.005/s16/projects/abcplayer/spec/
 *
 * Immutable data type to represent a tuplet in abc notation.
 *
 * Duplet: 2 notes in the time of 3 notes
 * Triplet: 3 notes in the time of 2 notes
 * Quadruplet: 4 notes in the time of 3 notes
 *
 * For example, a triplet that contains three eighth notes is equal in duration to one quarter note; therefore, each
 * eighth note in the triplet should be played 2/3 the duration of a standard eighth note.
 *
 * TODO: A tuplet may contain chords.
 *
 * TODO: A tuplet may have notes and chords of different lengths.
 *  In the case of a triplet, you should play each note or chord for 2/3 of the original duration. For a duplet, 3/2
 *  of the original durations. And for a quadruplet, 3/4 of the original durations.
 */
public class Tuplet {
    private final int spec;
    private final Note[] notes;

    public Tuplet(int spec, Note[] notes) {
        this.spec = spec;
        this.notes = notes;
        checkRep();
    }

    public int getSpec() {
        return spec;
    }

    // returns array of notes, such that the returned object does not expose the rep to mutation
    /**
     * @return an array of notes in the tuplet
     */
    public Note[] getNotes() {
        return Arrays.copyOf(notes, spec);
    }

    @Override
    public int hashCode() {
        int hashCode = spec;
        for (int i = 0; i < notes.length; i++) {
            hashCode += (7^i) * notes[i].hashCode();
        }
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Tuplet) {
            Tuplet that = (Tuplet) obj;
            boolean result = this.spec == that.spec;
            if(result) {
                for (int i = 0; i < notes.length; i++) {
                    result = result && (this.notes[i].equals(that.notes[i]));
                }
            }
            return result;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "(" + String.valueOf(spec);
        for (Note n : notes) {
            result += n.toString();
        }
//        result += " "; //TODO: haven't decided if white space should be part of toString() for individual elements
        return result;
    }

    private void checkRep() {
        assert spec == notes.length;
    }
}

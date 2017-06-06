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
 * A tuplet may contain chords.
 *
 * A tuplet may have notes and chords of different lengths.
 *
 * In the case of a triplet, you should play each note or chord for 2/3 of the original duration. For a duplet, 3/2
 * of the original durations. And for a quadruplet, 3/4 of the original durations.
 */
public class Tuplet implements MeasureElement {
    private final int spec;
    private final TupletElement[] elements;

    public Tuplet(int spec, TupletElement[] elements) {
        this.spec = spec;
        this.elements = elements;
        checkRep();
    }

    public int getSpec() {
        return spec;
    }

    /**
     * @return an array of notes in the tuplet
     */
    public TupletElement[] getElements() {
        return Arrays.copyOf(elements, spec);
    }

    @Override
    public int hashCode() {
        int result = spec;
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Tuplet) {
            Tuplet that = (Tuplet) obj;
            boolean result = this.spec == that.spec;
            if (result) {
                for (int i = 0; i < elements.length; i++) {
                    result = result && (this.elements[i].equals(that.elements[i]));
                }
            }
            return result;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("(" + String.valueOf(spec));
        for (TupletElement e : elements) {
            result.append(e.toString());
        }
        return result.toString();
    }

    private void checkRep() {
        assert elements != null;
        assert elements.length > 0;
        for (TupletElement e : elements) {
            assert e != null;
        }
    }
}

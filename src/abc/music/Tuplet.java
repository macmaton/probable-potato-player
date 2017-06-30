package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Adapted from https://ocw.mit.edu/ans7870/6/6.005/s16/projects/abcplayer/spec/
 * <p>
 * Immutable data type to represent a tuplet in abc notation.
 * <p>
 * Duplet: 2 notes in the time of 3 notes
 * Triplet: 3 notes in the time of 2 notes
 * Quadruplet: 4 notes in the time of 3 notes
 * <p>
 * For example, a triplet that contains three eighth notes is equal in duration to one quarter note; therefore, each
 * eighth note in the triplet should be played 2/3 the duration of a standard eighth note.
 * <p>
 * A tuplet may contain chords.
 * <p>
 * A tuplet may have notes and chords of different lengths.
 * <p>
 * In the case of a triplet, you should play each note or chord for 2/3 of the original duration. For a duplet, 3/2
 * of the original durations. And for a quadruplet, 3/4 of the original durations.
 */
public class Tuplet implements MeasureElement {
    private final int spec;
    private final List<TupletElement> elements;

    public Tuplet(int spec, List<TupletElement> elements) {
        this.spec = spec;
        this.elements = Collections.unmodifiableList(new ArrayList<>(elements));
        checkRep();
    }

    public int getSpec() {
        return spec;
    }

    /**
     * @return an array of notes in the tuplet
     */
    public List<TupletElement> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Tuplet that = (Tuplet) obj;

        if (spec != that.spec) return false;
        return elements.equals(that.elements);
    }

    @Override
    public int hashCode() {
        int result = spec;
        result = 31 * result + elements.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("(" + String.valueOf(spec));
        for (TupletElement e : elements) {
            result.append(e.toString());
        }
        result.append(" ");
        return result.toString();
    }

    private void checkRep() {
        assert elements != null;
        assert elements.size() > 0;
        for (TupletElement e : elements) {
            assert e != null;
        }
    }

    @Override
    public Components getType() {
        return Components.TUPLET;
    }
}

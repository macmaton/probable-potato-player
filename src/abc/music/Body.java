package abc.music;

import java.util.Arrays;

/**
 * An immutable data type representing the body of a piece of music in abc notation
 * limited implementation based on Spring 2016 version of MIT OCW 6.005
 */
public class Body {
    private final BodyElement[] elements;

    public Body(BodyElement[] elements) {
        this.elements = elements;

        checkRep();
    }

    public BodyElement[] getElements() {
        return Arrays.copyOf(elements, elements.length);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        Body that = (Body) obj;

        return Arrays.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (BodyElement e : elements) {
            result.append(e.toString());
        }
        return result.toString();
    }

    private void checkRep() {
        assert this.elements != null;
        assert this.elements.length > 0;
        for (BodyElement e : this.elements) {
            assert e != null;
        }
    }
}
package abc.music;

import java.util.Arrays;

public class Measure {

    private final MeasureElement[] elements;

    public Measure(MeasureElement[] elements) {
        this.elements = elements;
    }

    public MeasureElement[] getElements() {
        return Arrays.copyOf(elements, elements.length);
    }

    //TODO: toString adds leading and ending spaces as well as spaces between elements.
    // Should there be more sophisticated logic regarding String format for Measures?
    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        for (MeasureElement e : elements) {
            result.append(e.toString() + " ");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Measure) {
            Measure that = (Measure) obj;
            if (this.elements.length == that.elements.length) {
                for (int i = 0; i < elements.length; i++) {
                    if (!this.elements[i].equals(that.elements[i])) {
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
        return Arrays.hashCode(elements);
    }

    private void checkRep() {
        assert elements != null;
    }
}

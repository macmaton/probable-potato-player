package abc.music;

import java.util.Arrays;

public class Section implements BodyElement {
    private final SectionElement[] elements;

    public Section(SectionElement[] elements) {
        this.elements = elements;
        checkRep();
    }

    public SectionElement[] getElements() {
        return Arrays.copyOf(elements, elements.length);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Section) {
            Section that = (Section) obj;
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

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (BodyElement e : elements) {
            result.append(e.toString()).append("|");
        }
        result.append("]");
        return result.toString();
    }

    private void checkRep() {
        assert this.elements != null;
        assert this.elements.length != 0;
    }
}

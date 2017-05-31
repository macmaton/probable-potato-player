package abc.music;

import java.util.Arrays;

public class Section implements BodyElement {
    private final BodyElement[] elements;

    public Section(BodyElement[] elements) {
        this.elements = elements;
    }

    public BodyElement[] getElements() {
        return Arrays.copyOf(elements, elements.length);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for(BodyElement e : elements) {
            result.append(e.toString() + "|");
        }
        result.append("]");
        return result.toString();
    }
}

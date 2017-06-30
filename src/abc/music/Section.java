package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Section implements BodyElement {
    private final List<SectionElement> elements;

    public Section(List<SectionElement> elements) {
        assert elements != null;
        this.elements = Collections.unmodifiableList(new ArrayList<>(elements));
        checkRep();
    }

    public List<SectionElement> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Section that = (Section) obj;

        return this.elements.equals(that.elements);
    }

    @Override
    public int hashCode() {
        return elements.hashCode();
    }


    public String toString() {
        StringBuilder result = new StringBuilder("\n");
        for (BodyElement e : elements) {
            result.append(e.toString());
            result.append("\n");
        }
        result.deleteCharAt(result.length()-1);
        if (result.lastIndexOf("|") != result.length()-1) {
            result.append("|");
        }
        result.append("]");
        return result.toString();
    }

    private void checkRep() {
        assert this.elements != null;
        assert this.elements.size() > 0;
        for (SectionElement e : this.elements) {
            assert e != null;
        }
    }

    @Override
    public Components getType() {
        return Components.SECTION;
    }
}

package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Measure implements RepeatElement {

    private final List<MeasureElement> elements;

    public Measure(List<MeasureElement> elements) {
        this.elements = Collections.unmodifiableList(new ArrayList<>(elements));
        checkRep();
    }

    public List<MeasureElement> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Measure that = (Measure) obj;

        return elements.equals(that.elements);
    }

    @Override
    public int hashCode() {
        return elements.hashCode();
    }

    public String toString() {
        StringBuilder result = new StringBuilder(" ");
        for (MeasureElement e : elements) {
            result.append(e.toString());
            if (e.getType().equals(Components.TUPLET) || e.getType().equals(Components.CHORD)) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    private void checkRep() {
        assert this.elements != null;
        assert this.elements.size() > 0;
        for (MeasureElement e : this.elements) {
            assert e != null;
        }
    }

    @Override
    public Components getType() {
        return Components.MEASURE;
    }
}

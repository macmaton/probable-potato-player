package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An immutable data type representing the body of a piece of music in abc notation
 * limited implementation based on Spring 2016 version of MIT OCW 6.005
 */
public class Body implements Music {
    private final List<BodyElement> elements;

    public Body(List<BodyElement> elements) {
        assert elements != null && elements.size() > 0;
        this.elements = Collections.unmodifiableList(new ArrayList<>(elements));
        checkRep();
    }

    public List<BodyElement> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Body that = (Body) obj;

        return this.elements.equals(that.elements);
    }

    @Override
    public int hashCode() {
        return elements.hashCode();
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
        assert this.elements.size() > 0;
        for (BodyElement e : this.elements) {
            assert e != null;
        }
    }

    @Override
    public Components getType() {
        return Components.BODY;
    }
}
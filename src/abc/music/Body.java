package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An immutable data type representing the body of a piece of music in abc notation
 * limited implementation based on Spring 2016 version of MIT OCW 6.005
 */
public class Body implements Music {
    private final List<Section> sections;

    public Body(List<Section> sections) {
        assert sections != null && sections.size() > 0;
        this.sections = Collections.unmodifiableList(new ArrayList<>(sections));
        checkRep();
    }

    public List<Section> getSections() {
        return sections;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Body that = (Body) obj;

        return this.sections.equals(that.sections);
    }

    @Override
    public int hashCode() {
        return sections.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Section s : sections) {
            result.append(s.toString());
        }
        return result.toString();
    }

    private void checkRep() {
        assert this.sections != null;
        assert this.sections.size() > 0;
        for (BodyElement e : this.sections) {
            assert e != null;
        }
    }

    @Override
    public Components getType() {
        return Components.BODY;
    }
}
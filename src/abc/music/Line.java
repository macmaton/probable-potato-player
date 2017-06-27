package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Line implements VoicePartElement, RepeatElement {
    private final List<Measure> measures;

    public Line(List<Measure> measures) {
        if (measures != null && measures.size() > 0) {
            this.measures = Collections.unmodifiableList(new ArrayList<>(measures));
        } else {
            throw new IllegalArgumentException("measures must be initialized and have size greater than 0");
        }
        checkRep();
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Line that = (Line) obj;

        return this.measures.equals(that.measures);
    }

    @Override
    public int hashCode() {
        return measures.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (Measure m : measures) {
            result.append(m.toString());
            if (measures.indexOf(m) < measures.size()-1) {
                if (!result.substring(result.length()-1).equals(" ")) {
                    result.append(" ");
                }
                result.append("|");
            }
        }
        return result.toString();
    }

    public void checkRep() {
        assert this.measures != null;
        assert this.measures.size() > 0;
        for (Measure m : this.measures) {
            assert m != null;
        }
    }

    @Override
    public Components getType() {
        return Components.LINE;
    }
}

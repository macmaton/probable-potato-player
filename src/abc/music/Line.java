package abc.music;

import java.util.Arrays;

public class Line implements VoicePartElement, RepeatElement {
    private final Measure[] measures;

    public Line(Measure[] measures) {
        this.measures = measures;
        checkRep();
    }

    public Measure[] getMeasures() {
        return Arrays.copyOf(measures, measures.length);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(measures);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Line) {
            Line that = (Line) obj;
            if (this.measures.length == that.measures.length) {
                for (int i = 0; i < measures.length; i++) {
                    if (!this.measures[i].equals(that.measures[i])) {
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
    public String toString() {
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < measures.length; i++) {
            result.append(measures[i].toString());
            if (i < measures.length - 1) {
                result.append("|");
            }
        }
        return result.toString();
    }

    public void checkRep() {
        assert this.measures != null;
        assert this.measures.length > 0;
        for (Measure m : this.measures) {
            assert m != null;
        }
    }

    @Override
    public Components getType() {
        return Components.LINE;
    }
}

package abc.music;

import java.util.Arrays;

public class Line implements BodyElement {
    //TODO: representation of Line
    private final Measure[] measures;
    private final Voice voice;

    public Line(Voice voice, Measure[] measures) {
        this.voice = voice;
        this.measures = measures;
    }

    public Voice getVoice() {
        return voice;
    }

    public Measure[] getMeasures() {
        return Arrays.copyOf(measures, measures.length);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(voice.toString() + "\n");
        for (int i = 0; i < measures.length; i++) {
            result.append(measures[i].toString());
            if (i < measures.length-1) {
                result.append("|");
            }
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Line) {
            Line that = (Line) obj;
            if ((this.voice == null && that.voice == null) || (this.voice != null && this.voice.equals(that.voice))) {
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
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(measures);
        result = 31 * result + (voice != null ? voice.hashCode() : 0);
        return result;
    }
}

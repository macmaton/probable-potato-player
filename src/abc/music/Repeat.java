package abc.music;

import java.util.Arrays;

public class Repeat implements BodyElement {
    private final Line[] repeatedLines;
    private final Line[] endings;

    public Repeat(Line[] repeatedLines, Line[] endings) {
        this.repeatedLines = repeatedLines;
        this.endings = endings;
    }

    public Line[] getRepeatedLines() {
        return Arrays.copyOf(repeatedLines, repeatedLines.length);
    }

    public Line[] getEndings() {
        return Arrays.copyOf(endings, endings.length);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Line r : repeatedLines) {
            result.append(r);
        }
        if (endings != null) {
            result.append("|[1" + endings[0].toString() + ":|");
            for(int i = 1; i < endings.length; i++) {
                result.append("[" + (i+1) + endings[i].toString());
            }
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Repeat) {
            Repeat that = (Repeat) obj;
            if (this.repeatedLines.length == that.repeatedLines.length) {
                for (int i = 0; i < repeatedLines.length; i++) {
                    if (!this.repeatedLines[i].equals(that.repeatedLines[i])) {
                        return false;
                    }
                }
                if (this.endings == null && that.endings == null) {
                    return true;
                } else if (this.endings.length == that.endings.length) {
                    for (int i = 0; i < endings.length; i++) {
                        if (!this.endings[i].equals(that.endings[i])) {
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
        int result = Arrays.hashCode(repeatedLines);
        result = 31 * result + Arrays.hashCode(endings);
        return result;
    }
}

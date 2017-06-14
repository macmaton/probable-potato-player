package abc.music;

import java.util.Arrays;

public class Repeat implements VoicePartElement {
    private final RepeatElement[] repeatedLines;
    private final RepeatElement[] endings;

    /**
     * @param repeatedLines nullable
     * @param endings nullable
     */
    public Repeat(RepeatElement[] repeatedLines, RepeatElement[] endings) {
        this.repeatedLines = repeatedLines;
        this.endings = endings;
        checkRep();
    }

    public Repeat(RepeatElement[] repeatedLines) {
        this(repeatedLines, new RepeatElement[0]);
        checkRep();
    }

    public RepeatElement[] getRepeatedLines() {
        return Arrays.copyOf(repeatedLines, repeatedLines.length);
    }

    public RepeatElement[] getEndings() {
        return Arrays.copyOf(endings, endings.length);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(repeatedLines);
        result = 31 * result + Arrays.hashCode(endings);
        return result;
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
                if (this.endings.length == that.endings.length) {
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

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (RepeatElement r : repeatedLines) {
            result.append(r);
        }
        if (endings.length != 0) {
            result.append("|[1").append(endings[0].toString()).append(":|");
            for (int i = 1; i < endings.length; i++) {
                result.append("[").append(i + 1).append(endings[i].toString());
            }
        }
        return result.toString();
    }

    private void checkRep() {
//        assert this.repeatedLines != null;
//        assert this.repeatedLines.length > 0;
//        for (RepeatElement r : repeatedLines) {
//            assert r != null;
//        }
        if (endings != null) {
            assert this.endings.length > 0;
            for (RepeatElement r : endings) {
                assert r != null;
            }
        }
    }

    @Override
    public Components getType() {
        return Components.REPEAT;
    }
}

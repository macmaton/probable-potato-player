package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repeat implements VoicePartElement {
    protected final List<Line> repeatedLines;
    protected final List<Line> endings;

    /**
     * @param repeatedLines nullable - the portion of the music which is repeated
     * @param endings nullable - endings to be used following each repeat
     */
    public Repeat(List<Line> repeatedLines, List<Line> endings) {
        if (repeatedLines != null && repeatedLines.size() > 0) {
            this.repeatedLines = Collections.unmodifiableList(new ArrayList<>(repeatedLines));
        } else {
            this.repeatedLines = null;
        }
        if (endings != null && endings.size() > 0) {
            this.endings = Collections.unmodifiableList(new ArrayList<>(endings));
        } else {
            this.endings = null;
        }

        checkRep();
    }

    public Repeat(List<Line> repeatedLines) {
        this(repeatedLines, null);
        checkRep();
    }

    public List<Line> getRepeatedLines() {
        if (repeatedLines != null) {
            return repeatedLines;
        } else {
            return null;
        }
    }

    public List<Line> getEndings() {
        if(endings != null) {
            return endings;
        } else {
            return null;
        }
    }

    public boolean hasEndings() {
        if (endings != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = repeatedLines != null ? repeatedLines.hashCode() : 0;
        result = 31 * result + (endings != null ? endings.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Repeat) {
            Repeat that = (Repeat) obj;
            if (this.repeatedLines != null && this.endings != null) {
                return (this.repeatedLines.equals(that.repeatedLines) && this.endings.equals(that.endings));
            } else if (this.repeatedLines != null) {
                return (this.repeatedLines.equals(that.repeatedLines) && that.endings == null);
            } else {
                return this.endings != null && that.repeatedLines == null && this.endings.equals(that.endings);
            }
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        if (this.repeatedLines != null) {
            result.append("|:");
            for (Line e : repeatedLines) {
                result.append(e.toString());
            }
        }
        if (this.endings != null) {
            result.append(" |[1 ");
            result.append(endings.get(0));
            result.append(" :|");
            for (int i = 1; i < endings.size(); i++) {
                result.append("[" + (i+1));
                result.append(endings.get(i).toString());
            }
        }
        result.append(" :|");
        return result.toString();
    }

    private void checkRep() {
        assert (repeatedLines != null || endings != null);
        if (repeatedLines != null) {
            assert repeatedLines.size() > 0;
        }
        if (endings != null) {
            assert endings.size() > 0;
        }
    }

    @Override
    public Components getType() {
        return Components.REPEAT;
    }
}

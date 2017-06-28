package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Repeat implements VoicePartElement {
    protected final List<RepeatElement> repeatedLines;
    protected final List<RepeatElement> endings;

    /**
     * @param repeatedLines nullable - the portion of the music which is repeated
     * @param endings nullable - endings to be used following each repeat
     */
    public Repeat(List<RepeatElement> repeatedLines, List<RepeatElement> endings) {
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

    public Repeat(List<RepeatElement> repeatedLines) {
        this(repeatedLines, null);
        checkRep();
    }

    public List<RepeatElement> getRepeatedLines() {
        if (repeatedLines != null) {
            return repeatedLines;
        } else {
            return null;
        }
    }

    public List<RepeatElement> getEndings() {
        if(endings != null) {
            return endings;
        } else {
            return null;
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
            } else if (this.repeatedLines != null && this.endings == null) {
                return (this.repeatedLines.equals(that.repeatedLines) && that.endings == null);
            } else if (this.repeatedLines == null && this.endings != null) {
                return (that.repeatedLines == null && this.endings.equals(that.endings));
            } else {
                return false; //should not reach here - would require both this.repeatedLines and this.endings ==
                // null, violating the rep invariant
            }
        } else {
            return false;
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        if (this.repeatedLines != null) {
            for (RepeatElement e : repeatedLines) {
                result.append(e.toString());
            }
        }
        if (this.endings != null) {
            for (RepeatElement e : endings) {
                result.append(e.toString());
            }
        }
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

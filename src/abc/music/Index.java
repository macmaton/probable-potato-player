package abc.music;

/**
 * represents the index number of a piece in abc notation
 * denoted by X: in the first line of the file
 */
public class Index {
    private final Integer index;

    /**
     * Represents the index of a piece in abc notation, which must be in the first line of the file and denoted by X:
     * @param index nullable integer
     */
    public Index(Integer index) {
        this.index = index;
    }

    @Override
    public int hashCode() {
        return index != null ? index.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Index) {
            Index that = (Index) obj;
            return this.index.equals(that.index);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (index != null) {
            return "X: " + index.toString();
        } else {
            return "X: ";
        }
    }
}

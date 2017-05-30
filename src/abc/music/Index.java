package abc.music;

/**
 * represents the index number of a piece in abc notation
 * denoted by X: in the first line of the file
 */
public class Index implements Music {
    private final Integer index;

    public Index(Integer index) {
        this.index = index;
    }

    @Override
    public int hashCode() {
        return this.index * 43;
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

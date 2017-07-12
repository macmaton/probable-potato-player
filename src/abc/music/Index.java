package abc.music;

/**
 * represents the index number of a piece in abc notation
 * denoted by X: in the first line of the file
 */
public class Index implements HeaderField {
    private final Integer index;

    /**
     * Represents the index of a piece in abc notation, which must be in the first line of the file and denoted by X:
     *
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
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Index that = (Index) obj;

        return index != null ? index.equals(that.index) : that.index == null;
    }

    @Override
    public String toString() {
        if (index != null) {
            return "X: " + index.toString();
        } else {
            return "X: ";
        }
    }

    @Override
    public Components getType() {
        return Components.INDEX;
    }
}

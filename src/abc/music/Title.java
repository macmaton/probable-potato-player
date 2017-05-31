package abc.music;

/**
 * An immutable data type representing a voice field in abc notation,
 * T: title, where the title may be an arbitrary string (not null).
 */
public class Title {
    private final String title;

    public Title(String title) {
        this.title = title;
        checkRep();
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Title) {
            Title that = (Title) obj;
            return this.toString().equals(that.toString());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "T: " + title;
    }

    private void checkRep() {
        assert title != null;
    }
}

package abc.music;

public class Composer {
    private final String composer;
    private final boolean isSpecified;

    /**
     * A composer where the composer's name is provided in the abc file
     * @param name of the composer of the piece
     */
    public Composer(String name) {
        composer = name;
        isSpecified = true;
        checkRep();
    }

    /**
     * A composer where the name has not been specified.  Name is initialized to "Unknown"
     */
    public Composer() {
        composer = "Unknown";
        isSpecified = false;
    }

    public String getComposer() {
        return this.composer;
    }

    @Override
    public int hashCode() {
        return composer.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Composer) {
            Composer that = (Composer) obj;
            return this.composer.equals(that.composer) && this.isSpecified == that.isSpecified;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if(!isSpecified) {
            return "";
        } else {
            return "C: " + composer;
        }
    }

    private void checkRep() {
        assert composer != null;
    }
}

package abc.music;

/**
 * An immutable data type representing a voice field in abc notation,
 * V: name, where the name of the voice may be an arbitrary string.
 * Voice names may not be null.
 */
public class Voice implements HeaderField {
    private final String name;

    public Voice(String name) {
        this.name = name;
        checkRep();
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Voice) {
            Voice that = (Voice) obj;
            return this.toString().equals(that.toString());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "V: " + name;
    }

    private void checkRep() {
        assert name != null;
    }

    @Override
    public Components getType() {
        return Components.VOICE;
    }
}

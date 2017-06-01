package abc.music;

/**
 * An immutable data type representing a note in abc notation,
 * A note consists of a pitch or rest and a length (duration).
 * Neither pitch nor note may be null.
 */
public class Note implements TupletElement {
    private Pitch noteOrRest;
    private NoteLength length;

    public Note(Pitch noteOrRest, NoteLength length) {
        this.noteOrRest = noteOrRest;
        this.length = length;
        checkRep();
    }

    @Override
    public int hashCode() {
        int result = noteOrRest.hashCode();
        result = 31 * result + length.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Note) {
            Note that = (Note) obj;
            return this.noteOrRest.equals(that.noteOrRest) && this.length.equals(that.length);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return noteOrRest.toString() + length.toString();
    }

    private void checkRep() {
        assert !(noteOrRest == null);
        assert !(length == null);
    }
}

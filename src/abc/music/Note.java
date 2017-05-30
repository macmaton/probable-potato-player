package abc.music;

/**
 * An immutable data type representing a note in abc notation,
 * A note consists of a pitch or rest and a length (duration).
 * Neither pitch nor note may be null.
 */
public class Note implements Music {
    private Pitch noteorrest;
    private NoteLength length;

    public Note(Pitch noteorrest, NoteLength length) {
        this.noteorrest = noteorrest;
        this.length = length;
        checkRep();
    }

    @Override
    public int hashCode() {
        return this.noteorrest.hashCode() + this.length.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Note) {
            Note that = (Note) obj;
            return this.noteorrest.equals(that.noteorrest) && this.length.equals(that.length);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return noteorrest.toString() + length.toString();
    }

    private void checkRep() {
        assert !(noteorrest == null);
        assert !(length == null);
    }
}

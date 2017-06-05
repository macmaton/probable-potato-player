package abc.music;

import java.util.Objects;

/**
 * An immutable data type representing a note in abc notation,
 * A note consists of a pitch or rest and a length (duration).
 * Neither pitch nor note may be null.
 */
public class Note implements TupletElement {
    private final Pitch pitch;
    private final NoteLength length;

    public Note(Pitch pitch, NoteLength length) {
        Objects.requireNonNull(pitch, "pitch must not be null");
        Objects.requireNonNull(length, "if length is not provided, use Note(Pitch pitch)");
        this.pitch = pitch;
        this.length = length;
        checkRep();
    }

    /**
     * A Note where length is unspecified
     * @param pitch non-null pitch
     */
    public Note(Pitch pitch) {
        this(pitch, new NoteLength());
        checkRep();
    }

    @Override
    public int hashCode() {
        int result = pitch.hashCode();
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
            return this.pitch.equals(that.pitch) && this.length.equals(that.length);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return pitch.toString() + length.toString();
    }

    private void checkRep() {
        assert !(pitch == null);
        assert !(length == null);
    }
}

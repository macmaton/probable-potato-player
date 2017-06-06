package abc.music;

public class Rest implements TupletElement {
    private final NoteLength length;

    public Rest(NoteLength length) {
        this.length = length;
        checkRep();
    }

    public Rest() {
        this.length = new NoteLength();
    }

    @Override
    public int hashCode() {
        return length.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rest rest = (Rest) o;

        return length.equals(rest.length);
    }

    @Override
    public String toString() {
        return "z" + length.toString();
    }

    private void checkRep() {
        assert length != null;
    }
}

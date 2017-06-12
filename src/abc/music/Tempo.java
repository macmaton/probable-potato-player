package abc.music;

/**
 * An immutable data type representing a tempo field in abc notation,
 * Q: beatLength = beatsPerMinute where beatsPerMinute is a positive non-zero integer
 */
public class Tempo implements HeaderField {
    private final int beatsPerMinute;
    private final NoteLength beatLength;
    private final boolean isSpecified;
    //TODO: can Tempo be simplified to eliminate isSpecified?

    /**
     * The tempo provided in the header of a file in abc notation
     *
     * @param beatsPerMinute a positive non-zero number of beats in a minute
     * @param beatLength     the length of note that is counted for one beat
     */
    public Tempo(int beatsPerMinute, NoteLength beatLength) {
        this.beatsPerMinute = beatsPerMinute;
        this.beatLength = beatLength;
        isSpecified = true;
        checkRep();
    }

    public Tempo(int beatsPerMinute, int beatLengthNumerator, int beatLengthDenominator) {
        this.beatsPerMinute = beatsPerMinute;
        this.beatLength = new NoteLength(beatLengthNumerator, beatLengthDenominator);
        isSpecified = true;
        checkRep();
    }

    /**
     * The default tempo used when a tempo is not provided in the header of a file in abc notation
     *
     * @param defaultNoteLength the default note length L for the piece, used to determine the tempo if tempo is not
     *                          specified
     */
    public Tempo(DefaultNoteLength defaultNoteLength) {
        this.beatsPerMinute = 100;
        this.beatLength = new NoteLength(defaultNoteLength.getNumerator(), defaultNoteLength.getDenominator());
        isSpecified = false;
        checkRep();
    }

    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    public NoteLength getBeatLength() {
        return beatLength;
    }

    public boolean isSpecified() {
        return isSpecified;
    }

    @Override
    public int hashCode() {
        int result = beatsPerMinute;
        result = 31 * result + beatLength.hashCode();
        result = 31 * result + (isSpecified ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Tempo) {
            Tempo that = (Tempo) obj;
            return this.beatLength.equals(that.beatLength) && this.beatsPerMinute == that.beatsPerMinute && this.isSpecified == that.isSpecified;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (!isSpecified) {
            return "";
        } else {
            return "Q: " + beatLength.getNumerator() + "/" + beatLength.getDenominator() + "=" + beatsPerMinute;
        }
    }

    private void checkRep() {
        assert beatsPerMinute >= 1;
        assert beatLength != null;
    }

    @Override
    public Components getType() {
        return Components.TEMPO;
    }
}

package abc.music;

/**
 * Immutable representation of the length of a note in the body as a rational number
 */
public class NoteLength {
    private static final int DEFAULT_NUMERATOR = 1;
    private static final int DEFAULT_DENOMINATOR = 2;
    private final int numerator;
    private final int denominator;

    /**
     * A note length in abc notation
     *
     * @param numerator   nullable integer
     * @param denominator nullable integer
     */
    public NoteLength(Integer numerator, Integer denominator) {
        if (numerator == null) {
            this.numerator = DEFAULT_NUMERATOR;
        } else {
            this.numerator = numerator;
        }
        if (denominator == null) {
            this.denominator = DEFAULT_DENOMINATOR;
        } else {
            this.denominator = denominator;
        }
        checkRep();
    }

    /**
     * A note length when not specified in abc notation.
     */
    public NoteLength() {
        this.numerator = 1;
        this.denominator = 1;
        checkRep();
    }

    public double getNoteLength() {
        return (double) numerator / (double) denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } else {
            NoteLength that = (NoteLength) obj;
            return this.numerator == that.numerator && this.denominator == that.denominator;
        }
    }

    /**
     * @return a parsable String representing the NoteLength.
     */
    @Override
    public String toString() {
        String result;
        if (this.numerator == this.denominator) {
            result = "";
        } else {
            if (this.numerator == 1) {
                result = "";
            } else {
                result = String.valueOf(this.numerator);
            }
            if (this.denominator == DEFAULT_DENOMINATOR) {
                result = result + "/";
            } else if (this.denominator != DEFAULT_DENOMINATOR && this.denominator != 1) {
                result = result + "/" + String.valueOf(this.denominator);
            }
        }
        return result;
    }

    private void checkRep() {
        assert this.numerator > 0;
        assert this.denominator > 0;
    }

}

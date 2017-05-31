package abc.music;

/**
 * Immutable representation of the length of a note in the body as a rational number
 * hasMultiplier represents whether the noteLength is explicitly given and may not be null.
 * Numerator and denominator are nullable.  Default values are provided for when either is null.
 */
public class NoteLength {
    private final Integer numerator;
    private final Integer denominator;
    private final Boolean isSpecified; //whether a fractional multiplicative factor is provided

    /**
     * A note length in abc notation
     *
     * @param numerator
     * @param denominator
     * @param isSpecified Whether the note length was explicitly stated in the file.  If false, toString() returns an
     *                    empty string and getNoteLength() returns 1.0
     */
    public NoteLength(Integer numerator, Integer denominator, boolean isSpecified) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.isSpecified = isSpecified;
        checkRep();
    }

    /**
     * A note length when not specified in abc notation.
     */
    public NoteLength() {
        this.numerator = 1;
        this.denominator = 1;
        this.isSpecified = false;
        checkRep();
    }

    public double getNoteLength() {
        if (!isSpecified) {
            return 1.0;
        } else if (numerator == null && denominator == null) {
            return 0.5;
        } else if (numerator == null) {
            return 1.0 / denominator;
        } else if (denominator == null) {
            return (double) numerator / 2.0;
        } else {
            return (double) numerator / (double) denominator;
        }
    }

    public int getNumerator() {
        if (!isSpecified) {
            return 1;
        } else if (numerator == null) {
            return 1;
        } else {
            return numerator;
        }
    }

    public int getDenominator() {
        if (!isSpecified) {
            return 1;
        } else if (denominator == null) {
            return 2;
        } else {
            return denominator;
        }
    }

    public boolean isSpecified() {
        return isSpecified;
    }

    @Override
    public int hashCode() {
        if (!isSpecified) {
            return (11 + 17 + isSpecified.hashCode() * 23);
        } else {
            return (numerator.hashCode() * 11 + denominator.hashCode() * 17 + isSpecified.hashCode() * 23);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof NoteLength) {
            NoteLength that = (NoteLength) obj;
            boolean numeratorCheck;
            boolean denominatorCheck;
            if (this.isSpecified != that.isSpecified) {
                return false;
            } else if (!this.isSpecified() && !that.isSpecified()) {
                return true;
            }
            if (this.numerator == null && that.numerator == null) {
                numeratorCheck = true;
            } else if (this.numerator != null && that.numerator != null) {
                numeratorCheck = this.numerator.equals(that.numerator);
            } else {
                return false;
            }
            if (this.denominator == null && that.denominator == null) {
                denominatorCheck = true;
            } else if (this.denominator != null && that.denominator != null) {
                denominatorCheck = this.denominator.equals(that.denominator);
            } else {
                return false;
            }
            return numeratorCheck && denominatorCheck;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (!isSpecified) {
            return "";
        }

        String numerator;
        String denominator;

        if (this.numerator == null) {
            numerator = "";
        } else {
            numerator = this.numerator.toString();
        }

        if (this.denominator == null) {
            denominator = "";
        } else if (this.denominator.equals(1)) {
            return numerator;
        } else {
            denominator = this.denominator.toString();
        }
        return numerator + "/" + denominator;
    }

    private void checkRep() {
        assert isSpecified != null;
        if (!isSpecified) {
            assert (numerator == null && denominator == null) || (numerator != null && numerator.equals(denominator));
        }
    }

}

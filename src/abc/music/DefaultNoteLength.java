package abc.music;

/**
 * Immutable representation of the default note length for a piece
 */
public class DefaultNoteLength implements Music {
    private final int numerator;
    private final int denominator;
    private final Boolean isSpecified;

    public DefaultNoteLength(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.isSpecified = true;
        checkRep();
    }

    public DefaultNoteLength(Meter meter) {
        this.isSpecified = false;
        if (meter.getMeterDecimal() < .75) {
            this.numerator = 1;
            this.denominator = 16;
        } else {
            this.numerator = 1;
            this.denominator = 8;
        }

        checkRep();
    }

    public double getDefaultNoteLength() {
        return numerator / denominator;
    }

    public boolean isSpecified() {
        return isSpecified;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int hashCode() {
        return numerator * 13 + denominator * 17 + isSpecified.hashCode() * 23;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof DefaultNoteLength) {
            DefaultNoteLength that = (DefaultNoteLength) obj;
            return this.numerator == that.numerator && this.denominator == that.denominator && this.isSpecified ==
                    that.isSpecified;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (isSpecified) {
            return "L: " + numerator + "/" + denominator;
        } else {
            return "";
        }
    }

    private void checkRep() {
        assert this.numerator > 0;
        assert this.denominator > 0;
    }
}

package abc.music;

/**
 * Immutable data type to represent the meter of a piece in abc notation
 * M: beatsPerMeasure/noteValue
 */
public class Meter {
    private final int beatsPerMeasure;
    private final int noteValue;
    private final boolean isSpecified;
    //TODO: can meter be simplified to eliminate isSpecified?

    /**
     * The meter in abc notation M: beatsPerMeasure/noteValue
     *
     * @param beatsPerMeasure positive non-zero integer
     * @param noteValue       positive non-zero integer
     */
    public Meter(int beatsPerMeasure, int noteValue) {
        this.beatsPerMeasure = beatsPerMeasure;
        this.noteValue = noteValue;
        this.isSpecified = true;
        checkRep();
    }

    /**
     * The meter when not specified in the header of the piece in abc notation.  Default values are used for
     * beatsPerMeasure and noteValue.
     */
    public Meter() {
        this.beatsPerMeasure = 4;
        this.noteValue = 4;
        this.isSpecified = false;
        checkRep();
    }

    public int getBeatsPerMeasure() {
        return beatsPerMeasure;
    }

    public int getNoteValue() {
        return noteValue;
    }

    public double getMeterDecimal() {
        return (double) beatsPerMeasure / (double) noteValue;
    }

    @Override
    public int hashCode() {
        int result = beatsPerMeasure;
        result = 31 * result + noteValue;
        result = 31 * result + (isSpecified ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Meter) {
            Meter that = (Meter) obj;
            return this.beatsPerMeasure == that.beatsPerMeasure && this.noteValue == that.noteValue && this.isSpecified == that.isSpecified;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        if (isSpecified) {
            return "M: " + beatsPerMeasure + "/" + noteValue;
        } else {
            return "";
        }
    }

    private void checkRep() {
        assert beatsPerMeasure > 0;
        assert noteValue > 0;
    }
}

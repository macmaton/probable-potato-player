package abc.music;

/**
 * Immutable data type to represent the meter of a piece in abc notation
 * M: beatsPerMeasure/noteValue
 */
public class Meter implements Music {
	private final int beatsPerMeasure;
	private final int noteValue;
	private final boolean isSpecified;
	
	/**
	 * The meter in abc notation M: beatsPerMeasure/noteValue
	 * @param beatsPerMeasure
	 * @param noteValue
	 */
	public Meter(int beatsPerMeasure, int noteValue) {
		this.beatsPerMeasure = beatsPerMeasure;
		this.noteValue = noteValue;
		this.isSpecified = true;
		checkRep();
	}
	
	/**
	 * The meter when not specified in the header of the piece in abc notation.  Default values are used for beatsPerMeasure and noteValue.
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
		double result = (double)beatsPerMeasure/(double)noteValue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof Meter) {
			Meter that = (Meter) obj;
			return this.beatsPerMeasure == that.beatsPerMeasure && this.noteValue == that.noteValue && this.isSpecified == that.isSpecified;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		if(isSpecified) {
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

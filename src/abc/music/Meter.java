package abc.music;

/**
 * Immutable data type to represent the meter of a piece in abc notation
 * M: beatsPerMeasure/noteValue
 */
public class Meter implements Music {
	private final int beatsPerMeasure;
	private final int noteValue; //denominator of length of note that gets the beat
	
	public Meter(int beatsPerMeasure, int noteValue) {
		this.beatsPerMeasure = beatsPerMeasure;
		this.noteValue = noteValue;
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
			return this.toString().equals(that.toString());
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
		return "M: " + beatsPerMeasure + "/" + noteValue;
	}
	
	

}

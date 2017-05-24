package abc.music;

/**
 * Immutable representation of the length of a note as a rational number
 */
public class NoteLength implements Music {
	private final int numerator;
	private final int denominator;
	
	public NoteLength(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public double getNoteLength() {
		double result = (double)numerator / (double)denominator;
		return result;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NoteLength) {
			return this.toString().equals(obj.toString());
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
		return String.valueOf(numerator) + "/" + String.valueOf(denominator);
	}

}

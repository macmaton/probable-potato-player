package abc.music;

/**
 * Immutable representation of the length of a note as a rational number
 * hasMultiplier represents whether the noteLength is explicitly given and may not be null.
 * Numerator and denominator are nullable.  Default values are provided for when either is null.
 */
public class NoteLength implements Music {
	private final Integer numerator;
	private final Integer denominator;
	private final Boolean hasMultiplier; //whether a fractional multiplicative factor is provided
	
	public NoteLength(Integer numerator, Integer denominator, boolean hasMultiplier) {
		this.numerator = numerator;
		this.denominator = denominator;
		this.hasMultiplier = hasMultiplier;
		checkRep();
	}
	
	public double getNoteLength() {
		if(hasMultiplier == false) {
			return 1.0;
		} else if (numerator == null && denominator == null) {
			return 0.5;
		} else if (numerator == null) {
			return 1.0/denominator;
		} else if (denominator == null) {
			return (double)numerator/2.0;
		} else {
			return (double)numerator/(double)denominator;
		}
	}
	
	public int getNumerator() {
		if (!hasMultiplier) {
			return 1;
		} else if (numerator == null) {
			return 1;
		} else {
			return numerator;
		}
	}
	
	public int getDenominator() {
		if (!hasMultiplier) {
			return 1;
		} else if (denominator == null) {
			return 2;
		} else {
			return denominator;
		}
	}
	
	public boolean hasMultiplier() {
		return hasMultiplier;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if(obj instanceof NoteLength) {
			NoteLength that = (NoteLength)obj;
			boolean numeratorCheck;
			boolean denominatorCheck;
			if (this.hasMultiplier != that.hasMultiplier) {
				return false;
			} else if((!this.hasMultiplier()) && (!that.hasMultiplier())) {
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
	public int hashCode() {
		if (!hasMultiplier) {
			return (11+17+hasMultiplier.hashCode()*23);
		} else {
			return (numerator.hashCode()*11 + denominator.hashCode()*17 + hasMultiplier.hashCode()*23);	
		}
	}

	@Override
	public String toString() {
		if(!hasMultiplier) {
			return "";
		}
		
		String numerator;
		String denominator;
		
		if(this.numerator == null) {
			numerator = "";
		} else {
			numerator = this.numerator.toString();
		}
		
		if(this.denominator == null) {
			denominator = "";
		} else if (this.denominator.equals(1)) {
			return numerator;
		} else {
			denominator = this.denominator.toString();
		}
		return numerator + "/" + denominator;
	}
	
	private void checkRep() {
		assert hasMultiplier != null;
		if (!hasMultiplier) {
			assert (numerator == null && denominator == null) || (numerator == denominator);
		}
	}

}

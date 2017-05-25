package abc.music;

/**
 * Immutable datatype representing a pitch
 * basenote: in the range A-G (octave of middle C) or a-g (octave above middle C), or z for a rest
 * accidental: whether the note is marked as natural,sharp, or flat.  double flats and sharps are allowed.
 * octave: number of octaves above or below the basenote.
 */
public class Pitch implements Music {
	
	enum Accidental {NATURAL, SHARP, DOUBLESHARP, FLAT, DOUBLEFLAT, NONE};

	private final int octave;
	private final Accidental accidental;
	private final BaseNote basenote;

	public Pitch(BaseNote basenote, int octave, Accidental accidental) {
		this.basenote = basenote;
		this.accidental = accidental;
		this.octave = octave;
		checkRep();
	}
	
	public int getOctave() {
		return octave;
	}

	public Accidental getAccidental() {
		return accidental;
	}

	public BaseNote getBasenote() {
		return basenote;
	}
	
//	public int getModifier(Key key) {
//		TODO: provide pitch modifier (#/b) based on accidental and key
//	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {return false;}
		if (obj instanceof Pitch) {
			Pitch that = (Pitch) obj;
			return this.basenote.equals(that.basenote) && this.accidental.equals(that.accidental) && this.octave == that.octave;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.basenote.hashCode() + this.accidental.hashCode()*7 + this.octave*13;
	}

	@Override
	public String toString() {
		String octave = "";
		String octaveSymbol = "";
		String accidental = "";
		String basenote = this.basenote.toString();
		if(this.basenote.equals(BaseNote.z)) {
			return basenote;
		} else {
			if (this.octave != 0) {
				if (this.octave > 0) {
					octaveSymbol = "'";
				} else if (this.octave < 0) {
					octaveSymbol = ",";
				}
				for (int i = 0; i < Math.abs(this.octave); i++) {
					octave += octaveSymbol;
				}
			}

			switch(this.accidental) {
			case NATURAL: accidental = "=";
				break;
			case SHARP: accidental = "^";
				break;
			case DOUBLESHARP: accidental = "^^";
				break;
			case FLAT: accidental = "_";
				break;
			case DOUBLEFLAT: accidental = "__";
				break;
			case NONE: accidental = "";
				break;
			}

			return accidental + basenote + octave;
		}
	}
	
	private void checkRep() {
		assert accidental != null;
		assert basenote != null;
		if(basenote == BaseNote.z) {
			assert accidental == Accidental.NONE;
			assert octave == 0;
		}
	}
}

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
		String octave = "";
		String accidental = "";
		String basenote = this.basenote.toString();
		if(this.basenote.equals(BaseNote.z)) {
			return basenote;
		} else {
			if (this.octave != 0) {
				if (this.octave > 0) {
					octave = "'";
				} else if (this.octave < 0) {
					octave = ",";
				}
				for (int i = 1; i < Math.abs(this.octave); i++) {
					octave += octave;
				}
			}

			switch(this.accidental) {
			case NATURAL: accidental = "=";
			case SHARP: accidental = "^";
			case DOUBLESHARP: accidental = "^^";
			case FLAT: accidental = "_";
			case DOUBLEFLAT: accidental = "__";
			case NONE: accidental = "";
			}

			return accidental + basenote + octave;
		}
	}
}

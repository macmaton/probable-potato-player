package abc.music;

/**
 * Immutable datatype representing a pitch
 * basenote: in the range A-G (octave of middle C) or a-g (octave above middle C), or z for a rest
 * modifier: an integer representation of number of sharps or flats (semitones up or down from the basenote). a positive number is sharps, a negative flats, zero is natural.
 * octave: number of octaves above or below the basenote.
 */
public class Pitch implements Music {

	private final int octave;
	private final int modifier;
	private final BaseNote basenote;

	public Pitch(BaseNote basenote, int octave, int accidental) {
		this.basenote = basenote;
		this.modifier = accidental;
		this.octave = octave;
	}
	
	public int getOctave() {
		return octave;
	}

	public int getAccidental() {
		return modifier;
	}

	public BaseNote getBasenote() {
		return basenote;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof NoteLength) {
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

			if (this.modifier != 0) {
				if (this.modifier > 0) {
					accidental = "^";
				} else if (this.modifier < 0) {
					accidental = "_";
				}
				for (int i = 1; i < Math.abs(this.modifier); i++) {
					accidental += accidental;
				}
			}

			return accidental + basenote + octave;
		}
	}
}

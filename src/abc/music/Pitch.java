package abc.music;

import abc.music.Music.BaseNote;

/**
 * Immutable datatype representing a pitch
 * basenote: in the range A-G (octave of middle C)
 * accidental: whether the note is marked as natural,sharp, or flat.  double flats and sharps are allowed.
 * octave: number of octaves above or below the basenote.
 */
public class Pitch {

    private final int octave;
    private final Accidental accidental;
    private final BaseNote basenote;

    /**
     * @param basenote in the range A-G (octave of middle C)
     * @param octave whether the note is marked as natural,sharp, or flat.  double flats and sharps are allowed.
     * @param accidental number of octaves above or below the basenote.
     */
    public Pitch(BaseNote basenote, int octave, Accidental accidental) {
        this.basenote = basenote;
        this.accidental = accidental;
        this.octave = octave;
        checkRep();
    }

    public Pitch(BaseNote basenote, int octave) {
        this(basenote, octave, Accidental.NONE);
        checkRep();
    }

    public Pitch(BaseNote basenote, Accidental accidental) {
        this(basenote, 0, accidental);
        checkRep();
    }

    public Pitch(BaseNote basenote) {
        this(basenote, 0, Accidental.NONE);
    }

    public int getOctave() {
        return octave;
    }

    public Accidental getAccidental() {
        return accidental;
    }

    public BaseNote getBaseNote() {
        return basenote;
    }

    @Override
    public int hashCode() {
        int result = octave;
        result = 31 * result + (accidental != null ? accidental.hashCode() : 0);
        result = 31 * result + basenote.hashCode();
        return result;
    }

//	public int getModifier(Key key) {
//		TODO: provide pitch modifier (#/b) based on accidental and key
//	}

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Pitch) {
            Pitch that = (Pitch) obj;
            return this.basenote.equals(that.basenote) && this.accidental.equals(that.accidental) && this.octave == that.octave;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder octave = new StringBuilder();
        String octaveSymbol = "";
        int octaveSymbols = this.octave;
        String accidental = "";
        String basenote = this.basenote.toString();
        if (this.octave == 1) {
            basenote = basenote.toLowerCase();
            octaveSymbols -= 1;
        }
            if (octaveSymbols != 0) {
                if (octaveSymbols > 0) {
                    octaveSymbol = "'";
                } else if (octaveSymbols < 0) {
                    octaveSymbol = ",";
                }
                for (int i = 0; i < Math.abs(octaveSymbols); i++) {
                    octave.append(octaveSymbol);
                }
            }

            switch (this.accidental) {
                case NATURAL:
                    accidental = "=";
                    break;
                case SHARP:
                    accidental = "^";
                    break;
                case DOUBLESHARP:
                    accidental = "^^";
                    break;
                case FLAT:
                    accidental = "_";
                    break;
                case DOUBLEFLAT:
                    accidental = "__";
                    break;
                case NONE:
                    accidental = "";
                    break;
            }

            return accidental + basenote + octave;
    }

    private void checkRep() {
        assert accidental != null;
        assert basenote != null;
    }

    enum Accidental {NATURAL, SHARP, DOUBLESHARP, FLAT, DOUBLEFLAT, NONE}
}

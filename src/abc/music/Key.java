package abc.music;

import abc.music.Music.BaseNote;

import java.util.Arrays;
import java.util.List;

public class Key {
    private final BaseNote basenote;
    private final int modifier;
    private final boolean minor;

    //TODO: refactor to use an enum for possible keys?

    /**
     * The key of a piece in abc notation
     *
     * @param basenote basenote in [A-G]
     * @param modifier int number of sharps (positive) or flats (negative)
     * @param minor    boolean - true if minor
     */
    public Key(BaseNote basenote, int modifier, boolean minor) {
        this.basenote = basenote;
        this.modifier = modifier;
        this.minor = minor;
        checkRep();
    }

    @Override
    public int hashCode() {
        int result = basenote.hashCode();
        result = 31 * result + modifier;
        result = 31 * result + (minor ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Key) {
            Key that = (Key) obj;
            return this.basenote.equals(that.basenote) && this.modifier == that.modifier && this.minor == that.minor;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String basenote = this.basenote.toString();
        String modifier = "";
        String minor = "";
        if (this.modifier != 0) {
            if (this.modifier > 0) {
                modifier = "#";
            } else if (this.modifier < 0) {
                modifier = "b";
            }
        }
        if (this.minor) {
            minor = "m";
        }

        return basenote + modifier + minor;
    }

    private void checkRep() {
        List<BaseNote> keyNotes = Arrays.asList(BaseNote.A, BaseNote.B, BaseNote.C, BaseNote.D, BaseNote.E, BaseNote.F, BaseNote.G);
        assert keyNotes.contains(basenote);
    }
}

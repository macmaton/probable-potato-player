package abc.music;

import abc.music.Music.BaseNote;

import java.util.*;

public class Key {

    private static final Map<Keys, Integer> NUM_MODIFIED = Collections.unmodifiableMap(initializeNumModified());
    private static final List<BaseNote> MODIFIED_NOTES = Collections.unmodifiableList(Arrays.asList(BaseNote.F,
            BaseNote.C, BaseNote.G, BaseNote.D, BaseNote.A, BaseNote.E, BaseNote.B));
    private final Keys key;
    private final Map<BaseNote, Pitch> keyNotes;

    public Key(Keys key) {
        this.key = key;
        Map<BaseNote, Pitch> keyNotes = new HashMap<BaseNote, Pitch>();

        int numModified = NUM_MODIFIED.get(key);
        for (int i = 0; i < Math.abs(numModified); i++) {
            if (numModified > 0) {
                keyNotes.put(MODIFIED_NOTES.get(i), new Pitch(MODIFIED_NOTES.get(i), Pitch.Accidental.SHARP));
            } else if (numModified < 0) {
                keyNotes.put(MODIFIED_NOTES.get(MODIFIED_NOTES.size() - (i + 1)), new Pitch(MODIFIED_NOTES.get
                        (MODIFIED_NOTES.size() - (i + 1)), Pitch
                        .Accidental
                        .FLAT));
            }
        }
        for (BaseNote b : BaseNote.values()) {
            keyNotes.putIfAbsent(b, new Pitch(b));
        }
        this.keyNotes = Collections.unmodifiableMap(keyNotes);

        checkRep();
    }

    private static Map<Keys, Integer> initializeNumModified() {
        Map<Keys, Integer> result = new HashMap<Keys, Integer>();
        result.put(Keys.CMAJOR, 0);
        result.put(Keys.AMINOR, 0);

        result.put(Keys.GMAJOR, 1);
        result.put(Keys.DMAJOR, 2);
        result.put(Keys.AMAJOR, 3);
        result.put(Keys.EMAJOR, 4);
        result.put(Keys.BMAJOR, 5);
        result.put(Keys.FSHARPMAJOR, 6);
        result.put(Keys.CSHARPMAJOR, 7);

        result.put(Keys.EMINOR, 1);
        result.put(Keys.BMINOR, 2);
        result.put(Keys.FSHARPMINOR, 3);
        result.put(Keys.CSHARPMINOR, 4);
        result.put(Keys.GSHARPMINOR, 5);
        result.put(Keys.DSHARPMINOR, 6);
        result.put(Keys.ASHARPMINOR, 7);

        result.put(Keys.FMAJOR, -1);
        result.put(Keys.BFLATMAJOR, -2);
        result.put(Keys.EFLATMAJOR, -3);
        result.put(Keys.AFLATMAJOR, -4);
        result.put(Keys.DFLATMAJOR, -5);
        result.put(Keys.GFLATMAJOR, -6);
        result.put(Keys.CFLATMAJOR, -7);

        result.put(Keys.DMINOR, -1);
        result.put(Keys.GMINOR, -2);
        result.put(Keys.CMINOR, -3);
        result.put(Keys.FMINOR, -4);
        result.put(Keys.BFLATMINOR, -5);
        result.put(Keys.EFLATMINOR, -6);
        result.put(Keys.AFLATMINOR, -7);

        return result;
    }

    public Pitch getPitch(Pitch asWritten) {
        Pitch result;
        if (asWritten.getAccidental() == Pitch.Accidental.NONE) {
            Pitch fromKey = keyNotes.get(asWritten.getBaseNote());
            result = new Pitch(asWritten.getBaseNote(), asWritten.getOctave(), fromKey.getAccidental());
        } else {
            result = asWritten;
        }
        return result;
    }

    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + keyNotes.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Key that = (Key) obj;
        return this.key == that.key;
    }

    @Override
    public String toString() {
        String keyName = this.key.toString();
        String baseNote = keyName.substring(0, 1);
        String modifier = "";
        String minor = "";

        if (keyName.contains("SHARP")) {
            modifier = "#";
        } else if (keyName.contains("FLAT")) {
            modifier = "b";
        }

        if (keyName.contains("MINOR")) {
            minor = "m";
        }

        return "K: " + baseNote + modifier + minor;
    }

    private void checkRep() {
        assert this.key != null;
        assert this.keyNotes.size() == 7;
    }

    enum Keys {
        //keys with no sharps or flats
        CMAJOR, AMINOR,
        //major keys with sharp key signatures
        GMAJOR, DMAJOR, AMAJOR, EMAJOR, BMAJOR, FSHARPMAJOR, CSHARPMAJOR,
        //minor keys with sharp key signatures
        EMINOR, BMINOR, FSHARPMINOR, CSHARPMINOR, GSHARPMINOR, DSHARPMINOR, ASHARPMINOR,
        //major keys with flat key signatures
        FMAJOR, BFLATMAJOR, EFLATMAJOR, AFLATMAJOR, DFLATMAJOR, GFLATMAJOR, CFLATMAJOR,
        //minor keys with flat key signatures
        DMINOR, GMINOR, CMINOR, FMINOR, BFLATMINOR, EFLATMINOR, AFLATMINOR
    }
}
package abc.music;

import abc.music.Music.BaseNote;
import abc.music.Pitch.Accidental;
import org.junit.Test;

public class NoteTest {
    private Note n1;
    private Note n2;
    private Note n3;
    private Note n4;

    public void setup() {
        n1 = new Note(new Pitch(BaseNote.C, -3, Accidental.NONE), new NoteLength(null, null));
        n2 = new Note(new Pitch(BaseNote.C, -3, Accidental.NONE), new NoteLength(null, null));
        n3 = new Note(new Pitch(BaseNote.D, 0, Accidental.SHARP), new NoteLength(2, 1));
        n4 = new Note(new Pitch(BaseNote.A, 0, Accidental.FLAT), new NoteLength(1, 4));
    }

    @Test
    public void testEquals() {
        setup();
        assert n1.equals(n2);
        assert !(n2.equals(n3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert n1.hashCode() == n2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        assert n1.toString().equals("C,,,/");
        assert n3.toString().equals("^D2");
        assert n4.toString().equals("_A/4");
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        n1 = new Note(null, null);
    }
}

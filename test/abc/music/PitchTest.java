package abc.music;

import abc.music.Music.BaseNote;
import abc.music.Pitch.Accidental;
import org.junit.Test;

public class PitchTest {

    private Pitch p1;
    private Pitch p2;
    private Pitch p3;
    private Pitch p4;
    private Pitch p5;
    private Pitch p6;
    private Pitch p7;
    private Pitch p8;
    private Pitch rest;

    public void setup() {
        p1 = new Pitch(BaseNote.C, 0, Accidental.NONE);
        p2 = new Pitch(BaseNote.C, 0, Accidental.NONE);
        p3 = new Pitch(BaseNote.C, -1, Accidental.NONE);
        p4 = new Pitch(BaseNote.C, 1, Accidental.NONE);
        p5 = new Pitch(BaseNote.C, 3, Accidental.SHARP);
        p6 = new Pitch(BaseNote.A, 2, Accidental.DOUBLESHARP);
        p7 = new Pitch(BaseNote.D, -1, Accidental.DOUBLEFLAT);
        p8 = new Pitch(BaseNote.G, -3, Accidental.FLAT);
    }

    @Test
    public void testEquals() {
        setup();
        assert p1.equals(p2);
        assert !(p2.equals(p3));
        assert !(p1.equals(p4));
        assert !(p4.equals(p5));
    }

    @Test
    public void testHashCode() {
        setup();
        assert p1.hashCode() == p2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        assert p1.toString().equals("C");
        assert p3.toString().equals("C,");
        assert p4.toString().equals("c");
        assert p5.toString().equals("^c''");
        assert p6.toString().equals("^^a'");
        assert p7.toString().equals("__D,");
        assert p8.toString().equals("_G,,,");
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        p1 = new Pitch(BaseNote.A, 0, null);
        p2 = new Pitch(null, 0, Accidental.FLAT);
    }

}

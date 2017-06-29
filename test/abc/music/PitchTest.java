package abc.music;

import abc.music.Music.BaseNote;
import abc.music.Pitch.Accidental;
import org.junit.Test;

public class PitchTest extends TestBase {

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

        Body b1 = parseBody(p1.toString());
        Section s1 = (Section) b1.getElements().get(0);
        Line l1 = (Line) s1.getElements().get(0);
        Note n1 = (Note) l1.getMeasures().get(0).getElements().get(0);
        Pitch test1 = n1.getPitch();

        Body b2 = parseBody(p3.toString());
        Section s2 = (Section) b2.getElements().get(0);
        Line l2 = (Line) s2.getElements().get(0);
        Note n2 = (Note) l2.getMeasures().get(0).getElements().get(0);
        Pitch test2 = n2.getPitch();

        Body b3 = parseBody(p4.toString());
        Section s3 = (Section) b3.getElements().get(0);
        Line l3 = (Line) s3.getElements().get(0);
        Note n3 = (Note) l3.getMeasures().get(0).getElements().get(0);
        Pitch test3 = n3.getPitch();

        Body b4 = parseBody(p5.toString());
        Section s4 = (Section) b4.getElements().get(0);
        Line l4 = (Line) s4.getElements().get(0);
        Note n4 = (Note) l4.getMeasures().get(0).getElements().get(0);
        Pitch test4 = n4.getPitch();

        Body b5 = parseBody(p6.toString());
        Section s5 = (Section) b5.getElements().get(0);
        Line l5 = (Line) s5.getElements().get(0);
        Note n5 = (Note) l5.getMeasures().get(0).getElements().get(0);
        Pitch test5 = n5.getPitch();

        Body b6 = parseBody(p7.toString());
        Section s6 = (Section) b6.getElements().get(0);
        Line l6 = (Line) s6.getElements().get(0);
        Note n6 = (Note) l6.getMeasures().get(0).getElements().get(0);
        Pitch test6 = n6.getPitch();

        Body b7 = parseBody(p8.toString());
        Section s7 = (Section) b7.getElements().get(0);
        Line l7 = (Line) s7.getElements().get(0);
        Note n7 = (Note) l7.getMeasures().get(0).getElements().get(0);
        Pitch test7 = n7.getPitch();

        assert p1.equals(test1);
        assert p3.equals(test2);
        assert p4.equals(test3);
        assert p5.equals(test4);
        assert p6.equals(test5);
        assert p7.equals(test6);
        assert p8.equals(test7);
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        p1 = new Pitch(BaseNote.A, 0, null);
        p2 = new Pitch(null, 0, Accidental.FLAT);
    }

}

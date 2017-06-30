package abc.music;

import org.junit.Test;

public class ChordTest extends TestBase {
    Chord c1;
    Chord c2;
    Chord c3;

    public void setup() {
        c1 = createChord();
        c2 = createChord();
        c3 = createChord(n3);
    }

    @Test
    public void testEquals() {
        setup();
        assert c1.equals(c2);
        assert !(c2.equals(c3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert c1.hashCode() == c2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        Body b1 = parseBody(c1.toString());
        Section s1 = (Section) b1.getSections().get(0);
        Line l1 = (Line) s1.getElements().get(0);
        Measure m1 = (Measure) l1.getMeasures().get(0);
        Chord test1 = (Chord) m1.getElements().get(0);

        Body b2 = parseBody(c3.toString());
        Section s2 = (Section) b2.getSections().get(0);
        Line l2 = (Line) s2.getElements().get(0);
        Measure m2 = (Measure) l2.getMeasures().get(0);
        Chord test2 = (Chord) m2.getElements().get(0);

        assert c1.equals(test1);
        assert c3.equals(test2);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetNotes() {
        setup();
        c1.getNotes().set(0, n3);
    }
}

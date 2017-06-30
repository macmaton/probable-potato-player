package abc.music;

import org.junit.Test;

public class TupletTest extends TestBase {
    Tuplet t1;
    Tuplet t2;
    Tuplet t3;

    public void setup() {
        t1 = createTuplet();
        t2 = createTuplet();
        t3 = createTuplet(n3);
    }

    @Test
    public void testEquals() {
        setup();
		assert t1.equals(t2);
		assert !(t2.equals(t3));
    }

    @Test
    public void testHashCode() {
        setup();
		assert t1.hashCode() == t2.hashCode();
    }

    @Test
    public void testToString() {
        setup();

        Body b1 = parseBody(t1.toString());
        Section s1 = (Section) b1.getSections().get(0);
        Line l1 = (Line) s1.getElements().get(0);
        Measure m1 = l1.getMeasures().get(0);
        Tuplet test1 = (Tuplet) m1.getElements().get(0);

        Body b2 = parseBody(t3.toString());
        Section s2 = (Section) b2.getSections().get(0);
        Line l2 = (Line) s2.getElements().get(0);
        Measure m2 = l2.getMeasures().get(0);
        Tuplet test2 = (Tuplet) m2.getElements().get(0);

        assert t1.equals(test1);
        assert t3.equals(test2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetElements() {
        setup();
        t1.getElements().set(0, n2);
        assert t1.equals(t2);
    }
}

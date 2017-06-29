package abc.music;

import org.junit.Test;

public class RestTest extends TestBase {
    private Rest r1;
    private Rest r2;
    private Rest r3;

    public void setup() {
        r1 = new Rest();
        r2 = new Rest();
        r3 = new Rest(new NoteLength(1, 8));
    }

    @Test
    public void testEquals() {
        setup();
        assert r1.equals(r2);
        assert !(r2.equals(r3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert r1.hashCode() == r2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        Body b1 = parseBody(r1.toString());
        Section s1 = (Section) b1.getElements().get(0);
        Line l1 = (Line) s1.getElements().get(0);
        Rest test1 = (Rest) l1.getMeasures().get(0).getElements().get(0);

        Body b2 = parseBody(r3.toString());
        Section s2 = (Section) b2.getElements().get(0);
        Line l2 = (Line) s2.getElements().get(0);
        Rest test2 = (Rest) l2.getMeasures().get(0).getElements().get(0);

        assert r1.equals(test1);
        assert r3.equals(test2);
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        r1 = new Rest(null);
    }
}
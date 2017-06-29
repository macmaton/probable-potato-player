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
		assert t1.toString().equals("(3CCC");
		assert t3.toString().equals("(3CCE");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetElements() {
        setup();
        t1.getElements().set(0, n2);
        assert t1.equals(t2);
    }
}

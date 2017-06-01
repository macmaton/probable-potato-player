package abc.music;

import org.junit.Test;

public class LineTest {
    Line l1;
    Line l2;
    Line l3;

    public void setup() {
        //TODO: test setup
    }

    @Test
    public void testEquals() {
        setup();
        assert l1.equals(l2);
        assert !(l2.equals(l3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert l1.hashCode() == l2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
//        assert l1.toString().equals("");
//        assert l3.toString().equals("");
    }

    @Test
    public void testGetMeasures() {
        setup();
    }
}

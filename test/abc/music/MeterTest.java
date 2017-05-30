package abc.music;

import org.junit.Test;

public class MeterTest {
    private Meter m1;
    private Meter m2;
    private Meter m3;

    public void setup() {
        m1 = new Meter(4, 4);
        m2 = new Meter(4, 4);
        m3 = new Meter();
    }

    @Test
    public void testEquals() {
        setup();
        assert m1.equals(m2);
        assert !(m2.equals(m3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert m1.hashCode() == m2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        assert m1.toString().equals("M: 4/4");
        assert m3.toString().equals("");
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        m1 = new Meter(-1, 4);
    }
}

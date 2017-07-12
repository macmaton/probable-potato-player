package abc.music;

import org.junit.Test;

public class MeterTest extends TestBase{
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
        Header h1 = parseHeader(createHeader(m1).toString() + "\n");
        Header h2 = parseHeader(createHeader(m3).toString() + "\n");

        assert m1.equals(h1.getMeter());
        assert m3.equals(h2.getMeter());
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        m1 = new Meter(-1, 4);
    }
}

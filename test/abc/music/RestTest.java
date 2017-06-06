package abc.music;

import org.junit.Test;

public class RestTest {
    private Rest r1;
    private Rest r2;
    private Rest r3;

    public void setup() {
        r1 = new Rest();
        r2 = new Rest();
        r3 = new Rest(new NoteLength(1, 8, true));
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
        assert r1.toString().equals("z");
        assert r3.toString().equals("z1/8");
    }

    @Test(expected = NullPointerException.class)
    public void testInitialize() {
        r1 = new Rest(null);
    }
}
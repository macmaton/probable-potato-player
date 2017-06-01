package abc.music;

import org.junit.Test;

/**
 * Created by margaret on 6/1/17.
 */
public class RepeatTest {
    Repeat r1;
    Repeat r2;
    Repeat r3;

    public void setup() {
        //TODO: test setup
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
//        assert s1.toString().equals("");
//        assert r3.toString().equals("");
    }

    @Test
    public void testGetLines() {
        setup();
    }

    @Test
    public void testGetEndings() {

    }
}

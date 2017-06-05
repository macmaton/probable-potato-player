package abc.music;

import org.junit.Test;

public class KeyTest {
    private Key k1;
    private Key k2;
    private Key k3;

    public void setup() {
        k1 = new Key(Key.Keys.BFLATMINOR);
        k2 = new Key(Key.Keys.BFLATMINOR);
        k3 = new Key(Key.Keys.GMAJOR);
    }

    @Test
    public void testEquals() {
        setup();
        assert k1.equals(k2);
        assert !(k2.equals(k3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert k1.hashCode() == k2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        assert k1.toString().equals("K: Bbm");
        assert k3.toString().equals("K: G");
    }

    //TODO: test that flats/sharps are being correctly assigned (esp flats)
}

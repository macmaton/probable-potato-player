package abc.music;

import org.junit.Test;

public class KeyTest extends TestBase {
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
        Header h1 = parseHeader(createHeader(k1).toString() + "\n");
        Header h2 = parseHeader(createHeader(k3).toString() + "\n");

        assert k1.equals(h1.getKey());
        assert k3.equals(h2.getKey());
    }

    //TODO: test that flats/sharps are being correctly assigned (esp flats)
}

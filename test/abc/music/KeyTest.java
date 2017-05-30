package abc.music;

import abc.music.Music.BaseNote;
import org.junit.Test;

public class KeyTest {
    private Key k1;
    private Key k2;
    private Key k3;

    public void setup() {
        k1 = new Key(BaseNote.B, -1, true);
        k2 = new Key(BaseNote.B, -1, true);
        k3 = new Key(BaseNote.G, 0, false);
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
        assert k1.toString().equals("Bbm");
        assert k3.toString().equals("G");
    }

	@Test(expected=AssertionError.class)
	public void testInitialize() {
		k1 = new Key(BaseNote.a, 0, false);
	}
}

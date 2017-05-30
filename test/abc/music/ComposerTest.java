package abc.music;

import org.junit.Test;

public class ComposerTest {
    private Composer c1;
    private Composer c2;
    private Composer c3;
    private Composer c4;

    public void setup() {
        c1 = new Composer("Amos");
        c2 = new Composer("Amos");
        c3 = new Composer("Sir Doobinator");
        c4 = new Composer();
    }

    @Test
    public void testEquals() {
        setup();
		assert c1.equals(c2);
		assert !(c2.equals(c3));
    }

    @Test
    public void testHashCode() {
        setup();
		assert c1.hashCode() == c2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
		assert c1.toString().equals("C: Amos");
		assert c3.toString().equals("C: Sir Doobinator");
		assert c4.toString().equals("");
    }

	@Test(expected=AssertionError.class)
	public void testInitialize() {
		c1 = new Composer(null);
	}
}

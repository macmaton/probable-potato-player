package abc.music;

import org.junit.Test;

public class ComposerTest extends TestBase {
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
		Header h1 = parseHeader(createHeader(c1).toString() + "\n");
		Header h2 = parseHeader(createHeader(c3).toString() + "\n");
		Header h3 = parseHeader(createHeader(c4).toString() + "\n");

		assert c1.equals(h1.getComposer());
		assert c3.equals(h2.getComposer());
		assert c4.equals(h3.getComposer());
    }

	@Test(expected=AssertionError.class)
	public void testInitialize() {
		c1 = new Composer(null);
	}
}

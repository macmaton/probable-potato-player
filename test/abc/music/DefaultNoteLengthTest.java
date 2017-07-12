package abc.music;

import org.junit.Test;

public class DefaultNoteLengthTest extends TestBase {
    private DefaultNoteLength d1;
    private DefaultNoteLength d2;
    private DefaultNoteLength d3;
    private DefaultNoteLength d4;
    private Meter m1 = new Meter(4,4);
    private Meter m2 = new Meter(2,4);

    public void setup() {
        d1 = new DefaultNoteLength(1,8);
        d2 = new DefaultNoteLength(1, 8);
        d3 = new DefaultNoteLength(m1);
        d4 = new DefaultNoteLength(m2);
    }

    @Test
    public void testEquals() {
        setup();
		assert d1.equals(d2);
		assert !(d2.equals(d3));
    }

    @Test
    public void testHashCode() {
        setup();
		assert d1.hashCode() == d2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
		Header h1 = parseHeader(createHeader(d1).toString() + "\n");
		Header h2 = parseHeader(createHeader(d3, m1).toString() + "\n");
		Header h3 = parseHeader(createHeader(d4, m2).toString() + "\n");

		assert d1.equals(h1.getLength());
		assert d3.equals(h2.getLength());
		assert d4.equals(h3.getLength());
    }

	@Test(expected=AssertionError.class)
	public void testInitialize() {
		d1 = new DefaultNoteLength(-1, 8);
	}
}

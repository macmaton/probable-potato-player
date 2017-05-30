package abc.music;

import org.junit.Test;

public class DefaultNoteLengthTest {
    private DefaultNoteLength d1;
    private DefaultNoteLength d2;
    private DefaultNoteLength d3;
    private DefaultNoteLength d4;

    public void setup() {
        d1 = new DefaultNoteLength(1,8);
        d2 = new DefaultNoteLength(1, 8);
        d3 = new DefaultNoteLength(new Meter(4,4));
        d4 = new DefaultNoteLength(new Meter(2,4));
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
		assert d1.toString().equals("L: 1/8");
		assert d3.toString().equals("");
		assert d4.toString().equals("");
    }

	@Test(expected=AssertionError.class)
	public void testInitialize() {
		d1 = new DefaultNoteLength(-1, 8);
	}
}

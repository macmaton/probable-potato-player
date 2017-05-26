package abc.music;

import org.junit.Test;

public class TempoTest {
	Tempo t1;
	Tempo t2;
	Tempo t3;
	Tempo t4;
	
	public void setup() {
		t1 = new Tempo(120, new NoteLength(1, 4, true));
		t2 = new Tempo(120, new NoteLength(1, 4, true));
		t3 = new Tempo(100, new NoteLength(1, 4, true));
		t4 = new Tempo(new DefaultNoteLength(new NoteLength(1,4,true), true));
	}
	
	@Test
	public void testEquals() {		
		setup();
		assert t1.equals(t2);
		assert !(t2.equals(t3));
		assert !(t3.equals(t4));
	}
	
	@Test
	public void testHashCode() {
		setup();
		assert t1.hashCode() == t2.hashCode();
	}
	
	@Test
	public void testToString() {
		setup();
		assert t1.toString().equals("Q: 1/4=120");
		assert t3.toString().equals("Q: 1/4=100");
		assert t4.toString().equals("");
	}
	
	@Test(expected=AssertionError.class)
	public void testInitialize() {
		t1 = new Tempo(-100, new NoteLength(1,8,true));
	}
}

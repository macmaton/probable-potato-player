package abc.music;

import org.junit.Test;

public class TitleTest {
	Title t1;
	Title t2;
	Title t3;
	Title t4;
	
	public void setup() {
		t1 = new Title("Fur Elise");
		t2 = new Title("Fur Elise");
		t3 = new Title("Concerto No. 5 in D minor");
	}
	
	@Test
	public void testEquals() {		
		setup();
		assert t1.equals(t2);
		assert !(t2.equals(t3));
	}
	
	@Test
	public void testHashCode() {
		setup();
		assert t1.hashCode() == t2.hashCode();
	}
	
	@Test
	public void testToString() {
		setup();
		assert t3.toString().equals("T: Concerto No. 5 in D minor");
	}
	
	@Test(expected=AssertionError.class)
	public void testInitialize() {
		t1 = new Title(null);
	}
}

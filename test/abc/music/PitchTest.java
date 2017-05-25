package abc.music;

import org.junit.Test;

import abc.music.Music.BaseNote;
import abc.music.Pitch.Accidental;

public class PitchTest {
	
	Pitch p1;
	Pitch p2;
	Pitch p3;
	Pitch p4;
	Pitch p5;
	Pitch p6;
	Pitch p7;
	Pitch p8;
	Pitch rest;
	
	public void setup() {
		p1 = new Pitch(BaseNote.C, 0, Accidental.NONE);
		p2 = new Pitch(BaseNote.C, 0, Accidental.NONE);
		p3 = new Pitch(BaseNote.C, -1, Accidental.NONE);
		p4 = new Pitch(BaseNote.c, 0, Accidental.NONE);
		p5 = new Pitch(BaseNote.c, 2, Accidental.SHARP);
		p6 = new Pitch(BaseNote.a, 1, Accidental.DOUBLESHARP);
		p7 = new Pitch(BaseNote.D, -1, Accidental.DOUBLEFLAT);
		p8 = new Pitch(BaseNote.G, -3, Accidental.FLAT);
		rest = new Pitch(BaseNote.z, 0, Accidental.NONE);
	}
	
	@Test
	public void testEquals() {		
		setup();
		assert p1.equals(p2);
		assert !(p2.equals(p3));
		assert !(p1.equals(p4));
		assert !(p4.equals(p5));
	}
	
	@Test
	public void testHashCode() {
		setup();
		assert p1.hashCode() == p2.hashCode();
	}
	
	@Test
	public void testToString() {
		setup();
		assert p1.toString().equals("C");
		assert p3.toString().equals("C,");
		assert p4.toString().equals("c");
		assert p5.toString().equals("^c''");
		assert p6.toString().equals("^^a'");
		assert p7.toString().equals("__D,");
		assert p8.toString().equals("_G,,,");
		assert rest.toString().equals("z");
	}
	
	@Test(expected=AssertionError.class)
	public void testInitialize() {
		p1 = new Pitch(BaseNote.A, 0, null);
		p2 = new Pitch(null, 0, Accidental.FLAT);
		rest = new Pitch(BaseNote.z, -1, Accidental.NONE);
	}

}

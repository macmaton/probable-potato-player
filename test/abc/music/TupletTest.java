package abc.music;

import org.junit.Test;

public class TupletTest {
    Tuplet t1;
    Tuplet t2;
    Tuplet t3;

    public void setup() {
        t1 = new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                NoteLength())
                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())});
        t2 = new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                NoteLength())
                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())});
        t3 = new Tuplet(2, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                NoteLength())
                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength())});
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
		assert t1.toString().equals("(3ABC");
		assert t3.toString().equals("(2AB");
    }

	@Test(expected=AssertionError.class)
	public void testInitialize() {
		t1 = new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                NoteLength())
                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength())});
	}

    @Test
    public void testGetNotes() {
        setup();
        t1.getElements()[0] = new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength());
        assert t1.equals(t2);
    }
}

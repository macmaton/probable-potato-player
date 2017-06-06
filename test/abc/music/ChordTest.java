package abc.music;

import org.junit.Test;

public class ChordTest {
    Chord c1;
    Chord c2;
    Chord c3;

    public void setup() {
        c1 = new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                NoteLength())
                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength());
        c2 = new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                NoteLength())
                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength());
        c3 = new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                NoteLength())
                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength
                (1, 2));
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
        assert c1.toString().equals("[ABC]");
        assert c3.toString().equals("[AB]/");
    }

    @Test
    public void testGetNotes() {
        setup();
        c1.getNotes()[0] = new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength());
        assert c1.equals(c2);
    }
}

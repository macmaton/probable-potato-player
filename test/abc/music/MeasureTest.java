package abc.music;

import org.junit.Test;

public class MeasureTest {
    Measure m1;
    Measure m2;
    Measure m3;

    public void setup() {
        m1 = new Measure(new MeasureElement[]{
                new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                        NoteLength())
                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
                new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength()),
                new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                        NoteLength())
                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})});
        m2 = new Measure(new MeasureElement[]{
                new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                        NoteLength())
                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
                new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength()),
                new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                        NoteLength())
                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})});
        m3 = new Measure(new MeasureElement[]{
                new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                NoteLength()),
                new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()),
                new Note(new
                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())});
    }

    @Test
    public void testEquals() {
        setup();
        assert m1.equals(m2);
        assert !(m2.equals(m3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert m1.hashCode() == m2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        assert m1.toString().equals(" [ABC] z (3ABC ");
        assert m3.toString().equals(" A B C ");
    }

    @Test
    public void testGetElements() {
        setup();
        m1.getElements()[0] = new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength());
        assert m1.equals(m2);
    }
}

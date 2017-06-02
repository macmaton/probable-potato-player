package abc.music;

import org.junit.Test;

public class LineTest {
    Line l1;
    Line l2;
    Line l3;

    public void setup() {
        l1 = new Line(new Voice("V1"), new Measure[]{
                new Measure(new MeasureElement[]{
                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
                        new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength()),
                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
                new Measure(new MeasureElement[]{
                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
                        new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength()),
                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})})});
        l2 = new Line(new Voice("V1"), new Measure[]{
                new Measure(new MeasureElement[]{
                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
                        new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength()),
                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
                new Measure(new MeasureElement[]{
                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
                        new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength()),
                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})})});
        l3 = new Line(new Voice("V3"), new Measure[]{
                new Measure(new MeasureElement[]{
                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
                        new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength()),
                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
                new Measure(new MeasureElement[]{
                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
                        new Note(new Pitch(Music.BaseNote.z, 0, Pitch.Accidental.NONE), new NoteLength()),
                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength())
                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
                new Measure(new MeasureElement[]{
                        new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                                NoteLength()),
                        new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()),
                        new Note(new
                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})});
    }

    @Test
    public void testEquals() {
        setup();
        assert l1.equals(l2);
        assert !(l2.equals(l3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert l1.hashCode() == l2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        assert l1.toString().equals("V: V1\n [ABC] z (3ABC | [ABC] z (3ABC ");
        assert l3.toString().equals("V: V3\n [ABC] z (3ABC | [ABC] z (3ABC | A B C ");
    }

    @Test
    public void testGetMeasures() {
        setup();
        Measure[] test = l1.getMeasures();
        test[0] = new Measure(new MeasureElement[]{
                new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
                        NoteLength()),
                new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()),
                new Note(new
                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())});
        assert l1.equals(l2);
    }
}

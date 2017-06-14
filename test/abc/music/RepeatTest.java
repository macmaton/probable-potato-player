package abc.music;

import org.junit.Test;

public class RepeatTest {
    Repeat r1;
    Repeat r2;
    Repeat r3;

    public void setup() {
//        r1 = new Repeat(new Line[]{new Line(new Measure[]{
//                new Measure(new MeasureElement[]{
//                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                        new Rest(),
//                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                new Measure(new MeasureElement[]{
//                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                        new Rest(),
//                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})})})},
//                new Line[]{new Line(new Measure[]{
//                        new Measure(new MeasureElement[]{
//                                new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                                new Rest(),
//                                new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                        new Measure(new MeasureElement[]{
//                                new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                                new Rest(),
//                                new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                        new Measure(new MeasureElement[]{
//                                new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength()),
//                                new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()),
//                                new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})})});
//        r2 = new Repeat(new Line[]{new Line(new Measure[]{
//                new Measure(new MeasureElement[]{
//                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                        new Rest(),
//                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                new Measure(new MeasureElement[]{
//                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                        new Rest(),
//                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})})})},
//                new Line[]{new Line(new Measure[]{
//                        new Measure(new MeasureElement[]{
//                                new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                                new Rest(),
//                                new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                        new Measure(new MeasureElement[]{
//                                new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                                new Rest(),
//                                new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                        new Measure(new MeasureElement[]{
//                                new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength()),
//                                new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()),
//                                new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})})});
//        r3 = new Repeat(new Line[]{new Line(new Measure[]{
//                new Measure(new MeasureElement[]{
//                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                        new Rest(),
//                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                new Measure(new MeasureElement[]{
//                        new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                        new Rest(),
//                        new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength())
//                                , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                new Measure(new MeasureElement[]{
//                        new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                NoteLength()),
//                        new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()),
//                        new Note(new
//                                Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})})},
//                new Line[]{new Line(new Measure[]{
//                        new Measure(new MeasureElement[]{
//                                new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                                new Rest(),
//                                new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                        new Measure(new MeasureElement[]{
//                                new Chord(new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())}, new NoteLength()),
//                                new Rest(),
//                                new Tuplet(3, new Note[]{new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength())
//                                        , new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()), new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})}),
//                        new Measure(new MeasureElement[]{
//                                new Note(new Pitch(Music.BaseNote.A, 0, Pitch.Accidental.NONE), new
//                                        NoteLength()),
//                                new Note(new Pitch(Music.BaseNote.B, 0, Pitch.Accidental.NONE), new NoteLength()),
//                                new Note(new
//                                        Pitch(Music.BaseNote.C, 0, Pitch.Accidental.NONE), new NoteLength())})})});
    }

    @Test
    public void testEquals() {
        setup();
        assert r1.equals(r2);
        assert !(r2.equals(r3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert r1.hashCode() == r2.hashCode();
    }

    @Test
    public void testToString() {
        //TODO: test case
//        setup();
//        System.out.println(r1.toString());
//        System.out.println(r3.toString());
//        assert r1.toString().equals("");
//        assert r3.toString().equals("");
    }

    @Test
    public void testGetLines() {
        //TODO: test case
//        setup();
    }

    @Test
    public void testGetEndings() {
        setup();
    }
}

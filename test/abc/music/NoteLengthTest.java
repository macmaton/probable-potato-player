package abc.music;

import org.junit.Test;

public class NoteLengthTest extends TestBase {
    private NoteLength n1;
    private NoteLength n2;
    private NoteLength n3;
    private NoteLength n4;
    private NoteLength n5;
    private NoteLength n6;
    private NoteLength n7;
    private NoteLength n8;
    private NoteLength n9;
    private NoteLength n10;

    public void setup() {
        n1 = new NoteLength(1, 3);
        n2 = new NoteLength(null, 3);
        n3 = new NoteLength(1, null);
        n4 = new NoteLength(1, 2);
        n5 = new NoteLength(null, null);
        n6 = new NoteLength(null, null);
        n7 = new NoteLength(1, 3);
        n8 = new NoteLength(1, 1);
        n9 = new NoteLength(3, 1);
        n10 = new NoteLength();
    }

    @Test
    public void testEquals() {
        setup();
        assert n1.equals(n2);
        assert n3.equals(n4);
        assert n5.equals(n6);
        assert n1.equals(n7);
        assert !n6.equals(n8);
        assert n8.equals(n10);
    }

    @Test
    public void testHashCode() {
        setup();
        assert n1.hashCode() == n7.hashCode();
        assert n6.hashCode() != n8.hashCode();
        assert n8.hashCode() == n10.hashCode();
    }

    @Test
    public void testToString() {
        setup();

        Body b1 = parseBody(new Note(createPitch(), n1).toString());
        Section s1 = (Section) b1.getSections().get(0);
        Line l1 = (Line) s1.getElements().get(0);
        Note nt1 = (Note) l1.getMeasures().get(0).getElements().get(0);
        NoteLength test1 = nt1.getLength();

        Body b2 = parseBody(new Note(createPitch(), n2).toString());
        Section s2 = (Section) b2.getSections().get(0);
        Line l2 = (Line) s2.getElements().get(0);
        Note nt2 = (Note) l2.getMeasures().get(0).getElements().get(0);
        NoteLength test2 = nt2.getLength();

        Body b3 = parseBody(new Note(createPitch(), n3).toString());
        Section s3 = (Section) b3.getSections().get(0);
        Line l3 = (Line) s3.getElements().get(0);
        Note nt3 = (Note) l3.getMeasures().get(0).getElements().get(0);
        NoteLength test3 = nt3.getLength();

        Body b4 = parseBody(new Note(createPitch(), n4).toString());
        Section s4 = (Section) b4.getSections().get(0);
        Line l4 = (Line) s4.getElements().get(0);
        Note nt4 = (Note) l4.getMeasures().get(0).getElements().get(0);
        NoteLength test4 = nt4.getLength();

        Body b5 = parseBody(new Note(createPitch(), n5).toString());
        Section s5 = (Section) b5.getSections().get(0);
        Line l5 = (Line) s5.getElements().get(0);
        Note nt5 = (Note) l5.getMeasures().get(0).getElements().get(0);
        NoteLength test5 = nt5.getLength();

        Body b6 = parseBody(new Note(createPitch(), n6).toString());
        Section s6 = (Section) b6.getSections().get(0);
        Line l6 = (Line) s6.getElements().get(0);
        Note nt6 = (Note) l6.getMeasures().get(0).getElements().get(0);
        NoteLength test6 = nt6.getLength();

        Body b7 = parseBody(new Note(createPitch(), n8).toString());
        Section s7 = (Section) b7.getSections().get(0);
        Line l7 = (Line) s7.getElements().get(0);
        Note nt7 = (Note) l7.getMeasures().get(0).getElements().get(0);
        NoteLength test7 = nt7.getLength();

        Body b8 = parseBody(new Note(createPitch(), n9).toString());
        Section s8 = (Section) b8.getSections().get(0);
        Line l8 = (Line) s8.getElements().get(0);
        Note nt8 = (Note) l8.getMeasures().get(0).getElements().get(0);
        NoteLength test8 = nt8.getLength();

        Body b9 = parseBody(new Note(createPitch(), n10).toString());
        Section s9 = (Section) b9.getSections().get(0);
        Line l9 = (Line) s9.getElements().get(0);
        Note nt9 = (Note) l9.getMeasures().get(0).getElements().get(0);
        NoteLength test9 = nt9.getLength();

        assert n1.equals(test1);
        assert n2.equals(test2);
        assert n3.equals(test3);
        assert n4.equals(test4);
        assert n5.equals(test5);
        assert n6.equals(test6);
        assert n8.equals(test7);
        assert n9.equals(test8);
        assert n10.equals(test9);
    }
}

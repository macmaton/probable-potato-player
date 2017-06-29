package abc.music;

import abc.music.Music.BaseNote;
import abc.music.Pitch.Accidental;
import org.junit.Test;

public class NoteTest extends TestBase {
    private Note n1;
    private Note n2;
    private Note n3;
    private Note n4;

    public void setup() {
        n1 = new Note(new Pitch(BaseNote.C, -3, Accidental.NONE), new NoteLength(null, null));
        n2 = new Note(new Pitch(BaseNote.C, -3, Accidental.NONE), new NoteLength(null, null));
        n3 = new Note(new Pitch(BaseNote.D, 0, Accidental.SHARP), new NoteLength(2, 1));
        n4 = new Note(new Pitch(BaseNote.A, 0, Accidental.FLAT), new NoteLength(1, 4));
    }

    @Test
    public void testEquals() {
        setup();
        assert n1.equals(n2);
        assert !(n2.equals(n3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert n1.hashCode() == n2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        Body b1 = parseBody(n1.toString());
        Section s1 = (Section) b1.getElements().get(0);
        Line l1 = (Line) s1.getElements().get(0);
        Note test1 = (Note) l1.getMeasures().get(0).getElements().get(0);

        Body b2 = parseBody(n3.toString());
        Section s2 = (Section) b2.getElements().get(0);
        Line l2 = (Line) s2.getElements().get(0);
        Note test2 = (Note) l2.getMeasures().get(0).getElements().get(0);

        Body b3 = parseBody(n4.toString());
        Section s3 = (Section) b3.getElements().get(0);
        Line l3 = (Line) s3.getElements().get(0);
        Note test3 = (Note) l3.getMeasures().get(0).getElements().get(0);

        assert n1.equals(test1);
        assert n3.equals(test2);
        assert n4.equals(test3);
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        n1 = new Note(null, null);
    }
}

package abc.music;

import org.junit.Test;

public class NoteLengthTest {
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
        n1 = new NoteLength(1, 3, true);
        n2 = new NoteLength(null, 3, true);
        n3 = new NoteLength(1, null, true);
        n4 = new NoteLength(1, 2, true);
        n5 = new NoteLength(null, null, true);
        n6 = new NoteLength(null, null, false);
        n7 = new NoteLength(1, 3, true);
        n8 = new NoteLength(1, 1, false);
        n9 = new NoteLength(3, 1, true);
        n10 = new NoteLength();
    }

    @Test
    public void testEquals() {
        setup();
        assert !n1.equals(n2);
        assert !n3.equals(n4);
        assert !n5.equals(n6);
        assert n1.equals(n7);
        assert n6.equals(n8);
        assert n8.equals(n10);
    }

    @Test
    public void testHashCode() {
        setup();
        assert n1.hashCode() == n7.hashCode();
        assert n6.hashCode() == n8.hashCode();
        assert n8.hashCode() == n10.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        assert n1.toString().equals("1/3");
        assert n2.toString().equals("/3");
        assert n3.toString().equals("1/");
        assert n4.toString().equals("1/2");
        assert n5.toString().equals("/");
        assert n6.toString().equals("");
        assert n8.toString().equals("");
        assert n9.toString().equals("3");
        assert n10.toString().equals("");
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        n1 = new NoteLength(1, 3, false);
    }
}

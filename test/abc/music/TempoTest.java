package abc.music;

import org.junit.Test;

public class TempoTest {
    private Tempo t1;
    private Tempo t2;
    private Tempo t3;
    private Tempo t4;

    public void setup() {
        t1 = new Tempo(120, new NoteLength(1, 4));
        t2 = new Tempo(120, new NoteLength(1, 4));
        t3 = new Tempo(100, new NoteLength(1, 4));
        t4 = new Tempo(new DefaultNoteLength(1, 4));
    }

    @Test
    public void testEquals() {
        setup();
        assert t1.equals(t2);
        assert !(t2.equals(t3));
        assert !(t3.equals(t4));
    }

    @Test
    public void testHashCode() {
        setup();
        assert t1.hashCode() == t2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        assert t1.toString().equals("Q: 1/4=120");
        assert t3.toString().equals("Q: 1/4=100");
        assert t4.toString().equals("");
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        t1 = new Tempo(-100, new NoteLength(1, 8));
    }
}

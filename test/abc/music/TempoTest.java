package abc.music;

import org.junit.Test;

public class TempoTest extends TestBase {
    private Tempo t1;
    private Tempo t2;
    private Tempo t3;
    private Tempo t4;
    private NoteLength n1 = new NoteLength(1, 4);
    private DefaultNoteLength d1 = new DefaultNoteLength(1, 4);

    public void setup() {
        t1 = new Tempo(120, n1);
        t2 = new Tempo(120, n1);
        t3 = new Tempo(100, n1);
        t4 = new Tempo(d1);
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
        Header h1 = parseHeader(createHeader(t1).toString() + "\n");
        Header h2 = parseHeader(createHeader(t3).toString() + "\n");
        Header h3 = parseHeader(createHeader(t4, d1).toString() + "\n");

        assert t1.equals(h1.getTempo());
        assert t3.equals(h2.getTempo());
        assert t4.equals(h3.getTempo());
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        t1 = new Tempo(-100, new NoteLength(1, 8));
    }
}

package abc.music;

import org.junit.Test;

public class RepeatTest extends TestBase {
    Repeat r1;
    Repeat r2;
    Repeat r3;

    public void setup() {
        r1 = createRepeat();
        r2 = createRepeat();
        r3 = createRepeat(createMeasure(createChord()));
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
        setup();

        Body b1 = parseBody(r1.toString());
        Section s1 = (Section) b1.getElements().get(0);
        Repeat test1 = (Repeat) s1.getElements().get(0);

        System.out.println(r1.toString());
        System.out.println(test1.toString());

        Body b2 = parseBody(r3.toString());
        Section s2 = (Section) b2.getElements().get(0);
        Repeat test2 = (Repeat) s2.getElements().get(0);

        System.out.println(r3.toString());
        System.out.println(test2.toString());

        assert r1.equals(test1);
        assert r3.equals(test2);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetRepeatedLines() {
        setup();
        r1.getRepeatedLines().set(0, createLine());
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetEndings() {
        setup();
        r1.getEndings().set(0, createLine());
    }
}

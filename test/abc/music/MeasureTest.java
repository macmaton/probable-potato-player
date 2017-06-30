package abc.music;

import org.junit.Test;

public class MeasureTest extends TestBase {
    Measure m1;
    Measure m2;
    Measure m3;

    public void setup() {
        m1 = createMeasure();
        m2 = createMeasure();
        m3 = createMeasure(createChord());
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
        Body b1 = parseBody(m1.toString());
        Section s1 = (Section) b1.getSections().get(0);
        Line l1 = (Line) s1.getElements().get(0);
        Measure test1 = l1.getMeasures().get(0);

        Body b2 = parseBody(m3.toString());
        Section s2 = (Section) b2.getSections().get(0);
        Line l2 = (Line) s2.getElements().get(0);
        Measure test2 = l2.getMeasures().get(0);

        assert m1.equals(test1);
        assert m3.equals(test2);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetElements() {
        setup();
        m1.getElements().set(0, createRest());
    }
}

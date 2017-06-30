package abc.music;

import org.junit.Test;

public class LineTest extends TestBase {
    Line l1;
    Line l2;
    Line l3;

    public void setup() {
        l1 = createLine();
        l2 = createLine();
        l3 = createLine(createMeasure(createTuplet()));
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
        Body b1 = parseBody(l1.toString());
        Section s1 = (Section) b1.getSections().get(0);
        Line test1 = (Line) s1.getElements().get(0);

        Body b2 = parseBody(l3.toString());
        Section s2 = (Section) b2.getSections().get(0);
        Line test2 = (Line) s2.getElements().get(0);

        assert l1.equals(test1);
        assert l3.equals(test2);
    }
}

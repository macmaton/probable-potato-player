package abc.music;

import org.junit.Test;

public class SectionTest extends TestBase {
    Section s1;
    Section s2;
    Section s3;

    public void setup() {
        s1 = createSection();
        s2 = createSection();
        s3 = createSection(createLine());
    }

    @Test
    public void testEquals() {
        setup();
        assert s1.equals(s2);
        assert !(s2.equals(s3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert s1.hashCode() == s2.hashCode();
    }

    @Test
    public void testToString() {
        setup();

        Body b1 = parseBody(s1.toString());
        Section test1 = (Section) b1.getSections().get(0);

        Body b2 = parseBody(s3.toString());
        Section test2 = (Section) b2.getSections().get(0);

        assert s1.equals(test1);
        assert s3.equals(test2);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetElements() {
        setup();
        s1.getElements().set(0, createLine());
    }
}

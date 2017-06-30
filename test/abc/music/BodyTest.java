package abc.music;

import org.junit.Test;

public class BodyTest extends TestBase {
    Body b1;
    Body b2;
    Body b3;

    public void setup() {
        b1 = createBody();
        b2 = createBody();
        b3 = createBody(createSection(createLine()));
    }

    @Test
    public void testEquals() {
        setup();
		assert b1.equals(b2);
		assert !(b2.equals(b3));
    }

    @Test
    public void testHashCode() {
        setup();
		assert b1.hashCode() == b2.hashCode();
    }

    @Test
    public void testToString() {
        setup();

        Body test1 = parseBody(b1.toString());
        Body test2 = parseBody(b3.toString());

        System.out.println(b1.toString());
        System.out.println(test1.toString());
        System.out.println(b3.toString());
        System.out.println(test2.toString());

        assert b1.equals(test1);
        assert b3.equals(test2);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetSections() {
        setup();
        b1.getSections().set(0, createSection());
    }
}

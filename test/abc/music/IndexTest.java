package abc.music;

import org.junit.Test;

public class IndexTest extends TestBase {
    private Index x1;
    private Index x2;
    private Index x3;
    private Index x4;

    public void setup() {
        x1 = new Index(23);
        x2 = new Index(23);
        x3 = new Index(41);
        x4 = new Index(null);
    }

    @Test
    public void testEquals() {
        setup();
		assert x1.equals(x2);
		assert !(x2.equals(x3));
    }

    @Test
    public void testHashCode() {
        setup();
		assert x1.hashCode() == x2.hashCode();
    }

    @Test
    public void testToString() {
        setup();
        Header h1 = parseHeader(createHeader(x1).toString() + "\n");
        Header h4 = parseHeader(createHeader(x4).toString() + "\n");

		assert x1.equals(h1.getIndex());
		assert x4.equals(h4.getIndex());
    }
}

package abc.music;

import org.junit.Test;

public class TitleTest extends TestBase {
    private Title t1;
    private Title t2;
    private Title t3;

    public void setup() {
        t1 = new Title("Fur Elise");
        t2 = new Title("Fur Elise");
        t3 = new Title("Concerto No. 5 in D minor");
    }

    @Test
    public void testEquals() {
        setup();
        assert t1.equals(t2);
        assert !(t2.equals(t3));
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

        assert t1.equals(h1.getTitle());
        assert t3.equals(h2.getTitle());
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        t1 = new Title(null);
    }
}

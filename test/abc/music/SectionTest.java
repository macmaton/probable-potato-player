package abc.music;

import org.junit.Test;

public class SectionTest {
    Section s1;
    Section s2;
    Section s3;

    public void setup() {
        //TODO: test setup
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
//        assert s1.toString().equals("");
//        assert s3.toString().equals("");
    }

    @Test
    public void testGetMeasures() {
        setup();
    }
}

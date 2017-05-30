package abc.music;

import org.junit.Test;

public class VoiceTest {

    private Voice v1;
    private Voice v2;
    private Voice v3;

    public void setup() {
        v1 = new Voice("test");
        v2 = new Voice("test");
        v3 = new Voice("");
    }

    @Test
    public void testEquals() {
        setup();
        assert v1.equals(v2);
        assert !(v2.equals(v3));
    }

    @Test
    public void testHashCode() {
        setup();
        assert v1.hashCode() == v2.hashCode();
        assert !(v1.hashCode() == v3.hashCode());
    }

    @Test
    public void testToString() {
        setup();
        assert v1.toString().equals("V: test");
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        Voice v4 = new Voice(null);
    }
}

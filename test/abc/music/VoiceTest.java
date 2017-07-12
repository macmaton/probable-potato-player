package abc.music;

import org.junit.Test;

public class VoiceTest extends TestBase {

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

        Header h1 = parseHeader(createHeader(v1).toString() + "\n");
        Header h2 = parseHeader(createHeader(v3).toString() + "\n");

        assert v1.equals(h1.getVoices().get(0));
        assert v3.equals(h2.getVoices().get(0));
    }

    @Test(expected = AssertionError.class)
    public void testInitialize() {
        Voice v4 = new Voice(null);
    }
}

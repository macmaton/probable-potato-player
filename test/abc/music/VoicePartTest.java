package abc.music;

import org.junit.Test;

public class VoicePartTest extends TestBase {
    VoicePart v1;
    VoicePart v2;
    VoicePart v3;

    public void setup() {
        v1 = createVoicePart();
        v2 = createVoicePart();
        v3 = createVoicePart(createLine());
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
    }

    @Test
    public void testToString() {
        setup();

        Body b1 = parseBody(v1.toString());
        Section s1 = b1.getSections().get(0);
        VoicePart test1 = (VoicePart) s1.getElements().get(0);

        Body b2 = parseBody(v3.toString());
        Section s2 = b2.getSections().get(0);
        VoicePart test2 = (VoicePart) s2.getElements().get(0);

        assert v1.equals(test1);
        assert v3.equals(test2);
    }
}

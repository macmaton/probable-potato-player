package abc.music;

import java.util.Arrays;

public class VoicePart implements SectionElement {
    private final Voice voice;
    private final VoicePartElement[] elements;

    public VoicePart(Voice voice, VoicePartElement[] elements) {
        this.voice = voice;
        this.elements = elements;
        checkRep();
    }

    @Override
    public int hashCode() {
        int result = voice.hashCode();
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        VoicePart that = (VoicePart) obj;

        if (!this.voice.equals(that.voice)) return false;
        return Arrays.equals(elements, that.elements);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(voice.toString());
        result.append('\n');
        for (VoicePartElement e : elements) {
            result.append(e.toString());
            result.append('\n');
        }
        return result.toString();
    }

    private void checkRep() {
        assert this.voice != null;
        assert this.elements != null;
        assert this.elements.length > 0;
        for (VoicePartElement e : elements) {
            assert e != null;
        }
    }
}

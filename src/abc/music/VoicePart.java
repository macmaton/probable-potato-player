package abc.music;

import java.util.Arrays;
import java.util.Objects;

//TODO: test

public class VoicePart implements SectionElement {
    Voice voice;
    VoicePartElement[] elements;

    public VoicePart(Voice voice, VoicePartElement[] elements) {
        Objects.requireNonNull(voice, "voice may not be null");
        Objects.requireNonNull(elements, "a VoicePart must have elements");
        if(elements.length == 0) {
            throw new IllegalArgumentException("elements may not be empty");
        }
        Objects.requireNonNull(elements[0], "VoicePartElements in elements may not be null");

        this.voice = voice;
        this.elements = elements;
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
    public int hashCode() {
        int result = voice.hashCode();
        result = 31 * result + Arrays.hashCode(elements);
        return result;
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
}

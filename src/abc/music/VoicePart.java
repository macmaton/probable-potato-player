package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VoicePart implements SectionElement {
    private final Voice voice;
    private final List<VoicePartElement> elements;

    public VoicePart(Voice voice, List<VoicePartElement> elements) {
        if (elements != null) {
            this.elements = Collections.unmodifiableList(new ArrayList<>(elements));
        } else {
            throw new IllegalArgumentException("elements must be a non-null list");
        }
        this.voice = voice;
        checkRep();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        VoicePart that = (VoicePart) obj;

        if (!this.voice.equals(that.voice)) return false;
        return this.elements.equals(that.elements);
    }

    @Override
    public int hashCode() {
        int result = voice.hashCode();
        result = 31 * result + elements.hashCode();
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

    private void checkRep() {
        assert this.voice != null;
        assert this.elements != null;
        assert this.elements.size() > 0;
        for (VoicePartElement e : elements) {
            assert e != null;
        }
    }

    @Override
    public Components getType() {
        return Components.VOICEPART;
    }
}

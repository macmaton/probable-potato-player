package abc.music;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * An immutable data type representing the header of a piece in abc notation
 * 1 - X: index number; 2 - T: title; * - C: composer; * - M: meter; * - L: length -
 * default duration of a note; last - K: key
 */
public class Header implements Music {
    private final Index index;
    private final Title title;
    private final Key key;
    private final Composer composer;
    private final Meter meter;
    private final DefaultNoteLength length;
    private final Tempo tempo;
    private final List<Voice> voices;

    public Index getIndex() {
        return index;
    }

    public Title getTitle() {
        return title;
    }

    public Key getKey() {
        return key;
    }

    public Composer getComposer() {
        return composer;
    }

    public Meter getMeter() {
        return meter;
    }

    public DefaultNoteLength getLength() {
        return length;
    }

    public Tempo getTempo() {
        return tempo;
    }

    public List<Voice> getVoices() {
        return voices;
    }

    public Header(Index index, Title title, Key key, Meter meter, DefaultNoteLength length, Tempo tempo, Composer
            composer, List<Voice> voices) {
        this.index = index;
        this.title = title;
        this.key = key;
        if (composer != null) {
            this.composer = composer;
        } else {
            this.composer = new Composer();
        }
        if (meter != null) {
            this.meter = meter;
        } else {
            this.meter = new Meter();
        }
        if (length != null) {
            this.length = length;
        } else {
            this.length = new DefaultNoteLength(this.meter);
        }
        if (tempo != null) {
            this.tempo = tempo;
        } else {
            this.tempo = new Tempo(this.length);
        }
        if (voices != null) {
            this.voices = Collections.unmodifiableList(new ArrayList<>(voices));
        } else {
            this.voices = voices;
        }

        checkRep();
    }

    public Header(Index index, Title title, Key key) {
        this(index, title, key, null, null, null, null, null);

        checkRep();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Header that = (Header) obj;

        if (!index.equals(that.index)) return false;
        if (!title.equals(that.title)) return false;
        if (!key.equals(that.key)) return false;
        if (composer != null ? !composer.equals(that.composer) : that.composer != null) return false;
        if (meter != null ? !meter.equals(that.meter) : that.meter != null) return false;
        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (tempo != null ? !tempo.equals(that.tempo) : that.tempo != null) return false;
        return voices != null ? voices.equals(that.voices) : that.voices == null;
    }

    @Override
    public int hashCode() {
        int result = index.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + key.hashCode();
        result = 31 * result + (composer != null ? composer.hashCode() : 0);
        result = 31 * result + (meter != null ? meter.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (tempo != null ? tempo.hashCode() : 0);
        result = 31 * result + (voices != null ? voices.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("X: ");
        result.append(index.toString());
        result.append('\n');
        result.append("T: ");
        result.append(title.toString());
        result.append('\n');
        
        if (!composer.toString().isEmpty()) {
        	result.append("C: ");
            result.append(composer.toString());
            result.append('\n');
        }
        if (!meter.toString().isEmpty()) {
        	result.append("M: ");
            result.append(meter.toString());
            result.append('\n');
        }
        if (!length.toString().isEmpty()) {
        	result.append("L: ");
            result.append(length.toString());
            result.append('\n');
        }
        if (!tempo.toString().isEmpty()) {
        	result.append("Q: ");
            result.append(tempo.toString());
            result.append('\n');
        }
        if (voices != null) {
            for (Voice v : voices) {
            	result.append("V: ");
                result.append(v.toString());
                result.append('\n');
            }
        }
        
        result.append("K: ");
        result.append(key.toString());

        return result.toString();
    }

    private void checkRep() {
        assert this.index != null;
        assert this.title != null;
        assert this.key != null;
        assert this.composer != null;
        assert this.length != null;
        assert this.meter != null;
        assert this.tempo != null;
        if (this.voices != null) {
            assert this.voices.size() > 0;
            for (Voice v : this.voices) {
                assert v != null;
            }
        }
    }

    @Override
    public Components getType() {
        return Components.HEADER;
    }
}

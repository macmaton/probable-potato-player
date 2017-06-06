package abc.music;

import java.util.Arrays;

/**
 * An immutable data type representing the header of a piece in abc notation
 * 1 - X: index number; 2 - T: title; * - C: composer; * - M: meter; * - L: length -
 * default duration of a note; last - K: key
 */
public class Header {
    private final Index index;
    private final Title title;
    private final Key key;
    private final Composer composer;
    private final DefaultNoteLength length;
    private final Meter meter;
    private final Tempo tempo;
    private final Voice[] voices;

    public Header(Index index, Title title, Key key) {
        this.index = index;
        this.title = title;
        this.key = key;
        this.composer = new Composer();
        this.meter = new Meter();
        this.length = new DefaultNoteLength(this.meter);
        this.tempo = new Tempo(this.length);
        this.voices = null;

        checkRep();
    }

    //TODO: other constructors

//    @Override
//    public boolean equals() {
//        TODO
//    }

    @Override
    public int hashCode() {
        int result = index.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + key.hashCode();
        result = 31 * result + (composer != null ? composer.hashCode() : 0);
        result = 31 * result + (length != null ? length.hashCode() : 0);
        result = 31 * result + (meter != null ? meter.hashCode() : 0);
        result = 31 * result + (tempo != null ? tempo.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(voices);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(index.toString());
        result.append('\n');
        result.append(title.toString());
        result.append('\n');

        //TODO: other fields

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
            assert this.voices.length > 0;
            for (int i = 0; i<this.voices.length; i++) {
                assert this.voices[i] != null;
            }
        }
    }
}

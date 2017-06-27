package abc.music;

/**
 * Builds immutable data type representing a piece of music in abc notation
 * preserves transcription (ex, if a courtesy accidental is provided, it will be retained)
 * header - provides information about piece
 * body - contains transcription of music
 * limited implementation based on Spring 2016 version of MIT OCW 6.005
 */
public interface Music {

    /**
     * The octave that includes middle C
     */
    enum BaseNote {
        A, B, C, D, E, F, G
    }

    enum Components {
        BODY, CHORD, COMPOSER, DEFAULTNOTELENGTH, HEADER, INDEX, KEY, LINE, MEASURE, METER, NOTE, NOTELENGTH, PITCH,
        PARTIALREPEAT, REPEAT, REST, SECTION, TEMPO, TITLE, TUPLET, VOICE, VOICEPART
    }

    Components getType();
}

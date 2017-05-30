package abc.player;

import abc.music.Music;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * <p>
     * (Your code should not exit the application abnormally using
     * System.exit().)
     *
     * @param file the name of input abc file
     */
    public static void play(String file) {
        // YOUR CODE HERE
    }

    public static void main(String[] args) {
        // CALL play() HERE USING ARGS
        Music.getBodyParseTree("/home/margaret/workspace/abcplayer/sample_abc/little_night_music.abc");
    }
}

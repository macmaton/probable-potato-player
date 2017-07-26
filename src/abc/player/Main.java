package abc.player;

import abc.sound.SequencePlayer;
import java.io.InputStream;

import javax.sound.midi.MidiUnavailableException;

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
    private static void play(InputStream input) {
        // YOUR CODE HERE
    	SequencePlayer player = AbcMidiFactory.getSequencePlayer(input);

        try {
            player.play();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // CALL play() HERE USING ARGS
        //play(args[0]);
    	
    	if (args[0].endsWith(".abc")) {
    		AbcMidiFactory.getMidiFile(AbcMidiFactory.fileToStream(args[0]), args[0].substring(args[0].lastIndexOf("/"), args[0].indexOf(".abc")));
    	}
    }
    

}

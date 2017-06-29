package abc.player;

import abc.music.Body;
import abc.music.Header;
import abc.music.NoteLength;
import abc.parser.*;
import abc.sound.Pitch;
import abc.sound.SequencePlayer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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
    private static void play(String file) {
        // YOUR CODE HERE

        ParseTree headerTree = getHeaderParseTree(file);
        ParseTreeWalker walker = new ParseTreeWalker();
        HeaderListener headerListener = new MusicHeaderBuilder();
        walker.walk(headerListener, headerTree);
        MusicHeaderBuilder hb = (MusicHeaderBuilder) headerListener;
        Header header = (Header) hb.getHeader();
        System.out.println(header.toString());

        ParseTree bodyTree = getBodyParseTree(file);
        BodyListener bodyListener = new MusicBodyBuilder();
        walker.walk(bodyListener, bodyTree);
        MusicBodyBuilder bb = (MusicBodyBuilder) bodyListener;
        Body body = (Body) bb.getBody();
        System.out.println(body.toString());
    }

    public static void main(String[] args) {
        // CALL play() HERE USING ARGS
        play(args[0]);
    }

    private static ParseTree parse(String fileName) {
        File file = new File(fileName);
        FileInputStream fis;
        ANTLRInputStream stream = null;
        try {
            fis = new FileInputStream(file);
            stream = new ANTLRInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        HeaderParser parser;
        ParseTree root;

        HeaderLexer lexer = new HeaderLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new HeaderParser(tokens);
        root = parser.root();

        return root;
    }

    private static ParseTree getHeaderParseTree(String fileName) {
        ParseTree root = parse(fileName);
        return root.getChild(0);
    }

    private static ParseTree getBodyParseTree(String fileName) {
        //ParseTree root = parse(fileName);
        ParseTree root = getHeaderParseTree(fileName);
        String bodyString = root.getChild(root.getChildCount()-1).getText().replace("<EOF>", "");
        ANTLRInputStream stream = new ANTLRInputStream(bodyString);

        BodyParser parser;
        ParseTree body;

        BodyLexer lexer = new BodyLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new BodyParser(tokens);
        body = parser.body();

        return body;
    }

    private SequencePlayer buildPlayer(Header header, Body body) {
        try {
            int ticksPerBeat = 12;
            SequencePlayer player = new SequencePlayer(header.getTempo().getBeatsPerMinute(), ticksPerBeat);

            //TODO: work through body to create and add pitches to player
            //player.addNote(buildPitch(parsed, key).toMidiNote(), startTick, getNoteTicks(parsed, header,
            // ticksPerBeat);



        } catch (MidiUnavailableException e) {
            //TODO: useful error message?
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
        throw new NotImplementedException();
    }

    private int getNoteTicks(NoteLength parsed, Header header, int ticksPerBeat) {
        //numTicks = ticksPerBeat * (NoteLength * DefaultNoteLength / BeatLength)
        double working = parsed.getNoteLength() * header.getLength().getDefaultNoteLength();
        working = working/header.getTempo().getBeatLength().getNoteLength();
        int numTicks = (int) (working*ticksPerBeat);
        return numTicks;
    }

    private Pitch buildPitch(abc.music.Pitch parsed, abc.music.Key key) {
        abc.music.Pitch actual = key.getPitch(parsed);
        Pitch pitch = new Pitch(actual.getBaseNoteChar());
        pitch.transpose(actual.getSemitonesUp());
        return pitch;
    }
}

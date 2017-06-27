package abc.player;

import abc.music.Body;
import abc.music.Header;
import abc.parser.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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
    public static void play(String file) {
        // YOUR CODE HERE
    }

    public static void main(String[] args) {
        // CALL play() HERE USING ARGS
        ParseTree headerTree = getHeaderParseTree("/home/margaret/workspace/abcplayer/sample_abc/aldersgate.abc");
        ParseTreeWalker walker = new ParseTreeWalker();
        HeaderListener headerListener = new MusicHeaderBuilder();
        walker.walk(headerListener, headerTree);
        MusicHeaderBuilder hb = (MusicHeaderBuilder) headerListener;
        Header header = (Header) hb.getHeader();
        System.out.println(header.toString());

        ParseTree bodyTree = getBodyParseTree("/home/margaret/workspace/abcplayer/sample_abc/aldersgate.abc");
        BodyListener bodyListener = new MusicBodyBuilder();
        walker.walk(bodyListener, bodyTree);
        MusicBodyBuilder bb = (MusicBodyBuilder) bodyListener;
        Body body = (Body) bb.getBody();
        System.out.println(body.toString());
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

    public static ParseTree getHeaderParseTree(String fileName) {
        ParseTree root = parse(fileName);
        return root.getChild(0);
    }

    public static ParseTree getBodyParseTree(String fileName) {
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

}

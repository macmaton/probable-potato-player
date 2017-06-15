package abc.player;

import abc.music.*;
import abc.parser.*;
import org.antlr.v4.gui.Trees;
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
        ParseTree tree = getHeaderParseTree("/home/margaret/workspace/abcplayer/sample_abc/fur_elise.abc");
        ParseTreeWalker walker = new ParseTreeWalker();
        HeaderListener listener = new MusicHeaderBuilder();
        walker.walk(listener, tree);
        MusicHeaderBuilder hb = (MusicHeaderBuilder) listener;
        Header header = (Header) hb.getHeader();
        System.out.println(header.toString());
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
        ParseTree root = parse(fileName);
        ANTLRInputStream stream = new ANTLRInputStream(root.getChild(1).getText());

        BodyParser parser;
        ParseTree body;

        BodyLexer lexer = new BodyLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new BodyParser(tokens);
        body = parser.body();

        Trees.inspect(body, parser);

        return body;
    }

}

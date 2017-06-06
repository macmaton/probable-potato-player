package abc.music;

import abc.parser.BodyLexer;
import abc.parser.BodyParser;
import abc.parser.HeaderLexer;
import abc.parser.HeaderParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Builds immutable data type representing a piece of music in abc notation
 * preserves transcription (ex, if a courtesy accidental is provided, it will be retained)
 * header - provides information about piece
 * body - contains transcription of music
 * limited implementation based on Spring 2016 version of MIT OCW 6.005
 */
public class Music {

    public static ParseTree parse(String fileName) {
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
        ParseTree header = root.getChild(0);
        return header;
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

    /**
     * The octave that includes middle C
     */
    enum BaseNote {
        A, B, C, D, E, F, G
    }
}

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

    enum BaseNote {C, D, E, F, G, A, B, c, d, e, f, g, a, b, z}

//    /**
//     * @return hash code value consistent with the equals() definition of structural equality, such that for all
//     * e1,e2:Music, e1.equals(e2) implies e1.hashCode() == e2.hashCode()
//     */
//    @Override
//    public int hashCode();
//
////	public static Music buildAST(ParseTree tree) {
////
////
////	}
//
//    /**
//     * @param thatObject any object
//     * @return true if and only if this and thatObject are structurally-equal Music.
//     */
//    @Override
//    public boolean equals(Object thatObject);
//
//    /**
//     * @return a parsable representation in abc notation, such that for all e:Music, e.equals(Music.parse(e.toString())).
//     */
//    @Override
//    public String toString();
//
}

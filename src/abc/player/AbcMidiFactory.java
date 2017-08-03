package abc.player;

import abc.music.Body;
import abc.music.Header;
import abc.parser.*;
import abc.sound.SequencePlayer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

public class AbcMidiFactory {

    public static File getMidiFile(InputStream input, String outputFileName) {
        
    	SequencePlayer player = getSequencePlayer(input);
    	if (!outputFileName.endsWith(".midi")) {
    		if (outputFileName.indexOf(".") != -1) {
    			outputFileName = outputFileName.substring(0, outputFileName.indexOf("."));
    		}
    		outputFileName = outputFileName.concat(".midi");
    	}
    	return player.toFile("./" + outputFileName);
    }
    
    public static ByteArrayOutputStream getStream(InputStream input) {
    	SequencePlayer player = getSequencePlayer(input);
    	return player.toStream();
    }

    private static ParseTree parse(InputStream input) {
    	
    	ANTLRInputStream stream = null;
    	
    	try {
			stream = new ANTLRInputStream(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
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

    private static ParseTree getBodyParseTree(ParseTree headerTree) {
        String bodyString = headerTree.getChild(headerTree.getChildCount()-1).getText().replace("<EOF>", "");
        ANTLRInputStream stream = new ANTLRInputStream(bodyString);

        BodyParser parser;
        ParseTree body;

        BodyLexer lexer = new BodyLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new BodyParser(tokens);
        body = parser.body();

        return body;
    }
    
    static SequencePlayer getSequencePlayer(InputStream input) {
    
        ParseTree headerTree = parse(input).getChild(0);
        ParseTreeWalker walker = new ParseTreeWalker();
        HeaderListener headerListener = new MusicHeaderBuilder();
        walker.walk(headerListener, headerTree);
        MusicHeaderBuilder hb = (MusicHeaderBuilder) headerListener;
        Header header = (Header) hb.getHeader();
        System.out.println(header.toString());

        ParseTree bodyTree = getBodyParseTree(headerTree);
        BodyListener bodyListener = new MusicBodyBuilder();
        walker.walk(bodyListener, bodyTree);
        MusicBodyBuilder bb = (MusicBodyBuilder) bodyListener;
        Body body = (Body) bb.getBody();
        System.out.println(body.toString());

        PlayerBuilder playerBuilder = new PlayerBuilder(header, body, 12);
        return playerBuilder.getPlayer();
    }
    
    static FileInputStream fileToStream(String filePath) {
        File file = new File(filePath);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return fis;
    }
}

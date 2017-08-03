// Generated from /home/margaret/workspace/abcplayer/src/abc/parser/Body.g4 by ANTLR 4.7
package abc.parser;

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BodyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEWLINE=8, TUPLETSPEC=9, 
		BASENOTE=10, ACCIDENTAL=11, BARLINE=12, REPEATBEGINBAR=13, REPEATENDBAR=14, 
		NTHREPEAT=15, SECTIONBEGINBAR=16, SECTIONENDBAR=17, REST=18, NUMBER=19, 
		WHITESPACE=20, CHAR=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NEWLINE", "TUPLETSPEC", 
		"BASENOTE", "ACCIDENTAL", "BARLINE", "REPEATBEGINBAR", "REPEATENDBAR", 
		"NTHREPEAT", "SECTIONBEGINBAR", "SECTIONENDBAR", "REST", "NUMBER", "WHITESPACE", 
		"CHAR", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "','", "'/'", "'['", "']'", "'V:'", "'%'", null, null, null, 
		null, null, "'|:'", "':|'", null, null, null, "'z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "NEWLINE", "TUPLETSPEC", 
		"BASENOTE", "ACCIDENTAL", "BARLINE", "REPEATBEGINBAR", "REPEATENDBAR", 
		"NTHREPEAT", "SECTIONBEGINBAR", "SECTIONENDBAR", "REST", "NUMBER", "WHITESPACE", 
		"CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    // This method makes the parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        // To prevent any reports to standard error, add this line:
	        //removeErrorListeners();
	        
	        addErrorListener(new BaseErrorListener() {
	            public void syntaxError(Recognizer<?, ?> recognizer,
	                                    Object offendingSymbol, 
	                                    int line, int charPositionInLine,
	                                    String msg, RecognitionException e) {
	                throw new ParseCancellationException(msg, e);
	            }
	        });
	    }


	public BodyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Body.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5\tB\n\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fP\n\f\3\r\3\r\3\r\5\rU\n"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20a\n\20\3\21\3"+
		"\21\3\21\5\21f\n\21\3\22\3\22\3\22\5\22k\n\22\3\23\3\23\3\24\6\24p\n\24"+
		"\r\24\16\24q\3\25\3\25\3\26\3\26\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\2\3\2\6\4\2\f\f\17\17\4\2CIci\4\2\13\13\"\"\3\2\62;\2\u0081"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3/\3\2\2\2\5\61\3\2"+
		"\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17<\3\2\2\2\21"+
		"A\3\2\2\2\23C\3\2\2\2\25F\3\2\2\2\27O\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2"+
		"\35Y\3\2\2\2\37`\3\2\2\2!e\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'o\3\2\2\2)s\3"+
		"\2\2\2+u\3\2\2\2-w\3\2\2\2/\60\7)\2\2\60\4\3\2\2\2\61\62\7.\2\2\62\6\3"+
		"\2\2\2\63\64\7\61\2\2\64\b\3\2\2\2\65\66\7]\2\2\66\n\3\2\2\2\678\7_\2"+
		"\28\f\3\2\2\29:\7X\2\2:;\7<\2\2;\16\3\2\2\2<=\7\'\2\2=\20\3\2\2\2>?\7"+
		"\17\2\2?B\7\f\2\2@B\t\2\2\2A>\3\2\2\2A@\3\2\2\2B\22\3\2\2\2CD\7*\2\2D"+
		"E\5\'\24\2E\24\3\2\2\2FG\t\3\2\2G\26\3\2\2\2HP\7`\2\2IJ\7`\2\2JP\7`\2"+
		"\2KP\7a\2\2LM\7a\2\2MP\7a\2\2NP\7?\2\2OH\3\2\2\2OI\3\2\2\2OK\3\2\2\2O"+
		"L\3\2\2\2ON\3\2\2\2P\30\3\2\2\2QU\7~\2\2RS\7~\2\2SU\7~\2\2TQ\3\2\2\2T"+
		"R\3\2\2\2U\32\3\2\2\2VW\7~\2\2WX\7<\2\2X\34\3\2\2\2YZ\7<\2\2Z[\7~\2\2"+
		"[\36\3\2\2\2\\]\7]\2\2]a\7\63\2\2^_\7]\2\2_a\7\64\2\2`\\\3\2\2\2`^\3\2"+
		"\2\2a \3\2\2\2bc\7]\2\2cf\7~\2\2df\7]\2\2eb\3\2\2\2ed\3\2\2\2f\"\3\2\2"+
		"\2gh\7~\2\2hk\7_\2\2ik\7_\2\2jg\3\2\2\2ji\3\2\2\2k$\3\2\2\2lm\7|\2\2m"+
		"&\3\2\2\2np\5-\27\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r(\3\2\2\2"+
		"st\t\4\2\2t*\3\2\2\2uv\n\2\2\2v,\3\2\2\2wx\t\5\2\2x.\3\2\2\2\n\2AOT`e"+
		"jq\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
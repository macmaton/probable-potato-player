// Generated from Header.g4 by ANTLR 4.5.1

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
public class HeaderLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, 
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, DIGIT=29, NEWLINE=30, 
    WHITESPACE=31, CHAR=32;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
    "T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
    "T__25", "T__26", "T__27", "DIGIT", "NEWLINE", "WHITESPACE", "CHAR"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
    "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'a'", "'b'", "'c'", 
    "'d'", "'e'", "'f'", "'g'", "'m'", "'#'", "'/'", "'C|'", "'='", "'%'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, "DIGIT", "NEWLINE", "WHITESPACE", "CHAR"
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


  public HeaderLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }

  @Override
  public String getGrammarFileName() { return "Header.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\"\u0091\b\1\4\2"+
      "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
      "\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
      "\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
      "\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
      "\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
      "\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
      "\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
      "\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
      "\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
      "\36\3\37\3\37\3\37\5\37\u008a\n\37\5\37\u008c\n\37\3 \3 \3!\3!\2\2"+
      "\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
      "\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
      "\359\36;\37= ?!A\"\3\2\5\3\2\62;\4\2\13\13\"\"\7\2GGKKNNPPYY\u0092"+
      "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
      "\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
      "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
      "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-"+
      "\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
      "\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3"+
      "\2\2\2\5F\3\2\2\2\7I\3\2\2\2\tL\3\2\2\2\13O\3\2\2\2\rR\3\2\2\2\17"+
      "U\3\2\2\2\21X\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2\31a\3\2"+
      "\2\2\33c\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!i\3\2\2\2#k\3\2\2\2%m\3\2"+
      "\2\2\'o\3\2\2\2)q\3\2\2\2+s\3\2\2\2-u\3\2\2\2/w\3\2\2\2\61y\3\2\2"+
      "\2\63{\3\2\2\2\65}\3\2\2\2\67\u0080\3\2\2\29\u0082\3\2\2\2;\u0084"+
      "\3\2\2\2=\u008b\3\2\2\2?\u008d\3\2\2\2A\u008f\3\2\2\2CD\7Z\2\2DE\7"+
      "<\2\2E\4\3\2\2\2FG\7V\2\2GH\7<\2\2H\6\3\2\2\2IJ\7E\2\2JK\7<\2\2K\b"+
      "\3\2\2\2LM\7N\2\2MN\7<\2\2N\n\3\2\2\2OP\7O\2\2PQ\7<\2\2Q\f\3\2\2\2"+
      "RS\7S\2\2ST\7<\2\2T\16\3\2\2\2UV\7X\2\2VW\7<\2\2W\20\3\2\2\2XY\7M"+
      "\2\2YZ\7<\2\2Z\22\3\2\2\2[\\\7C\2\2\\\24\3\2\2\2]^\7D\2\2^\26\3\2"+
      "\2\2_`\7E\2\2`\30\3\2\2\2ab\7F\2\2b\32\3\2\2\2cd\7G\2\2d\34\3\2\2"+
      "\2ef\7H\2\2f\36\3\2\2\2gh\7I\2\2h \3\2\2\2ij\7c\2\2j\"\3\2\2\2kl\7"+
      "d\2\2l$\3\2\2\2mn\7e\2\2n&\3\2\2\2op\7f\2\2p(\3\2\2\2qr\7g\2\2r*\3"+
      "\2\2\2st\7h\2\2t,\3\2\2\2uv\7i\2\2v.\3\2\2\2wx\7o\2\2x\60\3\2\2\2"+
      "yz\7%\2\2z\62\3\2\2\2{|\7\61\2\2|\64\3\2\2\2}~\7E\2\2~\177\7~\2\2"+
      "\177\66\3\2\2\2\u0080\u0081\7?\2\2\u00818\3\2\2\2\u0082\u0083\7\'"+
      "\2\2\u0083:\3\2\2\2\u0084\u0085\t\2\2\2\u0085<\3\2\2\2\u0086\u008c"+
      "\7\f\2\2\u0087\u0089\7\17\2\2\u0088\u008a\7\f\2\2\u0089\u0088\3\2"+
      "\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
      "\u0087\3\2\2\2\u008c>\3\2\2\2\u008d\u008e\t\3\2\2\u008e@\3\2\2\2\u008f"+
      "\u0090\n\4\2\2\u0090B\3\2\2\2\5\2\u0089\u008b\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
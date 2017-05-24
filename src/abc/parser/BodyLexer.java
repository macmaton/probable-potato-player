// Generated from Body.g4 by ANTLR 4.5.1

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
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
    T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, 
    T__16=17, T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ACCIDENTAL=23, 
    BARLINE=24, NTHREPEAT=25, REST=26, DIGIT=27, NEWLINE=28, WHITESPACE=29, 
    CHAR=30;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
    "T__17", "T__18", "T__19", "T__20", "T__21", "ACCIDENTAL", "BARLINE", 
    "NTHREPEAT", "REST", "DIGIT", "NEWLINE", "WHITESPACE", "CHAR"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", 
    "'G'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'('", "'['", 
    "']'", "'V:'", "'%'", null, null, null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, "ACCIDENTAL", 
    "BARLINE", "NTHREPEAT", "REST", "DIGIT", "NEWLINE", "WHITESPACE", "CHAR"
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
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u0098\b\1\4\2"+
      "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
      "\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
      "\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4"+
      "\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t"+
      "\36\4\37\t\37\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
      "\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
      "\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
      "\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30t\n\30"+
      "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0081"+
      "\n\31\3\32\3\32\3\32\3\32\5\32\u0087\n\32\3\33\3\33\3\34\3\34\3\35"+
      "\3\35\3\35\5\35\u0090\n\35\3\35\5\35\u0093\n\35\3\36\3\36\3\37\3\37"+
      "\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
      "\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
      "\67\359\36;\37= \3\2\5\3\2\62;\4\2\13\13\"\"\7\2GGKKNNPPYY\u00a4\2"+
      "\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
      "\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
      "\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
      "\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
      "\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
      "\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C\3\2"+
      "\2\2\tE\3\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23"+
      "O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35Y\3\2"+
      "\2\2\37[\3\2\2\2!]\3\2\2\2#_\3\2\2\2%a\3\2\2\2\'c\3\2\2\2)e\3\2\2"+
      "\2+g\3\2\2\2-j\3\2\2\2/s\3\2\2\2\61\u0080\3\2\2\2\63\u0086\3\2\2\2"+
      "\65\u0088\3\2\2\2\67\u008a\3\2\2\29\u0092\3\2\2\2;\u0094\3\2\2\2="+
      "\u0096\3\2\2\2?@\7)\2\2@\4\3\2\2\2AB\7.\2\2B\6\3\2\2\2CD\7\61\2\2"+
      "D\b\3\2\2\2EF\7C\2\2F\n\3\2\2\2GH\7D\2\2H\f\3\2\2\2IJ\7E\2\2J\16\3"+
      "\2\2\2KL\7F\2\2L\20\3\2\2\2MN\7G\2\2N\22\3\2\2\2OP\7H\2\2P\24\3\2"+
      "\2\2QR\7I\2\2R\26\3\2\2\2ST\7c\2\2T\30\3\2\2\2UV\7d\2\2V\32\3\2\2"+
      "\2WX\7e\2\2X\34\3\2\2\2YZ\7f\2\2Z\36\3\2\2\2[\\\7g\2\2\\ \3\2\2\2"+
      "]^\7h\2\2^\"\3\2\2\2_`\7i\2\2`$\3\2\2\2ab\7*\2\2b&\3\2\2\2cd\7]\2"+
      "\2d(\3\2\2\2ef\7_\2\2f*\3\2\2\2gh\7X\2\2hi\7<\2\2i,\3\2\2\2jk\7\'"+
      "\2\2k.\3\2\2\2lt\7`\2\2mn\7`\2\2nt\7`\2\2ot\7a\2\2pq\7a\2\2qt\7a\2"+
      "\2rt\7?\2\2sl\3\2\2\2sm\3\2\2\2so\3\2\2\2sp\3\2\2\2sr\3\2\2\2t\60"+
      "\3\2\2\2u\u0081\7~\2\2vw\7~\2\2w\u0081\7~\2\2xy\7]\2\2y\u0081\7~\2"+
      "\2z{\7~\2\2{\u0081\7_\2\2|}\7<\2\2}\u0081\7~\2\2~\177\7~\2\2\177\u0081"+
      "\7<\2\2\u0080u\3\2\2\2\u0080v\3\2\2\2\u0080x\3\2\2\2\u0080z\3\2\2"+
      "\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081\62\3\2\2\2\u0082\u0083\7]\2"+
      "\2\u0083\u0087\7\63\2\2\u0084\u0085\7]\2\2\u0085\u0087\7\64\2\2\u0086"+
      "\u0082\3\2\2\2\u0086\u0084\3\2\2\2\u0087\64\3\2\2\2\u0088\u0089\7"+
      "|\2\2\u0089\66\3\2\2\2\u008a\u008b\t\2\2\2\u008b8\3\2\2\2\u008c\u0093"+
      "\7\f\2\2\u008d\u008f\7\17\2\2\u008e\u0090\7\f\2\2\u008f\u008e\3\2"+
      "\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0093\7\2\2\3\u0092"+
      "\u008c\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u0091\3\2\2\2\u0093:\3\2"+
      "\2\2\u0094\u0095\t\3\2\2\u0095<\3\2\2\2\u0096\u0097\n\4\2\2\u0097"+
      ">\3\2\2\2\b\2s\u0080\u0086\u008f\u0092\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
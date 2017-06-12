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
    T__9=10, T__10=11, INDEXMARKER=12, TITLEMARKER=13, KEYMARKER=14, COMPOSERMARKER=15, 
    LENGTHMARKER=16, METERMARKER=17, TEMPOMARKER=18, VOICEMARKER=19, NUMBER=20, 
    FRACTION=21, TEMPO=22, ENDOFLINE=23, COMMENT=24, BARLINE=25, TEXT=26, 
    NEWLINE=27, CHAR=28;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "INDEXMARKER", "TITLEMARKER", "KEYMARKER", "COMPOSERMARKER", 
    "LENGTHMARKER", "METERMARKER", "TEMPOMARKER", "VOICEMARKER", "NUMBER", 
    "FRACTION", "TEMPO", "ENDOFLINE", "COMMENT", "BARLINE", "TEXT", "WHITESPACE", 
    "NEWLINE", "CHAR"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'A'", "'B'", "'C'", "'D'", "'E'", "'F'", "'G'", "'m'", "'#'", 
    "'b'", "'C|'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    "INDEXMARKER", "TITLEMARKER", "KEYMARKER", "COMPOSERMARKER", "LENGTHMARKER", 
    "METERMARKER", "TEMPOMARKER", "VOICEMARKER", "NUMBER", "FRACTION", "TEMPO", 
    "ENDOFLINE", "COMMENT", "BARLINE", "TEXT", "NEWLINE", "CHAR"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00b8\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
      "\t\36\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
      "\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\rY\n\r\3\16\3"+
      "\16\3\16\3\16\5\16_\n\16\3\17\3\17\3\17\3\17\5\17e\n\17\3\20\3\20"+
      "\3\20\3\20\5\20k\n\20\3\21\3\21\3\21\3\21\5\21q\n\21\3\22\3\22\3\22"+
      "\3\22\5\22w\n\22\3\23\3\23\3\23\3\23\5\23}\n\23\3\24\3\24\3\24\3\24"+
      "\5\24\u0083\n\24\3\25\6\25\u0086\n\25\r\25\16\25\u0087\3\26\3\26\3"+
      "\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0096\n\30\3"+
      "\31\3\31\5\31\u009a\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
      "\32\3\32\3\32\5\32\u00a7\n\32\3\33\6\33\u00aa\n\33\r\33\16\33\u00ab"+
      "\3\34\3\34\3\35\3\35\3\35\5\35\u00b3\n\35\5\35\u00b5\n\35\3\36\3\36"+
      "\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
      "\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
      "\67\29\35;\36\3\2\5\3\2\62;\4\2\13\13\"\"\4\2\f\f<<\u00c9\2\3\3\2"+
      "\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
      "\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
      "\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
      "#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
      "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3"+
      "\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG"+
      "\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2"+
      "\2\31T\3\2\2\2\33Z\3\2\2\2\35`\3\2\2\2\37f\3\2\2\2!l\3\2\2\2#r\3\2"+
      "\2\2%x\3\2\2\2\'~\3\2\2\2)\u0085\3\2\2\2+\u0089\3\2\2\2-\u008d\3\2"+
      "\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2\63\u00a6\3\2\2\2\65\u00a9\3\2"+
      "\2\2\67\u00ad\3\2\2\29\u00b4\3\2\2\2;\u00b6\3\2\2\2=>\7C\2\2>\4\3"+
      "\2\2\2?@\7D\2\2@\6\3\2\2\2AB\7E\2\2B\b\3\2\2\2CD\7F\2\2D\n\3\2\2\2"+
      "EF\7G\2\2F\f\3\2\2\2GH\7H\2\2H\16\3\2\2\2IJ\7I\2\2J\20\3\2\2\2KL\7"+
      "o\2\2L\22\3\2\2\2MN\7%\2\2N\24\3\2\2\2OP\7d\2\2P\26\3\2\2\2QR\7E\2"+
      "\2RS\7~\2\2S\30\3\2\2\2TU\7Z\2\2UV\7<\2\2VX\3\2\2\2WY\5\67\34\2XW"+
      "\3\2\2\2XY\3\2\2\2Y\32\3\2\2\2Z[\7V\2\2[\\\7<\2\2\\^\3\2\2\2]_\5\67"+
      "\34\2^]\3\2\2\2^_\3\2\2\2_\34\3\2\2\2`a\7M\2\2ab\7<\2\2bd\3\2\2\2"+
      "ce\5\67\34\2dc\3\2\2\2de\3\2\2\2e\36\3\2\2\2fg\7E\2\2gh\7<\2\2hj\3"+
      "\2\2\2ik\5\67\34\2ji\3\2\2\2jk\3\2\2\2k \3\2\2\2lm\7N\2\2mn\7<\2\2"+
      "np\3\2\2\2oq\5\67\34\2po\3\2\2\2pq\3\2\2\2q\"\3\2\2\2rs\7O\2\2st\7"+
      "<\2\2tv\3\2\2\2uw\5\67\34\2vu\3\2\2\2vw\3\2\2\2w$\3\2\2\2xy\7S\2\2"+
      "yz\7<\2\2z|\3\2\2\2{}\5\67\34\2|{\3\2\2\2|}\3\2\2\2}&\3\2\2\2~\177"+
      "\7X\2\2\177\u0080\7<\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5\67\34\2"+
      "\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083(\3\2\2\2\u0084\u0086"+
      "\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2"+
      "\2\u0087\u0088\3\2\2\2\u0088*\3\2\2\2\u0089\u008a\5)\25\2\u008a\u008b"+
      "\7\61\2\2\u008b\u008c\5)\25\2\u008c,\3\2\2\2\u008d\u008e\5+\26\2\u008e"+
      "\u008f\7?\2\2\u008f\u0090\5)\25\2\u0090.\3\2\2\2\u0091\u0092\5\61"+
      "\31\2\u0092\u0093\59\35\2\u0093\u0096\3\2\2\2\u0094\u0096\59\35\2"+
      "\u0095\u0091\3\2\2\2\u0095\u0094\3\2\2\2\u0096\60\3\2\2\2\u0097\u0099"+
      "\7\'\2\2\u0098\u009a\5\65\33\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2"+
      "\2\2\u009a\62\3\2\2\2\u009b\u00a7\7~\2\2\u009c\u009d\7~\2\2\u009d"+
      "\u00a7\7~\2\2\u009e\u009f\7]\2\2\u009f\u00a7\7~\2\2\u00a0\u00a1\7"+
      "~\2\2\u00a1\u00a7\7_\2\2\u00a2\u00a3\7<\2\2\u00a3\u00a7\7~\2\2\u00a4"+
      "\u00a5\7~\2\2\u00a5\u00a7\7<\2\2\u00a6\u009b\3\2\2\2\u00a6\u009c\3"+
      "\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a2\3\2\2\2"+
      "\u00a6\u00a4\3\2\2\2\u00a7\64\3\2\2\2\u00a8\u00aa\5;\36\2\u00a9\u00a8"+
      "\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2"+
      "\2\u00ac\66\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae8\3\2\2\2\u00af\u00b5"+
      "\7\f\2\2\u00b0\u00b2\7\17\2\2\u00b1\u00b3\7\f\2\2\u00b2\u00b1\3\2"+
      "\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4"+
      "\u00b0\3\2\2\2\u00b5:\3\2\2\2\u00b6\u00b7\n\4\2\2\u00b7<\3\2\2\2\22"+
      "\2X^djpv|\u0082\u0087\u0095\u0099\u00a6\u00ab\u00b2\u00b4\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
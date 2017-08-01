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
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, 
    T__30=31, INDEXMARKER=32, TITLEMARKER=33, KEYMARKER=34, COMPOSERMARKER=35, 
    LENGTHMARKER=36, METERMARKER=37, TEMPOMARKER=38, VOICEMARKER=39, NUMBER=40, 
    FRACTION=41, TEMPO=42, ENDOFLINE=43, COMMENT=44, BARLINE=45, TEXT=46, 
    NEWLINE=47, CHAR=48;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
    "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
    "T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
    "T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "INDEXMARKER", 
    "TITLEMARKER", "KEYMARKER", "COMPOSERMARKER", "LENGTHMARKER", "METERMARKER", 
    "TEMPOMARKER", "VOICEMARKER", "NUMBER", "FRACTION", "TEMPO", "ENDOFLINE", 
    "COMMENT", "BARLINE", "TEXT", "WHITESPACE", "NEWLINE", "CHAR"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'C'", "'Am'", "'G'", "'D'", "'A'", "'E'", "'B'", "'F#'", "'C#'", 
    "'Em'", "'Bm'", "'F#m'", "'C#m'", "'G#m'", "'D#m'", "'A#m'", "'F'", 
    "'Bb'", "'Eb'", "'Ab'", "'Db'", "'Gb'", "'Cb'", "'Dm'", "'Gm'", "'Cm'", 
    "'Fm'", "'Bbm'", "'Ebm'", "'Abm'", "'C|'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, null, null, null, null, 
    null, null, null, null, null, null, null, null, "INDEXMARKER", "TITLEMARKER", 
    "KEYMARKER", "COMPOSERMARKER", "LENGTHMARKER", "METERMARKER", "TEMPOMARKER", 
    "VOICEMARKER", "NUMBER", "FRACTION", "TEMPO", "ENDOFLINE", "COMMENT", 
    "BARLINE", "TEXT", "NEWLINE", "CHAR"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0125\b\1\4"+
      "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
      "\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
      "\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
      "\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
      "\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t"+
      "\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61"+
      "\t\61\4\62\t\62\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
      "\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
      "\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
      "\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24"+
      "\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31"+
      "\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
      "\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!"+
      "\3!\3!\5!\u00c8\n!\3\"\3\"\3\"\3\"\5\"\u00ce\n\"\3#\3#\3#\3#\5#\u00d4"+
      "\n#\3$\3$\3$\3$\5$\u00da\n$\3%\3%\3%\3%\5%\u00e0\n%\3&\3&\3&\3&\5"+
      "&\u00e6\n&\3\'\3\'\3\'\3\'\5\'\u00ec\n\'\3(\3(\3(\3(\5(\u00f2\n(\3"+
      ")\6)\u00f5\n)\r)\16)\u00f6\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\5,"+
      "\u0105\n,\3-\3-\5-\u0109\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0116"+
      "\n.\3/\6/\u0119\n/\r/\16/\u011a\3\60\3\60\3\61\3\61\3\61\5\61\u0122"+
      "\n\61\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
      "\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
      "\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
      "_\2a\61c\62\3\2\6\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\4\2\f\f<<\u0135"+
      "\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
      "\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
      "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
      "\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-"+
      "\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
      "\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3"+
      "\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
      "\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
      "\2\2\2\2]\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5g\3\2\2\2\7j\3"+
      "\2\2\2\tl\3\2\2\2\13n\3\2\2\2\rp\3\2\2\2\17r\3\2\2\2\21t\3\2\2\2\23"+
      "w\3\2\2\2\25z\3\2\2\2\27}\3\2\2\2\31\u0080\3\2\2\2\33\u0084\3\2\2"+
      "\2\35\u0088\3\2\2\2\37\u008c\3\2\2\2!\u0090\3\2\2\2#\u0094\3\2\2\2"+
      "%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u009c\3\2\2\2+\u009f\3\2\2\2-\u00a2"+
      "\3\2\2\2/\u00a5\3\2\2\2\61\u00a8\3\2\2\2\63\u00ab\3\2\2\2\65\u00ae"+
      "\3\2\2\2\67\u00b1\3\2\2\29\u00b4\3\2\2\2;\u00b8\3\2\2\2=\u00bc\3\2"+
      "\2\2?\u00c0\3\2\2\2A\u00c3\3\2\2\2C\u00c9\3\2\2\2E\u00cf\3\2\2\2G"+
      "\u00d5\3\2\2\2I\u00db\3\2\2\2K\u00e1\3\2\2\2M\u00e7\3\2\2\2O\u00ed"+
      "\3\2\2\2Q\u00f4\3\2\2\2S\u00f8\3\2\2\2U\u00fc\3\2\2\2W\u0104\3\2\2"+
      "\2Y\u0106\3\2\2\2[\u0115\3\2\2\2]\u0118\3\2\2\2_\u011c\3\2\2\2a\u0121"+
      "\3\2\2\2c\u0123\3\2\2\2ef\7E\2\2f\4\3\2\2\2gh\7C\2\2hi\7o\2\2i\6\3"+
      "\2\2\2jk\7I\2\2k\b\3\2\2\2lm\7F\2\2m\n\3\2\2\2no\7C\2\2o\f\3\2\2\2"+
      "pq\7G\2\2q\16\3\2\2\2rs\7D\2\2s\20\3\2\2\2tu\7H\2\2uv\7%\2\2v\22\3"+
      "\2\2\2wx\7E\2\2xy\7%\2\2y\24\3\2\2\2z{\7G\2\2{|\7o\2\2|\26\3\2\2\2"+
      "}~\7D\2\2~\177\7o\2\2\177\30\3\2\2\2\u0080\u0081\7H\2\2\u0081\u0082"+
      "\7%\2\2\u0082\u0083\7o\2\2\u0083\32\3\2\2\2\u0084\u0085\7E\2\2\u0085"+
      "\u0086\7%\2\2\u0086\u0087\7o\2\2\u0087\34\3\2\2\2\u0088\u0089\7I\2"+
      "\2\u0089\u008a\7%\2\2\u008a\u008b\7o\2\2\u008b\36\3\2\2\2\u008c\u008d"+
      "\7F\2\2\u008d\u008e\7%\2\2\u008e\u008f\7o\2\2\u008f \3\2\2\2\u0090"+
      "\u0091\7C\2\2\u0091\u0092\7%\2\2\u0092\u0093\7o\2\2\u0093\"\3\2\2"+
      "\2\u0094\u0095\7H\2\2\u0095$\3\2\2\2\u0096\u0097\7D\2\2\u0097\u0098"+
      "\7d\2\2\u0098&\3\2\2\2\u0099\u009a\7G\2\2\u009a\u009b\7d\2\2\u009b"+
      "(\3\2\2\2\u009c\u009d\7C\2\2\u009d\u009e\7d\2\2\u009e*\3\2\2\2\u009f"+
      "\u00a0\7F\2\2\u00a0\u00a1\7d\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7I\2\2"+
      "\u00a3\u00a4\7d\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7E\2\2\u00a6\u00a7"+
      "\7d\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7F\2\2\u00a9\u00aa\7o\2\2\u00aa"+
      "\62\3\2\2\2\u00ab\u00ac\7I\2\2\u00ac\u00ad\7o\2\2\u00ad\64\3\2\2\2"+
      "\u00ae\u00af\7E\2\2\u00af\u00b0\7o\2\2\u00b0\66\3\2\2\2\u00b1\u00b2"+
      "\7H\2\2\u00b2\u00b3\7o\2\2\u00b38\3\2\2\2\u00b4\u00b5\7D\2\2\u00b5"+
      "\u00b6\7d\2\2\u00b6\u00b7\7o\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7G\2\2"+
      "\u00b9\u00ba\7d\2\2\u00ba\u00bb\7o\2\2\u00bb<\3\2\2\2\u00bc\u00bd"+
      "\7C\2\2\u00bd\u00be\7d\2\2\u00be\u00bf\7o\2\2\u00bf>\3\2\2\2\u00c0"+
      "\u00c1\7E\2\2\u00c1\u00c2\7~\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7Z\2\2"+
      "\u00c4\u00c5\7<\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c8\5_\60\2\u00c7"+
      "\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8B\3\2\2\2\u00c9\u00ca\7V\2"+
      "\2\u00ca\u00cb\7<\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ce\5_\60\2\u00cd"+
      "\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ceD\3\2\2\2\u00cf\u00d0\7M\2"+
      "\2\u00d0\u00d1\7<\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\5_\60\2\u00d3"+
      "\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4F\3\2\2\2\u00d5\u00d6\7E\2"+
      "\2\u00d6\u00d7\7<\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\5_\60\2\u00d9"+
      "\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00daH\3\2\2\2\u00db\u00dc\7N\2"+
      "\2\u00dc\u00dd\7<\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\5_\60\2\u00df"+
      "\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0J\3\2\2\2\u00e1\u00e2\7O\2"+
      "\2\u00e2\u00e3\7<\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6\5_\60\2\u00e5"+
      "\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7S\2"+
      "\2\u00e8\u00e9\7<\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\5_\60\2\u00eb"+
      "\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ecN\3\2\2\2\u00ed\u00ee\7X\2"+
      "\2\u00ee\u00ef\7<\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\5_\60\2\u00f1"+
      "\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2P\3\2\2\2\u00f3\u00f5\t\2"+
      "\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
      "\u00f7\3\2\2\2\u00f7R\3\2\2\2\u00f8\u00f9\5Q)\2\u00f9\u00fa\7\61\2"+
      "\2\u00fa\u00fb\5Q)\2\u00fbT\3\2\2\2\u00fc\u00fd\5S*\2\u00fd\u00fe"+
      "\7?\2\2\u00fe\u00ff\5Q)\2\u00ffV\3\2\2\2\u0100\u0101\5Y-\2\u0101\u0102"+
      "\5a\61\2\u0102\u0105\3\2\2\2\u0103\u0105\5a\61\2\u0104\u0100\3\2\2"+
      "\2\u0104\u0103\3\2\2\2\u0105X\3\2\2\2\u0106\u0108\7\'\2\2\u0107\u0109"+
      "\5]/\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109Z\3\2\2\2\u010a"+
      "\u0116\7~\2\2\u010b\u010c\7~\2\2\u010c\u0116\7~\2\2\u010d\u010e\7"+
      "]\2\2\u010e\u0116\7~\2\2\u010f\u0110\7~\2\2\u0110\u0116\7_\2\2\u0111"+
      "\u0112\7<\2\2\u0112\u0116\7~\2\2\u0113\u0114\7~\2\2\u0114\u0116\7"+
      "<\2\2\u0115\u010a\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u010d\3\2\2\2"+
      "\u0115\u010f\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
      "\\\3\2\2\2\u0117\u0119\5c\62\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2"+
      "\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b^\3\2\2\2\u011c"+
      "\u011d\t\3\2\2\u011d`\3\2\2\2\u011e\u011f\7\17\2\2\u011f\u0122\7\f"+
      "\2\2\u0120\u0122\t\4\2\2\u0121\u011e\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
      "b\3\2\2\2\u0123\u0124\n\5\2\2\u0124d\3\2\2\2\21\2\u00c7\u00cd\u00d3"+
      "\u00d9\u00df\u00e5\u00eb\u00f1\u00f6\u0104\u0108\u0115\u011a\u0121"+
      "\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
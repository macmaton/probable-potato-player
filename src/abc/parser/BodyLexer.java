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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NEWLINE=9, 
    BASENOTE=10, ACCIDENTAL=11, BARLINE=12, REPEATBEGINBAR=13, REPEATENDBAR=14, 
    NTHREPEAT=15, REST=16, NUMBER=17, WHITESPACE=18, CHAR=19;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NEWLINE", 
    "BASENOTE", "ACCIDENTAL", "BARLINE", "REPEATBEGINBAR", "REPEATENDBAR", 
    "NTHREPEAT", "REST", "NUMBER", "WHITESPACE", "CHAR", "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'('", "'['", "']'", "'V:'", "'%'", null, 
    null, null, null, "'|:'", "':|'", null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, "NEWLINE", "BASENOTE", 
    "ACCIDENTAL", "BARLINE", "REPEATBEGINBAR", "REPEATENDBAR", "NTHREPEAT", 
    "REST", "NUMBER", "WHITESPACE", "CHAR"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25q\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
      "\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\5\n@\n\n\3\n"+
      "\5\nC\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fN\n\f\3\r\3\r\3"+
      "\r\3\r\3\r\3\r\3\r\5\rW\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
      "\3\20\3\20\5\20c\n\20\3\21\3\21\3\22\6\22h\n\22\r\22\16\22i\3\23\3"+
      "\23\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
      "\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2\3\2\7"+
      "\3\3\f\f\4\2CIci\4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;{\2\3\3\2\2\2"+
      "\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
      "\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
      "\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
      "\2\2\2%\3\2\2\2\2\'\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61"+
      "\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\21:\3\2\2\2\23B"+
      "\3\2\2\2\25D\3\2\2\2\27M\3\2\2\2\31V\3\2\2\2\33X\3\2\2\2\35[\3\2\2"+
      "\2\37b\3\2\2\2!d\3\2\2\2#g\3\2\2\2%k\3\2\2\2\'m\3\2\2\2)o\3\2\2\2"+
      "+,\7)\2\2,\4\3\2\2\2-.\7.\2\2.\6\3\2\2\2/\60\7\61\2\2\60\b\3\2\2\2"+
      "\61\62\7*\2\2\62\n\3\2\2\2\63\64\7]\2\2\64\f\3\2\2\2\65\66\7_\2\2"+
      "\66\16\3\2\2\2\678\7X\2\289\7<\2\29\20\3\2\2\2:;\7\'\2\2;\22\3\2\2"+
      "\2<C\t\2\2\2=?\7\17\2\2>@\7\f\2\2?>\3\2\2\2?@\3\2\2\2@C\3\2\2\2AC"+
      "\7\17\2\2B<\3\2\2\2B=\3\2\2\2BA\3\2\2\2C\24\3\2\2\2DE\t\3\2\2E\26"+
      "\3\2\2\2FN\7`\2\2GH\7`\2\2HN\7`\2\2IN\7a\2\2JK\7a\2\2KN\7a\2\2LN\7"+
      "?\2\2MF\3\2\2\2MG\3\2\2\2MI\3\2\2\2MJ\3\2\2\2ML\3\2\2\2N\30\3\2\2"+
      "\2OW\7~\2\2PQ\7~\2\2QW\7~\2\2RS\7]\2\2SW\7~\2\2TU\7~\2\2UW\7_\2\2"+
      "VO\3\2\2\2VP\3\2\2\2VR\3\2\2\2VT\3\2\2\2W\32\3\2\2\2XY\7~\2\2YZ\7"+
      "<\2\2Z\34\3\2\2\2[\\\7<\2\2\\]\7~\2\2]\36\3\2\2\2^_\7]\2\2_c\7\63"+
      "\2\2`a\7]\2\2ac\7\64\2\2b^\3\2\2\2b`\3\2\2\2c \3\2\2\2de\7|\2\2e\""+
      "\3\2\2\2fh\5)\25\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j$\3\2\2"+
      "\2kl\t\4\2\2l&\3\2\2\2mn\n\5\2\2n(\3\2\2\2op\t\6\2\2p*\3\2\2\2\t\2"+
      "?BMVbi\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
// Generated from Body.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BodyLexer extends Lexer {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BASENOTE=9, 
    ACCIDENTAL=10, BARLINE=11, NTHREPEAT=12, REST=13, NUMBER=14, NEWLINE=15, 
    WHITESPACE=16, CHAR=17;
  public static String[] modeNames = {
    "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
    "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "BASENOTE", 
    "ACCIDENTAL", "BARLINE", "NTHREPEAT", "REST", "NUMBER", "NEWLINE", "WHITESPACE", 
    "CHAR", "DIGIT"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'('", "'['", "']'", "'V:'", "'%'", null, 
    null, null, null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, "BASENOTE", "ACCIDENTAL", 
    "BARLINE", "NTHREPEAT", "REST", "NUMBER", "NEWLINE", "WHITESPACE", "CHAR"
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23h\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
      "\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
      "\13B\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fO\n\f\3\r"+
      "\3\r\3\r\3\16\3\16\3\17\6\17W\n\17\r\17\16\17X\3\20\3\20\3\20\5\20"+
      "^\n\20\3\20\5\20a\n\20\3\21\3\21\3\22\3\22\3\23\3\23\2\2\24\3\3\5"+
      "\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
      "\21!\22#\23%\2\3\2\7\4\2CIci\3\3\17\17\4\2\13\13\"\"\4\2\f\f\17\17"+
      "\3\2\62;s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
      "\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
      "\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
      "\2\2!\3\2\2\2\2#\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2"+
      "\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\66\3\2\2\2\238\3\2"+
      "\2\2\25A\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33S\3\2\2\2\35V\3\2\2\2\37"+
      "`\3\2\2\2!b\3\2\2\2#d\3\2\2\2%f\3\2\2\2\'(\7)\2\2(\4\3\2\2\2)*\7."+
      "\2\2*\6\3\2\2\2+,\7\61\2\2,\b\3\2\2\2-.\7*\2\2.\n\3\2\2\2/\60\7]\2"+
      "\2\60\f\3\2\2\2\61\62\7_\2\2\62\16\3\2\2\2\63\64\7X\2\2\64\65\7<\2"+
      "\2\65\20\3\2\2\2\66\67\7\'\2\2\67\22\3\2\2\289\t\2\2\29\24\3\2\2\2"+
      ":B\7`\2\2;<\7`\2\2<B\7`\2\2=B\7a\2\2>?\7a\2\2?B\7a\2\2@B\7?\2\2A:"+
      "\3\2\2\2A;\3\2\2\2A=\3\2\2\2A>\3\2\2\2A@\3\2\2\2B\26\3\2\2\2CO\7~"+
      "\2\2DE\7~\2\2EO\7~\2\2FG\7]\2\2GO\7~\2\2HI\7~\2\2IO\7_\2\2JK\7<\2"+
      "\2KO\7~\2\2LM\7~\2\2MO\7<\2\2NC\3\2\2\2ND\3\2\2\2NF\3\2\2\2NH\3\2"+
      "\2\2NJ\3\2\2\2NL\3\2\2\2O\30\3\2\2\2PQ\7]\2\2QR\5\35\17\2R\32\3\2"+
      "\2\2ST\7|\2\2T\34\3\2\2\2UW\5%\23\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
      "XY\3\2\2\2Y\36\3\2\2\2Za\7\f\2\2[]\7\17\2\2\\^\7\f\2\2]\\\3\2\2\2"+
      "]^\3\2\2\2^a\3\2\2\2_a\t\3\2\2`Z\3\2\2\2`[\3\2\2\2`_\3\2\2\2a \3\2"+
      "\2\2bc\t\4\2\2c\"\3\2\2\2de\n\5\2\2e$\3\2\2\2fg\t\6\2\2g&\3\2\2\2"+
      "\b\2ANX]`\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
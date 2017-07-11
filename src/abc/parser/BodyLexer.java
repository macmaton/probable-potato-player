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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEWLINE=8, TUPLETSPEC=9, 
    BASENOTE=10, ACCIDENTAL=11, BARLINE=12, REPEATBEGINBAR=13, REPEATENDBAR=14, 
    NTHREPEAT=15, SECTIONBEGINBAR=16, SECTIONENDBAR=17, REST=18, NUMBER=19, 
    WHITESPACE=20, CHAR=21;
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
    null, "'''", "','", "'/'", "'['", "']'", "'V:'", "'%'", null, null, 
    null, null, null, "'|:'", "':|'", null, null, null, "'z'"
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
  public String[] getModeNames() { return modeNames; }

  @Override
  public ATN getATN() { return _ATN; }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27|\b\1\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2"+
      "\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\5"+
      "\tB\n\t\3\t\5\tE\n\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
      "\3\f\5\fS\n\f\3\r\3\r\3\r\5\rX\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
      "\20\3\20\3\20\3\20\5\20d\n\20\3\21\3\21\3\21\5\21i\n\21\3\22\3\22"+
      "\3\22\5\22n\n\22\3\23\3\23\3\24\6\24s\n\24\r\24\16\24t\3\25\3\25\3"+
      "\26\3\26\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
      "\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2\3\2"+
      "\7\3\3\f\f\4\2CIci\4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;\u0086\2\3\3"+
      "\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
      "\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
      "\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
      "\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3/\3\2\2"+
      "\2\5\61\3\2\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2"+
      "\17<\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2\25I\3\2\2\2\27R\3\2\2\2\31W\3"+
      "\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37c\3\2\2\2!h\3\2\2\2#m\3\2\2\2%o"+
      "\3\2\2\2\'r\3\2\2\2)v\3\2\2\2+x\3\2\2\2-z\3\2\2\2/\60\7)\2\2\60\4"+
      "\3\2\2\2\61\62\7.\2\2\62\6\3\2\2\2\63\64\7\61\2\2\64\b\3\2\2\2\65"+
      "\66\7]\2\2\66\n\3\2\2\2\678\7_\2\28\f\3\2\2\29:\7X\2\2:;\7<\2\2;\16"+
      "\3\2\2\2<=\7\'\2\2=\20\3\2\2\2>E\t\2\2\2?A\7\17\2\2@B\7\f\2\2A@\3"+
      "\2\2\2AB\3\2\2\2BE\3\2\2\2CE\7\17\2\2D>\3\2\2\2D?\3\2\2\2DC\3\2\2"+
      "\2E\22\3\2\2\2FG\7*\2\2GH\5\'\24\2H\24\3\2\2\2IJ\t\3\2\2J\26\3\2\2"+
      "\2KS\7`\2\2LM\7`\2\2MS\7`\2\2NS\7a\2\2OP\7a\2\2PS\7a\2\2QS\7?\2\2"+
      "RK\3\2\2\2RL\3\2\2\2RN\3\2\2\2RO\3\2\2\2RQ\3\2\2\2S\30\3\2\2\2TX\7"+
      "~\2\2UV\7~\2\2VX\7~\2\2WT\3\2\2\2WU\3\2\2\2X\32\3\2\2\2YZ\7~\2\2Z"+
      "[\7<\2\2[\34\3\2\2\2\\]\7<\2\2]^\7~\2\2^\36\3\2\2\2_`\7]\2\2`d\7\63"+
      "\2\2ab\7]\2\2bd\7\64\2\2c_\3\2\2\2ca\3\2\2\2d \3\2\2\2ef\7]\2\2fi"+
      "\7~\2\2gi\7]\2\2he\3\2\2\2hg\3\2\2\2i\"\3\2\2\2jk\7~\2\2kn\7_\2\2"+
      "ln\7_\2\2mj\3\2\2\2ml\3\2\2\2n$\3\2\2\2op\7|\2\2p&\3\2\2\2qs\5-\27"+
      "\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u(\3\2\2\2vw\t\4\2\2w*\3"+
      "\2\2\2xy\n\5\2\2y,\3\2\2\2z{\t\6\2\2{.\3\2\2\2\13\2ADRWchmt\2";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
// Generated from Header.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HeaderParser extends Parser {
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
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_fieldindex = 2, RULE_fieldtitle = 3, 
    RULE_otherfields = 4, RULE_fieldcomposer = 5, RULE_fieldlength = 6, 
    RULE_fieldmeter = 7, RULE_fieldtempo = 8, RULE_fieldvoice = 9, RULE_fieldkey = 10, 
    RULE_notelengthstrict = 11, RULE_meter = 12, RULE_fraction = 13, RULE_tempo = 14, 
    RULE_endofline = 15, RULE_comment = 16, RULE_body = 17, RULE_text = 18;
  public static final String[] ruleNames = {
    "root", "header", "fieldindex", "fieldtitle", "otherfields", "fieldcomposer", 
    "fieldlength", "fieldmeter", "fieldtempo", "fieldvoice", "fieldkey", 
    "notelengthstrict", "meter", "fraction", "tempo", "endofline", "comment", 
    "body", "text"
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

  @Override
  public String getGrammarFileName() { return "Header.g4"; }

  @Override
  public String[] getRuleNames() { return ruleNames; }

  @Override
  public String getSerializedATN() { return _serializedATN; }

  @Override
  public ATN getATN() { return _ATN; }


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

  public HeaderParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class RootContext extends ParserRuleContext {
    public HeaderContext header() {
      return getRuleContext(HeaderContext.class,0);
    }
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
    }
    public RootContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_root; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterRoot(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitRoot(this);
    }
  }

  public final RootContext root() throws RecognitionException {
    RootContext _localctx = new RootContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_root);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(38);
      header();
      setState(39);
      body();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class HeaderContext extends ParserRuleContext {
    public FieldindexContext fieldindex() {
      return getRuleContext(FieldindexContext.class,0);
    }
    public FieldtitleContext fieldtitle() {
      return getRuleContext(FieldtitleContext.class,0);
    }
    public FieldkeyContext fieldkey() {
      return getRuleContext(FieldkeyContext.class,0);
    }
    public List<CommentContext> comment() {
      return getRuleContexts(CommentContext.class);
    }
    public CommentContext comment(int i) {
      return getRuleContext(CommentContext.class,i);
    }
    public List<OtherfieldsContext> otherfields() {
      return getRuleContexts(OtherfieldsContext.class);
    }
    public OtherfieldsContext otherfields(int i) {
      return getRuleContext(OtherfieldsContext.class,i);
    }
    public HeaderContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_header; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterHeader(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitHeader(this);
    }
  }

  public final HeaderContext header() throws RecognitionException {
    HeaderContext _localctx = new HeaderContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_header);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(41);
      fieldindex();
      setState(45);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__27) {
        {
        {
        setState(42);
        comment();
        }
        }
        setState(47);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(48);
      fieldtitle();
      setState(52);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__27))) != 0)) {
        {
        {
        setState(49);
        otherfields();
        }
        }
        setState(54);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(55);
      fieldkey();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldindexContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public FieldindexContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldindex; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFieldindex(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFieldindex(this);
    }
  }

  public final FieldindexContext fieldindex() throws RecognitionException {
    FieldindexContext _localctx = new FieldindexContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_fieldindex);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(57);
      match(T__0);
      setState(59); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(58);
        match(DIGIT);
        }
        }
        setState(61); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(63);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldtitleContext extends ParserRuleContext {
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldtitleContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldtitle; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFieldtitle(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFieldtitle(this);
    }
  }

  public final FieldtitleContext fieldtitle() throws RecognitionException {
    FieldtitleContext _localctx = new FieldtitleContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_fieldtitle);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(65);
      match(T__1);
      setState(66);
      text();
      setState(67);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class OtherfieldsContext extends ParserRuleContext {
    public FieldcomposerContext fieldcomposer() {
      return getRuleContext(FieldcomposerContext.class,0);
    }
    public FieldlengthContext fieldlength() {
      return getRuleContext(FieldlengthContext.class,0);
    }
    public FieldmeterContext fieldmeter() {
      return getRuleContext(FieldmeterContext.class,0);
    }
    public FieldtempoContext fieldtempo() {
      return getRuleContext(FieldtempoContext.class,0);
    }
    public FieldvoiceContext fieldvoice() {
      return getRuleContext(FieldvoiceContext.class,0);
    }
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public OtherfieldsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_otherfields; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterOtherfields(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitOtherfields(this);
    }
  }

  public final OtherfieldsContext otherfields() throws RecognitionException {
    OtherfieldsContext _localctx = new OtherfieldsContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_otherfields);
    try {
      setState(75);
      switch (_input.LA(1)) {
      case T__2:
        enterOuterAlt(_localctx, 1);
        {
        setState(69);
        fieldcomposer();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(70);
        fieldlength();
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 3);
        {
        setState(71);
        fieldmeter();
        }
        break;
      case T__5:
        enterOuterAlt(_localctx, 4);
        {
        setState(72);
        fieldtempo();
        }
        break;
      case T__6:
        enterOuterAlt(_localctx, 5);
        {
        setState(73);
        fieldvoice();
        }
        break;
      case T__27:
        enterOuterAlt(_localctx, 6);
        {
        setState(74);
        comment();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldcomposerContext extends ParserRuleContext {
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldcomposerContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldcomposer; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFieldcomposer(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFieldcomposer(this);
    }
  }

  public final FieldcomposerContext fieldcomposer() throws RecognitionException {
    FieldcomposerContext _localctx = new FieldcomposerContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_fieldcomposer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(77);
      match(T__2);
      setState(78);
      text();
      setState(79);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldlengthContext extends ParserRuleContext {
    public NotelengthstrictContext notelengthstrict() {
      return getRuleContext(NotelengthstrictContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldlengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldlength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFieldlength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFieldlength(this);
    }
  }

  public final FieldlengthContext fieldlength() throws RecognitionException {
    FieldlengthContext _localctx = new FieldlengthContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_fieldlength);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(81);
      match(T__3);
      setState(82);
      notelengthstrict();
      setState(83);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldmeterContext extends ParserRuleContext {
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldmeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldmeter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFieldmeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFieldmeter(this);
    }
  }

  public final FieldmeterContext fieldmeter() throws RecognitionException {
    FieldmeterContext _localctx = new FieldmeterContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_fieldmeter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      match(T__4);
      setState(86);
      meter();
      setState(87);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldtempoContext extends ParserRuleContext {
    public TempoContext tempo() {
      return getRuleContext(TempoContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldtempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldtempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFieldtempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFieldtempo(this);
    }
  }

  public final FieldtempoContext fieldtempo() throws RecognitionException {
    FieldtempoContext _localctx = new FieldtempoContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_fieldtempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(89);
      match(T__5);
      setState(90);
      tempo();
      setState(91);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldvoiceContext extends ParserRuleContext {
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldvoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldvoice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFieldvoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFieldvoice(this);
    }
  }

  public final FieldvoiceContext fieldvoice() throws RecognitionException {
    FieldvoiceContext _localctx = new FieldvoiceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_fieldvoice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(93);
      match(T__6);
      setState(94);
      text();
      setState(95);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FieldkeyContext extends ParserRuleContext {
    public EndoflineContext endofline() {
      return getRuleContext(EndoflineContext.class,0);
    }
    public FieldkeyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldkey; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFieldkey(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFieldkey(this);
    }
  }

  public final FieldkeyContext fieldkey() throws RecognitionException {
    FieldkeyContext _localctx = new FieldkeyContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_fieldkey);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(97);
      match(T__7);
      setState(98);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      {
      setState(100);
      _la = _input.LA(1);
      if (_la==T__22) {
        {
        setState(99);
        match(T__22);
        }
      }

      }
      {
      setState(103);
      _la = _input.LA(1);
      if (_la==T__16 || _la==T__23) {
        {
        setState(102);
        _la = _input.LA(1);
        if ( !(_la==T__16 || _la==T__23) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      }
      setState(105);
      endofline();
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class NotelengthstrictContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public NotelengthstrictContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelengthstrict; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterNotelengthstrict(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitNotelengthstrict(this);
    }
  }

  public final NotelengthstrictContext notelengthstrict() throws RecognitionException {
    NotelengthstrictContext _localctx = new NotelengthstrictContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_notelengthstrict);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(108); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(107);
        match(DIGIT);
        }
        }
        setState(110); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(112);
      match(T__24);
      setState(114); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(113);
        match(DIGIT);
        }
        }
        setState(116); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class MeterContext extends ParserRuleContext {
    public FractionContext fraction() {
      return getRuleContext(FractionContext.class,0);
    }
    public MeterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_meter; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterMeter(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitMeter(this);
    }
  }

  public final MeterContext meter() throws RecognitionException {
    MeterContext _localctx = new MeterContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_meter);
    try {
      setState(121);
      switch (_input.LA(1)) {
      case T__10:
        enterOuterAlt(_localctx, 1);
        {
        setState(118);
        match(T__10);
        }
        break;
      case T__25:
        enterOuterAlt(_localctx, 2);
        {
        setState(119);
        match(T__25);
        }
        break;
      case DIGIT:
        enterOuterAlt(_localctx, 3);
        {
        setState(120);
        fraction();
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class FractionContext extends ParserRuleContext {
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public FractionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fraction; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterFraction(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitFraction(this);
    }
  }

  public final FractionContext fraction() throws RecognitionException {
    FractionContext _localctx = new FractionContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_fraction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(124); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(123);
        match(DIGIT);
        }
        }
        setState(126); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      setState(128);
      match(T__24);
      setState(130); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(129);
        match(DIGIT);
        }
        }
        setState(132); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TempoContext extends ParserRuleContext {
    public FractionContext fraction() {
      return getRuleContext(FractionContext.class,0);
    }
    public List<TerminalNode> DIGIT() { return getTokens(HeaderParser.DIGIT); }
    public TerminalNode DIGIT(int i) {
      return getToken(HeaderParser.DIGIT, i);
    }
    public TempoContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tempo; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterTempo(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitTempo(this);
    }
  }

  public final TempoContext tempo() throws RecognitionException {
    TempoContext _localctx = new TempoContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_tempo);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(134);
      fraction();
      setState(135);
      match(T__26);
      setState(137); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(136);
        match(DIGIT);
        }
        }
        setState(139); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==DIGIT );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class EndoflineContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public EndoflineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endofline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterEndofline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitEndofline(this);
    }
  }

  public final EndoflineContext endofline() throws RecognitionException {
    EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_endofline);
    try {
      setState(143);
      switch (_input.LA(1)) {
      case T__27:
        enterOuterAlt(_localctx, 1);
        {
        setState(141);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(142);
        match(NEWLINE);
        }
        break;
      default:
        throw new NoViableAltException(this);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CommentContext extends ParserRuleContext {
    public TextContext text() {
      return getRuleContext(TextContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(HeaderParser.NEWLINE, 0); }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_comment);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(145);
      match(T__27);
      setState(146);
      text();
      setState(147);
      match(NEWLINE);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BodyContext extends ParserRuleContext {
    public TerminalNode EOF() { return getToken(HeaderParser.EOF, 0); }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public List<TerminalNode> NEWLINE() { return getTokens(HeaderParser.NEWLINE); }
    public TerminalNode NEWLINE(int i) {
      return getToken(HeaderParser.NEWLINE, i);
    }
    public BodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_body; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitBody(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(154);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==CHAR) {
        {
        {
        setState(149);
        text();
        setState(150);
        match(NEWLINE);
        }
        }
        setState(156);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(157);
      match(EOF);
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static class TextContext extends ParserRuleContext {
    public List<TerminalNode> CHAR() { return getTokens(HeaderParser.CHAR); }
    public TerminalNode CHAR(int i) {
      return getToken(HeaderParser.CHAR, i);
    }
    public TextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_text; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).enterText(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof HeaderListener ) ((HeaderListener)listener).exitText(this);
    }
  }

  public final TextContext text() throws RecognitionException {
    TextContext _localctx = new TextContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_text);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(160); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(159);
        match(CHAR);
        }
        }
        setState(162); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==CHAR );
      }
    }
    catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    }
    finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00a7\4\2\t\2"+
      "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
      "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
      "\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\7\3.\n\3\f\3\16\3"+
      "\61\13\3\3\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\6\4>\n"+
      "\4\r\4\16\4?\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6N"+
      "\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
      "\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\fg\n\f\3\f\5\fj\n\f\3\f\3\f\3"+
      "\r\6\ro\n\r\r\r\16\rp\3\r\3\r\6\ru\n\r\r\r\16\rv\3\16\3\16\3\16\5"+
      "\16|\n\16\3\17\6\17\177\n\17\r\17\16\17\u0080\3\17\3\17\6\17\u0085"+
      "\n\17\r\17\16\17\u0086\3\20\3\20\3\20\6\20\u008c\n\20\r\20\16\20\u008d"+
      "\3\21\3\21\5\21\u0092\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23"+
      "\u009b\n\23\f\23\16\23\u009e\13\23\3\23\3\23\3\24\6\24\u00a3\n\24"+
      "\r\24\16\24\u00a4\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
      "\36 \"$&\2\4\3\2\13\30\4\2\23\23\32\32\u00a7\2(\3\2\2\2\4+\3\2\2\2"+
      "\6;\3\2\2\2\bC\3\2\2\2\nM\3\2\2\2\fO\3\2\2\2\16S\3\2\2\2\20W\3\2\2"+
      "\2\22[\3\2\2\2\24_\3\2\2\2\26c\3\2\2\2\30n\3\2\2\2\32{\3\2\2\2\34"+
      "~\3\2\2\2\36\u0088\3\2\2\2 \u0091\3\2\2\2\"\u0093\3\2\2\2$\u009c\3"+
      "\2\2\2&\u00a2\3\2\2\2()\5\4\3\2)*\5$\23\2*\3\3\2\2\2+/\5\6\4\2,.\5"+
      "\"\22\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2"+
      "\61/\3\2\2\2\62\66\5\b\5\2\63\65\5\n\6\2\64\63\3\2\2\2\658\3\2\2\2"+
      "\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\29:\5\26\f\2:\5"+
      "\3\2\2\2;=\7\3\2\2<>\7\37\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2"+
      "\2\2@A\3\2\2\2AB\5 \21\2B\7\3\2\2\2CD\7\4\2\2DE\5&\24\2EF\5 \21\2"+
      "F\t\3\2\2\2GN\5\f\7\2HN\5\16\b\2IN\5\20\t\2JN\5\22\n\2KN\5\24\13\2"+
      "LN\5\"\22\2MG\3\2\2\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3"+
      "\2\2\2N\13\3\2\2\2OP\7\5\2\2PQ\5&\24\2QR\5 \21\2R\r\3\2\2\2ST\7\6"+
      "\2\2TU\5\30\r\2UV\5 \21\2V\17\3\2\2\2WX\7\7\2\2XY\5\32\16\2YZ\5 \21"+
      "\2Z\21\3\2\2\2[\\\7\b\2\2\\]\5\36\20\2]^\5 \21\2^\23\3\2\2\2_`\7\t"+
      "\2\2`a\5&\24\2ab\5 \21\2b\25\3\2\2\2cd\7\n\2\2df\t\2\2\2eg\7\31\2"+
      "\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\t\3\2\2ih\3\2\2\2ij\3\2\2\2jk\3"+
      "\2\2\2kl\5 \21\2l\27\3\2\2\2mo\7\37\2\2nm\3\2\2\2op\3\2\2\2pn\3\2"+
      "\2\2pq\3\2\2\2qr\3\2\2\2rt\7\33\2\2su\7\37\2\2ts\3\2\2\2uv\3\2\2\2"+
      "vt\3\2\2\2vw\3\2\2\2w\31\3\2\2\2x|\7\r\2\2y|\7\34\2\2z|\5\34\17\2"+
      "{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\33\3\2\2\2}\177\7\37\2\2~}\3\2\2\2"+
      "\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
      "\3\2\2\2\u0082\u0084\7\33\2\2\u0083\u0085\7\37\2\2\u0084\u0083\3\2"+
      "\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
      "\35\3\2\2\2\u0088\u0089\5\34\17\2\u0089\u008b\7\35\2\2\u008a\u008c"+
      "\7\37\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2"+
      "\2\2\u008d\u008e\3\2\2\2\u008e\37\3\2\2\2\u008f\u0092\5\"\22\2\u0090"+
      "\u0092\7 \2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092!\3\2\2"+
      "\2\u0093\u0094\7\36\2\2\u0094\u0095\5&\24\2\u0095\u0096\7 \2\2\u0096"+
      "#\3\2\2\2\u0097\u0098\5&\24\2\u0098\u0099\7 \2\2\u0099\u009b\3\2\2"+
      "\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
      "\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0"+
      "\7\2\2\3\u00a0%\3\2\2\2\u00a1\u00a3\7\"\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
      "\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\'\3\2"+
      "\2\2\21/\66?Mfipv{\u0080\u0086\u008d\u0091\u009c\u00a4";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
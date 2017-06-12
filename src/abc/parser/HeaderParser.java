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
    T__9=10, T__10=11, INDEXMARKER=12, TITLEMARKER=13, KEYMARKER=14, COMPOSERMARKER=15, 
    LENGTHMARKER=16, METERMARKER=17, TEMPOMARKER=18, VOICEMARKER=19, NUMBER=20, 
    FRACTION=21, TEMPO=22, ENDOFLINE=23, COMMENT=24, BARLINE=25, TEXT=26, 
    NEWLINE=27, CHAR=28;
  public static final int
    RULE_root = 0, RULE_header = 1, RULE_fieldindex = 2, RULE_fieldtitle = 3, 
    RULE_fieldkey = 4, RULE_otherfields = 5, RULE_fieldcomposer = 6, RULE_fieldlength = 7, 
    RULE_fieldmeter = 8, RULE_fieldtempo = 9, RULE_fieldvoice = 10, RULE_meter = 11, 
    RULE_body = 12;
  public static final String[] ruleNames = {
    "root", "header", "fieldindex", "fieldtitle", "fieldkey", "otherfields", 
    "fieldcomposer", "fieldlength", "fieldmeter", "fieldtempo", "fieldvoice", 
    "meter", "body"
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
      setState(26);
      header();
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
    public BodyContext body() {
      return getRuleContext(BodyContext.class,0);
    }
    public List<TerminalNode> ENDOFLINE() { return getTokens(HeaderParser.ENDOFLINE); }
    public TerminalNode ENDOFLINE(int i) {
      return getToken(HeaderParser.ENDOFLINE, i);
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
      setState(28);
      fieldindex();
      setState(32);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==ENDOFLINE) {
        {
        {
        setState(29);
        match(ENDOFLINE);
        }
        }
        setState(34);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(35);
      fieldtitle();
      setState(39);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSERMARKER) | (1L << LENGTHMARKER) | (1L << METERMARKER) | (1L << TEMPOMARKER) | (1L << VOICEMARKER) | (1L << COMMENT))) != 0)) {
        {
        {
        setState(36);
        otherfields();
        }
        }
        setState(41);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(42);
      fieldkey();
      setState(43);
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

  public static class FieldindexContext extends ParserRuleContext {
    public TerminalNode INDEXMARKER() { return getToken(HeaderParser.INDEXMARKER, 0); }
    public TerminalNode NUMBER() { return getToken(HeaderParser.NUMBER, 0); }
    public TerminalNode ENDOFLINE() { return getToken(HeaderParser.ENDOFLINE, 0); }
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
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(45);
      match(INDEXMARKER);
      setState(46);
      match(NUMBER);
      setState(47);
      match(ENDOFLINE);
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
    public TerminalNode TITLEMARKER() { return getToken(HeaderParser.TITLEMARKER, 0); }
    public TerminalNode TEXT() { return getToken(HeaderParser.TEXT, 0); }
    public TerminalNode ENDOFLINE() { return getToken(HeaderParser.ENDOFLINE, 0); }
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
      setState(49);
      match(TITLEMARKER);
      setState(50);
      match(TEXT);
      setState(51);
      match(ENDOFLINE);
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
    public TerminalNode KEYMARKER() { return getToken(HeaderParser.KEYMARKER, 0); }
    public TerminalNode ENDOFLINE() { return getToken(HeaderParser.ENDOFLINE, 0); }
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
    enterRule(_localctx, 8, RULE_fieldkey);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(53);
      match(KEYMARKER);
      setState(54);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      {
      setState(56);
      _la = _input.LA(1);
      if (_la==T__7) {
        {
        setState(55);
        match(T__7);
        }
      }

      }
      {
      setState(59);
      _la = _input.LA(1);
      if (_la==T__8 || _la==T__9) {
        {
        setState(58);
        _la = _input.LA(1);
        if ( !(_la==T__8 || _la==T__9) ) {
        _errHandler.recoverInline(this);
        } else {
          consume();
        }
        }
      }

      }
      setState(61);
      match(ENDOFLINE);
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
    public TerminalNode COMMENT() { return getToken(HeaderParser.COMMENT, 0); }
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
    enterRule(_localctx, 10, RULE_otherfields);
    try {
      setState(69);
      switch (_input.LA(1)) {
      case COMPOSERMARKER:
        enterOuterAlt(_localctx, 1);
        {
        setState(63);
        fieldcomposer();
        }
        break;
      case LENGTHMARKER:
        enterOuterAlt(_localctx, 2);
        {
        setState(64);
        fieldlength();
        }
        break;
      case METERMARKER:
        enterOuterAlt(_localctx, 3);
        {
        setState(65);
        fieldmeter();
        }
        break;
      case TEMPOMARKER:
        enterOuterAlt(_localctx, 4);
        {
        setState(66);
        fieldtempo();
        }
        break;
      case VOICEMARKER:
        enterOuterAlt(_localctx, 5);
        {
        setState(67);
        fieldvoice();
        }
        break;
      case COMMENT:
        enterOuterAlt(_localctx, 6);
        {
        setState(68);
        match(COMMENT);
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
    public TerminalNode COMPOSERMARKER() { return getToken(HeaderParser.COMPOSERMARKER, 0); }
    public TerminalNode TEXT() { return getToken(HeaderParser.TEXT, 0); }
    public TerminalNode ENDOFLINE() { return getToken(HeaderParser.ENDOFLINE, 0); }
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
    enterRule(_localctx, 12, RULE_fieldcomposer);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(71);
      match(COMPOSERMARKER);
      setState(72);
      match(TEXT);
      setState(73);
      match(ENDOFLINE);
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
    public TerminalNode LENGTHMARKER() { return getToken(HeaderParser.LENGTHMARKER, 0); }
    public TerminalNode ENDOFLINE() { return getToken(HeaderParser.ENDOFLINE, 0); }
    public TerminalNode FRACTION() { return getToken(HeaderParser.FRACTION, 0); }
    public TerminalNode NUMBER() { return getToken(HeaderParser.NUMBER, 0); }
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
    enterRule(_localctx, 14, RULE_fieldlength);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(75);
      match(LENGTHMARKER);
      setState(76);
      _la = _input.LA(1);
      if ( !(_la==NUMBER || _la==FRACTION) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(77);
      match(ENDOFLINE);
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
    public TerminalNode METERMARKER() { return getToken(HeaderParser.METERMARKER, 0); }
    public MeterContext meter() {
      return getRuleContext(MeterContext.class,0);
    }
    public TerminalNode ENDOFLINE() { return getToken(HeaderParser.ENDOFLINE, 0); }
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
    enterRule(_localctx, 16, RULE_fieldmeter);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(79);
      match(METERMARKER);
      setState(80);
      meter();
      setState(81);
      match(ENDOFLINE);
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
    public TerminalNode TEMPOMARKER() { return getToken(HeaderParser.TEMPOMARKER, 0); }
    public TerminalNode TEMPO() { return getToken(HeaderParser.TEMPO, 0); }
    public TerminalNode ENDOFLINE() { return getToken(HeaderParser.ENDOFLINE, 0); }
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
    enterRule(_localctx, 18, RULE_fieldtempo);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(83);
      match(TEMPOMARKER);
      setState(84);
      match(TEMPO);
      setState(85);
      match(ENDOFLINE);
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
    public TerminalNode VOICEMARKER() { return getToken(HeaderParser.VOICEMARKER, 0); }
    public TerminalNode ENDOFLINE() { return getToken(HeaderParser.ENDOFLINE, 0); }
    public TerminalNode NUMBER() { return getToken(HeaderParser.NUMBER, 0); }
    public List<TerminalNode> TEXT() { return getTokens(HeaderParser.TEXT); }
    public TerminalNode TEXT(int i) {
      return getToken(HeaderParser.TEXT, i);
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
    enterRule(_localctx, 20, RULE_fieldvoice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(87);
      match(VOICEMARKER);
      setState(89);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(88);
        match(NUMBER);
        }
      }

      setState(94);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==TEXT) {
        {
        {
        setState(91);
        match(TEXT);
        }
        }
        setState(96);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(97);
      match(ENDOFLINE);
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
    public TerminalNode FRACTION() { return getToken(HeaderParser.FRACTION, 0); }
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
    enterRule(_localctx, 22, RULE_meter);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(99);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__10) | (1L << FRACTION))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
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
    public List<TerminalNode> ENDOFLINE() { return getTokens(HeaderParser.ENDOFLINE); }
    public TerminalNode ENDOFLINE(int i) {
      return getToken(HeaderParser.ENDOFLINE, i);
    }
    public List<TerminalNode> VOICEMARKER() { return getTokens(HeaderParser.VOICEMARKER); }
    public TerminalNode VOICEMARKER(int i) {
      return getToken(HeaderParser.VOICEMARKER, i);
    }
    public List<TerminalNode> TEXT() { return getTokens(HeaderParser.TEXT); }
    public TerminalNode TEXT(int i) {
      return getToken(HeaderParser.TEXT, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(HeaderParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(HeaderParser.NUMBER, i);
    }
    public List<TerminalNode> BARLINE() { return getTokens(HeaderParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(HeaderParser.BARLINE, i);
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
    enterRule(_localctx, 24, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(113);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOICEMARKER) | (1L << NUMBER) | (1L << ENDOFLINE) | (1L << BARLINE) | (1L << TEXT))) != 0)) {
        {
        {
        setState(102);
        _la = _input.LA(1);
        if (_la==VOICEMARKER) {
          {
          setState(101);
          match(VOICEMARKER);
          }
        }

        setState(107);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BARLINE) | (1L << TEXT))) != 0)) {
          {
          {
          setState(104);
          _la = _input.LA(1);
          if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BARLINE) | (1L << TEXT))) != 0)) ) {
          _errHandler.recoverInline(this);
          } else {
            consume();
          }
          }
          }
          setState(109);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(110);
        match(ENDOFLINE);
        }
        }
        setState(115);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(116);
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

  public static final String _serializedATN =
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36y\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\7\3!\n\3\f\3\16\3"+
      "$\13\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
      "\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6;\n\6\3\6\5\6>\n\6\3\6\3\6\3\7\3\7"+
      "\3\7\3\7\3\7\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
      "\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\5\f\\\n\f\3\f\7\f_\n\f\f\f\16"+
      "\fb\13\f\3\f\3\f\3\r\3\r\3\16\5\16i\n\16\3\16\7\16l\n\16\f\16\16\16"+
      "o\13\16\3\16\7\16r\n\16\f\16\16\16u\13\16\3\16\3\16\3\16\2\2\17\2"+
      "\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3\2\3\t\3\2\13\f\3\2\26\27\5\2"+
      "\5\5\r\r\27\27\4\2\26\26\33\34y\2\34\3\2\2\2\4\36\3\2\2\2\6/\3\2\2"+
      "\2\b\63\3\2\2\2\n\67\3\2\2\2\fG\3\2\2\2\16I\3\2\2\2\20M\3\2\2\2\22"+
      "Q\3\2\2\2\24U\3\2\2\2\26Y\3\2\2\2\30e\3\2\2\2\32s\3\2\2\2\34\35\5"+
      "\4\3\2\35\3\3\2\2\2\36\"\5\6\4\2\37!\7\31\2\2 \37\3\2\2\2!$\3\2\2"+
      "\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%)\5\b\5\2&(\5\f\7\2"+
      "\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5"+
      "\n\6\2-.\5\32\16\2.\5\3\2\2\2/\60\7\16\2\2\60\61\7\26\2\2\61\62\7"+
      "\31\2\2\62\7\3\2\2\2\63\64\7\17\2\2\64\65\7\34\2\2\65\66\7\31\2\2"+
      "\66\t\3\2\2\2\678\7\20\2\28:\t\2\2\29;\7\n\2\2:9\3\2\2\2:;\3\2\2\2"+
      ";=\3\2\2\2<>\t\3\2\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\31\2\2@\13"+
      "\3\2\2\2AH\5\16\b\2BH\5\20\t\2CH\5\22\n\2DH\5\24\13\2EH\5\26\f\2F"+
      "H\7\32\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2\2GF\3\2"+
      "\2\2H\r\3\2\2\2IJ\7\21\2\2JK\7\34\2\2KL\7\31\2\2L\17\3\2\2\2MN\7\22"+
      "\2\2NO\t\4\2\2OP\7\31\2\2P\21\3\2\2\2QR\7\23\2\2RS\5\30\r\2ST\7\31"+
      "\2\2T\23\3\2\2\2UV\7\24\2\2VW\7\30\2\2WX\7\31\2\2X\25\3\2\2\2Y[\7"+
      "\25\2\2Z\\\7\26\2\2[Z\3\2\2\2[\\\3\2\2\2\\`\3\2\2\2]_\7\34\2\2^]\3"+
      "\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\31\2"+
      "\2d\27\3\2\2\2ef\t\5\2\2f\31\3\2\2\2gi\7\25\2\2hg\3\2\2\2hi\3\2\2"+
      "\2im\3\2\2\2jl\t\6\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3"+
      "\2\2\2om\3\2\2\2pr\7\31\2\2qh\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
      "\2tv\3\2\2\2us\3\2\2\2vw\7\2\2\3w\33\3\2\2\2\f\"):=G[`hms";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
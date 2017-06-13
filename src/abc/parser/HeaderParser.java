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
    T__23=24, T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, 
    T__30=31, INDEXMARKER=32, TITLEMARKER=33, KEYMARKER=34, COMPOSERMARKER=35, 
    LENGTHMARKER=36, METERMARKER=37, TEMPOMARKER=38, VOICEMARKER=39, NUMBER=40, 
    FRACTION=41, TEMPO=42, ENDOFLINE=43, COMMENT=44, BARLINE=45, TEXT=46, 
    NEWLINE=47, CHAR=48;
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
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(55);
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
      setState(63);
      switch (_input.LA(1)) {
      case COMPOSERMARKER:
        enterOuterAlt(_localctx, 1);
        {
        setState(57);
        fieldcomposer();
        }
        break;
      case LENGTHMARKER:
        enterOuterAlt(_localctx, 2);
        {
        setState(58);
        fieldlength();
        }
        break;
      case METERMARKER:
        enterOuterAlt(_localctx, 3);
        {
        setState(59);
        fieldmeter();
        }
        break;
      case TEMPOMARKER:
        enterOuterAlt(_localctx, 4);
        {
        setState(60);
        fieldtempo();
        }
        break;
      case VOICEMARKER:
        enterOuterAlt(_localctx, 5);
        {
        setState(61);
        fieldvoice();
        }
        break;
      case COMMENT:
        enterOuterAlt(_localctx, 6);
        {
        setState(62);
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
      setState(65);
      match(COMPOSERMARKER);
      setState(66);
      match(TEXT);
      setState(67);
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
      setState(69);
      match(LENGTHMARKER);
      setState(70);
      _la = _input.LA(1);
      if ( !(_la==NUMBER || _la==FRACTION) ) {
      _errHandler.recoverInline(this);
      } else {
        consume();
      }
      setState(71);
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
      setState(73);
      match(METERMARKER);
      setState(74);
      meter();
      setState(75);
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
      setState(77);
      match(TEMPOMARKER);
      setState(78);
      match(TEMPO);
      setState(79);
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
      setState(81);
      match(VOICEMARKER);
      setState(83);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(82);
        match(NUMBER);
        }
      }

      setState(88);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==TEXT) {
        {
        {
        setState(85);
        match(TEXT);
        }
        }
        setState(90);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(91);
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
      setState(93);
      _la = _input.LA(1);
      if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__30) | (1L << FRACTION))) != 0)) ) {
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
      setState(107);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOICEMARKER) | (1L << NUMBER) | (1L << ENDOFLINE) | (1L << BARLINE) | (1L << TEXT))) != 0)) {
        {
        {
        setState(96);
        _la = _input.LA(1);
        if (_la==VOICEMARKER) {
          {
          setState(95);
          match(VOICEMARKER);
          }
        }

        setState(101);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BARLINE) | (1L << TEXT))) != 0)) {
          {
          {
          setState(98);
          _la = _input.LA(1);
          if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BARLINE) | (1L << TEXT))) != 0)) ) {
          _errHandler.recoverInline(this);
          } else {
            consume();
          }
          }
          }
          setState(103);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(104);
        match(ENDOFLINE);
        }
        }
        setState(109);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(110);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62s\4\2\t\2\4\3"+
      "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
      "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\7\3!\n\3\f\3\16\3"+
      "$\13\3\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
      "\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7B\n\7"+
      "\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
      "\13\3\f\3\f\5\fV\n\f\3\f\7\fY\n\f\f\f\16\f\\\13\f\3\f\3\f\3\r\3\r"+
      "\3\16\5\16c\n\16\3\16\7\16f\n\16\f\16\16\16i\13\16\3\16\7\16l\n\16"+
      "\f\16\16\16o\13\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26"+
      "\30\32\2\6\3\2\3 \3\2*+\5\2\3\3!!++\4\2**/\60q\2\34\3\2\2\2\4\36\3"+
      "\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\n\67\3\2\2\2\fA\3\2\2\2\16C\3\2\2\2"+
      "\20G\3\2\2\2\22K\3\2\2\2\24O\3\2\2\2\26S\3\2\2\2\30_\3\2\2\2\32m\3"+
      "\2\2\2\34\35\5\4\3\2\35\3\3\2\2\2\36\"\5\6\4\2\37!\7-\2\2 \37\3\2"+
      "\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%)\5\b\5"+
      "\2&(\5\f\7\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+"+
      ")\3\2\2\2,-\5\n\6\2-.\5\32\16\2.\5\3\2\2\2/\60\7\"\2\2\60\61\7*\2"+
      "\2\61\62\7-\2\2\62\7\3\2\2\2\63\64\7#\2\2\64\65\7\60\2\2\65\66\7-"+
      "\2\2\66\t\3\2\2\2\678\7$\2\289\t\2\2\29:\7-\2\2:\13\3\2\2\2;B\5\16"+
      "\b\2<B\5\20\t\2=B\5\22\n\2>B\5\24\13\2?B\5\26\f\2@B\7.\2\2A;\3\2\2"+
      "\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\r\3\2\2\2CD"+
      "\7%\2\2DE\7\60\2\2EF\7-\2\2F\17\3\2\2\2GH\7&\2\2HI\t\3\2\2IJ\7-\2"+
      "\2J\21\3\2\2\2KL\7\'\2\2LM\5\30\r\2MN\7-\2\2N\23\3\2\2\2OP\7(\2\2"+
      "PQ\7,\2\2QR\7-\2\2R\25\3\2\2\2SU\7)\2\2TV\7*\2\2UT\3\2\2\2UV\3\2\2"+
      "\2VZ\3\2\2\2WY\7\60\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2["+
      "]\3\2\2\2\\Z\3\2\2\2]^\7-\2\2^\27\3\2\2\2_`\t\4\2\2`\31\3\2\2\2ac"+
      "\7)\2\2ba\3\2\2\2bc\3\2\2\2cg\3\2\2\2df\t\5\2\2ed\3\2\2\2fi\3\2\2"+
      "\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\7-\2\2kb\3\2\2\2lo\3"+
      "\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\33\3\2\2"+
      "\2\n\")AUZbgm";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
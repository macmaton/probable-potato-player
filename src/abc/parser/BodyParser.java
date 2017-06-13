// Generated from Body.g4 by ANTLR 4.5.1

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
public class BodyParser extends Parser {
  static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
    new PredictionContextCache();
  public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, BASENOTE=9, 
    ACCIDENTAL=10, BARLINE=11, REPEATBEGINBAR=12, REPEATENDBAR=13, NTHREPEAT=14, 
    REST=15, NUMBER=16, NEWLINE=17, WHITESPACE=18, CHAR=19;
  public static final int
    RULE_body = 0, RULE_bodyelement = 1, RULE_sectionelement = 2, RULE_voicepart = 3, 
    RULE_voicepartelement = 4, RULE_repeatstart = 5, RULE_repeatend = 6, 
    RULE_repeatfull = 7, RULE_repeatendingline = 8, RULE_repeatending = 9, 
    RULE_line = 10, RULE_measure = 11, RULE_measureelement = 12, RULE_tupletelement = 13, 
    RULE_note = 14, RULE_noterest = 15, RULE_pitch = 16, RULE_octave = 17, 
    RULE_notelength = 18, RULE_tuplet = 19, RULE_tupletspec = 20, RULE_chord = 21, 
    RULE_fieldvoice = 22, RULE_endofline = 23, RULE_comment = 24, RULE_text = 25;
  public static final String[] ruleNames = {
    "body", "bodyelement", "sectionelement", "voicepart", "voicepartelement", 
    "repeatstart", "repeatend", "repeatfull", "repeatendingline", "repeatending", 
    "line", "measure", "measureelement", "tupletelement", "note", "noterest", 
    "pitch", "octave", "notelength", "tuplet", "tupletspec", "chord", "fieldvoice", 
    "endofline", "comment", "text"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'('", "'['", "']'", "'V:'", "'%'", null, 
    null, null, "'|:'", "':|'", null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, "BASENOTE", "ACCIDENTAL", 
    "BARLINE", "REPEATBEGINBAR", "REPEATENDBAR", "NTHREPEAT", "REST", "NUMBER", 
    "NEWLINE", "WHITESPACE", "CHAR"
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
  public String getGrammarFileName() { return "Body.g4"; }

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

  public BodyParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
  }
  public static class BodyContext extends ParserRuleContext {
    public TerminalNode EOF() { return getToken(BodyParser.EOF, 0); }
    public List<BodyelementContext> bodyelement() {
      return getRuleContexts(BodyelementContext.class);
    }
    public BodyelementContext bodyelement(int i) {
      return getRuleContext(BodyelementContext.class,i);
    }
    public BodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_body; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterBody(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitBody(this);
    }
  }

  public final BodyContext body() throws RecognitionException {
    BodyContext _localctx = new BodyContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_body);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(53); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(52);
        bodyelement();
        }
        }
        setState(55); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REPEATBEGINBAR) | (1L << NTHREPEAT) | (1L << REST) | (1L << WHITESPACE))) != 0) );
      setState(57);
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

  public static class BodyelementContext extends ParserRuleContext {
    public List<SectionelementContext> sectionelement() {
      return getRuleContexts(SectionelementContext.class);
    }
    public SectionelementContext sectionelement(int i) {
      return getRuleContext(SectionelementContext.class,i);
    }
    public BodyelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_bodyelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterBodyelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitBodyelement(this);
    }
  }

  public final BodyelementContext bodyelement() throws RecognitionException {
    BodyelementContext _localctx = new BodyelementContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_bodyelement);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(60); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(59);
          sectionelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(62); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,1,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class SectionelementContext extends ParserRuleContext {
    public VoicepartContext voicepart() {
      return getRuleContext(VoicepartContext.class,0);
    }
    public VoicepartelementContext voicepartelement() {
      return getRuleContext(VoicepartelementContext.class,0);
    }
    public SectionelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_sectionelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterSectionelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitSectionelement(this);
    }
  }

  public final SectionelementContext sectionelement() throws RecognitionException {
    SectionelementContext _localctx = new SectionelementContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_sectionelement);
    try {
      setState(66);
      switch (_input.LA(1)) {
      case T__6:
        enterOuterAlt(_localctx, 1);
        {
        setState(64);
        voicepart();
        }
        break;
      case T__3:
      case T__4:
      case BASENOTE:
      case ACCIDENTAL:
      case REPEATBEGINBAR:
      case NTHREPEAT:
      case REST:
      case WHITESPACE:
        enterOuterAlt(_localctx, 2);
        {
        setState(65);
        voicepartelement();
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

  public static class VoicepartContext extends ParserRuleContext {
    public FieldvoiceContext fieldvoice() {
      return getRuleContext(FieldvoiceContext.class,0);
    }
    public VoicepartelementContext voicepartelement() {
      return getRuleContext(VoicepartelementContext.class,0);
    }
    public VoicepartContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voicepart; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterVoicepart(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitVoicepart(this);
    }
  }

  public final VoicepartContext voicepart() throws RecognitionException {
    VoicepartContext _localctx = new VoicepartContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_voicepart);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(68);
      fieldvoice();
      setState(69);
      voicepartelement();
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

  public static class VoicepartelementContext extends ParserRuleContext {
    public RepeatstartContext repeatstart() {
      return getRuleContext(RepeatstartContext.class,0);
    }
    public RepeatendContext repeatend() {
      return getRuleContext(RepeatendContext.class,0);
    }
    public RepeatfullContext repeatfull() {
      return getRuleContext(RepeatfullContext.class,0);
    }
    public RepeatendinglineContext repeatendingline() {
      return getRuleContext(RepeatendinglineContext.class,0);
    }
    public LineContext line() {
      return getRuleContext(LineContext.class,0);
    }
    public VoicepartelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_voicepartelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterVoicepartelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitVoicepartelement(this);
    }
  }

  public final VoicepartelementContext voicepartelement() throws RecognitionException {
    VoicepartelementContext _localctx = new VoicepartelementContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_voicepartelement);
    try {
      setState(76);
      switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(71);
        repeatstart();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(72);
        repeatend();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(73);
        repeatfull();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(74);
        repeatendingline();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(75);
        line();
        }
        break;
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

  public static class RepeatstartContext extends ParserRuleContext {
    public TerminalNode REPEATBEGINBAR() { return getToken(BodyParser.REPEATBEGINBAR, 0); }
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public List<TerminalNode> BARLINE() { return getTokens(BodyParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(BodyParser.BARLINE, i);
    }
    public List<EndoflineContext> endofline() {
      return getRuleContexts(EndoflineContext.class);
    }
    public EndoflineContext endofline(int i) {
      return getRuleContext(EndoflineContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
    public RepeatstartContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_repeatstart; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterRepeatstart(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitRepeatstart(this);
    }
  }

  public final RepeatstartContext repeatstart() throws RecognitionException {
    RepeatstartContext _localctx = new RepeatstartContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_repeatstart);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(78);
      match(REPEATBEGINBAR);
      setState(86);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(79);
          measure();
          setState(80);
          match(BARLINE);
          setState(82);
          switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
          case 1:
            {
            setState(81);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(88);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
      }
      setState(89);
      measure();
      setState(94);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(90);
        match(BARLINE);
        setState(92);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(91);
          match(WHITESPACE);
          }
        }

        }
      }

      {
      setState(97); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(96);
        endofline();
        }
        }
        setState(99); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==T__7 || _la==NEWLINE );
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

  public static class RepeatendContext extends ParserRuleContext {
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public TerminalNode REPEATENDBAR() { return getToken(BodyParser.REPEATENDBAR, 0); }
    public TerminalNode EOF() { return getToken(BodyParser.EOF, 0); }
    public List<TerminalNode> BARLINE() { return getTokens(BodyParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(BodyParser.BARLINE, i);
    }
    public List<RepeatendingContext> repeatending() {
      return getRuleContexts(RepeatendingContext.class);
    }
    public RepeatendingContext repeatending(int i) {
      return getRuleContext(RepeatendingContext.class,i);
    }
    public List<EndoflineContext> endofline() {
      return getRuleContexts(EndoflineContext.class);
    }
    public EndoflineContext endofline(int i) {
      return getRuleContext(EndoflineContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
    public RepeatendContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_repeatend; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterRepeatend(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitRepeatend(this);
    }
  }

  public final RepeatendContext repeatend() throws RecognitionException {
    RepeatendContext _localctx = new RepeatendContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_repeatend);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(108);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(101);
          measure();
          setState(102);
          match(BARLINE);
          setState(104);
          switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
          case 1:
            {
            setState(103);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(110);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,10,_ctx);
      }
      setState(111);
      measure();
      setState(116);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(112);
        match(BARLINE);
        setState(114);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(113);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(119);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(118);
        repeatending();
        }
      }

      setState(121);
      match(REPEATENDBAR);
      setState(125);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NTHREPEAT) {
        {
        {
        setState(122);
        repeatending();
        }
        }
        setState(127);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(134);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(129); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(128);
          endofline();
          }
          }
          setState(131); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(133);
        match(EOF);
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class RepeatfullContext extends ParserRuleContext {
    public TerminalNode REPEATBEGINBAR() { return getToken(BodyParser.REPEATBEGINBAR, 0); }
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public TerminalNode REPEATENDBAR() { return getToken(BodyParser.REPEATENDBAR, 0); }
    public TerminalNode EOF() { return getToken(BodyParser.EOF, 0); }
    public List<TerminalNode> BARLINE() { return getTokens(BodyParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(BodyParser.BARLINE, i);
    }
    public List<RepeatendingContext> repeatending() {
      return getRuleContexts(RepeatendingContext.class);
    }
    public RepeatendingContext repeatending(int i) {
      return getRuleContext(RepeatendingContext.class,i);
    }
    public List<EndoflineContext> endofline() {
      return getRuleContexts(EndoflineContext.class);
    }
    public EndoflineContext endofline(int i) {
      return getRuleContext(EndoflineContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
    public RepeatfullContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_repeatfull; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterRepeatfull(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitRepeatfull(this);
    }
  }

  public final RepeatfullContext repeatfull() throws RecognitionException {
    RepeatfullContext _localctx = new RepeatfullContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_repeatfull);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(136);
      match(REPEATBEGINBAR);
      setState(144);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,18,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(137);
          measure();
          setState(138);
          match(BARLINE);
          setState(140);
          switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
          case 1:
            {
            setState(139);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(146);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,18,_ctx);
      }
      setState(147);
      measure();
      setState(152);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(148);
        match(BARLINE);
        setState(150);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(149);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(155);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(154);
        repeatending();
        }
      }

      setState(157);
      match(REPEATENDBAR);
      setState(161);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NTHREPEAT) {
        {
        {
        setState(158);
        repeatending();
        }
        }
        setState(163);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(170);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(165); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(164);
          endofline();
          }
          }
          setState(167); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(169);
        match(EOF);
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class RepeatendinglineContext extends ParserRuleContext {
    public RepeatendingContext repeatending() {
      return getRuleContext(RepeatendingContext.class,0);
    }
    public TerminalNode EOF() { return getToken(BodyParser.EOF, 0); }
    public List<EndoflineContext> endofline() {
      return getRuleContexts(EndoflineContext.class);
    }
    public EndoflineContext endofline(int i) {
      return getRuleContext(EndoflineContext.class,i);
    }
    public RepeatendinglineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_repeatendingline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterRepeatendingline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitRepeatendingline(this);
    }
  }

  public final RepeatendinglineContext repeatendingline() throws RecognitionException {
    RepeatendinglineContext _localctx = new RepeatendinglineContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_repeatendingline);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(172);
      repeatending();
      setState(179);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(174); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(173);
          endofline();
          }
          }
          setState(176); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(178);
        match(EOF);
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class RepeatendingContext extends ParserRuleContext {
    public TerminalNode NTHREPEAT() { return getToken(BodyParser.NTHREPEAT, 0); }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public List<TerminalNode> BARLINE() { return getTokens(BodyParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(BodyParser.BARLINE, i);
    }
    public RepeatendingContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_repeatending; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterRepeatending(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitRepeatending(this);
    }
  }

  public final RepeatendingContext repeatending() throws RecognitionException {
    RepeatendingContext _localctx = new RepeatendingContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_repeatending);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(181);
      match(NTHREPEAT);
      setState(183);
      switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
      case 1:
        {
        setState(182);
        match(WHITESPACE);
        }
        break;
      }
      setState(192); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(185);
        measure();
        setState(187);
        _la = _input.LA(1);
        if (_la==BARLINE) {
          {
          setState(186);
          match(BARLINE);
          }
        }

        setState(190);
        switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
        case 1:
          {
          setState(189);
          match(WHITESPACE);
          }
          break;
        }
        }
        }
        setState(194); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << WHITESPACE))) != 0) );
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

  public static class LineContext extends ParserRuleContext {
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public TerminalNode EOF() { return getToken(BodyParser.EOF, 0); }
    public List<TerminalNode> BARLINE() { return getTokens(BodyParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(BodyParser.BARLINE, i);
    }
    public List<EndoflineContext> endofline() {
      return getRuleContexts(EndoflineContext.class);
    }
    public EndoflineContext endofline(int i) {
      return getRuleContext(EndoflineContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
    public LineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_line; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterLine(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitLine(this);
    }
  }

  public final LineContext line() throws RecognitionException {
    LineContext _localctx = new LineContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_line);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(203);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,32,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(196);
          measure();
          setState(197);
          match(BARLINE);
          setState(199);
          switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
          case 1:
            {
            setState(198);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(205);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,32,_ctx);
      }
      setState(206);
      measure();
      setState(211);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(207);
        match(BARLINE);
        setState(209);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(208);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(219);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(214); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(213);
          endofline();
          }
          }
          setState(216); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(218);
        match(EOF);
        }
        break;
      default:
        throw new NoViableAltException(this);
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

  public static class MeasureContext extends ParserRuleContext {
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
    public List<MeasureelementContext> measureelement() {
      return getRuleContexts(MeasureelementContext.class);
    }
    public MeasureelementContext measureelement(int i) {
      return getRuleContext(MeasureelementContext.class,i);
    }
    public MeasureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_measure; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterMeasure(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitMeasure(this);
    }
  }

  public final MeasureContext measure() throws RecognitionException {
    MeasureContext _localctx = new MeasureContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_measure);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(222);
      _la = _input.LA(1);
      if (_la==WHITESPACE) {
        {
        setState(221);
        match(WHITESPACE);
        }
      }

      setState(228); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(224);
          measureelement();
          setState(226);
          switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
          case 1:
            {
            setState(225);
            match(WHITESPACE);
            }
            break;
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(230); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,39,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class MeasureelementContext extends ParserRuleContext {
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
    }
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
    }
    public MeasureelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_measureelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterMeasureelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitMeasureelement(this);
    }
  }

  public final MeasureelementContext measureelement() throws RecognitionException {
    MeasureelementContext _localctx = new MeasureelementContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_measureelement);
    try {
      setState(234);
      switch (_input.LA(1)) {
      case T__4:
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(232);
        tupletelement();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(233);
        tuplet();
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

  public static class TupletelementContext extends ParserRuleContext {
    public NoteContext note() {
      return getRuleContext(NoteContext.class,0);
    }
    public TerminalNode WHITESPACE() { return getToken(BodyParser.WHITESPACE, 0); }
    public ChordContext chord() {
      return getRuleContext(ChordContext.class,0);
    }
    public TupletelementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletelement; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterTupletelement(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitTupletelement(this);
    }
  }

  public final TupletelementContext tupletelement() throws RecognitionException {
    TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_tupletelement);
    try {
      setState(244);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(236);
        note();
        setState(238);
        switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
        case 1:
          {
          setState(237);
          match(WHITESPACE);
          }
          break;
        }
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(240);
        chord();
        setState(242);
        switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
        case 1:
          {
          setState(241);
          match(WHITESPACE);
          }
          break;
        }
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

  public static class NoteContext extends ParserRuleContext {
    public NoterestContext noterest() {
      return getRuleContext(NoterestContext.class,0);
    }
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public NoteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_note; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterNote(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitNote(this);
    }
  }

  public final NoteContext note() throws RecognitionException {
    NoteContext _localctx = new NoteContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(246);
      noterest();
      setState(247);
      notelength();
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

  public static class NoterestContext extends ParserRuleContext {
    public PitchContext pitch() {
      return getRuleContext(PitchContext.class,0);
    }
    public TerminalNode REST() { return getToken(BodyParser.REST, 0); }
    public NoterestContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_noterest; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterNoterest(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitNoterest(this);
    }
  }

  public final NoterestContext noterest() throws RecognitionException {
    NoterestContext _localctx = new NoterestContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_noterest);
    try {
      setState(251);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(249);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(250);
        match(REST);
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

  public static class PitchContext extends ParserRuleContext {
    public TerminalNode BASENOTE() { return getToken(BodyParser.BASENOTE, 0); }
    public TerminalNode ACCIDENTAL() { return getToken(BodyParser.ACCIDENTAL, 0); }
    public List<OctaveContext> octave() {
      return getRuleContexts(OctaveContext.class);
    }
    public OctaveContext octave(int i) {
      return getRuleContext(OctaveContext.class,i);
    }
    public PitchContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_pitch; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterPitch(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitPitch(this);
    }
  }

  public final PitchContext pitch() throws RecognitionException {
    PitchContext _localctx = new PitchContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(254);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(253);
        match(ACCIDENTAL);
        }
      }

      setState(256);
      match(BASENOTE);
      setState(260);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        {
        setState(257);
        octave();
        }
        }
        setState(262);
        _errHandler.sync(this);
        _la = _input.LA(1);
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

  public static class OctaveContext extends ParserRuleContext {
    public OctaveContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_octave; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterOctave(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitOctave(this);
    }
  }

  public final OctaveContext octave() throws RecognitionException {
    OctaveContext _localctx = new OctaveContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_octave);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(263);
      _la = _input.LA(1);
      if ( !(_la==T__0 || _la==T__1) ) {
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

  public static class NotelengthContext extends ParserRuleContext {
    public List<TerminalNode> NUMBER() { return getTokens(BodyParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(BodyParser.NUMBER, i);
    }
    public NotelengthContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_notelength; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterNotelength(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitNotelength(this);
    }
  }

  public final NotelengthContext notelength() throws RecognitionException {
    NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_notelength);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(270);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(266); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(265);
          match(NUMBER);
          }
          }
          setState(268); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==NUMBER );
        }
      }

      setState(280);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(272);
        match(T__2);
        setState(278);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(274); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(273);
            match(NUMBER);
            }
            }
            setState(276); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==NUMBER );
          }
        }

        }
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

  public static class TupletContext extends ParserRuleContext {
    public TupletspecContext tupletspec() {
      return getRuleContext(TupletspecContext.class,0);
    }
    public List<TupletelementContext> tupletelement() {
      return getRuleContexts(TupletelementContext.class);
    }
    public TupletelementContext tupletelement(int i) {
      return getRuleContext(TupletelementContext.class,i);
    }
    public TupletContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tuplet; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterTuplet(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitTuplet(this);
    }
  }

  public final TupletContext tuplet() throws RecognitionException {
    TupletContext _localctx = new TupletContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_tuplet);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(282);
      tupletspec();
      setState(284); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(283);
          tupletelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(286); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,52,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class TupletspecContext extends ParserRuleContext {
    public TerminalNode NUMBER() { return getToken(BodyParser.NUMBER, 0); }
    public TupletspecContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_tupletspec; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterTupletspec(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitTupletspec(this);
    }
  }

  public final TupletspecContext tupletspec() throws RecognitionException {
    TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(288);
      match(T__3);
      setState(289);
      match(NUMBER);
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

  public static class ChordContext extends ParserRuleContext {
    public NotelengthContext notelength() {
      return getRuleContext(NotelengthContext.class,0);
    }
    public List<NoteContext> note() {
      return getRuleContexts(NoteContext.class);
    }
    public NoteContext note(int i) {
      return getRuleContext(NoteContext.class,i);
    }
    public ChordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_chord; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterChord(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitChord(this);
    }
  }

  public final ChordContext chord() throws RecognitionException {
    ChordContext _localctx = new ChordContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_chord);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(291);
      match(T__4);
      setState(293); 
      _errHandler.sync(this);
      _alt = 1+1;
      do {
        switch (_alt) {
        case 1+1:
          {
          {
          setState(292);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(295); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,53,_ctx);
      } while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(297);
      match(T__5);
      setState(298);
      notelength();
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
    public TerminalNode WHITESPACE() { return getToken(BodyParser.WHITESPACE, 0); }
    public FieldvoiceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_fieldvoice; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterFieldvoice(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitFieldvoice(this);
    }
  }

  public final FieldvoiceContext fieldvoice() throws RecognitionException {
    FieldvoiceContext _localctx = new FieldvoiceContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_fieldvoice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(300);
      match(T__6);
      setState(302);
      _la = _input.LA(1);
      if (_la==WHITESPACE) {
        {
        setState(301);
        match(WHITESPACE);
        }
      }

      setState(304);
      text();
      setState(305);
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

  public static class EndoflineContext extends ParserRuleContext {
    public CommentContext comment() {
      return getRuleContext(CommentContext.class,0);
    }
    public TerminalNode NEWLINE() { return getToken(BodyParser.NEWLINE, 0); }
    public EndoflineContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_endofline; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterEndofline(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitEndofline(this);
    }
  }

  public final EndoflineContext endofline() throws RecognitionException {
    EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_endofline);
    try {
      setState(309);
      switch (_input.LA(1)) {
      case T__7:
        enterOuterAlt(_localctx, 1);
        {
        setState(307);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(308);
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
    public TerminalNode NEWLINE() { return getToken(BodyParser.NEWLINE, 0); }
    public List<TextContext> text() {
      return getRuleContexts(TextContext.class);
    }
    public TextContext text(int i) {
      return getRuleContext(TextContext.class,i);
    }
    public CommentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_comment; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterComment(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitComment(this);
    }
  }

  public final CommentContext comment() throws RecognitionException {
    CommentContext _localctx = new CommentContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(311);
      match(T__7);
      setState(315);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NUMBER || _la==CHAR) {
        {
        {
        setState(312);
        text();
        }
        }
        setState(317);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(318);
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

  public static class TextContext extends ParserRuleContext {
    public List<TerminalNode> CHAR() { return getTokens(BodyParser.CHAR); }
    public TerminalNode CHAR(int i) {
      return getToken(BodyParser.CHAR, i);
    }
    public List<TerminalNode> NUMBER() { return getTokens(BodyParser.NUMBER); }
    public TerminalNode NUMBER(int i) {
      return getToken(BodyParser.NUMBER, i);
    }
    public TextContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_text; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterText(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitText(this);
    }
  }

  public final TextContext text() throws RecognitionException {
    TextContext _localctx = new TextContext(_ctx, getState());
    enterRule(_localctx, 50, RULE_text);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(321); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(320);
          _la = _input.LA(1);
          if ( !(_la==NUMBER || _la==CHAR) ) {
          _errHandler.recoverInline(this);
          } else {
            consume();
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(323); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,57,_ctx);
      } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0148\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
      "\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\2\3\2"+
      "\3\3\6\3?\n\3\r\3\16\3@\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
      "\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\5\7U\n\7\7\7W\n\7\f\7\16\7Z\13\7\3"+
      "\7\3\7\3\7\5\7_\n\7\5\7a\n\7\3\7\6\7d\n\7\r\7\16\7e\3\b\3\b\3\b\5"+
      "\bk\n\b\7\bm\n\b\f\b\16\bp\13\b\3\b\3\b\3\b\5\bu\n\b\5\bw\n\b\3\b"+
      "\5\bz\n\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081\13\b\3\b\6\b\u0084\n\b\r"+
      "\b\16\b\u0085\3\b\5\b\u0089\n\b\3\t\3\t\3\t\3\t\5\t\u008f\n\t\7\t"+
      "\u0091\n\t\f\t\16\t\u0094\13\t\3\t\3\t\3\t\5\t\u0099\n\t\5\t\u009b"+
      "\n\t\3\t\5\t\u009e\n\t\3\t\3\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3"+
      "\t\6\t\u00a8\n\t\r\t\16\t\u00a9\3\t\5\t\u00ad\n\t\3\n\3\n\6\n\u00b1"+
      "\n\n\r\n\16\n\u00b2\3\n\5\n\u00b6\n\n\3\13\3\13\5\13\u00ba\n\13\3"+
      "\13\3\13\5\13\u00be\n\13\3\13\5\13\u00c1\n\13\6\13\u00c3\n\13\r\13"+
      "\16\13\u00c4\3\f\3\f\3\f\5\f\u00ca\n\f\7\f\u00cc\n\f\f\f\16\f\u00cf"+
      "\13\f\3\f\3\f\3\f\5\f\u00d4\n\f\5\f\u00d6\n\f\3\f\6\f\u00d9\n\f\r"+
      "\f\16\f\u00da\3\f\5\f\u00de\n\f\3\r\5\r\u00e1\n\r\3\r\3\r\5\r\u00e5"+
      "\n\r\6\r\u00e7\n\r\r\r\16\r\u00e8\3\16\3\16\5\16\u00ed\n\16\3\17\3"+
      "\17\5\17\u00f1\n\17\3\17\3\17\5\17\u00f5\n\17\5\17\u00f7\n\17\3\20"+
      "\3\20\3\20\3\21\3\21\5\21\u00fe\n\21\3\22\5\22\u0101\n\22\3\22\3\22"+
      "\7\22\u0105\n\22\f\22\16\22\u0108\13\22\3\23\3\23\3\24\6\24\u010d"+
      "\n\24\r\24\16\24\u010e\5\24\u0111\n\24\3\24\3\24\6\24\u0115\n\24\r"+
      "\24\16\24\u0116\5\24\u0119\n\24\5\24\u011b\n\24\3\25\3\25\6\25\u011f"+
      "\n\25\r\25\16\25\u0120\3\26\3\26\3\26\3\27\3\27\6\27\u0128\n\27\r"+
      "\27\16\27\u0129\3\27\3\27\3\27\3\30\3\30\5\30\u0131\n\30\3\30\3\30"+
      "\3\30\3\31\3\31\5\31\u0138\n\31\3\32\3\32\7\32\u013c\n\32\f\32\16"+
      "\32\u013f\13\32\3\32\3\32\3\33\6\33\u0144\n\33\r\33\16\33\u0145\3"+
      "\33\3\u0129\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
      "\62\64\2\4\3\2\3\4\4\2\22\22\25\25\u016a\2\67\3\2\2\2\4>\3\2\2\2\6"+
      "D\3\2\2\2\bF\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16n\3\2\2\2\20\u008a\3"+
      "\2\2\2\22\u00ae\3\2\2\2\24\u00b7\3\2\2\2\26\u00cd\3\2\2\2\30\u00e0"+
      "\3\2\2\2\32\u00ec\3\2\2\2\34\u00f6\3\2\2\2\36\u00f8\3\2\2\2 \u00fd"+
      "\3\2\2\2\"\u0100\3\2\2\2$\u0109\3\2\2\2&\u0110\3\2\2\2(\u011c\3\2"+
      "\2\2*\u0122\3\2\2\2,\u0125\3\2\2\2.\u012e\3\2\2\2\60\u0137\3\2\2\2"+
      "\62\u0139\3\2\2\2\64\u0143\3\2\2\2\668\5\4\3\2\67\66\3\2\2\289\3\2"+
      "\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\2\2\3<\3\3\2\2\2=?\5\6\4"+
      "\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3\2\2\2BE\5\b\5\2CE"+
      "\5\n\6\2DB\3\2\2\2DC\3\2\2\2E\7\3\2\2\2FG\5.\30\2GH\5\n\6\2H\t\3\2"+
      "\2\2IO\5\f\7\2JO\5\16\b\2KO\5\20\t\2LO\5\22\n\2MO\5\26\f\2NI\3\2\2"+
      "\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\13\3\2\2\2PX\7\16\2\2"+
      "QR\5\30\r\2RT\7\r\2\2SU\7\24\2\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VQ\3"+
      "\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[`\5\30\r"+
      "\2\\^\7\r\2\2]_\7\24\2\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`\\\3\2\2\2"+
      "`a\3\2\2\2ac\3\2\2\2bd\5\60\31\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3"+
      "\2\2\2f\r\3\2\2\2gh\5\30\r\2hj\7\r\2\2ik\7\24\2\2ji\3\2\2\2jk\3\2"+
      "\2\2km\3\2\2\2lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2p"+
      "n\3\2\2\2qv\5\30\r\2rt\7\r\2\2su\7\24\2\2ts\3\2\2\2tu\3\2\2\2uw\3"+
      "\2\2\2vr\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\5\24\13\2yx\3\2\2\2yz\3\2\2"+
      "\2z{\3\2\2\2{\177\7\17\2\2|~\5\24\13\2}|\3\2\2\2~\u0081\3\2\2\2\177"+
      "}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0088\3\2\2\2\u0081\177\3\2\2\2"+
      "\u0082\u0084\5\60\31\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
      "\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0089"+
      "\7\2\2\3\u0088\u0083\3\2\2\2\u0088\u0087\3\2\2\2\u0089\17\3\2\2\2"+
      "\u008a\u0092\7\16\2\2\u008b\u008c\5\30\r\2\u008c\u008e\7\r\2\2\u008d"+
      "\u008f\7\24\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091"+
      "\3\2\2\2\u0090\u008b\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2"+
      "\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
      "\u009a\5\30\r\2\u0096\u0098\7\r\2\2\u0097\u0099\7\24\2\2\u0098\u0097"+
      "\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2"+
      "\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\5\24\13\2\u009d"+
      "\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3"+
      "\7\17\2\2\u00a0\u00a2\5\24\13\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3"+
      "\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ac\3\2\2\2"+
      "\u00a5\u00a3\3\2\2\2\u00a6\u00a8\5\60\31\2\u00a7\u00a6\3\2\2\2\u00a8"+
      "\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad"+
      "\3\2\2\2\u00ab\u00ad\7\2\2\3\u00ac\u00a7\3\2\2\2\u00ac\u00ab\3\2\2"+
      "\2\u00ad\21\3\2\2\2\u00ae\u00b5\5\24\13\2\u00af\u00b1\5\60\31\2\u00b0"+
      "\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
      "\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\7\2\2\3\u00b5\u00b0\3\2\2"+
      "\2\u00b5\u00b4\3\2\2\2\u00b6\23\3\2\2\2\u00b7\u00b9\7\20\2\2\u00b8"+
      "\u00ba\7\24\2\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c2"+
      "\3\2\2\2\u00bb\u00bd\5\30\r\2\u00bc\u00be\7\r\2\2\u00bd\u00bc\3\2"+
      "\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\7\24\2\2"+
      "\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
      "\u00bb\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
      "\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c9\7\r\2\2"+
      "\u00c8\u00ca\7\24\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
      "\u00cc\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
      "\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2"+
      "\2\u00d0\u00d5\5\30\r\2\u00d1\u00d3\7\r\2\2\u00d2\u00d4\7\24\2\2\u00d3"+
      "\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d1"+
      "\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00dd\3\2\2\2\u00d7\u00d9\5\60"+
      "\31\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2"+
      "\u00da\u00db\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00de\7\2\2\3\u00dd"+
      "\u00d8\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\27\3\2\2\2\u00df\u00e1\7"+
      "\24\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e6\3\2\2"+
      "\2\u00e2\u00e4\5\32\16\2\u00e3\u00e5\7\24\2\2\u00e4\u00e3\3\2\2\2"+
      "\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e7"+
      "\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\31\3"+
      "\2\2\2\u00ea\u00ed\5\34\17\2\u00eb\u00ed\5(\25\2\u00ec\u00ea\3\2\2"+
      "\2\u00ec\u00eb\3\2\2\2\u00ed\33\3\2\2\2\u00ee\u00f0\5\36\20\2\u00ef"+
      "\u00f1\7\24\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f7"+
      "\3\2\2\2\u00f2\u00f4\5,\27\2\u00f3\u00f5\7\24\2\2\u00f4\u00f3\3\2"+
      "\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6"+
      "\u00f2\3\2\2\2\u00f7\35\3\2\2\2\u00f8\u00f9\5 \21\2\u00f9\u00fa\5"+
      "&\24\2\u00fa\37\3\2\2\2\u00fb\u00fe\5\"\22\2\u00fc\u00fe\7\21\2\2"+
      "\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe!\3\2\2\2\u00ff\u0101"+
      "\7\f\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2"+
      "\2\u0102\u0106\7\13\2\2\u0103\u0105\5$\23\2\u0104\u0103\3\2\2\2\u0105"+
      "\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107#\3\2"+
      "\2\2\u0108\u0106\3\2\2\2\u0109\u010a\t\2\2\2\u010a%\3\2\2\2\u010b"+
      "\u010d\7\22\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c"+
      "\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010c\3\2\2"+
      "\2\u0110\u0111\3\2\2\2\u0111\u011a\3\2\2\2\u0112\u0118\7\5\2\2\u0113"+
      "\u0115\7\22\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114"+
      "\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0114\3\2\2"+
      "\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0112\3\2\2\2\u011a"+
      "\u011b\3\2\2\2\u011b\'\3\2\2\2\u011c\u011e\5*\26\2\u011d\u011f\5\34"+
      "\17\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2"+
      "\u0120\u0121\3\2\2\2\u0121)\3\2\2\2\u0122\u0123\7\6\2\2\u0123\u0124"+
      "\7\22\2\2\u0124+\3\2\2\2\u0125\u0127\7\7\2\2\u0126\u0128\5\36\20\2"+
      "\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u0129"+
      "\u0127\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\b\2\2\u012c\u012d"+
      "\5&\24\2\u012d-\3\2\2\2\u012e\u0130\7\t\2\2\u012f\u0131\7\24\2\2\u0130"+
      "\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133"+
      "\5\64\33\2\u0133\u0134\5\60\31\2\u0134/\3\2\2\2\u0135\u0138\5\62\32"+
      "\2\u0136\u0138\7\23\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
      "\61\3\2\2\2\u0139\u013d\7\n\2\2\u013a\u013c\5\64\33\2\u013b\u013a"+
      "\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2"+
      "\2\u013e\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\23\2\2\u0141"+
      "\63\3\2\2\2\u0142\u0144\t\3\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3"+
      "\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\65\3\2\2\2<9"+
      "@DNTX^`ejntvy\177\u0085\u0088\u008e\u0092\u0098\u009a\u009d\u00a3"+
      "\u00a9\u00ac\u00b2\u00b5\u00b9\u00bd\u00c0\u00c4\u00c9\u00cd\u00d3"+
      "\u00d5\u00da\u00dd\u00e0\u00e4\u00e8\u00ec\u00f0\u00f4\u00f6\u00fd"+
      "\u0100\u0106\u010e\u0110\u0116\u0118\u011a\u0120\u0129\u0130\u0137"+
      "\u013d\u0145";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NEWLINE=9, 
    BASENOTE=10, ACCIDENTAL=11, BARLINE=12, REPEATBEGINBAR=13, REPEATENDBAR=14, 
    NTHREPEAT=15, REST=16, NUMBER=17, WHITESPACE=18, CHAR=19;
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
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << REPEATBEGINBAR) | (1L << NTHREPEAT) | (1L << REST) | (1L << WHITESPACE))) != 0) );
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
    public TerminalNode BARLINE() { return getToken(BodyParser.BARLINE, 0); }
    public List<VoicepartContext> voicepart() {
      return getRuleContexts(VoicepartContext.class);
    }
    public VoicepartContext voicepart(int i) {
      return getRuleContext(VoicepartContext.class,i);
    }
    public List<VoicepartelementContext> voicepartelement() {
      return getRuleContexts(VoicepartelementContext.class);
    }
    public VoicepartelementContext voicepartelement(int i) {
      return getRuleContext(VoicepartelementContext.class,i);
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
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(65);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(64);
        match(BARLINE);
        }
      }

      setState(77);
      switch (_input.LA(1)) {
      case T__6:
        {
        setState(68); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(67);
            voicepart();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(70); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
        {
        setState(73); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(72);
            voicepartelement();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(75); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class VoicepartContext extends ParserRuleContext {
    public FieldvoiceContext fieldvoice() {
      return getRuleContext(FieldvoiceContext.class,0);
    }
    public List<VoicepartelementContext> voicepartelement() {
      return getRuleContexts(VoicepartelementContext.class);
    }
    public VoicepartelementContext voicepartelement(int i) {
      return getRuleContext(VoicepartelementContext.class,i);
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
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(79);
      fieldvoice();
      setState(81); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(80);
          voicepartelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(83); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
      setState(90);
      switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(85);
        repeatstart();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(86);
        repeatend();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(87);
        repeatfull();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(88);
        repeatendingline();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(89);
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
      setState(92);
      match(REPEATBEGINBAR);
      setState(100);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(93);
          measure();
          setState(94);
          match(BARLINE);
          setState(96);
          switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
          case 1:
            {
            setState(95);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(102);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
      }
      setState(103);
      measure();
      setState(108);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(104);
        match(BARLINE);
        setState(106);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(105);
          match(WHITESPACE);
          }
        }

        }
      }

      {
      setState(111); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(110);
        endofline();
        }
        }
        setState(113); 
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
      setState(122);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,14,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(115);
          measure();
          setState(116);
          match(BARLINE);
          setState(118);
          switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
          case 1:
            {
            setState(117);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(124);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,14,_ctx);
      }
      setState(125);
      measure();
      setState(130);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(126);
        match(BARLINE);
        setState(128);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(127);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(133);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(132);
        repeatending();
        }
      }

      setState(135);
      match(REPEATENDBAR);
      setState(139);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NTHREPEAT) {
        {
        {
        setState(136);
        repeatending();
        }
        }
        setState(141);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(148);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(143); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(142);
          endofline();
          }
          }
          setState(145); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(147);
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
      setState(150);
      match(REPEATBEGINBAR);
      setState(158);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,22,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(151);
          measure();
          setState(152);
          match(BARLINE);
          setState(154);
          switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
          case 1:
            {
            setState(153);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(160);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,22,_ctx);
      }
      setState(161);
      measure();
      setState(166);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(162);
        match(BARLINE);
        setState(164);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(163);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(169);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(168);
        repeatending();
        }
      }

      setState(171);
      match(REPEATENDBAR);
      setState(175);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NTHREPEAT) {
        {
        {
        setState(172);
        repeatending();
        }
        }
        setState(177);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(184);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(179); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(178);
          endofline();
          }
          }
          setState(181); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(183);
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
    public TerminalNode EOF() { return getToken(BodyParser.EOF, 0); }
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
      setState(193);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << WHITESPACE))) != 0)) {
        {
        {
        setState(186);
        measure();
        setState(187);
        match(BARLINE);
        setState(189);
        switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
        case 1:
          {
          setState(188);
          match(WHITESPACE);
          }
          break;
        }
        }
        }
        setState(195);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(197); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(196);
        repeatending();
        }
        }
        setState(199); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NTHREPEAT );
      setState(207);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(202); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(201);
          endofline();
          }
          }
          setState(204); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(206);
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
      setState(209);
      match(NTHREPEAT);
      setState(211);
      switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
      case 1:
        {
        setState(210);
        match(WHITESPACE);
        }
        break;
      }
      setState(220); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(213);
        measure();
        setState(215);
        _la = _input.LA(1);
        if (_la==BARLINE) {
          {
          setState(214);
          match(BARLINE);
          }
        }

        setState(218);
        switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
        case 1:
          {
          setState(217);
          match(WHITESPACE);
          }
          break;
        }
        }
        }
        setState(222); 
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
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
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
      setState(227);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,38,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(224);
          match(WHITESPACE);
          }
          } 
        }
        setState(229);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,38,_ctx);
      }
      setState(237);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,40,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(230);
          measure();
          setState(231);
          match(BARLINE);
          setState(233);
          switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
          case 1:
            {
            setState(232);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(239);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,40,_ctx);
      }
      setState(240);
      measure();
      setState(245);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(241);
        match(BARLINE);
        setState(243);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(242);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(253);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(248); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(247);
          endofline();
          }
          }
          setState(250); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(252);
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
      setState(258);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==WHITESPACE) {
        {
        {
        setState(255);
        match(WHITESPACE);
        }
        }
        setState(260);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(268); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(261);
          measureelement();
          setState(265);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,46,_ctx);
          while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
            if ( _alt==1 ) {
              {
              {
              setState(262);
              match(WHITESPACE);
              }
              } 
            }
            setState(267);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,46,_ctx);
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(270); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
      setState(274);
      switch (_input.LA(1)) {
      case T__4:
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(272);
        tupletelement();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(273);
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
      setState(284);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(276);
        note();
        setState(278);
        switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
        case 1:
          {
          setState(277);
          match(WHITESPACE);
          }
          break;
        }
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(280);
        chord();
        setState(282);
        switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
        case 1:
          {
          setState(281);
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
      setState(286);
      noterest();
      setState(287);
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
      setState(291);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(289);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(290);
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
      setState(294);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(293);
        match(ACCIDENTAL);
        }
      }

      setState(296);
      match(BASENOTE);
      setState(300);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        {
        setState(297);
        octave();
        }
        }
        setState(302);
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
      setState(303);
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
      setState(306);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(305);
        match(NUMBER);
        }
      }

      setState(312);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(308);
        match(T__2);
        setState(310);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(309);
          match(NUMBER);
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
      setState(314);
      tupletspec();
      setState(316); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(315);
          tupletelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(318); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
      setState(320);
      match(T__3);
      setState(321);
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
      setState(323);
      match(T__4);
      setState(325); 
      _errHandler.sync(this);
      _alt = 1+1;
      do {
        switch (_alt) {
        case 1+1:
          {
          {
          setState(324);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(327); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,59,_ctx);
      } while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(329);
      match(T__5);
      setState(330);
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
      setState(332);
      match(T__6);
      setState(334);
      _la = _input.LA(1);
      if (_la==WHITESPACE) {
        {
        setState(333);
        match(WHITESPACE);
        }
      }

      setState(336);
      text();
      setState(337);
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
      setState(341);
      switch (_input.LA(1)) {
      case T__7:
        enterOuterAlt(_localctx, 1);
        {
        setState(339);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(340);
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
      setState(343);
      match(T__7);
      setState(347);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NUMBER || _la==CHAR) {
        {
        {
        setState(344);
        text();
        }
        }
        setState(349);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(350);
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
      setState(353); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(352);
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
        setState(355); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0168\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
      "\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\2\3\2"+
      "\3\3\6\3?\n\3\r\3\16\3@\3\4\5\4D\n\4\3\4\6\4G\n\4\r\4\16\4H\3\4\6"+
      "\4L\n\4\r\4\16\4M\5\4P\n\4\3\5\3\5\6\5T\n\5\r\5\16\5U\3\6\3\6\3\6"+
      "\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\5\7c\n\7\7\7e\n\7\f\7\16\7h\13\7"+
      "\3\7\3\7\3\7\5\7m\n\7\5\7o\n\7\3\7\6\7r\n\7\r\7\16\7s\3\b\3\b\3\b"+
      "\5\by\n\b\7\b{\n\b\f\b\16\b~\13\b\3\b\3\b\3\b\5\b\u0083\n\b\5\b\u0085"+
      "\n\b\3\b\5\b\u0088\n\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b\3"+
      "\b\6\b\u0092\n\b\r\b\16\b\u0093\3\b\5\b\u0097\n\b\3\t\3\t\3\t\3\t"+
      "\5\t\u009d\n\t\7\t\u009f\n\t\f\t\16\t\u00a2\13\t\3\t\3\t\3\t\5\t\u00a7"+
      "\n\t\5\t\u00a9\n\t\3\t\5\t\u00ac\n\t\3\t\3\t\7\t\u00b0\n\t\f\t\16"+
      "\t\u00b3\13\t\3\t\6\t\u00b6\n\t\r\t\16\t\u00b7\3\t\5\t\u00bb\n\t\3"+
      "\n\3\n\3\n\5\n\u00c0\n\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\3\n\6\n"+
      "\u00c8\n\n\r\n\16\n\u00c9\3\n\6\n\u00cd\n\n\r\n\16\n\u00ce\3\n\5\n"+
      "\u00d2\n\n\3\13\3\13\5\13\u00d6\n\13\3\13\3\13\5\13\u00da\n\13\3\13"+
      "\5\13\u00dd\n\13\6\13\u00df\n\13\r\13\16\13\u00e0\3\f\7\f\u00e4\n"+
      "\f\f\f\16\f\u00e7\13\f\3\f\3\f\3\f\5\f\u00ec\n\f\7\f\u00ee\n\f\f\f"+
      "\16\f\u00f1\13\f\3\f\3\f\3\f\5\f\u00f6\n\f\5\f\u00f8\n\f\3\f\6\f\u00fb"+
      "\n\f\r\f\16\f\u00fc\3\f\5\f\u0100\n\f\3\r\7\r\u0103\n\r\f\r\16\r\u0106"+
      "\13\r\3\r\3\r\7\r\u010a\n\r\f\r\16\r\u010d\13\r\6\r\u010f\n\r\r\r"+
      "\16\r\u0110\3\16\3\16\5\16\u0115\n\16\3\17\3\17\5\17\u0119\n\17\3"+
      "\17\3\17\5\17\u011d\n\17\5\17\u011f\n\17\3\20\3\20\3\20\3\21\3\21"+
      "\5\21\u0126\n\21\3\22\5\22\u0129\n\22\3\22\3\22\7\22\u012d\n\22\f"+
      "\22\16\22\u0130\13\22\3\23\3\23\3\24\5\24\u0135\n\24\3\24\3\24\5\24"+
      "\u0139\n\24\5\24\u013b\n\24\3\25\3\25\6\25\u013f\n\25\r\25\16\25\u0140"+
      "\3\26\3\26\3\26\3\27\3\27\6\27\u0148\n\27\r\27\16\27\u0149\3\27\3"+
      "\27\3\27\3\30\3\30\5\30\u0151\n\30\3\30\3\30\3\30\3\31\3\31\5\31\u0158"+
      "\n\31\3\32\3\32\7\32\u015c\n\32\f\32\16\32\u015f\13\32\3\32\3\32\3"+
      "\33\6\33\u0164\n\33\r\33\16\33\u0165\3\33\3\u0149\2\34\2\4\6\b\n\f"+
      "\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\3\4\4\2\23\23"+
      "\25\25\u0190\2\67\3\2\2\2\4>\3\2\2\2\6C\3\2\2\2\bQ\3\2\2\2\n\\\3\2"+
      "\2\2\f^\3\2\2\2\16|\3\2\2\2\20\u0098\3\2\2\2\22\u00c3\3\2\2\2\24\u00d3"+
      "\3\2\2\2\26\u00e5\3\2\2\2\30\u0104\3\2\2\2\32\u0114\3\2\2\2\34\u011e"+
      "\3\2\2\2\36\u0120\3\2\2\2 \u0125\3\2\2\2\"\u0128\3\2\2\2$\u0131\3"+
      "\2\2\2&\u0134\3\2\2\2(\u013c\3\2\2\2*\u0142\3\2\2\2,\u0145\3\2\2\2"+
      ".\u014e\3\2\2\2\60\u0157\3\2\2\2\62\u0159\3\2\2\2\64\u0163\3\2\2\2"+
      "\668\5\4\3\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2"+
      "\2;<\7\2\2\3<\3\3\2\2\2=?\5\6\4\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A"+
      "\3\2\2\2A\5\3\2\2\2BD\7\16\2\2CB\3\2\2\2CD\3\2\2\2DO\3\2\2\2EG\5\b"+
      "\5\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IP\3\2\2\2JL\5\n\6\2K"+
      "J\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OF\3\2\2\2OK\3\2"+
      "\2\2P\7\3\2\2\2QS\5.\30\2RT\5\n\6\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2"+
      "UV\3\2\2\2V\t\3\2\2\2W]\5\f\7\2X]\5\16\b\2Y]\5\20\t\2Z]\5\22\n\2["+
      "]\5\26\f\2\\W\3\2\2\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2"+
      "]\13\3\2\2\2^f\7\17\2\2_`\5\30\r\2`b\7\16\2\2ac\7\24\2\2ba\3\2\2\2"+
      "bc\3\2\2\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2"+
      "\2\2hf\3\2\2\2in\5\30\r\2jl\7\16\2\2km\7\24\2\2lk\3\2\2\2lm\3\2\2"+
      "\2mo\3\2\2\2nj\3\2\2\2no\3\2\2\2oq\3\2\2\2pr\5\60\31\2qp\3\2\2\2r"+
      "s\3\2\2\2sq\3\2\2\2st\3\2\2\2t\r\3\2\2\2uv\5\30\r\2vx\7\16\2\2wy\7"+
      "\24\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2zu\3\2\2\2{~\3\2\2\2|z\3\2\2"+
      "\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0084\5\30\r\2\u0080\u0082"+
      "\7\16\2\2\u0081\u0083\7\24\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2"+
      "\2\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
      "\u0087\3\2\2\2\u0086\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087\u0088"+
      "\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\7\20\2\2\u008a\u008c\5\24"+
      "\13\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2"+
      "\u008d\u008e\3\2\2\2\u008e\u0096\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
      "\u0092\5\60\31\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091"+
      "\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0097\7\2\2"+
      "\3\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\17\3\2\2\2\u0098"+
      "\u00a0\7\17\2\2\u0099\u009a\5\30\r\2\u009a\u009c\7\16\2\2\u009b\u009d"+
      "\7\24\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
      "\2\2\u009e\u0099\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
      "\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a8"+
      "\5\30\r\2\u00a4\u00a6\7\16\2\2\u00a5\u00a7\7\24\2\2\u00a6\u00a5\3"+
      "\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2"+
      "\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5\24\13\2\u00ab"+
      "\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1"+
      "\7\20\2\2\u00ae\u00b0\5\24\13\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3"+
      "\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00ba\3\2\2\2"+
      "\u00b3\u00b1\3\2\2\2\u00b4\u00b6\5\60\31\2\u00b5\u00b4\3\2\2\2\u00b6"+
      "\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb"+
      "\3\2\2\2\u00b9\u00bb\7\2\2\3\u00ba\u00b5\3\2\2\2\u00ba\u00b9\3\2\2"+
      "\2\u00bb\21\3\2\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00bf\7\16\2\2\u00be"+
      "\u00c0\7\24\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
      "\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2"+
      "\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
      "\u00c8\5\24\13\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7"+
      "\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d1\3\2\2\2\u00cb\u00cd\5\60"+
      "\31\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2"+
      "\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\7\2\2\3\u00d1"+
      "\u00cc\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\23\3\2\2\2\u00d3\u00d5\7"+
      "\21\2\2\u00d4\u00d6\7\24\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2"+
      "\2\u00d6\u00de\3\2\2\2\u00d7\u00d9\5\30\r\2\u00d8\u00da\7\16\2\2\u00d9"+
      "\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd"+
      "\7\24\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
      "\2\2\u00de\u00d7\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
      "\u00e1\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e4\7\24\2\2\u00e3\u00e2\3"+
      "\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2"+
      "\u00e6\u00ef\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\30\r\2\u00e9"+
      "\u00eb\7\16\2\2\u00ea\u00ec\7\24\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec"+
      "\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee\u00f1\3\2\2"+
      "\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
      "\u00ef\3\2\2\2\u00f2\u00f7\5\30\r\2\u00f3\u00f5\7\16\2\2\u00f4\u00f6"+
      "\7\24\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2"+
      "\2\2\u00f7\u00f3\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00ff\3\2\2\2\u00f9"+
      "\u00fb\5\60\31\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa"+
      "\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u0100\7\2\2"+
      "\3\u00ff\u00fa\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\27\3\2\2\2\u0101"+
      "\u0103\7\24\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102"+
      "\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u010e\3\2\2\2\u0106\u0104\3\2\2"+
      "\2\u0107\u010b\5\32\16\2\u0108\u010a\7\24\2\2\u0109\u0108\3\2\2\2"+
      "\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
      "\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0107\3\2\2\2\u010f\u0110"+
      "\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\31\3\2\2\2"+
      "\u0112\u0115\5\34\17\2\u0113\u0115\5(\25\2\u0114\u0112\3\2\2\2\u0114"+
      "\u0113\3\2\2\2\u0115\33\3\2\2\2\u0116\u0118\5\36\20\2\u0117\u0119"+
      "\7\24\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011f\3\2"+
      "\2\2\u011a\u011c\5,\27\2\u011b\u011d\7\24\2\2\u011c\u011b\3\2\2\2"+
      "\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0116\3\2\2\2\u011e"+
      "\u011a\3\2\2\2\u011f\35\3\2\2\2\u0120\u0121\5 \21\2\u0121\u0122\5"+
      "&\24\2\u0122\37\3\2\2\2\u0123\u0126\5\"\22\2\u0124\u0126\7\22\2\2"+
      "\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126!\3\2\2\2\u0127\u0129"+
      "\7\r\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2"+
      "\2\u012a\u012e\7\f\2\2\u012b\u012d\5$\23\2\u012c\u012b\3\2\2\2\u012d"+
      "\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f#\3\2"+
      "\2\2\u0130\u012e\3\2\2\2\u0131\u0132\t\2\2\2\u0132%\3\2\2\2\u0133"+
      "\u0135\7\23\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013a"+
      "\3\2\2\2\u0136\u0138\7\5\2\2\u0137\u0139\7\23\2\2\u0138\u0137\3\2"+
      "\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0136\3\2\2\2\u013a"+
      "\u013b\3\2\2\2\u013b\'\3\2\2\2\u013c\u013e\5*\26\2\u013d\u013f\5\34"+
      "\17\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2"+
      "\u0140\u0141\3\2\2\2\u0141)\3\2\2\2\u0142\u0143\7\6\2\2\u0143\u0144"+
      "\7\23\2\2\u0144+\3\2\2\2\u0145\u0147\7\7\2\2\u0146\u0148\5\36\20\2"+
      "\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u0149"+
      "\u0147\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\7\b\2\2\u014c\u014d"+
      "\5&\24\2\u014d-\3\2\2\2\u014e\u0150\7\t\2\2\u014f\u0151\7\24\2\2\u0150"+
      "\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153"+
      "\5\64\33\2\u0153\u0154\5\60\31\2\u0154/\3\2\2\2\u0155\u0158\5\62\32"+
      "\2\u0156\u0158\7\13\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158"+
      "\61\3\2\2\2\u0159\u015d\7\n\2\2\u015a\u015c\5\64\33\2\u015b\u015a"+
      "\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2"+
      "\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7\13\2\2\u0161"+
      "\63\3\2\2\2\u0162\u0164\t\3\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3"+
      "\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\65\3\2\2\2B9"+
      "@CHMOU\\bflnsx|\u0082\u0084\u0087\u008d\u0093\u0096\u009c\u00a0\u00a6"+
      "\u00a8\u00ab\u00b1\u00b7\u00ba\u00bf\u00c3\u00c9\u00ce\u00d1\u00d5"+
      "\u00d9\u00dc\u00e0\u00e5\u00eb\u00ef\u00f5\u00f7\u00fc\u00ff\u0104"+
      "\u010b\u0110\u0114\u0118\u011c\u011e\u0125\u0128\u012e\u0134\u0138"+
      "\u013a\u0140\u0149\u0150\u0157\u015d\u0165";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
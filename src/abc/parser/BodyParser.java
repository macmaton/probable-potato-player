// Generated from Body.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

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
    try {
      int _alt;
      setState(74);
      switch (_input.LA(1)) {
      case T__6:
        enterOuterAlt(_localctx, 1);
        {
        setState(65); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(64);
            voicepart();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(67); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
        enterOuterAlt(_localctx, 2);
        {
        setState(70); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(69);
            voicepartelement();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(72); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,3,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
      setState(76);
      fieldvoice();
      setState(78); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(77);
          voicepartelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(80); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
      setState(87);
      switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(82);
        repeatstart();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(83);
        repeatend();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(84);
        repeatfull();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(85);
        repeatendingline();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(86);
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
      setState(89);
      match(REPEATBEGINBAR);
      setState(97);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,8,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(90);
          measure();
          setState(91);
          match(BARLINE);
          setState(93);
          switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
          case 1:
            {
            setState(92);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(99);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,8,_ctx);
      }
      setState(100);
      measure();
      setState(105);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(101);
        match(BARLINE);
        setState(103);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(102);
          match(WHITESPACE);
          }
        }

        }
      }

      {
      setState(108); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(107);
        endofline();
        }
        }
        setState(110); 
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
      setState(119);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,13,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(112);
          measure();
          setState(113);
          match(BARLINE);
          setState(115);
          switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
          case 1:
            {
            setState(114);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(121);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,13,_ctx);
      }
      setState(122);
      measure();
      setState(127);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(123);
        match(BARLINE);
        setState(125);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(124);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(130);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(129);
        repeatending();
        }
      }

      setState(132);
      match(REPEATENDBAR);
      setState(136);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NTHREPEAT) {
        {
        {
        setState(133);
        repeatending();
        }
        }
        setState(138);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(145);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(140); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(139);
          endofline();
          }
          }
          setState(142); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(144);
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
      setState(147);
      match(REPEATBEGINBAR);
      setState(155);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(148);
          measure();
          setState(149);
          match(BARLINE);
          setState(151);
          switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
          case 1:
            {
            setState(150);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(157);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
      }
      setState(158);
      measure();
      setState(163);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(159);
        match(BARLINE);
        setState(161);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(160);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(166);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(165);
        repeatending();
        }
      }

      setState(168);
      match(REPEATENDBAR);
      setState(172);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NTHREPEAT) {
        {
        {
        setState(169);
        repeatending();
        }
        }
        setState(174);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(181);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(176); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(175);
          endofline();
          }
          }
          setState(178); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(180);
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
      setState(190);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << WHITESPACE))) != 0)) {
        {
        {
        setState(183);
        measure();
        setState(184);
        match(BARLINE);
        setState(186);
        switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
        case 1:
          {
          setState(185);
          match(WHITESPACE);
          }
          break;
        }
        }
        }
        setState(192);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(194); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(193);
        repeatending();
        }
        }
        setState(196); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NTHREPEAT );
      setState(204);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(199); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(198);
          endofline();
          }
          }
          setState(201); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(203);
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
      setState(206);
      match(NTHREPEAT);
      setState(208);
      switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
      case 1:
        {
        setState(207);
        match(WHITESPACE);
        }
        break;
      }
      setState(217); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(210);
        measure();
        setState(212);
        _la = _input.LA(1);
        if (_la==BARLINE) {
          {
          setState(211);
          match(BARLINE);
          }
        }

        setState(215);
        switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
        case 1:
          {
          setState(214);
          match(WHITESPACE);
          }
          break;
        }
        }
        }
        setState(219); 
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
      setState(228);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,38,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(221);
          measure();
          setState(222);
          match(BARLINE);
          setState(224);
          switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
          case 1:
            {
            setState(223);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(230);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,38,_ctx);
      }
      setState(231);
      measure();
      setState(236);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(232);
        match(BARLINE);
        setState(234);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(233);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(244);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(239); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(238);
          endofline();
          }
          }
          setState(241); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(243);
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
      setState(247);
      _la = _input.LA(1);
      if (_la==WHITESPACE) {
        {
        setState(246);
        match(WHITESPACE);
        }
      }

      setState(253); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(249);
          measureelement();
          setState(251);
          switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
          case 1:
            {
            setState(250);
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
        setState(255); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
      setState(259);
      switch (_input.LA(1)) {
      case T__4:
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(257);
        tupletelement();
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(258);
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
      setState(269);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(261);
        note();
        setState(263);
        switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
        case 1:
          {
          setState(262);
          match(WHITESPACE);
          }
          break;
        }
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(265);
        chord();
        setState(267);
        switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
        case 1:
          {
          setState(266);
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
      setState(271);
      noterest();
      setState(272);
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
      setState(276);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(274);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(275);
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
      setState(279);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(278);
        match(ACCIDENTAL);
        }
      }

      setState(281);
      match(BASENOTE);
      setState(285);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        {
        setState(282);
        octave();
        }
        }
        setState(287);
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
      setState(288);
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
      setState(291);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(290);
        match(NUMBER);
        }
      }

      setState(297);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(293);
        match(T__2);
        setState(295);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(294);
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
      setState(299);
      tupletspec();
      setState(301); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(300);
          tupletelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(303); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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
      setState(305);
      match(T__3);
      setState(306);
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
      setState(308);
      match(T__4);
      setState(310); 
      _errHandler.sync(this);
      _alt = 1+1;
      do {
        switch (_alt) {
        case 1+1:
          {
          {
          setState(309);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(312); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,57,_ctx);
      } while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(314);
      match(T__5);
      setState(315);
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
      setState(317);
      match(T__6);
      setState(319);
      _la = _input.LA(1);
      if (_la==WHITESPACE) {
        {
        setState(318);
        match(WHITESPACE);
        }
      }

      setState(321);
      text();
      setState(322);
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
      setState(326);
      switch (_input.LA(1)) {
      case T__7:
        enterOuterAlt(_localctx, 1);
        {
        setState(324);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(325);
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
      setState(328);
      match(T__7);
      setState(332);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NUMBER || _la==CHAR) {
        {
        {
        setState(329);
        text();
        }
        }
        setState(334);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(335);
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
      setState(338); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(337);
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
        setState(340); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0159\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
      "\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\2\3\2"+
      "\3\3\6\3?\n\3\r\3\16\3@\3\4\6\4D\n\4\r\4\16\4E\3\4\6\4I\n\4\r\4\16"+
      "\4J\5\4M\n\4\3\5\3\5\6\5Q\n\5\r\5\16\5R\3\6\3\6\3\6\3\6\3\6\5\6Z\n"+
      "\6\3\7\3\7\3\7\3\7\5\7`\n\7\7\7b\n\7\f\7\16\7e\13\7\3\7\3\7\3\7\5"+
      "\7j\n\7\5\7l\n\7\3\7\6\7o\n\7\r\7\16\7p\3\b\3\b\3\b\5\bv\n\b\7\bx"+
      "\n\b\f\b\16\b{\13\b\3\b\3\b\3\b\5\b\u0080\n\b\5\b\u0082\n\b\3\b\5"+
      "\b\u0085\n\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\b\6\b\u008f"+
      "\n\b\r\b\16\b\u0090\3\b\5\b\u0094\n\b\3\t\3\t\3\t\3\t\5\t\u009a\n"+
      "\t\7\t\u009c\n\t\f\t\16\t\u009f\13\t\3\t\3\t\3\t\5\t\u00a4\n\t\5\t"+
      "\u00a6\n\t\3\t\5\t\u00a9\n\t\3\t\3\t\7\t\u00ad\n\t\f\t\16\t\u00b0"+
      "\13\t\3\t\6\t\u00b3\n\t\r\t\16\t\u00b4\3\t\5\t\u00b8\n\t\3\n\3\n\3"+
      "\n\5\n\u00bd\n\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\n\6\n\u00c5\n"+
      "\n\r\n\16\n\u00c6\3\n\6\n\u00ca\n\n\r\n\16\n\u00cb\3\n\5\n\u00cf\n"+
      "\n\3\13\3\13\5\13\u00d3\n\13\3\13\3\13\5\13\u00d7\n\13\3\13\5\13\u00da"+
      "\n\13\6\13\u00dc\n\13\r\13\16\13\u00dd\3\f\3\f\3\f\5\f\u00e3\n\f\7"+
      "\f\u00e5\n\f\f\f\16\f\u00e8\13\f\3\f\3\f\3\f\5\f\u00ed\n\f\5\f\u00ef"+
      "\n\f\3\f\6\f\u00f2\n\f\r\f\16\f\u00f3\3\f\5\f\u00f7\n\f\3\r\5\r\u00fa"+
      "\n\r\3\r\3\r\5\r\u00fe\n\r\6\r\u0100\n\r\r\r\16\r\u0101\3\16\3\16"+
      "\5\16\u0106\n\16\3\17\3\17\5\17\u010a\n\17\3\17\3\17\5\17\u010e\n"+
      "\17\5\17\u0110\n\17\3\20\3\20\3\20\3\21\3\21\5\21\u0117\n\21\3\22"+
      "\5\22\u011a\n\22\3\22\3\22\7\22\u011e\n\22\f\22\16\22\u0121\13\22"+
      "\3\23\3\23\3\24\5\24\u0126\n\24\3\24\3\24\5\24\u012a\n\24\5\24\u012c"+
      "\n\24\3\25\3\25\6\25\u0130\n\25\r\25\16\25\u0131\3\26\3\26\3\26\3"+
      "\27\3\27\6\27\u0139\n\27\r\27\16\27\u013a\3\27\3\27\3\27\3\30\3\30"+
      "\5\30\u0142\n\30\3\30\3\30\3\30\3\31\3\31\5\31\u0149\n\31\3\32\3\32"+
      "\7\32\u014d\n\32\f\32\16\32\u0150\13\32\3\32\3\32\3\33\6\33\u0155"+
      "\n\33\r\33\16\33\u0156\3\33\3\u013a\2\34\2\4\6\b\n\f\16\20\22\24\26"+
      "\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\3\4\4\2\23\23\25\25\u017f\2"+
      "\67\3\2\2\2\4>\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nY\3\2\2\2\f[\3\2\2\2"+
      "\16y\3\2\2\2\20\u0095\3\2\2\2\22\u00c0\3\2\2\2\24\u00d0\3\2\2\2\26"+
      "\u00e6\3\2\2\2\30\u00f9\3\2\2\2\32\u0105\3\2\2\2\34\u010f\3\2\2\2"+
      "\36\u0111\3\2\2\2 \u0116\3\2\2\2\"\u0119\3\2\2\2$\u0122\3\2\2\2&\u0125"+
      "\3\2\2\2(\u012d\3\2\2\2*\u0133\3\2\2\2,\u0136\3\2\2\2.\u013f\3\2\2"+
      "\2\60\u0148\3\2\2\2\62\u014a\3\2\2\2\64\u0154\3\2\2\2\668\5\4\3\2"+
      "\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\2\2\3"+
      "<\3\3\2\2\2=?\5\6\4\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\5\3"+
      "\2\2\2BD\5\b\5\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FM\3\2\2\2"+
      "GI\5\n\6\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LC\3\2"+
      "\2\2LH\3\2\2\2M\7\3\2\2\2NP\5.\30\2OQ\5\n\6\2PO\3\2\2\2QR\3\2\2\2"+
      "RP\3\2\2\2RS\3\2\2\2S\t\3\2\2\2TZ\5\f\7\2UZ\5\16\b\2VZ\5\20\t\2WZ"+
      "\5\22\n\2XZ\5\26\f\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2"+
      "\2\2Z\13\3\2\2\2[c\7\17\2\2\\]\5\30\r\2]_\7\16\2\2^`\7\24\2\2_^\3"+
      "\2\2\2_`\3\2\2\2`b\3\2\2\2a\\\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2"+
      "\2df\3\2\2\2ec\3\2\2\2fk\5\30\r\2gi\7\16\2\2hj\7\24\2\2ih\3\2\2\2"+
      "ij\3\2\2\2jl\3\2\2\2kg\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\5\60\31\2nm\3"+
      "\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rs\5\30\r\2su\7\16"+
      "\2\2tv\7\24\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wr\3\2\2\2x{\3\2\2\2"+
      "yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|\u0081\5\30\r\2}\177\7\16"+
      "\2\2~\u0080\7\24\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3"+
      "\2\2\2\u0081}\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
      "\u0085\5\24\13\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
      "\3\2\2\2\u0086\u008a\7\20\2\2\u0087\u0089\5\24\13\2\u0088\u0087\3"+
      "\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2"+
      "\u008b\u0093\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\5\60\31\2\u008e"+
      "\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
      "\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0094\7\2\2\3\u0093\u008e\3\2\2"+
      "\2\u0093\u0092\3\2\2\2\u0094\17\3\2\2\2\u0095\u009d\7\17\2\2\u0096"+
      "\u0097\5\30\r\2\u0097\u0099\7\16\2\2\u0098\u009a\7\24\2\2\u0099\u0098"+
      "\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0096\3\2\2"+
      "\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
      "\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a5\5\30\r\2\u00a1\u00a3"+
      "\7\16\2\2\u00a2\u00a4\7\24\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2"+
      "\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
      "\u00a8\3\2\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9"+
      "\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ae\7\20\2\2\u00ab\u00ad\5\24"+
      "\13\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2"+
      "\u00ae\u00af\3\2\2\2\u00af\u00b7\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
      "\u00b3\5\60\31\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2"+
      "\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\7\2\2"+
      "\3\u00b7\u00b2\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\21\3\2\2\2\u00b9"+
      "\u00ba\5\30\r\2\u00ba\u00bc\7\16\2\2\u00bb\u00bd\7\24\2\2\u00bc\u00bb"+
      "\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2"+
      "\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
      "\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5\24\13\2\u00c4\u00c3"+
      "\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2"+
      "\2\u00c7\u00ce\3\2\2\2\u00c8\u00ca\5\60\31\2\u00c9\u00c8\3\2\2\2\u00ca"+
      "\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf"+
      "\3\2\2\2\u00cd\u00cf\7\2\2\3\u00ce\u00c9\3\2\2\2\u00ce\u00cd\3\2\2"+
      "\2\u00cf\23\3\2\2\2\u00d0\u00d2\7\21\2\2\u00d1\u00d3\7\24\2\2\u00d2"+
      "\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00db\3\2\2\2\u00d4\u00d6"+
      "\5\30\r\2\u00d5\u00d7\7\16\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2"+
      "\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00da\7\24\2\2\u00d9\u00d8\3\2\2\2"+
      "\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d4\3\2\2\2\u00dc"+
      "\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\25\3"+
      "\2\2\2\u00df\u00e0\5\30\r\2\u00e0\u00e2\7\16\2\2\u00e1\u00e3\7\24"+
      "\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
      "\u00df\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
      "\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ee\5\30"+
      "\r\2\u00ea\u00ec\7\16\2\2\u00eb\u00ed\7\24\2\2\u00ec\u00eb\3\2\2\2"+
      "\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee"+
      "\u00ef\3\2\2\2\u00ef\u00f6\3\2\2\2\u00f0\u00f2\5\60\31\2\u00f1\u00f0"+
      "\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2"+
      "\2\u00f4\u00f7\3\2\2\2\u00f5\u00f7\7\2\2\3\u00f6\u00f1\3\2\2\2\u00f6"+
      "\u00f5\3\2\2\2\u00f7\27\3\2\2\2\u00f8\u00fa\7\24\2\2\u00f9\u00f8\3"+
      "\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00ff\3\2\2\2\u00fb\u00fd\5\32\16"+
      "\2\u00fc\u00fe\7\24\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
      "\u0100\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff"+
      "\3\2\2\2\u0101\u0102\3\2\2\2\u0102\31\3\2\2\2\u0103\u0106\5\34\17"+
      "\2\u0104\u0106\5(\25\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
      "\33\3\2\2\2\u0107\u0109\5\36\20\2\u0108\u010a\7\24\2\2\u0109\u0108"+
      "\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0110\3\2\2\2\u010b\u010d\5,\27"+
      "\2\u010c\u010e\7\24\2\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
      "\u0110\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2\2\2\u0110\35\3"+
      "\2\2\2\u0111\u0112\5 \21\2\u0112\u0113\5&\24\2\u0113\37\3\2\2\2\u0114"+
      "\u0117\5\"\22\2\u0115\u0117\7\22\2\2\u0116\u0114\3\2\2\2\u0116\u0115"+
      "\3\2\2\2\u0117!\3\2\2\2\u0118\u011a\7\r\2\2\u0119\u0118\3\2\2\2\u0119"+
      "\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011f\7\f\2\2\u011c\u011e"+
      "\5$\23\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2"+
      "\2\u011f\u0120\3\2\2\2\u0120#\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123"+
      "\t\2\2\2\u0123%\3\2\2\2\u0124\u0126\7\23\2\2\u0125\u0124\3\2\2\2\u0125"+
      "\u0126\3\2\2\2\u0126\u012b\3\2\2\2\u0127\u0129\7\5\2\2\u0128\u012a"+
      "\7\23\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2"+
      "\2\2\u012b\u0127\3\2\2\2\u012b\u012c\3\2\2\2\u012c\'\3\2\2\2\u012d"+
      "\u012f\5*\26\2\u012e\u0130\5\34\17\2\u012f\u012e\3\2\2\2\u0130\u0131"+
      "\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132)\3\2\2\2\u0133"+
      "\u0134\7\6\2\2\u0134\u0135\7\23\2\2\u0135+\3\2\2\2\u0136\u0138\7\7"+
      "\2\2\u0137\u0139\5\36\20\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2"+
      "\u013a\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
      "\u013d\7\b\2\2\u013d\u013e\5&\24\2\u013e-\3\2\2\2\u013f\u0141\7\t"+
      "\2\2\u0140\u0142\7\24\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2"+
      "\u0142\u0143\3\2\2\2\u0143\u0144\5\64\33\2\u0144\u0145\5\60\31\2\u0145"+
      "/\3\2\2\2\u0146\u0149\5\62\32\2\u0147\u0149\7\13\2\2\u0148\u0146\3"+
      "\2\2\2\u0148\u0147\3\2\2\2\u0149\61\3\2\2\2\u014a\u014e\7\n\2\2\u014b"+
      "\u014d\5\64\33\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c"+
      "\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2"+
      "\2\u0151\u0152\7\13\2\2\u0152\63\3\2\2\2\u0153\u0155\t\3\2\2\u0154"+
      "\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
      "\3\2\2\2\u0157\65\3\2\2\2@9@EJLRY_cikpuy\177\u0081\u0084\u008a\u0090"+
      "\u0093\u0099\u009d\u00a3\u00a5\u00a8\u00ae\u00b4\u00b7\u00bc\u00c0"+
      "\u00c6\u00cb\u00ce\u00d2\u00d6\u00d9\u00dd\u00e2\u00e6\u00ec\u00ee"+
      "\u00f3\u00f6\u00f9\u00fd\u0101\u0105\u0109\u010d\u010f\u0116\u0119"+
      "\u011f\u0125\u0129\u012b\u0131\u013a\u0141\u0148\u014e\u0156";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
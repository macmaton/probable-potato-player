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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEWLINE=8, TUPLETSPEC=9, 
    BASENOTE=10, ACCIDENTAL=11, BARLINE=12, REPEATBEGINBAR=13, REPEATENDBAR=14, 
    NTHREPEAT=15, REST=16, NUMBER=17, WHITESPACE=18, CHAR=19;
  public static final int
    RULE_body = 0, RULE_bodyelement = 1, RULE_sectionelement = 2, RULE_voicepart = 3, 
    RULE_voicepartelement = 4, RULE_repeatstart = 5, RULE_repeatend = 6, 
    RULE_repeatfull = 7, RULE_repeatendingline = 8, RULE_repeatending = 9, 
    RULE_line = 10, RULE_measure = 11, RULE_measureelement = 12, RULE_tupletelement = 13, 
    RULE_note = 14, RULE_noterest = 15, RULE_pitch = 16, RULE_octave = 17, 
    RULE_notelength = 18, RULE_tuplet = 19, RULE_chord = 20, RULE_fieldvoice = 21, 
    RULE_endofline = 22, RULE_comment = 23, RULE_text = 24;
  public static final String[] ruleNames = {
    "body", "bodyelement", "sectionelement", "voicepart", "voicepartelement", 
    "repeatstart", "repeatend", "repeatfull", "repeatendingline", "repeatending", 
    "line", "measure", "measureelement", "tupletelement", "note", "noterest", 
    "pitch", "octave", "notelength", "tuplet", "chord", "fieldvoice", "endofline", 
    "comment", "text"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'['", "']'", "'V:'", "'%'", null, null, 
    null, null, null, "'|:'", "':|'", null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, "NEWLINE", "TUPLETSPEC", 
    "BASENOTE", "ACCIDENTAL", "BARLINE", "REPEATBEGINBAR", "REPEATENDBAR", 
    "NTHREPEAT", "REST", "NUMBER", "WHITESPACE", "CHAR"
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
    public List<TerminalNode> NEWLINE() { return getTokens(BodyParser.NEWLINE); }
    public TerminalNode NEWLINE(int i) {
      return getToken(BodyParser.NEWLINE, i);
    }
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
      while (_la==NEWLINE) {
        {
        {
        setState(50);
        match(NEWLINE);
        }
        }
        setState(55);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(57); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(56);
        bodyelement();
        }
        }
        setState(59); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << TUPLETSPEC) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << REPEATBEGINBAR) | (1L << NTHREPEAT) | (1L << REST) | (1L << WHITESPACE))) != 0) );
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
      setState(62); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(61);
          sectionelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(64); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
    public List<VoicepartelementContext> voicepartelement() {
      return getRuleContexts(VoicepartelementContext.class);
    }
    public VoicepartelementContext voicepartelement(int i) {
      return getRuleContext(VoicepartelementContext.class,i);
    }
    public List<VoicepartContext> voicepart() {
      return getRuleContexts(VoicepartContext.class);
    }
    public VoicepartContext voicepart(int i) {
      return getRuleContext(VoicepartContext.class,i);
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
      setState(67);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(66);
        match(BARLINE);
        }
      }

      setState(79);
      switch (_input.LA(1)) {
      case T__3:
      case TUPLETSPEC:
      case BASENOTE:
      case ACCIDENTAL:
      case REPEATBEGINBAR:
      case NTHREPEAT:
      case REST:
      case WHITESPACE:
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
          _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      case T__5:
        {
        setState(75); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(74);
            voicepart();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(77); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
    public TerminalNode WHITESPACE() { return getToken(BodyParser.WHITESPACE, 0); }
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
      setState(81);
      fieldvoice();
      setState(83);
      switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
      case 1:
        {
        setState(82);
        match(WHITESPACE);
        }
        break;
      }
      setState(86); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(85);
          voicepartelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(88); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
      setState(95);
      switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(90);
        repeatstart();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(91);
        repeatend();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(92);
        repeatfull();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(93);
        repeatendingline();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(94);
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
      setState(97);
      match(REPEATBEGINBAR);
      setState(105);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(98);
          measure();
          setState(99);
          match(BARLINE);
          setState(101);
          switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
          case 1:
            {
            setState(100);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(107);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,11,_ctx);
      }
      setState(108);
      measure();
      setState(113);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(109);
        match(BARLINE);
        setState(111);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(110);
          match(WHITESPACE);
          }
        }

        }
      }

      {
      setState(116); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(115);
        endofline();
        }
        }
        setState(118); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==T__6 || _la==NEWLINE );
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
      setState(127);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,16,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(120);
          measure();
          setState(121);
          match(BARLINE);
          setState(123);
          switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
          case 1:
            {
            setState(122);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(129);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,16,_ctx);
      }
      setState(130);
      measure();
      setState(135);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(131);
        match(BARLINE);
        setState(133);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(132);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(138);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(137);
        repeatending();
        }
      }

      setState(140);
      match(REPEATENDBAR);
      setState(144);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NTHREPEAT) {
        {
        {
        setState(141);
        repeatending();
        }
        }
        setState(146);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(153);
      switch (_input.LA(1)) {
      case T__6:
      case NEWLINE:
        {
        setState(148); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(147);
          endofline();
          }
          }
          setState(150); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__6 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(152);
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
      setState(155);
      match(REPEATBEGINBAR);
      setState(163);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,24,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(156);
          measure();
          setState(157);
          match(BARLINE);
          setState(159);
          switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
          case 1:
            {
            setState(158);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(165);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,24,_ctx);
      }
      setState(166);
      measure();
      setState(171);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(167);
        match(BARLINE);
        setState(169);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(168);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(174);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(173);
        repeatending();
        }
      }

      setState(176);
      match(REPEATENDBAR);
      setState(180);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NTHREPEAT) {
        {
        {
        setState(177);
        repeatending();
        }
        }
        setState(182);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(189);
      switch (_input.LA(1)) {
      case T__6:
      case NEWLINE:
        {
        setState(184); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(183);
          endofline();
          }
          }
          setState(186); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__6 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(188);
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
      setState(198);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << TUPLETSPEC) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << WHITESPACE))) != 0)) {
        {
        {
        setState(191);
        measure();
        setState(192);
        match(BARLINE);
        setState(194);
        switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
        case 1:
          {
          setState(193);
          match(WHITESPACE);
          }
          break;
        }
        }
        }
        setState(200);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(202); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(201);
        repeatending();
        }
        }
        setState(204); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( _la==NTHREPEAT );
      setState(212);
      switch (_input.LA(1)) {
      case T__6:
      case NEWLINE:
        {
        setState(207); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(206);
          endofline();
          }
          }
          setState(209); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__6 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(211);
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
      setState(214);
      match(NTHREPEAT);
      setState(216);
      switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
      case 1:
        {
        setState(215);
        match(WHITESPACE);
        }
        break;
      }
      setState(225); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(218);
        measure();
        setState(220);
        _la = _input.LA(1);
        if (_la==BARLINE) {
          {
          setState(219);
          match(BARLINE);
          }
        }

        setState(223);
        switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
        case 1:
          {
          setState(222);
          match(WHITESPACE);
          }
          break;
        }
        }
        }
        setState(227); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << TUPLETSPEC) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REST) | (1L << WHITESPACE))) != 0) );
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
      setState(232);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,40,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(229);
          match(WHITESPACE);
          }
          } 
        }
        setState(234);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,40,_ctx);
      }
      setState(242);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,42,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(235);
          measure();
          setState(236);
          match(BARLINE);
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
          } 
        }
        setState(244);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,42,_ctx);
      }
      setState(245);
      measure();
      setState(250);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(246);
        match(BARLINE);
        setState(248);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(247);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(258);
      switch (_input.LA(1)) {
      case T__6:
      case NEWLINE:
        {
        setState(253); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(252);
          endofline();
          }
          }
          setState(255); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__6 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(257);
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
      setState(263);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==WHITESPACE) {
        {
        {
        setState(260);
        match(WHITESPACE);
        }
        }
        setState(265);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(273); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(266);
          measureelement();
          setState(270);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,48,_ctx);
          while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
            if ( _alt==1 ) {
              {
              {
              setState(267);
              match(WHITESPACE);
              }
              } 
            }
            setState(272);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,48,_ctx);
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(275); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
    public TupletContext tuplet() {
      return getRuleContext(TupletContext.class,0);
    }
    public TerminalNode WHITESPACE() { return getToken(BodyParser.WHITESPACE, 0); }
    public TupletelementContext tupletelement() {
      return getRuleContext(TupletelementContext.class,0);
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
      setState(281);
      switch (_input.LA(1)) {
      case TUPLETSPEC:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(277);
        tuplet();
        setState(278);
        match(WHITESPACE);
        }
        }
        break;
      case T__3:
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(280);
        tupletelement();
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
      setState(291);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(283);
        note();
        setState(285);
        switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
        case 1:
          {
          setState(284);
          match(WHITESPACE);
          }
          break;
        }
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(287);
        chord();
        setState(289);
        switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
        case 1:
          {
          setState(288);
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
      setState(293);
      noterest();
      setState(294);
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
      setState(298);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(296);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(297);
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
      setState(301);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(300);
        match(ACCIDENTAL);
        }
      }

      setState(303);
      match(BASENOTE);
      setState(307);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        {
        setState(304);
        octave();
        }
        }
        setState(309);
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
      setState(310);
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
      setState(313);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(312);
        match(NUMBER);
        }
      }

      setState(319);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(315);
        match(T__2);
        setState(317);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(316);
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
    public TerminalNode TUPLETSPEC() { return getToken(BodyParser.TUPLETSPEC, 0); }
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(321);
      match(TUPLETSPEC);
      setState(323); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(322);
        tupletelement();
        }
        }
        setState(325); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REST))) != 0) );
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
    enterRule(_localctx, 40, RULE_chord);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(327);
      match(T__3);
      setState(329); 
      _errHandler.sync(this);
      _alt = 1+1;
      do {
        switch (_alt) {
        case 1+1:
          {
          {
          setState(328);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(331); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,61,_ctx);
      } while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(333);
      match(T__4);
      setState(334);
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
    enterRule(_localctx, 42, RULE_fieldvoice);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(336);
      match(T__5);
      setState(338);
      switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
      case 1:
        {
        setState(337);
        match(WHITESPACE);
        }
        break;
      }
      setState(340);
      text();
      setState(341);
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
    enterRule(_localctx, 44, RULE_endofline);
    try {
      setState(345);
      switch (_input.LA(1)) {
      case T__6:
        enterOuterAlt(_localctx, 1);
        {
        setState(343);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(344);
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
    enterRule(_localctx, 46, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(347);
      match(T__6);
      setState(351);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << NUMBER) | (1L << WHITESPACE) | (1L << CHAR))) != 0)) {
        {
        {
        setState(348);
        text();
        }
        }
        setState(353);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(354);
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
    public List<TerminalNode> BASENOTE() { return getTokens(BodyParser.BASENOTE); }
    public TerminalNode BASENOTE(int i) {
      return getToken(BodyParser.BASENOTE, i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
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
    enterRule(_localctx, 48, RULE_text);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(373); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(359);
          _errHandler.sync(this);
          _la = _input.LA(1);
          while (_la==BASENOTE || _la==WHITESPACE) {
            {
            {
            setState(356);
            _la = _input.LA(1);
            if ( !(_la==BASENOTE || _la==WHITESPACE) ) {
            _errHandler.recoverInline(this);
            } else {
              consume();
            }
            }
            }
            setState(361);
            _errHandler.sync(this);
            _la = _input.LA(1);
          }
          setState(363); 
          _errHandler.sync(this);
          _alt = 1;
          do {
            switch (_alt) {
            case 1:
              {
              {
              setState(362);
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
            setState(365); 
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,66,_ctx);
          } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
          setState(370);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,67,_ctx);
          while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
            if ( _alt==1 ) {
              {
              {
              setState(367);
              _la = _input.LA(1);
              if ( !(_la==BASENOTE || _la==WHITESPACE) ) {
              _errHandler.recoverInline(this);
              } else {
                consume();
              }
              }
              } 
            }
            setState(372);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,67,_ctx);
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(375); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u017c\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
      "\t\30\4\31\t\31\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\6\2<\n"+
      "\2\r\2\16\2=\3\3\6\3A\n\3\r\3\16\3B\3\4\5\4F\n\4\3\4\6\4I\n\4\r\4"+
      "\16\4J\3\4\6\4N\n\4\r\4\16\4O\5\4R\n\4\3\5\3\5\5\5V\n\5\3\5\6\5Y\n"+
      "\5\r\5\16\5Z\3\6\3\6\3\6\3\6\3\6\5\6b\n\6\3\7\3\7\3\7\3\7\5\7h\n\7"+
      "\7\7j\n\7\f\7\16\7m\13\7\3\7\3\7\3\7\5\7r\n\7\5\7t\n\7\3\7\6\7w\n"+
      "\7\r\7\16\7x\3\b\3\b\3\b\5\b~\n\b\7\b\u0080\n\b\f\b\16\b\u0083\13"+
      "\b\3\b\3\b\3\b\5\b\u0088\n\b\5\b\u008a\n\b\3\b\5\b\u008d\n\b\3\b\3"+
      "\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\6\b\u0097\n\b\r\b\16\b\u0098"+
      "\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\5\t\u00a2\n\t\7\t\u00a4\n\t\f\t"+
      "\16\t\u00a7\13\t\3\t\3\t\3\t\5\t\u00ac\n\t\5\t\u00ae\n\t\3\t\5\t\u00b1"+
      "\n\t\3\t\3\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\t\6\t\u00bb\n\t\r"+
      "\t\16\t\u00bc\3\t\5\t\u00c0\n\t\3\n\3\n\3\n\5\n\u00c5\n\n\7\n\u00c7"+
      "\n\n\f\n\16\n\u00ca\13\n\3\n\6\n\u00cd\n\n\r\n\16\n\u00ce\3\n\6\n"+
      "\u00d2\n\n\r\n\16\n\u00d3\3\n\5\n\u00d7\n\n\3\13\3\13\5\13\u00db\n"+
      "\13\3\13\3\13\5\13\u00df\n\13\3\13\5\13\u00e2\n\13\6\13\u00e4\n\13"+
      "\r\13\16\13\u00e5\3\f\7\f\u00e9\n\f\f\f\16\f\u00ec\13\f\3\f\3\f\3"+
      "\f\5\f\u00f1\n\f\7\f\u00f3\n\f\f\f\16\f\u00f6\13\f\3\f\3\f\3\f\5\f"+
      "\u00fb\n\f\5\f\u00fd\n\f\3\f\6\f\u0100\n\f\r\f\16\f\u0101\3\f\5\f"+
      "\u0105\n\f\3\r\7\r\u0108\n\r\f\r\16\r\u010b\13\r\3\r\3\r\7\r\u010f"+
      "\n\r\f\r\16\r\u0112\13\r\6\r\u0114\n\r\r\r\16\r\u0115\3\16\3\16\3"+
      "\16\3\16\5\16\u011c\n\16\3\17\3\17\5\17\u0120\n\17\3\17\3\17\5\17"+
      "\u0124\n\17\5\17\u0126\n\17\3\20\3\20\3\20\3\21\3\21\5\21\u012d\n"+
      "\21\3\22\5\22\u0130\n\22\3\22\3\22\7\22\u0134\n\22\f\22\16\22\u0137"+
      "\13\22\3\23\3\23\3\24\5\24\u013c\n\24\3\24\3\24\5\24\u0140\n\24\5"+
      "\24\u0142\n\24\3\25\3\25\6\25\u0146\n\25\r\25\16\25\u0147\3\26\3\26"+
      "\6\26\u014c\n\26\r\26\16\26\u014d\3\26\3\26\3\26\3\27\3\27\5\27\u0155"+
      "\n\27\3\27\3\27\3\27\3\30\3\30\5\30\u015c\n\30\3\31\3\31\7\31\u0160"+
      "\n\31\f\31\16\31\u0163\13\31\3\31\3\31\3\32\7\32\u0168\n\32\f\32\16"+
      "\32\u016b\13\32\3\32\6\32\u016e\n\32\r\32\16\32\u016f\3\32\7\32\u0173"+
      "\n\32\f\32\16\32\u0176\13\32\6\32\u0178\n\32\r\32\16\32\u0179\3\32"+
      "\3\u014d\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
      "\2\5\3\2\3\4\4\2\f\f\24\24\4\2\23\23\25\25\u01aa\2\67\3\2\2\2\4@\3"+
      "\2\2\2\6E\3\2\2\2\bS\3\2\2\2\na\3\2\2\2\fc\3\2\2\2\16\u0081\3\2\2"+
      "\2\20\u009d\3\2\2\2\22\u00c8\3\2\2\2\24\u00d8\3\2\2\2\26\u00ea\3\2"+
      "\2\2\30\u0109\3\2\2\2\32\u011b\3\2\2\2\34\u0125\3\2\2\2\36\u0127\3"+
      "\2\2\2 \u012c\3\2\2\2\"\u012f\3\2\2\2$\u0138\3\2\2\2&\u013b\3\2\2"+
      "\2(\u0143\3\2\2\2*\u0149\3\2\2\2,\u0152\3\2\2\2.\u015b\3\2\2\2\60"+
      "\u015d\3\2\2\2\62\u0177\3\2\2\2\64\66\7\n\2\2\65\64\3\2\2\2\669\3"+
      "\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67\3\2\2\2:<\5\4\3\2;"+
      ":\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?A\5\6\4\2@?\3\2"+
      "\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\5\3\2\2\2DF\7\16\2\2ED\3\2\2\2"+
      "EF\3\2\2\2FQ\3\2\2\2GI\5\n\6\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2"+
      "\2\2KR\3\2\2\2LN\5\b\5\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P"+
      "R\3\2\2\2QH\3\2\2\2QM\3\2\2\2R\7\3\2\2\2SU\5,\27\2TV\7\24\2\2UT\3"+
      "\2\2\2UV\3\2\2\2VX\3\2\2\2WY\5\n\6\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2"+
      "Z[\3\2\2\2[\t\3\2\2\2\\b\5\f\7\2]b\5\16\b\2^b\5\20\t\2_b\5\22\n\2"+
      "`b\5\26\f\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\13"+
      "\3\2\2\2ck\7\17\2\2de\5\30\r\2eg\7\16\2\2fh\7\24\2\2gf\3\2\2\2gh\3"+
      "\2\2\2hj\3\2\2\2id\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2"+
      "mk\3\2\2\2ns\5\30\r\2oq\7\16\2\2pr\7\24\2\2qp\3\2\2\2qr\3\2\2\2rt"+
      "\3\2\2\2so\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5.\30\2vu\3\2\2\2wx\3\2\2"+
      "\2xv\3\2\2\2xy\3\2\2\2y\r\3\2\2\2z{\5\30\r\2{}\7\16\2\2|~\7\24\2\2"+
      "}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177z\3\2\2\2\u0080\u0083\3\2\2"+
      "\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
      "\u0081\3\2\2\2\u0084\u0089\5\30\r\2\u0085\u0087\7\16\2\2\u0086\u0088"+
      "\7\24\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
      "\2\2\u0089\u0085\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
      "\u008d\5\24\13\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
      "\3\2\2\2\u008e\u0092\7\20\2\2\u008f\u0091\5\24\13\2\u0090\u008f\3"+
      "\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2"+
      "\u0093\u009b\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\5.\30\2\u0096"+
      "\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099"+
      "\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009c\7\2\2\3\u009b\u0096\3\2\2"+
      "\2\u009b\u009a\3\2\2\2\u009c\17\3\2\2\2\u009d\u00a5\7\17\2\2\u009e"+
      "\u009f\5\30\r\2\u009f\u00a1\7\16\2\2\u00a0\u00a2\7\24\2\2\u00a1\u00a0"+
      "\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009e\3\2\2"+
      "\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
      "\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ad\5\30\r\2\u00a9\u00ab"+
      "\7\16\2\2\u00aa\u00ac\7\24\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2"+
      "\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
      "\u00b0\3\2\2\2\u00af\u00b1\5\24\13\2\u00b0\u00af\3\2\2\2\u00b0\u00b1"+
      "\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\7\20\2\2\u00b3\u00b5\5\24"+
      "\13\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2"+
      "\u00b6\u00b7\3\2\2\2\u00b7\u00bf\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
      "\u00bb\5.\30\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba"+
      "\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\7\2\2"+
      "\3\u00bf\u00ba\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\21\3\2\2\2\u00c1"+
      "\u00c2\5\30\r\2\u00c2\u00c4\7\16\2\2\u00c3\u00c5\7\24\2\2\u00c4\u00c3"+
      "\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2"+
      "\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
      "\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\5\24\13\2\u00cc\u00cb"+
      "\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2"+
      "\2\u00cf\u00d6\3\2\2\2\u00d0\u00d2\5.\30\2\u00d1\u00d0\3\2\2\2\u00d2"+
      "\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7"+
      "\3\2\2\2\u00d5\u00d7\7\2\2\3\u00d6\u00d1\3\2\2\2\u00d6\u00d5\3\2\2"+
      "\2\u00d7\23\3\2\2\2\u00d8\u00da\7\21\2\2\u00d9\u00db\7\24\2\2\u00da"+
      "\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e3\3\2\2\2\u00dc\u00de"+
      "\5\30\r\2\u00dd\u00df\7\16\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2"+
      "\2\2\u00df\u00e1\3\2\2\2\u00e0\u00e2\7\24\2\2\u00e1\u00e0\3\2\2\2"+
      "\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00dc\3\2\2\2\u00e4"+
      "\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\25\3"+
      "\2\2\2\u00e7\u00e9\7\24\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2"+
      "\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f4\3\2\2\2\u00ec"+
      "\u00ea\3\2\2\2\u00ed\u00ee\5\30\r\2\u00ee\u00f0\7\16\2\2\u00ef\u00f1"+
      "\7\24\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2"+
      "\2\2\u00f2\u00ed\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
      "\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fc"+
      "\5\30\r\2\u00f8\u00fa\7\16\2\2\u00f9\u00fb\7\24\2\2\u00fa\u00f9\3"+
      "\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f8\3\2\2\2"+
      "\u00fc\u00fd\3\2\2\2\u00fd\u0104\3\2\2\2\u00fe\u0100\5.\30\2\u00ff"+
      "\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
      "\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0105\7\2\2\3\u0104\u00ff\3\2\2"+
      "\2\u0104\u0103\3\2\2\2\u0105\27\3\2\2\2\u0106\u0108\7\24\2\2\u0107"+
      "\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a"+
      "\3\2\2\2\u010a\u0113\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110\5\32"+
      "\16\2\u010d\u010f\7\24\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2"+
      "\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
      "\u0110\3\2\2\2\u0113\u010c\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113"+
      "\3\2\2\2\u0115\u0116\3\2\2\2\u0116\31\3\2\2\2\u0117\u0118\5(\25\2"+
      "\u0118\u0119\7\24\2\2\u0119\u011c\3\2\2\2\u011a\u011c\5\34\17\2\u011b"+
      "\u0117\3\2\2\2\u011b\u011a\3\2\2\2\u011c\33\3\2\2\2\u011d\u011f\5"+
      "\36\20\2\u011e\u0120\7\24\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
      "\2\2\u0120\u0126\3\2\2\2\u0121\u0123\5*\26\2\u0122\u0124\7\24\2\2"+
      "\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
      "\u011d\3\2\2\2\u0125\u0121\3\2\2\2\u0126\35\3\2\2\2\u0127\u0128\5"+
      " \21\2\u0128\u0129\5&\24\2\u0129\37\3\2\2\2\u012a\u012d\5\"\22\2\u012b"+
      "\u012d\7\22\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d!\3\2"+
      "\2\2\u012e\u0130\7\r\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
      "\u0131\3\2\2\2\u0131\u0135\7\f\2\2\u0132\u0134\5$\23\2\u0133\u0132"+
      "\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2"+
      "\2\u0136#\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\t\2\2\2\u0139%\3"+
      "\2\2\2\u013a\u013c\7\23\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2"+
      "\2\u013c\u0141\3\2\2\2\u013d\u013f\7\5\2\2\u013e\u0140\7\23\2\2\u013f"+
      "\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013d"+
      "\3\2\2\2\u0141\u0142\3\2\2\2\u0142\'\3\2\2\2\u0143\u0145\7\13\2\2"+
      "\u0144\u0146\5\34\17\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
      "\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148)\3\2\2\2\u0149\u014b\7\6"+
      "\2\2\u014a\u014c\5\36\20\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2"+
      "\u014d\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
      "\u0150\7\7\2\2\u0150\u0151\5&\24\2\u0151+\3\2\2\2\u0152\u0154\7\b"+
      "\2\2\u0153\u0155\7\24\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2"+
      "\u0155\u0156\3\2\2\2\u0156\u0157\5\62\32\2\u0157\u0158\5.\30\2\u0158"+
      "-\3\2\2\2\u0159\u015c\5\60\31\2\u015a\u015c\7\n\2\2\u015b\u0159\3"+
      "\2\2\2\u015b\u015a\3\2\2\2\u015c/\3\2\2\2\u015d\u0161\7\t\2\2\u015e"+
      "\u0160\5\62\32\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
      "\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2"+
      "\2\u0164\u0165\7\n\2\2\u0165\61\3\2\2\2\u0166\u0168\t\3\2\2\u0167"+
      "\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a"+
      "\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\t\4\2"+
      "\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
      "\u0170\3\2\2\2\u0170\u0174\3\2\2\2\u0171\u0173\t\3\2\2\u0172\u0171"+
      "\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2"+
      "\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0169\3\2\2\2\u0178"+
      "\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\63\3"+
      "\2\2\2G\67=BEJOQUZagkqsx}\u0081\u0087\u0089\u008c\u0092\u0098\u009b"+
      "\u00a1\u00a5\u00ab\u00ad\u00b0\u00b6\u00bc\u00bf\u00c4\u00c8\u00ce"+
      "\u00d3\u00d6\u00da\u00de\u00e1\u00e5\u00ea\u00f0\u00f4\u00fa\u00fc"+
      "\u0101\u0104\u0109\u0110\u0115\u011b\u011f\u0123\u0125\u012c\u012f"+
      "\u0135\u013b\u013f\u0141\u0147\u014d\u0154\u015b\u0161\u0169\u016f"+
      "\u0174\u0179";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
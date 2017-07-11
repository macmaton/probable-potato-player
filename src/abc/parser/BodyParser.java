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
    T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NEWLINE=8, TUPLETSPEC=9, 
    BASENOTE=10, ACCIDENTAL=11, BARLINE=12, REPEATBEGINBAR=13, REPEATENDBAR=14, 
    NTHREPEAT=15, SECTIONBEGINBAR=16, SECTIONENDBAR=17, REST=18, NUMBER=19, 
    WHITESPACE=20, CHAR=21;
  public static final int
    RULE_body = 0, RULE_section = 1, RULE_sectionelement = 2, RULE_voicepart = 3, 
    RULE_voicepartelement = 4, RULE_repeatstart = 5, RULE_repeatend = 6, 
    RULE_repeatfull = 7, RULE_repeatendingline = 8, RULE_repeatending = 9, 
    RULE_line = 10, RULE_measure = 11, RULE_measureelement = 12, RULE_tupletelement = 13, 
    RULE_note = 14, RULE_noterest = 15, RULE_pitch = 16, RULE_octave = 17, 
    RULE_notelength = 18, RULE_tuplet = 19, RULE_chord = 20, RULE_fieldvoice = 21, 
    RULE_endofline = 22, RULE_comment = 23, RULE_sectionend = 24, RULE_text = 25;
  public static final String[] ruleNames = {
    "body", "section", "sectionelement", "voicepart", "voicepartelement", 
    "repeatstart", "repeatend", "repeatfull", "repeatendingline", "repeatending", 
    "line", "measure", "measureelement", "tupletelement", "note", "noterest", 
    "pitch", "octave", "notelength", "tuplet", "chord", "fieldvoice", "endofline", 
    "comment", "sectionend", "text"
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
    public List<SectionContext> section() {
      return getRuleContexts(SectionContext.class);
    }
    public SectionContext section(int i) {
      return getRuleContext(SectionContext.class,i);
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
      setState(55);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NEWLINE) {
        {
        {
        setState(52);
        match(NEWLINE);
        }
        }
        setState(57);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(59); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(58);
        section();
        }
        }
        setState(61); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << TUPLETSPEC) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << REPEATBEGINBAR) | (1L << NTHREPEAT) | (1L << SECTIONBEGINBAR) | (1L << REST) | (1L << WHITESPACE))) != 0) );
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

  public static class SectionContext extends ParserRuleContext {
    public List<TerminalNode> EOF() { return getTokens(BodyParser.EOF); }
    public TerminalNode EOF(int i) {
      return getToken(BodyParser.EOF, i);
    }
    public List<SectionelementContext> sectionelement() {
      return getRuleContexts(SectionelementContext.class);
    }
    public SectionelementContext sectionelement(int i) {
      return getRuleContext(SectionelementContext.class,i);
    }
    public SectionendContext sectionend() {
      return getRuleContext(SectionendContext.class,0);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
    public List<EndoflineContext> endofline() {
      return getRuleContexts(EndoflineContext.class);
    }
    public EndoflineContext endofline(int i) {
      return getRuleContext(EndoflineContext.class,i);
    }
    public List<VoicepartContext> voicepart() {
      return getRuleContexts(VoicepartContext.class);
    }
    public VoicepartContext voicepart(int i) {
      return getRuleContext(VoicepartContext.class,i);
    }
    public SectionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_section; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterSection(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitSection(this);
    }
  }

  public final SectionContext section() throws RecognitionException {
    SectionContext _localctx = new SectionContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_section);
    int _la;
    try {
      int _alt;
      setState(128);
      switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(64); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(63);
            sectionelement();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(66); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,2,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        setState(69);
        _la = _input.LA(1);
        if (_la==SECTIONENDBAR) {
          {
          setState(68);
          sectionend();
          }
        }

        setState(74);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la==WHITESPACE) {
          {
          {
          setState(71);
          match(WHITESPACE);
          }
          }
          setState(76);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(86);
        switch (_input.LA(1)) {
        case T__6:
        case NEWLINE:
          {
          setState(78); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(77);
            endofline();
            }
            }
            setState(80); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==T__6 || _la==NEWLINE );
          setState(83);
          switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
          case 1:
            {
            setState(82);
            match(EOF);
            }
            break;
          }
          }
          break;
        case EOF:
          {
          setState(85);
          match(EOF);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        {
        setState(96);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
          if ( _alt==1 ) {
            {
            {
            setState(88);
            voicepart();
            setState(90); 
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
              {
              setState(89);
              endofline();
              }
              }
              setState(92); 
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while ( _la==T__6 || _la==NEWLINE );
            }
            } 
          }
          setState(98);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
        }
        {
        setState(99);
        voicepart();
        setState(100);
        sectionend();
        setState(110);
        switch (_input.LA(1)) {
        case T__6:
        case NEWLINE:
          {
          setState(102); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(101);
            endofline();
            }
            }
            setState(104); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==T__6 || _la==NEWLINE );
          setState(107);
          switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
          case 1:
            {
            setState(106);
            match(EOF);
            }
            break;
          }
          }
          break;
        case EOF:
          {
          setState(109);
          match(EOF);
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        }
        }
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(124); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(112);
            voicepart();
            setState(122);
            switch (_input.LA(1)) {
            case T__6:
            case NEWLINE:
              {
              setState(114); 
              _errHandler.sync(this);
              _la = _input.LA(1);
              do {
                {
                {
                setState(113);
                endofline();
                }
                }
                setState(116); 
                _errHandler.sync(this);
                _la = _input.LA(1);
              } while ( _la==T__6 || _la==NEWLINE );
              setState(119);
              switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
              case 1:
                {
                setState(118);
                match(EOF);
                }
                break;
              }
              }
              break;
            case EOF:
              {
              setState(121);
              match(EOF);
              }
              break;
            default:
              throw new NoViableAltException(this);
            }
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(126); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,16,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

  public static class SectionelementContext extends ParserRuleContext {
    public List<VoicepartelementContext> voicepartelement() {
      return getRuleContexts(VoicepartelementContext.class);
    }
    public VoicepartelementContext voicepartelement(int i) {
      return getRuleContext(VoicepartelementContext.class,i);
    }
    public TerminalNode BARLINE() { return getToken(BodyParser.BARLINE, 0); }
    public TerminalNode SECTIONBEGINBAR() { return getToken(BodyParser.SECTIONBEGINBAR, 0); }
    public List<EndoflineContext> endofline() {
      return getRuleContexts(EndoflineContext.class);
    }
    public EndoflineContext endofline(int i) {
      return getRuleContext(EndoflineContext.class,i);
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
      setState(131);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(130);
        match(BARLINE);
        }
      }

      {
      setState(134);
      _la = _input.LA(1);
      if (_la==SECTIONBEGINBAR) {
        {
        setState(133);
        match(SECTIONBEGINBAR);
        }
      }

      setState(144);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(136);
          voicepartelement();
          setState(138); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(137);
            endofline();
            }
            }
            setState(140); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==T__6 || _la==NEWLINE );
          }
          } 
        }
        setState(146);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
      }
      setState(147);
      voicepartelement();
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
    public TerminalNode WHITESPACE() { return getToken(BodyParser.WHITESPACE, 0); }
    public TerminalNode SECTIONBEGINBAR() { return getToken(BodyParser.SECTIONBEGINBAR, 0); }
    public List<EndoflineContext> endofline() {
      return getRuleContexts(EndoflineContext.class);
    }
    public EndoflineContext endofline(int i) {
      return getRuleContext(EndoflineContext.class,i);
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
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(149);
      fieldvoice();
      setState(151);
      switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
      case 1:
        {
        setState(150);
        match(WHITESPACE);
        }
        break;
      }
      setState(154);
      _la = _input.LA(1);
      if (_la==SECTIONBEGINBAR) {
        {
        setState(153);
        match(SECTIONBEGINBAR);
        }
      }

      setState(164);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,25,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(156);
          voicepartelement();
          setState(158); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(157);
            endofline();
            }
            }
            setState(160); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==T__6 || _la==NEWLINE );
          }
          } 
        }
        setState(166);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,25,_ctx);
      }
      setState(167);
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
    public RepeatfullContext repeatfull() {
      return getRuleContext(RepeatfullContext.class,0);
    }
    public RepeatendinglineContext repeatendingline() {
      return getRuleContext(RepeatendinglineContext.class,0);
    }
    public RepeatstartContext repeatstart() {
      return getRuleContext(RepeatstartContext.class,0);
    }
    public RepeatendContext repeatend() {
      return getRuleContext(RepeatendContext.class,0);
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
      setState(174);
      switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(169);
        repeatfull();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(170);
        repeatendingline();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(171);
        repeatstart();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(172);
        repeatend();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(173);
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
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(176);
      match(REPEATBEGINBAR);
      setState(184);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,28,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(177);
          measure();
          setState(178);
          match(BARLINE);
          setState(180);
          switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
          case 1:
            {
            setState(179);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(186);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,28,_ctx);
      }
      setState(187);
      measure();
      setState(192);
      switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
      case 1:
        {
        setState(188);
        match(BARLINE);
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
        break;
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
      setState(201);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,32,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(194);
          measure();
          setState(195);
          match(BARLINE);
          setState(197);
          switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
          case 1:
            {
            setState(196);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(203);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,32,_ctx);
      }
      setState(204);
      measure();
      setState(209);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(205);
        match(BARLINE);
        setState(207);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(206);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(212); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(211);
          repeatending();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(214); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

  public static class RepeatfullContext extends ParserRuleContext {
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
    public List<RepeatendingContext> repeatending() {
      return getRuleContexts(RepeatendingContext.class);
    }
    public RepeatendingContext repeatending(int i) {
      return getRuleContext(RepeatendingContext.class,i);
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
      setState(216);
      match(REPEATBEGINBAR);
      setState(224);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,37,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(217);
          measure();
          setState(218);
          match(BARLINE);
          setState(220);
          switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
          case 1:
            {
            setState(219);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(226);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,37,_ctx);
      }
      setState(227);
      measure();
      setState(232);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(228);
        match(BARLINE);
        setState(230);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(229);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(235); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(234);
          repeatending();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(237); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

  public static class RepeatendinglineContext extends ParserRuleContext {
    public List<RepeatendingContext> repeatending() {
      return getRuleContexts(RepeatendingContext.class);
    }
    public RepeatendingContext repeatending(int i) {
      return getRuleContext(RepeatendingContext.class,i);
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
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(240); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(239);
          repeatending();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(242); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

  public static class RepeatendingContext extends ParserRuleContext {
    public TerminalNode NTHREPEAT() { return getToken(BodyParser.NTHREPEAT, 0); }
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public TerminalNode REPEATENDBAR() { return getToken(BodyParser.REPEATENDBAR, 0); }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
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
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(244);
      match(NTHREPEAT);
      setState(248);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,42,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(245);
          match(WHITESPACE);
          }
          } 
        }
        setState(250);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,42,_ctx);
      }
      setState(258);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,44,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(251);
          measure();
          setState(252);
          match(BARLINE);
          setState(254);
          switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
          case 1:
            {
            setState(253);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(260);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,44,_ctx);
      }
      {
      setState(261);
      measure();
      setState(262);
      match(REPEATENDBAR);
      setState(264);
      switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
      case 1:
        {
        setState(263);
        match(WHITESPACE);
        }
        break;
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

  public static class LineContext extends ParserRuleContext {
    public List<MeasureContext> measure() {
      return getRuleContexts(MeasureContext.class);
    }
    public MeasureContext measure(int i) {
      return getRuleContext(MeasureContext.class,i);
    }
    public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
    public TerminalNode WHITESPACE(int i) {
      return getToken(BodyParser.WHITESPACE, i);
    }
    public List<TerminalNode> BARLINE() { return getTokens(BodyParser.BARLINE); }
    public TerminalNode BARLINE(int i) {
      return getToken(BodyParser.BARLINE, i);
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
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(269);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,46,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(266);
          match(WHITESPACE);
          }
          } 
        }
        setState(271);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,46,_ctx);
      }
      setState(291);
      switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
      case 1:
        {
        setState(277); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(272);
            measure();
            setState(273);
            match(BARLINE);
            setState(275);
            switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
            case 1:
              {
              setState(274);
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
          setState(279); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,48,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        setState(282);
        switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
        case 1:
          {
          setState(281);
          measure();
          }
          break;
        }
        }
        break;
      case 2:
        {
        setState(284);
        measure();
        setState(288);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,50,_ctx);
        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
          if ( _alt==1 ) {
            {
            {
            setState(285);
            match(WHITESPACE);
            }
            } 
          }
          setState(290);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,50,_ctx);
        }
        }
        break;
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
      setState(296);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==WHITESPACE) {
        {
        {
        setState(293);
        match(WHITESPACE);
        }
        }
        setState(298);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(306); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(299);
          measureelement();
          setState(303);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,53,_ctx);
          while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
            if ( _alt==1 ) {
              {
              {
              setState(300);
              match(WHITESPACE);
              }
              } 
            }
            setState(305);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,53,_ctx);
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(308); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
      setState(314);
      switch (_input.LA(1)) {
      case TUPLETSPEC:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(310);
        tuplet();
        setState(311);
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
        setState(313);
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
      setState(324);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(316);
        note();
        setState(318);
        switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
        case 1:
          {
          setState(317);
          match(WHITESPACE);
          }
          break;
        }
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(320);
        chord();
        setState(322);
        switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
        case 1:
          {
          setState(321);
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
      setState(326);
      noterest();
      setState(327);
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
      setState(331);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(329);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(330);
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
      setState(334);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(333);
        match(ACCIDENTAL);
        }
      }

      setState(336);
      match(BASENOTE);
      setState(340);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        {
        setState(337);
        octave();
        }
        }
        setState(342);
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
      setState(343);
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
      setState(346);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(345);
        match(NUMBER);
        }
      }

      setState(352);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(348);
        match(T__2);
        setState(350);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(349);
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
      setState(354);
      match(TUPLETSPEC);
      setState(356); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(355);
        tupletelement();
        }
        }
        setState(358); 
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
      setState(360);
      match(T__3);
      setState(362); 
      _errHandler.sync(this);
      _alt = 1+1;
      do {
        switch (_alt) {
        case 1+1:
          {
          {
          setState(361);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(364); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,66,_ctx);
      } while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(366);
      match(T__4);
      setState(367);
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
      setState(369);
      match(T__5);
      setState(371);
      switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
      case 1:
        {
        setState(370);
        match(WHITESPACE);
        }
        break;
      }
      setState(373);
      text();
      setState(374);
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
      enterOuterAlt(_localctx, 1);
      {
      setState(378);
      switch (_input.LA(1)) {
      case T__6:
        {
        setState(376);
        comment();
        }
        break;
      case NEWLINE:
        {
        setState(377);
        match(NEWLINE);
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
      setState(380);
      match(T__6);
      setState(384);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << NUMBER) | (1L << WHITESPACE) | (1L << CHAR))) != 0)) {
        {
        {
        setState(381);
        text();
        }
        }
        setState(386);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(387);
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

  public static class SectionendContext extends ParserRuleContext {
    public TerminalNode SECTIONENDBAR() { return getToken(BodyParser.SECTIONENDBAR, 0); }
    public SectionendContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }
    @Override public int getRuleIndex() { return RULE_sectionend; }
    @Override
    public void enterRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).enterSectionend(this);
    }
    @Override
    public void exitRule(ParseTreeListener listener) {
      if ( listener instanceof BodyListener ) ((BodyListener)listener).exitSectionend(this);
    }
  }

  public final SectionendContext sectionend() throws RecognitionException {
    SectionendContext _localctx = new SectionendContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_sectionend);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(389);
      match(SECTIONENDBAR);
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
    enterRule(_localctx, 50, RULE_text);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(408); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(394);
          _errHandler.sync(this);
          _la = _input.LA(1);
          while (_la==BASENOTE || _la==WHITESPACE) {
            {
            {
            setState(391);
            _la = _input.LA(1);
            if ( !(_la==BASENOTE || _la==WHITESPACE) ) {
            _errHandler.recoverInline(this);
            } else {
              consume();
            }
            }
            }
            setState(396);
            _errHandler.sync(this);
            _la = _input.LA(1);
          }
          setState(398); 
          _errHandler.sync(this);
          _alt = 1;
          do {
            switch (_alt) {
            case 1:
              {
              {
              setState(397);
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
            setState(400); 
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,71,_ctx);
          } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
          setState(405);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,72,_ctx);
          while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
            if ( _alt==1 ) {
              {
              {
              setState(402);
              _la = _input.LA(1);
              if ( !(_la==BASENOTE || _la==WHITESPACE) ) {
              _errHandler.recoverInline(this);
              } else {
                consume();
              }
              }
              } 
            }
            setState(407);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,72,_ctx);
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(410); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u019f\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
      "\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3"+
      "\2\6\2>\n\2\r\2\16\2?\3\3\6\3C\n\3\r\3\16\3D\3\3\5\3H\n\3\3\3\7\3"+
      "K\n\3\f\3\16\3N\13\3\3\3\6\3Q\n\3\r\3\16\3R\3\3\5\3V\n\3\3\3\5\3Y"+
      "\n\3\3\3\3\3\6\3]\n\3\r\3\16\3^\7\3a\n\3\f\3\16\3d\13\3\3\3\3\3\3"+
      "\3\6\3i\n\3\r\3\16\3j\3\3\5\3n\n\3\3\3\5\3q\n\3\3\3\3\3\6\3u\n\3\r"+
      "\3\16\3v\3\3\5\3z\n\3\3\3\5\3}\n\3\6\3\177\n\3\r\3\16\3\u0080\5\3"+
      "\u0083\n\3\3\4\5\4\u0086\n\4\3\4\5\4\u0089\n\4\3\4\3\4\6\4\u008d\n"+
      "\4\r\4\16\4\u008e\7\4\u0091\n\4\f\4\16\4\u0094\13\4\3\4\3\4\3\5\3"+
      "\5\5\5\u009a\n\5\3\5\5\5\u009d\n\5\3\5\3\5\6\5\u00a1\n\5\r\5\16\5"+
      "\u00a2\7\5\u00a5\n\5\f\5\16\5\u00a8\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
      "\6\5\6\u00b1\n\6\3\7\3\7\3\7\3\7\5\7\u00b7\n\7\7\7\u00b9\n\7\f\7\16"+
      "\7\u00bc\13\7\3\7\3\7\3\7\5\7\u00c1\n\7\5\7\u00c3\n\7\3\b\3\b\3\b"+
      "\5\b\u00c8\n\b\7\b\u00ca\n\b\f\b\16\b\u00cd\13\b\3\b\3\b\3\b\5\b\u00d2"+
      "\n\b\5\b\u00d4\n\b\3\b\6\b\u00d7\n\b\r\b\16\b\u00d8\3\t\3\t\3\t\3"+
      "\t\5\t\u00df\n\t\7\t\u00e1\n\t\f\t\16\t\u00e4\13\t\3\t\3\t\3\t\5\t"+
      "\u00e9\n\t\5\t\u00eb\n\t\3\t\6\t\u00ee\n\t\r\t\16\t\u00ef\3\n\6\n"+
      "\u00f3\n\n\r\n\16\n\u00f4\3\13\3\13\7\13\u00f9\n\13\f\13\16\13\u00fc"+
      "\13\13\3\13\3\13\3\13\5\13\u0101\n\13\7\13\u0103\n\13\f\13\16\13\u0106"+
      "\13\13\3\13\3\13\3\13\5\13\u010b\n\13\3\f\7\f\u010e\n\f\f\f\16\f\u0111"+
      "\13\f\3\f\3\f\3\f\5\f\u0116\n\f\6\f\u0118\n\f\r\f\16\f\u0119\3\f\5"+
      "\f\u011d\n\f\3\f\3\f\7\f\u0121\n\f\f\f\16\f\u0124\13\f\5\f\u0126\n"+
      "\f\3\r\7\r\u0129\n\r\f\r\16\r\u012c\13\r\3\r\3\r\7\r\u0130\n\r\f\r"+
      "\16\r\u0133\13\r\6\r\u0135\n\r\r\r\16\r\u0136\3\16\3\16\3\16\3\16"+
      "\5\16\u013d\n\16\3\17\3\17\5\17\u0141\n\17\3\17\3\17\5\17\u0145\n"+
      "\17\5\17\u0147\n\17\3\20\3\20\3\20\3\21\3\21\5\21\u014e\n\21\3\22"+
      "\5\22\u0151\n\22\3\22\3\22\7\22\u0155\n\22\f\22\16\22\u0158\13\22"+
      "\3\23\3\23\3\24\5\24\u015d\n\24\3\24\3\24\5\24\u0161\n\24\5\24\u0163"+
      "\n\24\3\25\3\25\6\25\u0167\n\25\r\25\16\25\u0168\3\26\3\26\6\26\u016d"+
      "\n\26\r\26\16\26\u016e\3\26\3\26\3\26\3\27\3\27\5\27\u0176\n\27\3"+
      "\27\3\27\3\27\3\30\3\30\5\30\u017d\n\30\3\31\3\31\7\31\u0181\n\31"+
      "\f\31\16\31\u0184\13\31\3\31\3\31\3\32\3\32\3\33\7\33\u018b\n\33\f"+
      "\33\16\33\u018e\13\33\3\33\6\33\u0191\n\33\r\33\16\33\u0192\3\33\7"+
      "\33\u0196\n\33\f\33\16\33\u0199\13\33\6\33\u019b\n\33\r\33\16\33\u019c"+
      "\3\33\3\u016e\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
      ".\60\62\64\2\5\3\2\3\4\4\2\f\f\26\26\4\2\25\25\27\27\u01d2\29\3\2"+
      "\2\2\4\u0082\3\2\2\2\6\u0085\3\2\2\2\b\u0097\3\2\2\2\n\u00b0\3\2\2"+
      "\2\f\u00b2\3\2\2\2\16\u00cb\3\2\2\2\20\u00da\3\2\2\2\22\u00f2\3\2"+
      "\2\2\24\u00f6\3\2\2\2\26\u010f\3\2\2\2\30\u012a\3\2\2\2\32\u013c\3"+
      "\2\2\2\34\u0146\3\2\2\2\36\u0148\3\2\2\2 \u014d\3\2\2\2\"\u0150\3"+
      "\2\2\2$\u0159\3\2\2\2&\u015c\3\2\2\2(\u0164\3\2\2\2*\u016a\3\2\2\2"+
      ",\u0173\3\2\2\2.\u017c\3\2\2\2\60\u017e\3\2\2\2\62\u0187\3\2\2\2\64"+
      "\u019a\3\2\2\2\668\7\n\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3"+
      "\2\2\2:=\3\2\2\2;9\3\2\2\2<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2"+
      "?@\3\2\2\2@\3\3\2\2\2AC\5\6\4\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3"+
      "\2\2\2EG\3\2\2\2FH\5\62\32\2GF\3\2\2\2GH\3\2\2\2HL\3\2\2\2IK\7\26"+
      "\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MX\3\2\2\2NL\3\2\2\2O"+
      "Q\5.\30\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TV\7\2"+
      "\2\3UT\3\2\2\2UV\3\2\2\2VY\3\2\2\2WY\7\2\2\3XP\3\2\2\2XW\3\2\2\2Y"+
      "\u0083\3\2\2\2Z\\\5\b\5\2[]\5.\30\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2"+
      "\2^_\3\2\2\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3"+
      "\2\2\2db\3\2\2\2ef\5\b\5\2fp\5\62\32\2gi\5.\30\2hg\3\2\2\2ij\3\2\2"+
      "\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\7\2\2\3ml\3\2\2\2mn\3\2\2\2nq\3"+
      "\2\2\2oq\7\2\2\3ph\3\2\2\2po\3\2\2\2q\u0083\3\2\2\2r|\5\b\5\2su\5"+
      ".\30\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\7\2\2\3"+
      "yx\3\2\2\2yz\3\2\2\2z}\3\2\2\2{}\7\2\2\3|t\3\2\2\2|{\3\2\2\2}\177"+
      "\3\2\2\2~r\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
      "\2\2\2\u0081\u0083\3\2\2\2\u0082B\3\2\2\2\u0082b\3\2\2\2\u0082~\3"+
      "\2\2\2\u0083\5\3\2\2\2\u0084\u0086\7\16\2\2\u0085\u0084\3\2\2\2\u0085"+
      "\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\7\22\2\2\u0088\u0087"+
      "\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0092\3\2\2\2\u008a\u008c\5\n\6"+
      "\2\u008b\u008d\5.\30\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
      "\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008a"+
      "\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2"+
      "\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\5\n\6\2\u0096"+
      "\7\3\2\2\2\u0097\u0099\5,\27\2\u0098\u009a\7\26\2\2\u0099\u0098\3"+
      "\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u009d\7\22\2"+
      "\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a6\3\2\2\2\u009e"+
      "\u00a0\5\n\6\2\u009f\u00a1\5.\30\2\u00a0\u009f\3\2\2\2\u00a1\u00a2"+
      "\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2"+
      "\2\u00a4\u009e\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
      "\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa"+
      "\5\n\6\2\u00aa\t\3\2\2\2\u00ab\u00b1\5\20\t\2\u00ac\u00b1\5\22\n\2"+
      "\u00ad\u00b1\5\f\7\2\u00ae\u00b1\5\16\b\2\u00af\u00b1\5\26\f\2\u00b0"+
      "\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae"+
      "\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\13\3\2\2\2\u00b2\u00ba\7\17\2\2"+
      "\u00b3\u00b4\5\30\r\2\u00b4\u00b6\7\16\2\2\u00b5\u00b7\7\26\2\2\u00b6"+
      "\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b3"+
      "\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2"+
      "\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c2\5\30\r\2\u00be"+
      "\u00c0\7\16\2\2\u00bf\u00c1\7\26\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1"+
      "\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00c3\3\2\2"+
      "\2\u00c3\r\3\2\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c7\7\16\2\2\u00c6"+
      "\u00c8\7\26\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca"+
      "\3\2\2\2\u00c9\u00c4\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2"+
      "\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
      "\u00d3\5\30\r\2\u00cf\u00d1\7\16\2\2\u00d0\u00d2\7\26\2\2\u00d1\u00d0"+
      "\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00cf\3\2\2"+
      "\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5\24\13\2\u00d6"+
      "\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
      "\3\2\2\2\u00d9\17\3\2\2\2\u00da\u00e2\7\17\2\2\u00db\u00dc\5\30\r"+
      "\2\u00dc\u00de\7\16\2\2\u00dd\u00df\7\26\2\2\u00de\u00dd\3\2\2\2\u00de"+
      "\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1\u00e4"+
      "\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2"+
      "\2\u00e4\u00e2\3\2\2\2\u00e5\u00ea\5\30\r\2\u00e6\u00e8\7\16\2\2\u00e7"+
      "\u00e9\7\26\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb"+
      "\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2"+
      "\2\u00ec\u00ee\5\24\13\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
      "\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\21\3\2\2\2\u00f1\u00f3\5"+
      "\24\13\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2"+
      "\2\u00f4\u00f5\3\2\2\2\u00f5\23\3\2\2\2\u00f6\u00fa\7\21\2\2\u00f7"+
      "\u00f9\7\26\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8"+
      "\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0104\3\2\2\2\u00fc\u00fa\3\2\2"+
      "\2\u00fd\u00fe\5\30\r\2\u00fe\u0100\7\16\2\2\u00ff\u0101\7\26\2\2"+
      "\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
      "\u00fd\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105"+
      "\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\5\30"+
      "\r\2\u0108\u010a\7\20\2\2\u0109\u010b\7\26\2\2\u010a\u0109\3\2\2\2"+
      "\u010a\u010b\3\2\2\2\u010b\25\3\2\2\2\u010c\u010e\7\26\2\2\u010d\u010c"+
      "\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2"+
      "\2\u0110\u0125\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\5\30\r\2\u0113"+
      "\u0115\7\16\2\2\u0114\u0116\7\26\2\2\u0115\u0114\3\2\2\2\u0115\u0116"+
      "\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0112\3\2\2\2\u0118\u0119\3\2\2"+
      "\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b"+
      "\u011d\5\30\r\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0126"+
      "\3\2\2\2\u011e\u0122\5\30\r\2\u011f\u0121\7\26\2\2\u0120\u011f\3\2"+
      "\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
      "\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0117\3\2\2\2\u0125\u011e"+
      "\3\2\2\2\u0126\27\3\2\2\2\u0127\u0129\7\26\2\2\u0128\u0127\3\2\2\2"+
      "\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
      "\u0134\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0131\5\32\16\2\u012e\u0130"+
      "\7\26\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
      "\2\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0134"+
      "\u012d\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
      "\3\2\2\2\u0137\31\3\2\2\2\u0138\u0139\5(\25\2\u0139\u013a\7\26\2\2"+
      "\u013a\u013d\3\2\2\2\u013b\u013d\5\34\17\2\u013c\u0138\3\2\2\2\u013c"+
      "\u013b\3\2\2\2\u013d\33\3\2\2\2\u013e\u0140\5\36\20\2\u013f\u0141"+
      "\7\26\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0147\3\2"+
      "\2\2\u0142\u0144\5*\26\2\u0143\u0145\7\26\2\2\u0144\u0143\3\2\2\2"+
      "\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u013e\3\2\2\2\u0146"+
      "\u0142\3\2\2\2\u0147\35\3\2\2\2\u0148\u0149\5 \21\2\u0149\u014a\5"+
      "&\24\2\u014a\37\3\2\2\2\u014b\u014e\5\"\22\2\u014c\u014e\7\24\2\2"+
      "\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e!\3\2\2\2\u014f\u0151"+
      "\7\r\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2"+
      "\2\u0152\u0156\7\f\2\2\u0153\u0155\5$\23\2\u0154\u0153\3\2\2\2\u0155"+
      "\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157#\3\2"+
      "\2\2\u0158\u0156\3\2\2\2\u0159\u015a\t\2\2\2\u015a%\3\2\2\2\u015b"+
      "\u015d\7\25\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0162"+
      "\3\2\2\2\u015e\u0160\7\5\2\2\u015f\u0161\7\25\2\2\u0160\u015f\3\2"+
      "\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015e\3\2\2\2\u0162"+
      "\u0163\3\2\2\2\u0163\'\3\2\2\2\u0164\u0166\7\13\2\2\u0165\u0167\5"+
      "\34\17\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2"+
      "\2\u0168\u0169\3\2\2\2\u0169)\3\2\2\2\u016a\u016c\7\6\2\2\u016b\u016d"+
      "\5\36\20\2\u016c\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2"+
      "\2\2\u016e\u016c\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\7\2\2\u0171"+
      "\u0172\5&\24\2\u0172+\3\2\2\2\u0173\u0175\7\b\2\2\u0174\u0176\7\26"+
      "\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
      "\u0178\5\64\33\2\u0178\u0179\5.\30\2\u0179-\3\2\2\2\u017a\u017d\5"+
      "\60\31\2\u017b\u017d\7\n\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2"+
      "\2\u017d/\3\2\2\2\u017e\u0182\7\t\2\2\u017f\u0181\5\64\33\2\u0180"+
      "\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183"+
      "\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7\n\2"+
      "\2\u0186\61\3\2\2\2\u0187\u0188\7\23\2\2\u0188\63\3\2\2\2\u0189\u018b"+
      "\t\3\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2"+
      "\2\u018c\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f"+
      "\u0191\t\4\2\2\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190"+
      "\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0197\3\2\2\2\u0194\u0196\t\3\2"+
      "\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
      "\u0198\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u018c"+
      "\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2"+
      "\2\u019d\65\3\2\2\2L9?DGLRUX^bjmpvy|\u0080\u0082\u0085\u0088\u008e"+
      "\u0092\u0099\u009c\u00a2\u00a6\u00b0\u00b6\u00ba\u00c0\u00c2\u00c7"+
      "\u00cb\u00d1\u00d3\u00d8\u00de\u00e2\u00e8\u00ea\u00ef\u00f4\u00fa"+
      "\u0100\u0104\u010a\u010f\u0115\u0119\u011c\u0122\u0125\u012a\u0131"+
      "\u0136\u013c\u0140\u0144\u0146\u014d\u0150\u0156\u015c\u0160\u0162"+
      "\u0168\u016e\u0175\u017c\u0182\u018c\u0192\u0197\u019c";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
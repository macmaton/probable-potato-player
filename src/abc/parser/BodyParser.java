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
    NTHREPEAT=15, SECTIONBEGINBAR=16, SECTIONENDBAR=17, REST=18, NUMBER=19, 
    WHITESPACE=20, CHAR=21;
  public static final int
    RULE_body = 0, RULE_section = 1, RULE_sectionelement = 2, RULE_voicepart = 3, 
    RULE_voicepartelement = 4, RULE_repeatstart = 5, RULE_repeatend = 6, 
    RULE_repeatfull = 7, RULE_repeatendingline = 8, RULE_repeatending = 9, 
    RULE_line = 10, RULE_measure = 11, RULE_measureelement = 12, RULE_tupletelement = 13, 
    RULE_note = 14, RULE_noterest = 15, RULE_pitch = 16, RULE_octave = 17, 
    RULE_notelength = 18, RULE_tuplet = 19, RULE_chord = 20, RULE_fieldvoice = 21, 
    RULE_endofline = 22, RULE_comment = 23, RULE_text = 24;
  public static final String[] ruleNames = {
    "body", "section", "sectionelement", "voicepart", "voicepartelement", 
    "repeatstart", "repeatend", "repeatfull", "repeatendingline", "repeatending", 
    "line", "measure", "measureelement", "tupletelement", "note", "noterest", 
    "pitch", "octave", "notelength", "tuplet", "chord", "fieldvoice", "endofline", 
    "comment", "text"
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
        section();
        }
        }
        setState(59); 
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
    public TerminalNode SECTIONENDBAR() { return getToken(BodyParser.SECTIONENDBAR, 0); }
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
      setState(126);
      switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
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
        setState(67);
        _la = _input.LA(1);
        if (_la==SECTIONENDBAR) {
          {
          setState(66);
          match(SECTIONENDBAR);
          }
        }

        setState(72);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la==WHITESPACE) {
          {
          {
          setState(69);
          match(WHITESPACE);
          }
          }
          setState(74);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(84);
        switch (_input.LA(1)) {
        case T__6:
        case NEWLINE:
          {
          setState(76); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(75);
            endofline();
            }
            }
            setState(78); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==T__6 || _la==NEWLINE );
          setState(81);
          switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
          case 1:
            {
            setState(80);
            match(EOF);
            }
            break;
          }
          }
          break;
        case EOF:
          {
          setState(83);
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
        setState(94);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
          if ( _alt==1 ) {
            {
            {
            setState(86);
            voicepart();
            setState(88); 
            _errHandler.sync(this);
            _la = _input.LA(1);
            do {
              {
              {
              setState(87);
              endofline();
              }
              }
              setState(90); 
              _errHandler.sync(this);
              _la = _input.LA(1);
            } while ( _la==T__6 || _la==NEWLINE );
            }
            } 
          }
          setState(96);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
        }
        {
        setState(97);
        voicepart();
        setState(98);
        match(SECTIONENDBAR);
        setState(108);
        switch (_input.LA(1)) {
        case T__6:
        case NEWLINE:
          {
          setState(100); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(99);
            endofline();
            }
            }
            setState(102); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==T__6 || _la==NEWLINE );
          setState(105);
          switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
          case 1:
            {
            setState(104);
            match(EOF);
            }
            break;
          }
          }
          break;
        case EOF:
          {
          setState(107);
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
        setState(122); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(110);
            voicepart();
            setState(120);
            switch (_input.LA(1)) {
            case T__6:
            case NEWLINE:
              {
              setState(112); 
              _errHandler.sync(this);
              _la = _input.LA(1);
              do {
                {
                {
                setState(111);
                endofline();
                }
                }
                setState(114); 
                _errHandler.sync(this);
                _la = _input.LA(1);
              } while ( _la==T__6 || _la==NEWLINE );
              setState(117);
              switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
              case 1:
                {
                setState(116);
                match(EOF);
                }
                break;
              }
              }
              break;
            case EOF:
              {
              setState(119);
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
          setState(124); 
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
      setState(129);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(128);
        match(BARLINE);
        }
      }

      {
      setState(132);
      _la = _input.LA(1);
      if (_la==SECTIONBEGINBAR) {
        {
        setState(131);
        match(SECTIONBEGINBAR);
        }
      }

      setState(142);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(134);
          voicepartelement();
          setState(136); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(135);
            endofline();
            }
            }
            setState(138); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==T__6 || _la==NEWLINE );
          }
          } 
        }
        setState(144);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,21,_ctx);
      }
      setState(145);
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
      setState(147);
      fieldvoice();
      setState(149);
      switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
      case 1:
        {
        setState(148);
        match(WHITESPACE);
        }
        break;
      }
      setState(152);
      _la = _input.LA(1);
      if (_la==SECTIONBEGINBAR) {
        {
        setState(151);
        match(SECTIONBEGINBAR);
        }
      }

      setState(162);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,25,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(154);
          voicepartelement();
          setState(156); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(155);
            endofline();
            }
            }
            setState(158); 
            _errHandler.sync(this);
            _la = _input.LA(1);
          } while ( _la==T__6 || _la==NEWLINE );
          }
          } 
        }
        setState(164);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,25,_ctx);
      }
      setState(165);
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
      setState(172);
      switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
      case 1:
        enterOuterAlt(_localctx, 1);
        {
        setState(167);
        repeatfull();
        }
        break;
      case 2:
        enterOuterAlt(_localctx, 2);
        {
        setState(168);
        repeatendingline();
        }
        break;
      case 3:
        enterOuterAlt(_localctx, 3);
        {
        setState(169);
        repeatstart();
        }
        break;
      case 4:
        enterOuterAlt(_localctx, 4);
        {
        setState(170);
        repeatend();
        }
        break;
      case 5:
        enterOuterAlt(_localctx, 5);
        {
        setState(171);
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
      setState(174);
      match(REPEATBEGINBAR);
      setState(182);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,28,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(175);
          measure();
          setState(176);
          match(BARLINE);
          setState(178);
          switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
          case 1:
            {
            setState(177);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(184);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,28,_ctx);
      }
      setState(185);
      measure();
      setState(190);
      switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
      case 1:
        {
        setState(186);
        match(BARLINE);
        setState(188);
        switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
        case 1:
          {
          setState(187);
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
      setState(199);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,32,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(192);
          measure();
          setState(193);
          match(BARLINE);
          setState(195);
          switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
          case 1:
            {
            setState(194);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(201);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,32,_ctx);
      }
      setState(202);
      measure();
      setState(207);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(203);
        match(BARLINE);
        setState(205);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(204);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(210); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(209);
          repeatending();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(212); 
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
    public TerminalNode REPEATENDBAR() { return getToken(BodyParser.REPEATENDBAR, 0); }
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
      setState(214);
      match(REPEATBEGINBAR);
      setState(222);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,37,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(215);
          measure();
          setState(216);
          match(BARLINE);
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
        }
        setState(224);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,37,_ctx);
      }
      setState(225);
      measure();
      setState(230);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(226);
        match(BARLINE);
        setState(228);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(227);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(238);
      switch (_input.LA(1)) {
      case NTHREPEAT:
        {
        setState(233); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(232);
            repeatending();
            }
            }
            break;
          default:
            throw new NoViableAltException(this);
          }
          setState(235); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,40,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        }
        break;
      case REPEATENDBAR:
        {
        setState(237);
        match(REPEATENDBAR);
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
      setState(241); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(240);
          repeatending();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(243); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
      setState(245);
      match(NTHREPEAT);
      setState(249);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,43,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(246);
          match(WHITESPACE);
          }
          } 
        }
        setState(251);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,43,_ctx);
      }
      setState(259);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,45,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(252);
          measure();
          setState(253);
          match(BARLINE);
          setState(255);
          switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
          case 1:
            {
            setState(254);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(261);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,45,_ctx);
      }
      {
      setState(262);
      measure();
      setState(263);
      match(REPEATENDBAR);
      setState(265);
      switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
      case 1:
        {
        setState(264);
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
      setState(270);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
        _alt = getInterpreter().adaptivePredict(_input,47,_ctx);
      }
      setState(292);
      switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
      case 1:
        {
        setState(278); 
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
          case 1:
            {
            {
            setState(273);
            measure();
            setState(274);
            match(BARLINE);
            setState(276);
            switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
            case 1:
              {
              setState(275);
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
          setState(280); 
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,49,_ctx);
        } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
        setState(283);
        switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
        case 1:
          {
          setState(282);
          measure();
          }
          break;
        }
        }
        break;
      case 2:
        {
        setState(285);
        measure();
        setState(289);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,51,_ctx);
        while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
          if ( _alt==1 ) {
            {
            {
            setState(286);
            match(WHITESPACE);
            }
            } 
          }
          setState(291);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
      setState(297);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==WHITESPACE) {
        {
        {
        setState(294);
        match(WHITESPACE);
        }
        }
        setState(299);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(307); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(300);
          measureelement();
          setState(304);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,54,_ctx);
          while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
            if ( _alt==1 ) {
              {
              {
              setState(301);
              match(WHITESPACE);
              }
              } 
            }
            setState(306);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,54,_ctx);
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(309); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
      setState(315);
      switch (_input.LA(1)) {
      case TUPLETSPEC:
        enterOuterAlt(_localctx, 1);
        {
        {
        setState(311);
        tuplet();
        setState(312);
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
        setState(314);
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
      setState(325);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(317);
        note();
        setState(319);
        switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
        case 1:
          {
          setState(318);
          match(WHITESPACE);
          }
          break;
        }
        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(321);
        chord();
        setState(323);
        switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
        case 1:
          {
          setState(322);
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
      setState(327);
      noterest();
      setState(328);
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
      setState(332);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(330);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(331);
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
      setState(335);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(334);
        match(ACCIDENTAL);
        }
      }

      setState(337);
      match(BASENOTE);
      setState(341);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        {
        setState(338);
        octave();
        }
        }
        setState(343);
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
      setState(344);
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
      setState(347);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(346);
        match(NUMBER);
        }
      }

      setState(353);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(349);
        match(T__2);
        setState(351);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(350);
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
      setState(355);
      match(TUPLETSPEC);
      setState(357); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(356);
        tupletelement();
        }
        }
        setState(359); 
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
      setState(361);
      match(T__3);
      setState(363); 
      _errHandler.sync(this);
      _alt = 1+1;
      do {
        switch (_alt) {
        case 1+1:
          {
          {
          setState(362);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(365); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,67,_ctx);
      } while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(367);
      match(T__4);
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
      switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
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
      setState(406); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(392);
          _errHandler.sync(this);
          _la = _input.LA(1);
          while (_la==BASENOTE || _la==WHITESPACE) {
            {
            {
            setState(389);
            _la = _input.LA(1);
            if ( !(_la==BASENOTE || _la==WHITESPACE) ) {
            _errHandler.recoverInline(this);
            } else {
              consume();
            }
            }
            }
            setState(394);
            _errHandler.sync(this);
            _la = _input.LA(1);
          }
          setState(396); 
          _errHandler.sync(this);
          _alt = 1;
          do {
            switch (_alt) {
            case 1:
              {
              {
              setState(395);
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
            setState(398); 
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,72,_ctx);
          } while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
          setState(403);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input,73,_ctx);
          while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
            if ( _alt==1 ) {
              {
              {
              setState(400);
              _la = _input.LA(1);
              if ( !(_la==BASENOTE || _la==WHITESPACE) ) {
              _errHandler.recoverInline(this);
              } else {
                consume();
              }
              }
              } 
            }
            setState(405);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input,73,_ctx);
          }
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(408); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\27\u019d\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
      "\t\30\4\31\t\31\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\6\2<\n"+
      "\2\r\2\16\2=\3\3\6\3A\n\3\r\3\16\3B\3\3\5\3F\n\3\3\3\7\3I\n\3\f\3"+
      "\16\3L\13\3\3\3\6\3O\n\3\r\3\16\3P\3\3\5\3T\n\3\3\3\5\3W\n\3\3\3\3"+
      "\3\6\3[\n\3\r\3\16\3\\\7\3_\n\3\f\3\16\3b\13\3\3\3\3\3\3\3\6\3g\n"+
      "\3\r\3\16\3h\3\3\5\3l\n\3\3\3\5\3o\n\3\3\3\3\3\6\3s\n\3\r\3\16\3t"+
      "\3\3\5\3x\n\3\3\3\5\3{\n\3\6\3}\n\3\r\3\16\3~\5\3\u0081\n\3\3\4\5"+
      "\4\u0084\n\4\3\4\5\4\u0087\n\4\3\4\3\4\6\4\u008b\n\4\r\4\16\4\u008c"+
      "\7\4\u008f\n\4\f\4\16\4\u0092\13\4\3\4\3\4\3\5\3\5\5\5\u0098\n\5\3"+
      "\5\5\5\u009b\n\5\3\5\3\5\6\5\u009f\n\5\r\5\16\5\u00a0\7\5\u00a3\n"+
      "\5\f\5\16\5\u00a6\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u00af\n\6\3"+
      "\7\3\7\3\7\3\7\5\7\u00b5\n\7\7\7\u00b7\n\7\f\7\16\7\u00ba\13\7\3\7"+
      "\3\7\3\7\5\7\u00bf\n\7\5\7\u00c1\n\7\3\b\3\b\3\b\5\b\u00c6\n\b\7\b"+
      "\u00c8\n\b\f\b\16\b\u00cb\13\b\3\b\3\b\3\b\5\b\u00d0\n\b\5\b\u00d2"+
      "\n\b\3\b\6\b\u00d5\n\b\r\b\16\b\u00d6\3\t\3\t\3\t\3\t\5\t\u00dd\n"+
      "\t\7\t\u00df\n\t\f\t\16\t\u00e2\13\t\3\t\3\t\3\t\5\t\u00e7\n\t\5\t"+
      "\u00e9\n\t\3\t\6\t\u00ec\n\t\r\t\16\t\u00ed\3\t\5\t\u00f1\n\t\3\n"+
      "\6\n\u00f4\n\n\r\n\16\n\u00f5\3\13\3\13\7\13\u00fa\n\13\f\13\16\13"+
      "\u00fd\13\13\3\13\3\13\3\13\5\13\u0102\n\13\7\13\u0104\n\13\f\13\16"+
      "\13\u0107\13\13\3\13\3\13\3\13\5\13\u010c\n\13\3\f\7\f\u010f\n\f\f"+
      "\f\16\f\u0112\13\f\3\f\3\f\3\f\5\f\u0117\n\f\6\f\u0119\n\f\r\f\16"+
      "\f\u011a\3\f\5\f\u011e\n\f\3\f\3\f\7\f\u0122\n\f\f\f\16\f\u0125\13"+
      "\f\5\f\u0127\n\f\3\r\7\r\u012a\n\r\f\r\16\r\u012d\13\r\3\r\3\r\7\r"+
      "\u0131\n\r\f\r\16\r\u0134\13\r\6\r\u0136\n\r\r\r\16\r\u0137\3\16\3"+
      "\16\3\16\3\16\5\16\u013e\n\16\3\17\3\17\5\17\u0142\n\17\3\17\3\17"+
      "\5\17\u0146\n\17\5\17\u0148\n\17\3\20\3\20\3\20\3\21\3\21\5\21\u014f"+
      "\n\21\3\22\5\22\u0152\n\22\3\22\3\22\7\22\u0156\n\22\f\22\16\22\u0159"+
      "\13\22\3\23\3\23\3\24\5\24\u015e\n\24\3\24\3\24\5\24\u0162\n\24\5"+
      "\24\u0164\n\24\3\25\3\25\6\25\u0168\n\25\r\25\16\25\u0169\3\26\3\26"+
      "\6\26\u016e\n\26\r\26\16\26\u016f\3\26\3\26\3\27\3\27\5\27\u0176\n"+
      "\27\3\27\3\27\3\27\3\30\3\30\5\30\u017d\n\30\3\31\3\31\7\31\u0181"+
      "\n\31\f\31\16\31\u0184\13\31\3\31\3\31\3\32\7\32\u0189\n\32\f\32\16"+
      "\32\u018c\13\32\3\32\6\32\u018f\n\32\r\32\16\32\u0190\3\32\7\32\u0194"+
      "\n\32\f\32\16\32\u0197\13\32\6\32\u0199\n\32\r\32\16\32\u019a\3\32"+
      "\3\u016f\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
      "\2\5\3\2\3\4\4\2\f\f\26\26\4\2\25\25\27\27\u01d2\2\67\3\2\2\2\4\u0080"+
      "\3\2\2\2\6\u0083\3\2\2\2\b\u0095\3\2\2\2\n\u00ae\3\2\2\2\f\u00b0\3"+
      "\2\2\2\16\u00c9\3\2\2\2\20\u00d8\3\2\2\2\22\u00f3\3\2\2\2\24\u00f7"+
      "\3\2\2\2\26\u0110\3\2\2\2\30\u012b\3\2\2\2\32\u013d\3\2\2\2\34\u0147"+
      "\3\2\2\2\36\u0149\3\2\2\2 \u014e\3\2\2\2\"\u0151\3\2\2\2$\u015a\3"+
      "\2\2\2&\u015d\3\2\2\2(\u0165\3\2\2\2*\u016b\3\2\2\2,\u0173\3\2\2\2"+
      ".\u017c\3\2\2\2\60\u017e\3\2\2\2\62\u0198\3\2\2\2\64\66\7\n\2\2\65"+
      "\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67\3"+
      "\2\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2"+
      "\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DF\7"+
      "\23\2\2ED\3\2\2\2EF\3\2\2\2FJ\3\2\2\2GI\7\26\2\2HG\3\2\2\2IL\3\2\2"+
      "\2JH\3\2\2\2JK\3\2\2\2KV\3\2\2\2LJ\3\2\2\2MO\5.\30\2NM\3\2\2\2OP\3"+
      "\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\7\2\2\3SR\3\2\2\2ST\3\2\2\2"+
      "TW\3\2\2\2UW\7\2\2\3VN\3\2\2\2VU\3\2\2\2W\u0081\3\2\2\2XZ\5\b\5\2"+
      "Y[\5.\30\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^X"+
      "\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\5\b\5"+
      "\2dn\7\23\2\2eg\5.\30\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik"+
      "\3\2\2\2jl\7\2\2\3kj\3\2\2\2kl\3\2\2\2lo\3\2\2\2mo\7\2\2\3nf\3\2\2"+
      "\2nm\3\2\2\2o\u0081\3\2\2\2pz\5\b\5\2qs\5.\30\2rq\3\2\2\2st\3\2\2"+
      "\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\7\2\2\3wv\3\2\2\2wx\3\2\2\2x{\3"+
      "\2\2\2y{\7\2\2\3zr\3\2\2\2zy\3\2\2\2{}\3\2\2\2|p\3\2\2\2}~\3\2\2\2"+
      "~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080@\3\2\2\2\u0080`\3"+
      "\2\2\2\u0080|\3\2\2\2\u0081\5\3\2\2\2\u0082\u0084\7\16\2\2\u0083\u0082"+
      "\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0087\7\22"+
      "\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0090\3\2\2\2\u0088"+
      "\u008a\5\n\6\2\u0089\u008b\5.\30\2\u008a\u0089\3\2\2\2\u008b\u008c"+
      "\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2"+
      "\2\u008e\u0088\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
      "\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094"+
      "\5\n\6\2\u0094\7\3\2\2\2\u0095\u0097\5,\27\2\u0096\u0098\7\26\2\2"+
      "\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099"+
      "\u009b\7\22\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a4"+
      "\3\2\2\2\u009c\u009e\5\n\6\2\u009d\u009f\5.\30\2\u009e\u009d\3\2\2"+
      "\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
      "\u00a3\3\2\2\2\u00a2\u009c\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2"+
      "\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2"+
      "\2\u00a7\u00a8\5\n\6\2\u00a8\t\3\2\2\2\u00a9\u00af\5\20\t\2\u00aa"+
      "\u00af\5\22\n\2\u00ab\u00af\5\f\7\2\u00ac\u00af\5\16\b\2\u00ad\u00af"+
      "\5\26\f\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2"+
      "\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\13\3\2\2\2\u00b0"+
      "\u00b8\7\17\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b4\7\16\2\2\u00b3\u00b5"+
      "\7\26\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
      "\2\2\u00b6\u00b1\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8"+
      "\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00c0"+
      "\5\30\r\2\u00bc\u00be\7\16\2\2\u00bd\u00bf\7\26\2\2\u00be\u00bd\3"+
      "\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2"+
      "\u00c0\u00c1\3\2\2\2\u00c1\r\3\2\2\2\u00c2\u00c3\5\30\r\2\u00c3\u00c5"+
      "\7\16\2\2\u00c4\u00c6\7\26\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2"+
      "\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
      "\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9"+
      "\3\2\2\2\u00cc\u00d1\5\30\r\2\u00cd\u00cf\7\16\2\2\u00ce\u00d0\7\26"+
      "\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
      "\u00cd\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5"+
      "\5\24\13\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2"+
      "\2\2\u00d6\u00d7\3\2\2\2\u00d7\17\3\2\2\2\u00d8\u00e0\7\17\2\2\u00d9"+
      "\u00da\5\30\r\2\u00da\u00dc\7\16\2\2\u00db\u00dd\7\26\2\2\u00dc\u00db"+
      "\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00d9\3\2\2"+
      "\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
      "\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e8\5\30\r\2\u00e4\u00e6"+
      "\7\16\2\2\u00e5\u00e7\7\26\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2"+
      "\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
      "\u00f0\3\2\2\2\u00ea\u00ec\5\24\13\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
      "\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f1\3\2\2"+
      "\2\u00ef\u00f1\7\20\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
      "\21\3\2\2\2\u00f2\u00f4\5\24\13\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5"+
      "\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\23\3\2\2\2"+
      "\u00f7\u00fb\7\21\2\2\u00f8\u00fa\7\26\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
      "\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0105"+
      "\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\5\30\r\2\u00ff\u0101\7\16"+
      "\2\2\u0100\u0102\7\26\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2"+
      "\u0102\u0104\3\2\2\2\u0103\u00fe\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
      "\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105"+
      "\3\2\2\2\u0108\u0109\5\30\r\2\u0109\u010b\7\20\2\2\u010a\u010c\7\26"+
      "\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\25\3\2\2\2\u010d"+
      "\u010f\7\26\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e"+
      "\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0126\3\2\2\2\u0112\u0110\3\2\2"+
      "\2\u0113\u0114\5\30\r\2\u0114\u0116\7\16\2\2\u0115\u0117\7\26\2\2"+
      "\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
      "\u0113\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
      "\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\5\30\r\2\u011d\u011c\3\2"+
      "\2\2\u011d\u011e\3\2\2\2\u011e\u0127\3\2\2\2\u011f\u0123\5\30\r\2"+
      "\u0120\u0122\7\26\2\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
      "\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123"+
      "\3\2\2\2\u0126\u0118\3\2\2\2\u0126\u011f\3\2\2\2\u0127\27\3\2\2\2"+
      "\u0128\u012a\7\26\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
      "\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u0135\3\2\2\2\u012d\u012b"+
      "\3\2\2\2\u012e\u0132\5\32\16\2\u012f\u0131\7\26\2\2\u0130\u012f\3"+
      "\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2"+
      "\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u012e\3\2\2\2\u0136"+
      "\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\31\3"+
      "\2\2\2\u0139\u013a\5(\25\2\u013a\u013b\7\26\2\2\u013b\u013e\3\2\2"+
      "\2\u013c\u013e\5\34\17\2\u013d\u0139\3\2\2\2\u013d\u013c\3\2\2\2\u013e"+
      "\33\3\2\2\2\u013f\u0141\5\36\20\2\u0140\u0142\7\26\2\2\u0141\u0140"+
      "\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0148\3\2\2\2\u0143\u0145\5*\26"+
      "\2\u0144\u0146\7\26\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
      "\u0148\3\2\2\2\u0147\u013f\3\2\2\2\u0147\u0143\3\2\2\2\u0148\35\3"+
      "\2\2\2\u0149\u014a\5 \21\2\u014a\u014b\5&\24\2\u014b\37\3\2\2\2\u014c"+
      "\u014f\5\"\22\2\u014d\u014f\7\24\2\2\u014e\u014c\3\2\2\2\u014e\u014d"+
      "\3\2\2\2\u014f!\3\2\2\2\u0150\u0152\7\r\2\2\u0151\u0150\3\2\2\2\u0151"+
      "\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0157\7\f\2\2\u0154\u0156"+
      "\5$\23\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2"+
      "\2\u0157\u0158\3\2\2\2\u0158#\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b"+
      "\t\2\2\2\u015b%\3\2\2\2\u015c\u015e\7\25\2\2\u015d\u015c\3\2\2\2\u015d"+
      "\u015e\3\2\2\2\u015e\u0163\3\2\2\2\u015f\u0161\7\5\2\2\u0160\u0162"+
      "\7\25\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2"+
      "\2\2\u0163\u015f\3\2\2\2\u0163\u0164\3\2\2\2\u0164\'\3\2\2\2\u0165"+
      "\u0167\7\13\2\2\u0166\u0168\5\34\17\2\u0167\u0166\3\2\2\2\u0168\u0169"+
      "\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a)\3\2\2\2\u016b"+
      "\u016d\7\6\2\2\u016c\u016e\5\36\20\2\u016d\u016c\3\2\2\2\u016e\u016f"+
      "\3\2\2\2\u016f\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\3\2\2"+
      "\2\u0171\u0172\7\7\2\2\u0172+\3\2\2\2\u0173\u0175\7\b\2\2\u0174\u0176"+
      "\7\26\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2"+
      "\2\2\u0177\u0178\5\62\32\2\u0178\u0179\5.\30\2\u0179-\3\2\2\2\u017a"+
      "\u017d\5\60\31\2\u017b\u017d\7\n\2\2\u017c\u017a\3\2\2\2\u017c\u017b"+
      "\3\2\2\2\u017d/\3\2\2\2\u017e\u0182\7\t\2\2\u017f\u0181\5\62\32\2"+
      "\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182"+
      "\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186"+
      "\7\n\2\2\u0186\61\3\2\2\2\u0187\u0189\t\3\2\2\u0188\u0187\3\2\2\2"+
      "\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
      "\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\t\4\2\2\u018e\u018d"+
      "\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2"+
      "\2\u0191\u0195\3\2\2\2\u0192\u0194\t\3\2\2\u0193\u0192\3\2\2\2\u0194"+
      "\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199"+
      "\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u018a\3\2\2\2\u0199\u019a\3\2\2"+
      "\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\63\3\2\2\2M\67=B"+
      "EJPSV\\`hkntwz~\u0080\u0083\u0086\u008c\u0090\u0097\u009a\u00a0\u00a4"+
      "\u00ae\u00b4\u00b8\u00be\u00c0\u00c5\u00c9\u00cf\u00d1\u00d6\u00dc"+
      "\u00e0\u00e6\u00e8\u00ed\u00f0\u00f5\u00fb\u0101\u0105\u010b\u0110"+
      "\u0116\u011a\u011d\u0123\u0126\u012b\u0132\u0137\u013d\u0141\u0145"+
      "\u0147\u014e\u0151\u0157\u015d\u0161\u0163\u0169\u016f\u0175\u017c"+
      "\u0182\u018a\u0190\u0195\u019a";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
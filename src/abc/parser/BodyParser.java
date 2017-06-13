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
    ACCIDENTAL=10, BARLINE=11, NTHREPEAT=12, REST=13, NUMBER=14, NEWLINE=15, 
    WHITESPACE=16, CHAR=17;
  public static final int
    RULE_body = 0, RULE_bodyelement = 1, RULE_sectionelement = 2, RULE_voicepart = 3, 
    RULE_line = 4, RULE_measure = 5, RULE_measureelement = 6, RULE_tupletelement = 7, 
    RULE_note = 8, RULE_noterest = 9, RULE_pitch = 10, RULE_octave = 11, 
    RULE_notelength = 12, RULE_tuplet = 13, RULE_tupletspec = 14, RULE_chord = 15, 
    RULE_fieldvoice = 16, RULE_endofline = 17, RULE_comment = 18, RULE_text = 19;
  public static final String[] ruleNames = {
    "body", "bodyelement", "sectionelement", "voicepart", "line", "measure", 
    "measureelement", "tupletelement", "note", "noterest", "pitch", "octave", 
    "notelength", "tuplet", "tupletspec", "chord", "fieldvoice", "endofline", 
    "comment", "text"
  };

  private static final String[] _LITERAL_NAMES = {
    null, "'''", "','", "'/'", "'('", "'['", "']'", "'V:'", "'%'", null, 
    null, null, null, "'z'"
  };
  private static final String[] _SYMBOLIC_NAMES = {
    null, null, null, null, null, null, null, null, null, "BASENOTE", "ACCIDENTAL", 
    "BARLINE", "NTHREPEAT", "REST", "NUMBER", "NEWLINE", "WHITESPACE", "CHAR"
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
      setState(41); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(40);
        bodyelement();
        }
        }
        setState(43); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << NTHREPEAT) | (1L << REST) | (1L << WHITESPACE))) != 0) );
      setState(45);
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
      setState(48); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(47);
          sectionelement();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(50); 
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
    public LineContext line() {
      return getRuleContext(LineContext.class,0);
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
      setState(54);
      switch (_input.LA(1)) {
      case T__6:
        enterOuterAlt(_localctx, 1);
        {
        setState(52);
        voicepart();
        }
        break;
      case T__3:
      case T__4:
      case BASENOTE:
      case ACCIDENTAL:
      case NTHREPEAT:
      case REST:
      case WHITESPACE:
        enterOuterAlt(_localctx, 2);
        {
        setState(53);
        line();
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
    public LineContext line() {
      return getRuleContext(LineContext.class,0);
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
      setState(56);
      fieldvoice();
      setState(57);
      line();
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
    enterRule(_localctx, 8, RULE_line);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(66);
      _errHandler.sync(this);
      _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
      while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
        if ( _alt==1 ) {
          {
          {
          setState(59);
          measure();
          setState(60);
          match(BARLINE);
          setState(62);
          switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
          case 1:
            {
            setState(61);
            match(WHITESPACE);
            }
            break;
          }
          }
          } 
        }
        setState(68);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,4,_ctx);
      }
      setState(69);
      measure();
      setState(74);
      _la = _input.LA(1);
      if (_la==BARLINE) {
        {
        setState(70);
        match(BARLINE);
        setState(72);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(71);
          match(WHITESPACE);
          }
        }

        }
      }

      setState(82);
      switch (_input.LA(1)) {
      case T__7:
      case NEWLINE:
        {
        setState(77); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(76);
          endofline();
          }
          }
          setState(79); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==T__7 || _la==NEWLINE );
        }
        break;
      case EOF:
        {
        setState(81);
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
    public TerminalNode NTHREPEAT() { return getToken(BodyParser.NTHREPEAT, 0); }
    public TerminalNode WHITESPACE() { return getToken(BodyParser.WHITESPACE, 0); }
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
    enterRule(_localctx, 10, RULE_measure);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(85);
      _la = _input.LA(1);
      if (_la==NTHREPEAT) {
        {
        setState(84);
        match(NTHREPEAT);
        }
      }

      setState(88);
      _la = _input.LA(1);
      if (_la==WHITESPACE) {
        {
        setState(87);
        match(WHITESPACE);
        }
      }

      setState(91); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(90);
        measureelement();
        }
        }
        setState(93); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REST))) != 0) );
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
    public TerminalNode WHITESPACE() { return getToken(BodyParser.WHITESPACE, 0); }
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
    enterRule(_localctx, 12, RULE_measureelement);
    int _la;
    try {
      setState(100);
      switch (_input.LA(1)) {
      case T__4:
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(95);
        tupletelement();
        setState(97);
        _la = _input.LA(1);
        if (_la==WHITESPACE) {
          {
          setState(96);
          match(WHITESPACE);
          }
        }

        }
        break;
      case T__3:
        enterOuterAlt(_localctx, 2);
        {
        setState(99);
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
    enterRule(_localctx, 14, RULE_tupletelement);
    try {
      setState(110);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
      case REST:
        enterOuterAlt(_localctx, 1);
        {
        setState(102);
        note();
        setState(104);
        switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
        case 1:
          {
          setState(103);
          match(WHITESPACE);
          }
          break;
        }
        }
        break;
      case T__4:
        enterOuterAlt(_localctx, 2);
        {
        setState(106);
        chord();
        setState(108);
        switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
        case 1:
          {
          setState(107);
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
    enterRule(_localctx, 16, RULE_note);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(112);
      noterest();
      setState(113);
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
    enterRule(_localctx, 18, RULE_noterest);
    try {
      setState(117);
      switch (_input.LA(1)) {
      case BASENOTE:
      case ACCIDENTAL:
        enterOuterAlt(_localctx, 1);
        {
        setState(115);
        pitch();
        }
        break;
      case REST:
        enterOuterAlt(_localctx, 2);
        {
        setState(116);
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
    enterRule(_localctx, 20, RULE_pitch);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(120);
      _la = _input.LA(1);
      if (_la==ACCIDENTAL) {
        {
        setState(119);
        match(ACCIDENTAL);
        }
      }

      setState(122);
      match(BASENOTE);
      setState(126);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==T__0 || _la==T__1) {
        {
        {
        setState(123);
        octave();
        }
        }
        setState(128);
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
    enterRule(_localctx, 22, RULE_octave);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(129);
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
    enterRule(_localctx, 24, RULE_notelength);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(136);
      _la = _input.LA(1);
      if (_la==NUMBER) {
        {
        setState(132); 
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
          {
          setState(131);
          match(NUMBER);
          }
          }
          setState(134); 
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ( _la==NUMBER );
        }
      }

      setState(146);
      _la = _input.LA(1);
      if (_la==T__2) {
        {
        setState(138);
        match(T__2);
        setState(144);
        _la = _input.LA(1);
        if (_la==NUMBER) {
          {
          setState(140); 
          _errHandler.sync(this);
          _la = _input.LA(1);
          do {
            {
            {
            setState(139);
            match(NUMBER);
            }
            }
            setState(142); 
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
    public TerminalNode WHITESPACE() { return getToken(BodyParser.WHITESPACE, 0); }
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
    enterRule(_localctx, 26, RULE_tuplet);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(148);
      tupletspec();
      setState(150); 
      _errHandler.sync(this);
      _la = _input.LA(1);
      do {
        {
        {
        setState(149);
        tupletelement();
        }
        }
        setState(152); 
        _errHandler.sync(this);
        _la = _input.LA(1);
      } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << BASENOTE) | (1L << ACCIDENTAL) | (1L << REST))) != 0) );
      setState(154);
      match(WHITESPACE);
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
    enterRule(_localctx, 28, RULE_tupletspec);
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(156);
      match(T__3);
      setState(157);
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
    enterRule(_localctx, 30, RULE_chord);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(159);
      match(T__4);
      setState(161); 
      _errHandler.sync(this);
      _alt = 1+1;
      do {
        switch (_alt) {
        case 1+1:
          {
          {
          setState(160);
          note();
          }
          }
          break;
        default:
          throw new NoViableAltException(this);
        }
        setState(163); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,26,_ctx);
      } while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
      setState(165);
      match(T__5);
      setState(166);
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
    enterRule(_localctx, 32, RULE_fieldvoice);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(168);
      match(T__6);
      setState(170);
      _la = _input.LA(1);
      if (_la==WHITESPACE) {
        {
        setState(169);
        match(WHITESPACE);
        }
      }

      setState(172);
      text();
      setState(173);
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
    enterRule(_localctx, 34, RULE_endofline);
    try {
      setState(177);
      switch (_input.LA(1)) {
      case T__7:
        enterOuterAlt(_localctx, 1);
        {
        setState(175);
        comment();
        }
        break;
      case NEWLINE:
        enterOuterAlt(_localctx, 2);
        {
        setState(176);
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
    enterRule(_localctx, 36, RULE_comment);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
      setState(179);
      match(T__7);
      setState(183);
      _errHandler.sync(this);
      _la = _input.LA(1);
      while (_la==NUMBER || _la==CHAR) {
        {
        {
        setState(180);
        text();
        }
        }
        setState(185);
        _errHandler.sync(this);
        _la = _input.LA(1);
      }
      setState(186);
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
    enterRule(_localctx, 38, RULE_text);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
      setState(189); 
      _errHandler.sync(this);
      _alt = 1;
      do {
        switch (_alt) {
        case 1:
          {
          {
          setState(188);
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
        setState(191); 
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
    "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\u00c4\4\2\t"+
      "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
      "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
      "\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3"+
      "\2\3\2\3\3\6\3\63\n\3\r\3\16\3\64\3\4\3\4\5\49\n\4\3\5\3\5\3\5\3\6"+
      "\3\6\3\6\5\6A\n\6\7\6C\n\6\f\6\16\6F\13\6\3\6\3\6\3\6\5\6K\n\6\5\6"+
      "M\n\6\3\6\6\6P\n\6\r\6\16\6Q\3\6\5\6U\n\6\3\7\5\7X\n\7\3\7\5\7[\n"+
      "\7\3\7\6\7^\n\7\r\7\16\7_\3\b\3\b\5\bd\n\b\3\b\5\bg\n\b\3\t\3\t\5"+
      "\tk\n\t\3\t\3\t\5\to\n\t\5\tq\n\t\3\n\3\n\3\n\3\13\3\13\5\13x\n\13"+
      "\3\f\5\f{\n\f\3\f\3\f\7\f\177\n\f\f\f\16\f\u0082\13\f\3\r\3\r\3\16"+
      "\6\16\u0087\n\16\r\16\16\16\u0088\5\16\u008b\n\16\3\16\3\16\6\16\u008f"+
      "\n\16\r\16\16\16\u0090\5\16\u0093\n\16\5\16\u0095\n\16\3\17\3\17\6"+
      "\17\u0099\n\17\r\17\16\17\u009a\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
      "\6\21\u00a4\n\21\r\21\16\21\u00a5\3\21\3\21\3\21\3\22\3\22\5\22\u00ad"+
      "\n\22\3\22\3\22\3\22\3\23\3\23\5\23\u00b4\n\23\3\24\3\24\7\24\u00b8"+
      "\n\24\f\24\16\24\u00bb\13\24\3\24\3\24\3\25\6\25\u00c0\n\25\r\25\16"+
      "\25\u00c1\3\25\3\u00a5\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
      " \"$&(\2\4\3\2\3\4\4\2\20\20\23\23\u00ce\2+\3\2\2\2\4\62\3\2\2\2\6"+
      "8\3\2\2\2\b:\3\2\2\2\nD\3\2\2\2\fW\3\2\2\2\16f\3\2\2\2\20p\3\2\2\2"+
      "\22r\3\2\2\2\24w\3\2\2\2\26z\3\2\2\2\30\u0083\3\2\2\2\32\u008a\3\2"+
      "\2\2\34\u0096\3\2\2\2\36\u009e\3\2\2\2 \u00a1\3\2\2\2\"\u00aa\3\2"+
      "\2\2$\u00b3\3\2\2\2&\u00b5\3\2\2\2(\u00bf\3\2\2\2*,\5\4\3\2+*\3\2"+
      "\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\2\2\3\60\3\3\2"+
      "\2\2\61\63\5\6\4\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65"+
      "\3\2\2\2\65\5\3\2\2\2\669\5\b\5\2\679\5\n\6\28\66\3\2\2\28\67\3\2"+
      "\2\29\7\3\2\2\2:;\5\"\22\2;<\5\n\6\2<\t\3\2\2\2=>\5\f\7\2>@\7\r\2"+
      "\2?A\7\22\2\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2B=\3\2\2\2CF\3\2\2\2DB"+
      "\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GL\5\f\7\2HJ\7\r\2\2IK\7\22"+
      "\2\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LH\3\2\2\2LM\3\2\2\2MT\3\2\2\2N"+
      "P\5$\23\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2\2\2SU\7\2"+
      "\2\3TO\3\2\2\2TS\3\2\2\2U\13\3\2\2\2VX\7\16\2\2WV\3\2\2\2WX\3\2\2"+
      "\2XZ\3\2\2\2Y[\7\22\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\16\b\2"+
      "]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2ac\5\20\t\2bd"+
      "\7\22\2\2cb\3\2\2\2cd\3\2\2\2dg\3\2\2\2eg\5\34\17\2fa\3\2\2\2fe\3"+
      "\2\2\2g\17\3\2\2\2hj\5\22\n\2ik\7\22\2\2ji\3\2\2\2jk\3\2\2\2kq\3\2"+
      "\2\2ln\5 \21\2mo\7\22\2\2nm\3\2\2\2no\3\2\2\2oq\3\2\2\2ph\3\2\2\2"+
      "pl\3\2\2\2q\21\3\2\2\2rs\5\24\13\2st\5\32\16\2t\23\3\2\2\2ux\5\26"+
      "\f\2vx\7\17\2\2wu\3\2\2\2wv\3\2\2\2x\25\3\2\2\2y{\7\f\2\2zy\3\2\2"+
      "\2z{\3\2\2\2{|\3\2\2\2|\u0080\7\13\2\2}\177\5\30\r\2~}\3\2\2\2\177"+
      "\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\27\3\2\2\2"+
      "\u0082\u0080\3\2\2\2\u0083\u0084\t\2\2\2\u0084\31\3\2\2\2\u0085\u0087"+
      "\7\20\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
      "\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008a"+
      "\u008b\3\2\2\2\u008b\u0094\3\2\2\2\u008c\u0092\7\5\2\2\u008d\u008f"+
      "\7\20\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2"+
      "\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0092"+
      "\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u0095"+
      "\3\2\2\2\u0095\33\3\2\2\2\u0096\u0098\5\36\20\2\u0097\u0099\5\20\t"+
      "\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
      "\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\22\2\2\u009d\35\3"+
      "\2\2\2\u009e\u009f\7\6\2\2\u009f\u00a0\7\20\2\2\u00a0\37\3\2\2\2\u00a1"+
      "\u00a3\7\7\2\2\u00a2\u00a4\5\22\n\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5"+
      "\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\3\2\2"+
      "\2\u00a7\u00a8\7\b\2\2\u00a8\u00a9\5\32\16\2\u00a9!\3\2\2\2\u00aa"+
      "\u00ac\7\t\2\2\u00ab\u00ad\7\22\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad"+
      "\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5(\25\2\u00af\u00b0\5$\23"+
      "\2\u00b0#\3\2\2\2\u00b1\u00b4\5&\24\2\u00b2\u00b4\7\21\2\2\u00b3\u00b1"+
      "\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4%\3\2\2\2\u00b5\u00b9\7\n\2\2\u00b6"+
      "\u00b8\5(\25\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
      "\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2"+
      "\2\u00bc\u00bd\7\21\2\2\u00bd\'\3\2\2\2\u00be\u00c0\t\3\2\2\u00bf"+
      "\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2"+
      "\3\2\2\2\u00c2)\3\2\2\2!-\648@DJLQTWZ_cfjnpwz\u0080\u0088\u008a\u0090"+
      "\u0092\u0094\u009a\u00a5\u00ac\u00b3\u00b9\u00c1";
  public static final ATN _ATN =
    new ATNDeserializer().deserialize(_serializedATN.toCharArray());
  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
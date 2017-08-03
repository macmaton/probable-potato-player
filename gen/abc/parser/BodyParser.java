// Generated from /home/margaret/workspace/abcplayer/src/abc/parser/Body.g4 by ANTLR 4.7
package abc.parser;

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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		RULE_voicepartelement = 4, RULE_repeatstart = 5, RULE_repeatendnoendings = 6, 
		RULE_repeatend = 7, RULE_repeatfull = 8, RULE_repeatendingline = 9, RULE_repeatending = 10, 
		RULE_line = 11, RULE_measure = 12, RULE_measureelement = 13, RULE_tupletelement = 14, 
		RULE_note = 15, RULE_noterest = 16, RULE_pitch = 17, RULE_octave = 18, 
		RULE_notelength = 19, RULE_tuplet = 20, RULE_chord = 21, RULE_fieldvoice = 22, 
		RULE_endofline = 23, RULE_comment = 24, RULE_text = 25;
	public static final String[] ruleNames = {
		"body", "section", "sectionelement", "voicepart", "voicepartelement", 
		"repeatstart", "repeatendnoendings", "repeatend", "repeatfull", "repeatendingline", 
		"repeatending", "line", "measure", "measureelement", "tupletelement", 
		"note", "noterest", "pitch", "octave", "notelength", "tuplet", "chord", 
		"fieldvoice", "endofline", "comment", "text"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "','", "'/'", "'['", "']'", "'V:'", "'%'", null, null, null, 
		null, null, "'|:'", "':|'", null, null, null, "'z'"
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
		public List<TerminalNode> SECTIONENDBAR() { return getTokens(BodyParser.SECTIONENDBAR); }
		public TerminalNode SECTIONENDBAR(int i) {
			return getToken(BodyParser.SECTIONENDBAR, i);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
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
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECTIONENDBAR) {
					{
					setState(68);
					match(SECTIONENDBAR);
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
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case NEWLINE:
				case BARLINE:
					{
					setState(78); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(77);
							endofline();
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
					setState(83);
					_errHandler.sync(this);
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
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << NEWLINE) | (1L << BARLINE))) != 0) );
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(106); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(99);
						voicepart();
						setState(100);
						match(SECTIONENDBAR);
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
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << NEWLINE) | (1L << BARLINE))) != 0) );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(108); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(110);
				voicepart();
				setState(111);
				match(SECTIONENDBAR);
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
				case NEWLINE:
				case BARLINE:
					{
					setState(113); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(112);
							endofline();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(115); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(117);
						match(EOF);
						}
						break;
					}
					}
					break;
				case EOF:
					{
					setState(120);
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
				setState(135); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(123);
						voicepart();
						setState(133);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__6:
						case NEWLINE:
						case BARLINE:
							{
							setState(125); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(124);
									endofline();
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(127); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							setState(130);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
							case 1:
								{
								setState(129);
								match(EOF);
								}
								break;
							}
							}
							break;
						case EOF:
							{
							setState(132);
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
					setState(137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BARLINE) {
				{
				setState(141);
				match(BARLINE);
				}
			}

			{
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SECTIONBEGINBAR) {
				{
				setState(144);
				match(SECTIONBEGINBAR);
				}
			}

			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					voicepartelement();
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(148);
						endofline();
						}
						}
						setState(151); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << NEWLINE) | (1L << BARLINE))) != 0) );
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(158);
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
			setState(160);
			fieldvoice();
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(161);
				match(WHITESPACE);
				}
				break;
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SECTIONBEGINBAR) {
				{
				setState(164);
				match(SECTIONBEGINBAR);
				}
			}

			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					voicepartelement();
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(168);
						endofline();
						}
						}
						setState(171); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << NEWLINE) | (1L << BARLINE))) != 0) );
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(178);
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
		public RepeatendnoendingsContext repeatendnoendings() {
			return getRuleContext(RepeatendnoendingsContext.class,0);
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
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				repeatfull();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				repeatendnoendings();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				repeatendingline();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				repeatstart();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				repeatend();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
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
			setState(188);
			match(REPEATBEGINBAR);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					measure();
					setState(190);
					match(BARLINE);
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(191);
						match(WHITESPACE);
						}
						break;
					}
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(199);
			measure();
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(200);
				match(BARLINE);
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(201);
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

	public static class RepeatendnoendingsContext extends ParserRuleContext {
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
		public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(BodyParser.WHITESPACE, i);
		}
		public RepeatendnoendingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatendnoendings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BodyListener ) ((BodyListener)listener).enterRepeatendnoendings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BodyListener ) ((BodyListener)listener).exitRepeatendnoendings(this);
		}
	}

	public final RepeatendnoendingsContext repeatendnoendings() throws RecognitionException {
		RepeatendnoendingsContext _localctx = new RepeatendnoendingsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeatendnoendings);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					measure();
					setState(207);
					match(BARLINE);
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						setState(208);
						match(WHITESPACE);
						}
						break;
					}
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(216);
			measure();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BARLINE) {
				{
				setState(217);
				match(BARLINE);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(218);
					match(WHITESPACE);
					}
				}

				}
			}

			setState(223);
			match(REPEATENDBAR);
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
		enterRule(_localctx, 14, RULE_repeatend);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					measure();
					setState(226);
					match(BARLINE);
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(227);
						match(WHITESPACE);
						}
						break;
					}
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(235);
			measure();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BARLINE) {
				{
				setState(236);
				match(BARLINE);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(237);
					match(WHITESPACE);
					}
				}

				}
			}

			setState(243); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(242);
					repeatending();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(245); 
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
		enterRule(_localctx, 16, RULE_repeatfull);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(REPEATBEGINBAR);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					measure();
					setState(249);
					match(BARLINE);
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						setState(250);
						match(WHITESPACE);
						}
						break;
					}
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(258);
			measure();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BARLINE) {
				{
				setState(259);
				match(BARLINE);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(260);
					match(WHITESPACE);
					}
				}

				}
			}

			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NTHREPEAT:
				{
				setState(266); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(265);
						repeatending();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(268); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case REPEATENDBAR:
				{
				setState(270);
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
		enterRule(_localctx, 18, RULE_repeatendingline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(273);
					repeatending();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(276); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(BodyParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(BodyParser.WHITESPACE, i);
		}
		public List<TerminalNode> BARLINE() { return getTokens(BodyParser.BARLINE); }
		public TerminalNode BARLINE(int i) {
			return getToken(BodyParser.BARLINE, i);
		}
		public TerminalNode REPEATENDBAR() { return getToken(BodyParser.REPEATENDBAR, 0); }
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
		enterRule(_localctx, 20, RULE_repeatending);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(NTHREPEAT);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					match(WHITESPACE);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					measure();
					setState(286);
					match(BARLINE);
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
					case 1:
						{
						setState(287);
						match(WHITESPACE);
						}
						break;
					}
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			{
			setState(295);
			measure();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPEATENDBAR) {
				{
				setState(296);
				match(REPEATENDBAR);
				}
			}

			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(299);
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
		enterRule(_localctx, 22, RULE_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(302);
					match(WHITESPACE);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(313); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(308);
						measure();
						setState(309);
						match(BARLINE);
						setState(311);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(310);
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
					setState(315); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(317);
					measure();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(320);
				measure();
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(321);
						match(WHITESPACE);
						}
						} 
					}
					setState(326);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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
		enterRule(_localctx, 24, RULE_measure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(329);
				match(WHITESPACE);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(335);
					measureelement();
					setState(339);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(336);
							match(WHITESPACE);
							}
							} 
						}
						setState(341);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(344); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		enterRule(_localctx, 26, RULE_measureelement);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TUPLETSPEC:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(346);
				tuplet();
				setState(347);
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
				setState(349);
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
		enterRule(_localctx, 28, RULE_tupletelement);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASENOTE:
			case ACCIDENTAL:
			case REST:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				note();
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(353);
					match(WHITESPACE);
					}
					break;
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				chord();
				setState(358);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(357);
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
		enterRule(_localctx, 30, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			noterest();
			setState(363);
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
		enterRule(_localctx, 32, RULE_noterest);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASENOTE:
			case ACCIDENTAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
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
		enterRule(_localctx, 34, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(369);
				match(ACCIDENTAL);
				}
			}

			setState(372);
			match(BASENOTE);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(373);
				octave();
				}
				}
				setState(378);
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
		enterRule(_localctx, 36, RULE_octave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 38, RULE_notelength);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(381);
				match(NUMBER);
				}
			}

			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(384);
				match(T__2);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER) {
					{
					setState(385);
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
		enterRule(_localctx, 40, RULE_tuplet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(TUPLETSPEC);
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(391);
				tupletelement();
				}
				}
				setState(394); 
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
		enterRule(_localctx, 42, RULE_chord);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__3);
			setState(398); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(397);
					note();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(400); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(402);
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
		enterRule(_localctx, 44, RULE_fieldvoice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__5);
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(405);
				match(WHITESPACE);
				}
				break;
			}
			setState(408);
			text();
			setState(409);
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
		public TerminalNode BARLINE() { return getToken(BodyParser.BARLINE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BARLINE) {
				{
				setState(411);
				match(BARLINE);
				}
			}

			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(414);
				comment();
				}
				break;
			case NEWLINE:
				{
				setState(415);
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
		enterRule(_localctx, 48, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(T__6);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASENOTE) | (1L << NUMBER) | (1L << WHITESPACE) | (1L << CHAR))) != 0)) {
				{
				{
				setState(419);
				text();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
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
		enterRule(_localctx, 50, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==BASENOTE || _la==WHITESPACE) {
						{
						{
						setState(427);
						_la = _input.LA(1);
						if ( !(_la==BASENOTE || _la==WHITESPACE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(432);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(434); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(433);
							_la = _input.LA(1);
							if ( !(_la==NUMBER || _la==CHAR) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(436); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(441);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(438);
							_la = _input.LA(1);
							if ( !(_la==BASENOTE || _la==WHITESPACE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							} 
						}
						setState(443);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(446); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u01c3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\6\2>\n\2\r\2\16\2"+
		"?\3\3\6\3C\n\3\r\3\16\3D\3\3\5\3H\n\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3"+
		"\6\3Q\n\3\r\3\16\3R\3\3\5\3V\n\3\3\3\5\3Y\n\3\3\3\3\3\6\3]\n\3\r\3\16"+
		"\3^\7\3a\n\3\f\3\16\3d\13\3\3\3\3\3\3\3\6\3i\n\3\r\3\16\3j\6\3m\n\3\r"+
		"\3\16\3n\3\3\3\3\3\3\6\3t\n\3\r\3\16\3u\3\3\5\3y\n\3\3\3\5\3|\n\3\3\3"+
		"\3\3\6\3\u0080\n\3\r\3\16\3\u0081\3\3\5\3\u0085\n\3\3\3\5\3\u0088\n\3"+
		"\6\3\u008a\n\3\r\3\16\3\u008b\5\3\u008e\n\3\3\4\5\4\u0091\n\4\3\4\5\4"+
		"\u0094\n\4\3\4\3\4\6\4\u0098\n\4\r\4\16\4\u0099\7\4\u009c\n\4\f\4\16\4"+
		"\u009f\13\4\3\4\3\4\3\5\3\5\5\5\u00a5\n\5\3\5\5\5\u00a8\n\5\3\5\3\5\6"+
		"\5\u00ac\n\5\r\5\16\5\u00ad\7\5\u00b0\n\5\f\5\16\5\u00b3\13\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00bd\n\6\3\7\3\7\3\7\3\7\5\7\u00c3\n\7\7"+
		"\7\u00c5\n\7\f\7\16\7\u00c8\13\7\3\7\3\7\3\7\5\7\u00cd\n\7\5\7\u00cf\n"+
		"\7\3\b\3\b\3\b\5\b\u00d4\n\b\7\b\u00d6\n\b\f\b\16\b\u00d9\13\b\3\b\3\b"+
		"\3\b\5\b\u00de\n\b\5\b\u00e0\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u00e7\n\t\7\t"+
		"\u00e9\n\t\f\t\16\t\u00ec\13\t\3\t\3\t\3\t\5\t\u00f1\n\t\5\t\u00f3\n\t"+
		"\3\t\6\t\u00f6\n\t\r\t\16\t\u00f7\3\n\3\n\3\n\3\n\5\n\u00fe\n\n\7\n\u0100"+
		"\n\n\f\n\16\n\u0103\13\n\3\n\3\n\3\n\5\n\u0108\n\n\5\n\u010a\n\n\3\n\6"+
		"\n\u010d\n\n\r\n\16\n\u010e\3\n\5\n\u0112\n\n\3\13\6\13\u0115\n\13\r\13"+
		"\16\13\u0116\3\f\3\f\7\f\u011b\n\f\f\f\16\f\u011e\13\f\3\f\3\f\3\f\5\f"+
		"\u0123\n\f\7\f\u0125\n\f\f\f\16\f\u0128\13\f\3\f\3\f\5\f\u012c\n\f\3\f"+
		"\5\f\u012f\n\f\3\r\7\r\u0132\n\r\f\r\16\r\u0135\13\r\3\r\3\r\3\r\5\r\u013a"+
		"\n\r\6\r\u013c\n\r\r\r\16\r\u013d\3\r\5\r\u0141\n\r\3\r\3\r\7\r\u0145"+
		"\n\r\f\r\16\r\u0148\13\r\5\r\u014a\n\r\3\16\7\16\u014d\n\16\f\16\16\16"+
		"\u0150\13\16\3\16\3\16\7\16\u0154\n\16\f\16\16\16\u0157\13\16\6\16\u0159"+
		"\n\16\r\16\16\16\u015a\3\17\3\17\3\17\3\17\5\17\u0161\n\17\3\20\3\20\5"+
		"\20\u0165\n\20\3\20\3\20\5\20\u0169\n\20\5\20\u016b\n\20\3\21\3\21\3\21"+
		"\3\22\3\22\5\22\u0172\n\22\3\23\5\23\u0175\n\23\3\23\3\23\7\23\u0179\n"+
		"\23\f\23\16\23\u017c\13\23\3\24\3\24\3\25\5\25\u0181\n\25\3\25\3\25\5"+
		"\25\u0185\n\25\5\25\u0187\n\25\3\26\3\26\6\26\u018b\n\26\r\26\16\26\u018c"+
		"\3\27\3\27\6\27\u0191\n\27\r\27\16\27\u0192\3\27\3\27\3\30\3\30\5\30\u0199"+
		"\n\30\3\30\3\30\3\30\3\31\5\31\u019f\n\31\3\31\3\31\5\31\u01a3\n\31\3"+
		"\32\3\32\7\32\u01a7\n\32\f\32\16\32\u01aa\13\32\3\32\3\32\3\33\7\33\u01af"+
		"\n\33\f\33\16\33\u01b2\13\33\3\33\6\33\u01b5\n\33\r\33\16\33\u01b6\3\33"+
		"\7\33\u01ba\n\33\f\33\16\33\u01bd\13\33\6\33\u01bf\n\33\r\33\16\33\u01c0"+
		"\3\33\3\u0192\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\2\5\3\2\3\4\4\2\f\f\26\26\4\2\25\25\27\27\2\u0200\29\3\2\2\2\4"+
		"\u008d\3\2\2\2\6\u0090\3\2\2\2\b\u00a2\3\2\2\2\n\u00bc\3\2\2\2\f\u00be"+
		"\3\2\2\2\16\u00d7\3\2\2\2\20\u00ea\3\2\2\2\22\u00f9\3\2\2\2\24\u0114\3"+
		"\2\2\2\26\u0118\3\2\2\2\30\u0133\3\2\2\2\32\u014e\3\2\2\2\34\u0160\3\2"+
		"\2\2\36\u016a\3\2\2\2 \u016c\3\2\2\2\"\u0171\3\2\2\2$\u0174\3\2\2\2&\u017d"+
		"\3\2\2\2(\u0180\3\2\2\2*\u0188\3\2\2\2,\u018e\3\2\2\2.\u0196\3\2\2\2\60"+
		"\u019e\3\2\2\2\62\u01a4\3\2\2\2\64\u01be\3\2\2\2\668\7\n\2\2\67\66\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<>\5\4\3\2=<\3"+
		"\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2AC\5\6\4\2BA\3\2\2\2CD"+
		"\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FH\7\23\2\2GF\3\2\2\2GH\3\2\2\2"+
		"HL\3\2\2\2IK\7\26\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MX\3\2\2"+
		"\2NL\3\2\2\2OQ\5\60\31\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2"+
		"\2\2TV\7\2\2\3UT\3\2\2\2UV\3\2\2\2VY\3\2\2\2WY\7\2\2\3XP\3\2\2\2XW\3\2"+
		"\2\2Y\u008e\3\2\2\2Z\\\5\b\5\2[]\5\60\31\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2"+
		"\2\2^_\3\2\2\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cl\3\2"+
		"\2\2db\3\2\2\2ef\5\b\5\2fh\7\23\2\2gi\5\60\31\2hg\3\2\2\2ij\3\2\2\2jh"+
		"\3\2\2\2jk\3\2\2\2km\3\2\2\2le\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o"+
		"p\3\2\2\2pq\5\b\5\2q{\7\23\2\2rt\5\60\31\2sr\3\2\2\2tu\3\2\2\2us\3\2\2"+
		"\2uv\3\2\2\2vx\3\2\2\2wy\7\2\2\3xw\3\2\2\2xy\3\2\2\2y|\3\2\2\2z|\7\2\2"+
		"\3{s\3\2\2\2{z\3\2\2\2|\u008e\3\2\2\2}\u0087\5\b\5\2~\u0080\5\60\31\2"+
		"\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0084\3\2\2\2\u0083\u0085\7\2\2\3\u0084\u0083\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0088\7\2\2\3\u0087\177\3\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u008a\3\2\2\2\u0089}\3\2\2\2\u008a\u008b\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008dB\3"+
		"\2\2\2\u008db\3\2\2\2\u008d\u0089\3\2\2\2\u008e\5\3\2\2\2\u008f\u0091"+
		"\7\16\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2"+
		"\u0092\u0094\7\22\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009d"+
		"\3\2\2\2\u0095\u0097\5\n\6\2\u0096\u0098\5\60\31\2\u0097\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0095\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\5\n"+
		"\6\2\u00a1\7\3\2\2\2\u00a2\u00a4\5.\30\2\u00a3\u00a5\7\26\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a8\7\22\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b1\3\2\2\2\u00a9\u00ab"+
		"\5\n\6\2\u00aa\u00ac\5\60\31\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a9"+
		"\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\5\n\6\2\u00b5\t\3\2\2\2"+
		"\u00b6\u00bd\5\22\n\2\u00b7\u00bd\5\16\b\2\u00b8\u00bd\5\24\13\2\u00b9"+
		"\u00bd\5\f\7\2\u00ba\u00bd\5\20\t\2\u00bb\u00bd\5\30\r\2\u00bc\u00b6\3"+
		"\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\13\3\2\2\2\u00be\u00c6\7\17\2"+
		"\2\u00bf\u00c0\5\32\16\2\u00c0\u00c2\7\16\2\2\u00c1\u00c3\7\26\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00bf\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\5\32\16\2\u00ca\u00cc\7"+
		"\16\2\2\u00cb\u00cd\7\26\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\r\3\2\2\2"+
		"\u00d0\u00d1\5\32\16\2\u00d1\u00d3\7\16\2\2\u00d2\u00d4\7\26\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d0\3\2"+
		"\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00df\5\32\16\2\u00db\u00dd\7"+
		"\16\2\2\u00dc\u00de\7\26\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\7\20\2\2\u00e2\17\3\2\2\2\u00e3\u00e4\5\32\16\2\u00e4"+
		"\u00e6\7\16\2\2\u00e5\u00e7\7\26\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3"+
		"\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00f2\5\32\16\2\u00ee\u00f0\7\16\2\2\u00ef\u00f1\7\26\2\2\u00f0"+
		"\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00ee\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f6\5\26\f\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\21\3\2\2\2\u00f9\u0101\7\17\2\2\u00fa\u00fb\5\32\16\2\u00fb"+
		"\u00fd\7\16\2\2\u00fc\u00fe\7\26\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3"+
		"\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0109\5\32\16\2\u0105\u0107\7\16\2\2\u0106\u0108\7\26\2\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0105\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u0111\3\2\2\2\u010b\u010d\5\26\f\2\u010c"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0112\3\2\2\2\u0110\u0112\7\20\2\2\u0111\u010c\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\23\3\2\2\2\u0113\u0115\5\26\f\2\u0114\u0113\3\2\2"+
		"\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\25"+
		"\3\2\2\2\u0118\u011c\7\21\2\2\u0119\u011b\7\26\2\2\u011a\u0119\3\2\2\2"+
		"\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0126"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\5\32\16\2\u0120\u0122\7\16\2"+
		"\2\u0121\u0123\7\26\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u011f\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012b\5\32\16\2\u012a\u012c\7\20\2\2\u012b\u012a\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\7\26\2\2\u012e\u012d\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\27\3\2\2\2\u0130\u0132\7\26\2\2\u0131\u0130"+
		"\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0149\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5\32\16\2\u0137\u0139\7"+
		"\16\2\2\u0138\u013a\7\26\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0136\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0141\5\32\16\2\u0140"+
		"\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u014a\3\2\2\2\u0142\u0146\5\32"+
		"\16\2\u0143\u0145\7\26\2\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0149\u013b\3\2\2\2\u0149\u0142\3\2\2\2\u014a\31\3\2\2\2\u014b\u014d"+
		"\7\26\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0158\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0155"+
		"\5\34\17\2\u0152\u0154\7\26\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2"+
		"\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u0151\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\33\3\2\2\2\u015c\u015d\5*\26\2\u015d\u015e\7\26\2"+
		"\2\u015e\u0161\3\2\2\2\u015f\u0161\5\36\20\2\u0160\u015c\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161\35\3\2\2\2\u0162\u0164\5 \21\2\u0163\u0165\7\26\2"+
		"\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u016b\3\2\2\2\u0166\u0168"+
		"\5,\27\2\u0167\u0169\7\26\2\2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2"+
		"\u0169\u016b\3\2\2\2\u016a\u0162\3\2\2\2\u016a\u0166\3\2\2\2\u016b\37"+
		"\3\2\2\2\u016c\u016d\5\"\22\2\u016d\u016e\5(\25\2\u016e!\3\2\2\2\u016f"+
		"\u0172\5$\23\2\u0170\u0172\7\24\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3"+
		"\2\2\2\u0172#\3\2\2\2\u0173\u0175\7\r\2\2\u0174\u0173\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017a\7\f\2\2\u0177\u0179\5&\24\2\u0178"+
		"\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2"+
		"\2\2\u017b%\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\t\2\2\2\u017e\'\3"+
		"\2\2\2\u017f\u0181\7\25\2\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0186\3\2\2\2\u0182\u0184\7\5\2\2\u0183\u0185\7\25\2\2\u0184\u0183\3"+
		"\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0182\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187)\3\2\2\2\u0188\u018a\7\13\2\2\u0189\u018b\5\36\20"+
		"\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d+\3\2\2\2\u018e\u0190\7\6\2\2\u018f\u0191\5 \21\2\u0190"+
		"\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0192\u0190\3\2"+
		"\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\7\2\2\u0195-\3\2\2\2\u0196\u0198"+
		"\7\b\2\2\u0197\u0199\7\26\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2"+
		"\u0199\u019a\3\2\2\2\u019a\u019b\5\64\33\2\u019b\u019c\5\60\31\2\u019c"+
		"/\3\2\2\2\u019d\u019f\7\16\2\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2"+
		"\u019f\u01a2\3\2\2\2\u01a0\u01a3\5\62\32\2\u01a1\u01a3\7\n\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\61\3\2\2\2\u01a4\u01a8\7\t\2\2\u01a5"+
		"\u01a7\5\64\33\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3"+
		"\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ac\7\n\2\2\u01ac\63\3\2\2\2\u01ad\u01af\t\3\2\2\u01ae\u01ad\3\2\2"+
		"\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b5\t\4\2\2\u01b4\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bb\3\2"+
		"\2\2\u01b8\u01ba\t\3\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01be\u01b0\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\65\3\2\2\2U9?DGLRUX^bjnux{\u0081\u0084\u0087\u008b"+
		"\u008d\u0090\u0093\u0099\u009d\u00a4\u00a7\u00ad\u00b1\u00bc\u00c2\u00c6"+
		"\u00cc\u00ce\u00d3\u00d7\u00dd\u00df\u00e6\u00ea\u00f0\u00f2\u00f7\u00fd"+
		"\u0101\u0107\u0109\u010e\u0111\u0116\u011c\u0122\u0126\u012b\u012e\u0133"+
		"\u0139\u013d\u0140\u0146\u0149\u014e\u0155\u015a\u0160\u0164\u0168\u016a"+
		"\u0171\u0174\u017a\u0180\u0184\u0186\u018c\u0192\u0198\u019e\u01a2\u01a8"+
		"\u01b0\u01b6\u01bb\u01c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
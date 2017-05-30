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
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16,
            T__16 = 17, T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, ACCIDENTAL = 23,
            BARLINE = 24, NTHREPEAT = 25, REST = 26, DIGIT = 27, NEWLINE = 28, WHITESPACE = 29,
            CHAR = 30;
    public static final int
            RULE_body = 0, RULE_line = 1, RULE_element = 2, RULE_noteelement = 3,
            RULE_note = 4, RULE_noterest = 5, RULE_pitch = 6, RULE_octave = 7, RULE_notelength = 8,
            RULE_notelengthstrict = 9, RULE_basenote = 10, RULE_tupletelement = 11,
            RULE_tupletspec = 12, RULE_multinote = 13, RULE_midtunefield = 14, RULE_fieldvoice = 15,
            RULE_endofline = 16, RULE_comment = 17, RULE_text = 18;
    public static final String[] ruleNames = {
            "body", "line", "element", "noteelement", "note", "noterest", "pitch",
            "octave", "notelength", "notelengthstrict", "basenote", "tupletelement",
            "tupletspec", "multinote", "midtunefield", "fieldvoice", "endofline",
            "comment", "text"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u00a5\4\2\t\2" +
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                    "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4" +
                    "\22\t\22\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\7\3/\n\3\f" +
                    "\3\16\3\62\13\3\3\3\3\3\3\3\5\3\67\n\3\3\4\3\4\5\4;\n\4\3\4\3\4\3" +
                    "\4\3\4\3\4\5\4B\n\4\3\4\3\4\5\4F\n\4\5\4H\n\4\3\5\3\5\5\5L\n\5\3\6" +
                    "\3\6\3\6\3\7\3\7\5\7S\n\7\3\b\5\bV\n\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3" +
                    "\n\6\n_\n\n\r\n\16\n`\5\nc\n\n\3\n\3\n\6\ng\n\n\r\n\16\nh\5\nk\n\n" +
                    "\5\nm\n\n\3\13\6\13p\n\13\r\13\16\13q\3\13\3\13\6\13v\n\13\r\13\16" +
                    "\13w\3\f\3\f\3\r\3\r\6\r~\n\r\r\r\16\r\177\3\16\3\16\3\16\3\17\3\17" +
                    "\6\17\u0087\n\17\r\17\16\17\u0088\3\17\3\17\3\20\3\20\3\21\3\21\3" +
                    "\21\3\21\3\22\3\22\5\22\u0095\n\22\3\23\3\23\7\23\u0099\n\23\f\23" +
                    "\16\23\u009c\13\23\3\23\3\23\3\24\6\24\u00a1\n\24\r\24\16\24\u00a2" +
                    "\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\3" +
                    "\4\3\2\6\23\u00ab\2)\3\2\2\2\4\66\3\2\2\2\6G\3\2\2\2\bK\3\2\2\2\n" +
                    "M\3\2\2\2\fR\3\2\2\2\16U\3\2\2\2\20[\3\2\2\2\22b\3\2\2\2\24o\3\2\2" +
                    "\2\26y\3\2\2\2\30{\3\2\2\2\32\u0081\3\2\2\2\34\u0084\3\2\2\2\36\u008c" +
                    "\3\2\2\2 \u008e\3\2\2\2\"\u0094\3\2\2\2$\u0096\3\2\2\2&\u00a0\3\2" +
                    "\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2" +
                    "-/\5\6\4\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3" +
                    "\2\2\2\62\60\3\2\2\2\63\67\5\"\22\2\64\67\5\36\20\2\65\67\5$\23\2" +
                    "\66\60\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2\28:\5\b\5\2" +
                    "9;\7\37\2\2:9\3\2\2\2:;\3\2\2\2;H\3\2\2\2<=\5\30\r\2=>\7\37\2\2>H" +
                    "\3\2\2\2?A\7\32\2\2@B\7\37\2\2A@\3\2\2\2AB\3\2\2\2BH\3\2\2\2CE\7\33" +
                    "\2\2DF\7\37\2\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2G8\3\2\2\2G<\3\2\2\2" +
                    "G?\3\2\2\2GC\3\2\2\2H\7\3\2\2\2IL\5\n\6\2JL\5\34\17\2KI\3\2\2\2KJ" +
                    "\3\2\2\2L\t\3\2\2\2MN\5\f\7\2NO\5\22\n\2O\13\3\2\2\2PS\5\16\b\2QS" +
                    "\7\34\2\2RP\3\2\2\2RQ\3\2\2\2S\r\3\2\2\2TV\7\31\2\2UT\3\2\2\2UV\3" +
                    "\2\2\2VW\3\2\2\2WY\5\26\f\2XZ\5\20\t\2YX\3\2\2\2YZ\3\2\2\2Z\17\3\2" +
                    "\2\2[\\\t\2\2\2\\\21\3\2\2\2]_\7\35\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2" +
                    "\2\2`a\3\2\2\2ac\3\2\2\2b^\3\2\2\2bc\3\2\2\2cl\3\2\2\2dj\7\5\2\2e" +
                    "g\7\35\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jf\3\2" +
                    "\2\2jk\3\2\2\2km\3\2\2\2ld\3\2\2\2lm\3\2\2\2m\23\3\2\2\2np\7\35\2" +
                    "\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\7\5\2\2tv\7" +
                    "\35\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\25\3\2\2\2yz\t\3" +
                    "\2\2z\27\3\2\2\2{}\5\32\16\2|~\5\b\5\2}|\3\2\2\2~\177\3\2\2\2\177" +
                    "}\3\2\2\2\177\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\u0082\7\24\2\2" +
                    "\u0082\u0083\7\35\2\2\u0083\33\3\2\2\2\u0084\u0086\7\25\2\2\u0085" +
                    "\u0087\5\n\6\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086" +
                    "\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\26" +
                    "\2\2\u008b\35\3\2\2\2\u008c\u008d\5 \21\2\u008d\37\3\2\2\2\u008e\u008f" +
                    "\7\27\2\2\u008f\u0090\5&\24\2\u0090\u0091\5\"\22\2\u0091!\3\2\2\2" +
                    "\u0092\u0095\5$\23\2\u0093\u0095\7\36\2\2\u0094\u0092\3\2\2\2\u0094" +
                    "\u0093\3\2\2\2\u0095#\3\2\2\2\u0096\u009a\7\30\2\2\u0097\u0099\5&" +
                    "\24\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2" +
                    "\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d" +
                    "\u009e\7\36\2\2\u009e%\3\2\2\2\u009f\u00a1\7 \2\2\u00a0\u009f\3\2" +
                    "\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3" +
                    "\'\3\2\2\2\31+\60\66:AEGKRUY`bhjlqw\177\u0088\u0094\u009a\u00a2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'''", "','", "'/'", "'A'", "'B'", "'C'", "'D'", "'E'", "'F'",
            "'G'", "'a'", "'b'", "'c'", "'d'", "'e'", "'f'", "'g'", "'('", "'['",
            "']'", "'V:'", "'%'", null, null, null, "'z'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, "ACCIDENTAL",
            "BARLINE", "NTHREPEAT", "REST", "DIGIT", "NEWLINE", "WHITESPACE", "CHAR"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public BodyParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String getGrammarFileName() {
        return "Body.g4";
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

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

    public final BodyContext body() throws RecognitionException {
        BodyContext _localctx = new BodyContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_body);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(39);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(38);
                            line();
                        }
                    }
                    setState(41);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << REST) | (1L << NEWLINE))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LineContext line() throws RecognitionException {
        LineContext _localctx = new LineContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_line);
        int _la;
        try {
            setState(52);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(46);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << ACCIDENTAL) | (1L << BARLINE) | (1L << NTHREPEAT) | (1L << REST))) != 0)) {
                        {
                            {
                                setState(43);
                                element();
                            }
                        }
                        setState(48);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(49);
                    endofline();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(50);
                    midtunefield();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(51);
                    comment();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ElementContext element() throws RecognitionException {
        ElementContext _localctx = new ElementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_element);
        int _la;
        try {
            setState(69);
            switch (_input.LA(1)) {
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                case T__7:
                case T__8:
                case T__9:
                case T__10:
                case T__11:
                case T__12:
                case T__13:
                case T__14:
                case T__15:
                case T__16:
                case T__18:
                case ACCIDENTAL:
                case REST:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(54);
                    noteelement();
                    setState(56);
                    _la = _input.LA(1);
                    if (_la == WHITESPACE) {
                        {
                            setState(55);
                            match(WHITESPACE);
                        }
                    }

                }
                break;
                case T__17:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(58);
                    tupletelement();
                    setState(59);
                    match(WHITESPACE);
                }
                break;
                case BARLINE:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(61);
                    match(BARLINE);
                    setState(63);
                    _la = _input.LA(1);
                    if (_la == WHITESPACE) {
                        {
                            setState(62);
                            match(WHITESPACE);
                        }
                    }

                }
                break;
                case NTHREPEAT:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(65);
                    match(NTHREPEAT);
                    setState(67);
                    _la = _input.LA(1);
                    if (_la == WHITESPACE) {
                        {
                            setState(66);
                            match(WHITESPACE);
                        }
                    }

                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NoteelementContext noteelement() throws RecognitionException {
        NoteelementContext _localctx = new NoteelementContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_noteelement);
        try {
            setState(73);
            switch (_input.LA(1)) {
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                case T__7:
                case T__8:
                case T__9:
                case T__10:
                case T__11:
                case T__12:
                case T__13:
                case T__14:
                case T__15:
                case T__16:
                case ACCIDENTAL:
                case REST:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(71);
                    note();
                }
                break;
                case T__18:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(72);
                    multinote();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NoteContext note() throws RecognitionException {
        NoteContext _localctx = new NoteContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_note);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(75);
                noterest();
                setState(76);
                notelength();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NoterestContext noterest() throws RecognitionException {
        NoterestContext _localctx = new NoterestContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_noterest);
        try {
            setState(80);
            switch (_input.LA(1)) {
                case T__3:
                case T__4:
                case T__5:
                case T__6:
                case T__7:
                case T__8:
                case T__9:
                case T__10:
                case T__11:
                case T__12:
                case T__13:
                case T__14:
                case T__15:
                case T__16:
                case ACCIDENTAL:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(78);
                    pitch();
                }
                break;
                case REST:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(79);
                    match(REST);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PitchContext pitch() throws RecognitionException {
        PitchContext _localctx = new PitchContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_pitch);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(83);
                _la = _input.LA(1);
                if (_la == ACCIDENTAL) {
                    {
                        setState(82);
                        match(ACCIDENTAL);
                    }
                }

                setState(85);
                basenote();
                setState(87);
                _la = _input.LA(1);
                if (_la == T__0 || _la == T__1) {
                    {
                        setState(86);
                        octave();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final OctaveContext octave() throws RecognitionException {
        OctaveContext _localctx = new OctaveContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_octave);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                _la = _input.LA(1);
                if (!(_la == T__0 || _la == T__1)) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NotelengthContext notelength() throws RecognitionException {
        NotelengthContext _localctx = new NotelengthContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_notelength);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                _la = _input.LA(1);
                if (_la == DIGIT) {
                    {
                        setState(92);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(91);
                                    match(DIGIT);
                                }
                            }
                            setState(94);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == DIGIT);
                    }
                }

                setState(106);
                _la = _input.LA(1);
                if (_la == T__2) {
                    {
                        setState(98);
                        match(T__2);
                        setState(104);
                        _la = _input.LA(1);
                        if (_la == DIGIT) {
                            {
                                setState(100);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                do {
                                    {
                                        {
                                            setState(99);
                                            match(DIGIT);
                                        }
                                    }
                                    setState(102);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                } while (_la == DIGIT);
                            }
                        }

                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NotelengthstrictContext notelengthstrict() throws RecognitionException {
        NotelengthstrictContext _localctx = new NotelengthstrictContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_notelengthstrict);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(109);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(108);
                            match(DIGIT);
                        }
                    }
                    setState(111);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
                setState(113);
                match(T__2);
                setState(115);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(114);
                            match(DIGIT);
                        }
                    }
                    setState(117);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BasenoteContext basenote() throws RecognitionException {
        BasenoteContext _localctx = new BasenoteContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_basenote);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(119);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TupletelementContext tupletelement() throws RecognitionException {
        TupletelementContext _localctx = new TupletelementContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_tupletelement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(121);
                tupletspec();
                setState(123);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(122);
                            noteelement();
                        }
                    }
                    setState(125);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << ACCIDENTAL) | (1L << REST))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TupletspecContext tupletspec() throws RecognitionException {
        TupletspecContext _localctx = new TupletspecContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_tupletspec);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(127);
                match(T__17);
                setState(128);
                match(DIGIT);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MultinoteContext multinote() throws RecognitionException {
        MultinoteContext _localctx = new MultinoteContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_multinote);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                match(T__18);
                setState(132);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(131);
                            note();
                        }
                    }
                    setState(134);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ACCIDENTAL) | (1L << REST))) != 0));
                setState(136);
                match(T__19);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final MidtunefieldContext midtunefield() throws RecognitionException {
        MidtunefieldContext _localctx = new MidtunefieldContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_midtunefield);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(138);
                fieldvoice();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FieldvoiceContext fieldvoice() throws RecognitionException {
        FieldvoiceContext _localctx = new FieldvoiceContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_fieldvoice);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(140);
                match(T__20);
                setState(141);
                text();
                setState(142);
                endofline();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final EndoflineContext endofline() throws RecognitionException {
        EndoflineContext _localctx = new EndoflineContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_endofline);
        try {
            setState(146);
            switch (_input.LA(1)) {
                case T__21:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(144);
                    comment();
                }
                break;
                case NEWLINE:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(145);
                    match(NEWLINE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CommentContext comment() throws RecognitionException {
        CommentContext _localctx = new CommentContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_comment);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(148);
                match(T__21);
                setState(152);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == CHAR) {
                    {
                        {
                            setState(149);
                            text();
                        }
                    }
                    setState(154);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(155);
                match(NEWLINE);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final TextContext text() throws RecognitionException {
        TextContext _localctx = new TextContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_text);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(158);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(157);
                                match(CHAR);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(160);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 22, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BodyContext extends ParserRuleContext {
        public BodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<LineContext> line() {
            return getRuleContexts(LineContext.class);
        }

        public LineContext line(int i) {
            return getRuleContext(LineContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitBody(this);
        }
    }

    public static class LineContext extends ParserRuleContext {
        public LineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public EndoflineContext endofline() {
            return getRuleContext(EndoflineContext.class, 0);
        }

        public List<ElementContext> element() {
            return getRuleContexts(ElementContext.class);
        }

        public ElementContext element(int i) {
            return getRuleContext(ElementContext.class, i);
        }

        public MidtunefieldContext midtunefield() {
            return getRuleContext(MidtunefieldContext.class, 0);
        }

        public CommentContext comment() {
            return getRuleContext(CommentContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_line;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterLine(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitLine(this);
        }
    }

    public static class ElementContext extends ParserRuleContext {
        public ElementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public NoteelementContext noteelement() {
            return getRuleContext(NoteelementContext.class, 0);
        }

        public TerminalNode WHITESPACE() {
            return getToken(BodyParser.WHITESPACE, 0);
        }

        public TupletelementContext tupletelement() {
            return getRuleContext(TupletelementContext.class, 0);
        }

        public TerminalNode BARLINE() {
            return getToken(BodyParser.BARLINE, 0);
        }

        public TerminalNode NTHREPEAT() {
            return getToken(BodyParser.NTHREPEAT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_element;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterElement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitElement(this);
        }
    }

    public static class NoteelementContext extends ParserRuleContext {
        public NoteelementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public NoteContext note() {
            return getRuleContext(NoteContext.class, 0);
        }

        public MultinoteContext multinote() {
            return getRuleContext(MultinoteContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_noteelement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterNoteelement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitNoteelement(this);
        }
    }

    public static class NoteContext extends ParserRuleContext {
        public NoteContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public NoterestContext noterest() {
            return getRuleContext(NoterestContext.class, 0);
        }

        public NotelengthContext notelength() {
            return getRuleContext(NotelengthContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_note;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterNote(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitNote(this);
        }
    }

    public static class NoterestContext extends ParserRuleContext {
        public NoterestContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public PitchContext pitch() {
            return getRuleContext(PitchContext.class, 0);
        }

        public TerminalNode REST() {
            return getToken(BodyParser.REST, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_noterest;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterNoterest(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitNoterest(this);
        }
    }

    public static class PitchContext extends ParserRuleContext {
        public PitchContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public BasenoteContext basenote() {
            return getRuleContext(BasenoteContext.class, 0);
        }

        public TerminalNode ACCIDENTAL() {
            return getToken(BodyParser.ACCIDENTAL, 0);
        }

        public OctaveContext octave() {
            return getRuleContext(OctaveContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pitch;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterPitch(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitPitch(this);
        }
    }

    public static class OctaveContext extends ParserRuleContext {
        public OctaveContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_octave;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterOctave(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitOctave(this);
        }
    }

    public static class NotelengthContext extends ParserRuleContext {
        public NotelengthContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(BodyParser.DIGIT);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(BodyParser.DIGIT, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_notelength;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterNotelength(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitNotelength(this);
        }
    }

    public static class NotelengthstrictContext extends ParserRuleContext {
        public NotelengthstrictContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> DIGIT() {
            return getTokens(BodyParser.DIGIT);
        }

        public TerminalNode DIGIT(int i) {
            return getToken(BodyParser.DIGIT, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_notelengthstrict;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterNotelengthstrict(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitNotelengthstrict(this);
        }
    }

    public static class BasenoteContext extends ParserRuleContext {
        public BasenoteContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_basenote;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterBasenote(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitBasenote(this);
        }
    }

    public static class TupletelementContext extends ParserRuleContext {
        public TupletelementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TupletspecContext tupletspec() {
            return getRuleContext(TupletspecContext.class, 0);
        }

        public List<NoteelementContext> noteelement() {
            return getRuleContexts(NoteelementContext.class);
        }

        public NoteelementContext noteelement(int i) {
            return getRuleContext(NoteelementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tupletelement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterTupletelement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitTupletelement(this);
        }
    }

    public static class TupletspecContext extends ParserRuleContext {
        public TupletspecContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode DIGIT() {
            return getToken(BodyParser.DIGIT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tupletspec;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterTupletspec(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitTupletspec(this);
        }
    }

    public static class MultinoteContext extends ParserRuleContext {
        public MultinoteContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<NoteContext> note() {
            return getRuleContexts(NoteContext.class);
        }

        public NoteContext note(int i) {
            return getRuleContext(NoteContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_multinote;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterMultinote(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitMultinote(this);
        }
    }

    public static class MidtunefieldContext extends ParserRuleContext {
        public MidtunefieldContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FieldvoiceContext fieldvoice() {
            return getRuleContext(FieldvoiceContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_midtunefield;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterMidtunefield(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitMidtunefield(this);
        }
    }

    public static class FieldvoiceContext extends ParserRuleContext {
        public FieldvoiceContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TextContext text() {
            return getRuleContext(TextContext.class, 0);
        }

        public EndoflineContext endofline() {
            return getRuleContext(EndoflineContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fieldvoice;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterFieldvoice(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitFieldvoice(this);
        }
    }

    public static class EndoflineContext extends ParserRuleContext {
        public EndoflineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public CommentContext comment() {
            return getRuleContext(CommentContext.class, 0);
        }

        public TerminalNode NEWLINE() {
            return getToken(BodyParser.NEWLINE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_endofline;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterEndofline(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitEndofline(this);
        }
    }

    public static class CommentContext extends ParserRuleContext {
        public CommentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NEWLINE() {
            return getToken(BodyParser.NEWLINE, 0);
        }

        public List<TextContext> text() {
            return getRuleContexts(TextContext.class);
        }

        public TextContext text(int i) {
            return getRuleContext(TextContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comment;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterComment(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitComment(this);
        }
    }

    public static class TextContext extends ParserRuleContext {
        public TextContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> CHAR() {
            return getTokens(BodyParser.CHAR);
        }

        public TerminalNode CHAR(int i) {
            return getToken(BodyParser.CHAR, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_text;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).enterText(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof BodyListener) ((BodyListener) listener).exitText(this);
        }
    }
}
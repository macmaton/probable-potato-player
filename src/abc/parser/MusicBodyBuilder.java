package abc.parser;

import abc.music.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

/**
 * Builds Music object for Body from parse tree
 */
public class MusicBodyBuilder implements BodyListener {
    /**
     * stack contains the Music objects representing each parse subtree walked so far, but whose parent has not been
     * exited by the walk.  The stack is ordered by recency of visit, such that the item at the top of the stack is the
     * Music object for the most recently walked subtree.
     *
     * When a node is exited by the walk, its children are on top of the stack.  The values are popped and combined and
     * a new Music object representing the entire subtree is pushed onto the stack.
     *
     * When a walk is completed, the Music object representing the entire tree is the sole object on the stack.
     */
    private final Stack<Music> stack = new Stack<>();

    public Music getBody() {
        return stack.get(0);
    }

    @Override
    public void enterBody(BodyParser.BodyContext ctx) {

    }

    @Override
    public void exitBody(BodyParser.BodyContext ctx) {
        List<BodyElement> elements = new ArrayList<>();
        for (BodyParser.BodyelementContext e : ctx.bodyelement()) {
            Music.Components type = stack.peek().getType();
            switch(type) {
                case LINE:
                case REPEAT:
                case SECTION:
                case VOICEPART:
                    elements.add(0, (BodyElement) stack.pop());
                    break;
                default:
                    throw new RuntimeException("Illegal section: " + type.toString());
            }
        }
        assert stack.isEmpty();
        stack.push(new Body(elements));
    }

    @Override
    public void enterBodyelement(BodyParser.BodyelementContext ctx) {

    }

    /**
     * Builds and pushes to stack Sections.  Simplifies voice parts and repeats such that there is one voice part
     * per
     * voice, and repeats are complete (have repeated lines or measures from beginning of piece or section or
     * repeatstart to end of repeat, and consolidate endings to one array)
     * @param ctx the parse tree
     */
    @Override
    public void exitBodyelement(BodyParser.BodyelementContext ctx) {
        //TODO
        //bodyelement: sectionelement+;
        //sectionelement: voicepart | voicepartelement;
        Section section;
        Map<Voice,List<VoicePartElement>> sortedVoiceParts = new HashMap<>();
        List<VoicePartElement> elements;
        for (BodyParser.SectionelementContext s : ctx.sectionelement()) {
            //if the section contains voiceparts, add them to sortedVoiceParts

            //if the section contains voicepartelements, add them to elements
            //TODO: update grammar and this method to allow one voice to apply to multiple lines
        }

    }

    /**
     * Simplifies VoicePartElements so that incomplete repeats stored across multiple structures are stored in one
     * Repeat, and other lines are stored as lines.  Preserves order of elements.
     * @param elementList List of VoicePartElements which may have non-contiguous sections
     * @param ctx the context for the Section where the VoicePart is used.  The parse tree has additional needed
     *            information about where the repeat sections begin and end. TODO: should this be stored in Repeat?
     * @return Simplified list of VoicePartElements
     */
    private List<VoicePartElement> simplifyVoicePartElements(List<VoicePartElement> elementList,
                                                             BodyParser.BodyelementContext ctx) {
        throw new NotImplementedException();
    }

    @Override
    public void enterSectionelement(BodyParser.SectionelementContext ctx) {

    }

    @Override
    public void exitSectionelement(BodyParser.SectionelementContext ctx) {
        //TODO?
    }

    @Override
    public void enterVoicepart(BodyParser.VoicepartContext ctx) {

    }

    /**
     * Builds and pushes to stack a VoicePart with lines or repeats available.
     * @param ctx the parse tree
     */
    @Override
    public void exitVoicepart(BodyParser.VoicepartContext ctx) {
        String voice = ctx.fieldvoice().getText().substring(2).trim();
        VoicePartElement element;
        assert stack.peek().getType().equals(Music.Components.REPEAT) || stack.peek().getType().equals(Music
                .Components.LINE);
        element = (VoicePartElement) stack.pop();
        List<VoicePartElement> elements = new ArrayList<>();
        elements.add(element);
        stack.push(new VoicePart(new Voice(voice), elements));
    }

    @Override
    public void enterVoicepartelement(BodyParser.VoicepartelementContext ctx) {

    }

    @Override
    public void exitVoicepartelement(BodyParser.VoicepartelementContext ctx) {

    }

    @Override
    public void enterRepeatstart(BodyParser.RepeatstartContext ctx) {

    }

    /**
     * Builds and pushes to stack a Repeat using lines or measures available.  Repeated lines may be incomplete due
     * to spanning multiple lines.  Repeat endings, if any, provided in other lines.
     * @param ctx the parse tree
     */
    @Override
    public void exitRepeatstart(BodyParser.RepeatstartContext ctx) {
        List<RepeatElement> repeated = new ArrayList<>();
        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            repeated.add(0, (Measure) stack.pop());
        }
        stack.push(new Repeat(repeated, null));
    }

    @Override
    public void enterRepeatend(BodyParser.RepeatendContext ctx) {

    }

    /**
     * Builds and pushes to stack a Repeat using lines or measures available.  May be incomplete due to spanning
     * across multiple lines.
     * @param ctx the parse tree
     */
    @Override
    public void exitRepeatend(BodyParser.RepeatendContext ctx) {
        List<RepeatElement> repeated = new ArrayList<>();
        List<RepeatElement> endings = new ArrayList<>();

        for(BodyParser.RepeatendingContext e : ctx.repeatending()) {
            assert stack.peek().getType().equals(Music.Components.REPEAT);
            Repeat ending = (Repeat) stack.pop();
            assert ending.getRepeatedLines() == null;
            endings.addAll(0, ending.getEndings());
        }

        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            repeated.add(0, (Measure) stack.pop());
        }

        stack.push(new Repeat(repeated, endings));
    }

    @Override
    public void enterRepeatfull(BodyParser.RepeatfullContext ctx) {

    }

    /**
     * Builds and pushes to stack a Repeat using lines or measures.  Endings may be incomplete if endings span
     * multiple lines.
     * @param ctx the parse tree
     */
    @Override
    public void exitRepeatfull(BodyParser.RepeatfullContext ctx) {
        List<RepeatElement> repeated = new ArrayList<>();
        List<RepeatElement> endings = new ArrayList<>();

        for(BodyParser.RepeatendingContext e : ctx.repeatending()) {
            assert stack.peek().getType().equals(Music.Components.REPEAT);
            Repeat ending = (Repeat) stack.pop();
            assert ending.getRepeatedLines() == null;
            endings.addAll(0, ending.getEndings());
        }

        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            repeated.add(0, (Measure) stack.pop());
        }

        stack.push(new Repeat(repeated, endings));
    }

    @Override
    public void enterRepeatendingline(BodyParser.RepeatendinglineContext ctx) {

    }

    @Override
    public void exitRepeatendingline(BodyParser.RepeatendinglineContext ctx) {
        List<RepeatElement> endings = new ArrayList<>();

        //accumulate endings - last ending may be incomplete due to spanning multiple lines
        for (BodyParser.RepeatendingContext e : ctx.repeatending()) {
            assert stack.peek().getType().equals(Music.Components.REPEAT);
            Repeat ending = (Repeat) stack.pop();
            assert ending.getRepeatedLines() == null;
            List<Measure> nthending = new ArrayList<>();

            for(RepeatElement endingElement : ending.getRepeatedLines()) {
                assert endingElement.getType().equals(Music.Components.MEASURE);
                nthending.add((Measure) endingElement);
            }
            endings.add(0, new Line(nthending));
        }

        //assemble partial ending from measures at start of line
        List<Measure> partialEnding = new ArrayList<>();
        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            partialEnding.add(0, (Measure) stack.pop());
        }
        endings.add(0, new Line(partialEnding));

        stack.push(new Repeat(null, endings));
    }

    @Override
    public void enterRepeatending(BodyParser.RepeatendingContext ctx) {

    }

    /**
     * Builds and pushes to stack a Repeat using lines or measures available, with only endings.
     * @param ctx the parse tree
     */
    @Override
    public void exitRepeatending(BodyParser.RepeatendingContext ctx) {
        List<RepeatElement> nthending = new ArrayList<>();

        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            nthending.add(0, (Measure) stack.pop());
        }
        stack.push(new Repeat(null, nthending));
    }

    @Override
    public void enterLine(BodyParser.LineContext ctx) {

    }

    @Override
    public void exitLine(BodyParser.LineContext ctx) {
        List<Measure> measures = new ArrayList<>();

        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            measures.add(0, (Measure) stack.pop());
        }
        stack.push(new Line(measures));
    }

    @Override
    public void enterMeasure(BodyParser.MeasureContext ctx) {

    }

    @Override
    public void exitMeasure(BodyParser.MeasureContext ctx) {
        List<MeasureElement> elements = new ArrayList<>();
        for(int i = 1; i <= ctx.getChildCount(); i++) {
            Music.Components type = stack.peek().getType();
            switch(type) {
                case TUPLET:
                case CHORD:
                case NOTE:
                case REST:
                    elements.add(0, (MeasureElement) stack.pop());
                    break;
                default:
                    throw new RuntimeException("Illegal measure element: " + type + stack.peek().toString());
            }
        }
        stack.push(new Measure(elements.toArray(new MeasureElement[elements.size()])));
    }

    @Override
    public void enterMeasureelement(BodyParser.MeasureelementContext ctx) {

    }

    @Override
    public void exitMeasureelement(BodyParser.MeasureelementContext ctx) {

    }

    @Override
    public void enterNote(BodyParser.NoteContext ctx) {

    }

    @Override
    public void exitNote(BodyParser.NoteContext ctx) {
        assert stack.peek().getType().equals(Music.Components.NOTELENGTH);
        NoteLength length = (NoteLength) stack.pop();
        if (stack.peek().getType().equals(Music.Components.PITCH)) {
            Pitch pitch = (Pitch) stack.pop();
            stack.push(new Note(pitch, length));
        } else {
            stack.push(new Rest(length));
        }
    }

    @Override
    public void enterNoterest(BodyParser.NoterestContext ctx) {

    }

    @Override
    public void exitNoterest(BodyParser.NoterestContext ctx) {

    }

    @Override
    public void enterPitch(BodyParser.PitchContext ctx) {

    }

    @Override
    public void exitPitch(BodyParser.PitchContext ctx) {
        Pitch pitch;
        String rawBaseNote = String.valueOf(ctx.BASENOTE());
        Music.BaseNote basenote = Music.BaseNote.valueOf(rawBaseNote.toUpperCase());

        String rawOctave = ctx.octave().toString();
        int octave = 0;
        if (rawBaseNote.toLowerCase().equals(rawBaseNote)) {
            octave += 1;
        }
        if (rawOctave.contains("'")) {
            octave += rawOctave.length();
        } else if (rawOctave.contains(",")) {
            octave -= rawOctave.length();
        }

        String rawAccidental = ctx.ACCIDENTAL().getText();
        Pitch.Accidental accidental;
        switch(rawAccidental) {
            case "^": accidental = Pitch.Accidental.SHARP;
            break;
            case "^^": accidental = Pitch.Accidental.DOUBLESHARP;
            break;
            case "_": accidental = Pitch.Accidental.FLAT;
            break;
            case "__": accidental = Pitch.Accidental.DOUBLEFLAT;
            break;
            case "=": accidental = Pitch.Accidental.NATURAL;
            break;
            default: accidental = Pitch.Accidental.NONE;
        }

        pitch = new Pitch(basenote, octave, accidental);

        stack.push(pitch);
    }

    @Override
    public void enterOctave(BodyParser.OctaveContext ctx) {

    }

    @Override
    public void exitOctave(BodyParser.OctaveContext ctx) {

    }

    @Override
    public void enterNotelength(BodyParser.NotelengthContext ctx) {

    }

    @Override
    public void exitNotelength(BodyParser.NotelengthContext ctx) {
        NoteLength length;
        String rawLength = ctx.getText();
        if (rawLength.isEmpty()) {
            length = new NoteLength();
        } else {
            if (!rawLength.contains("/")) {
                length = new NoteLength(Integer.getInteger(rawLength), 1);
            } else {
                int slashIndex = rawLength.indexOf("/");
                Integer numerator = null;
                Integer denominator = null;
                if (slashIndex > 0) {
                    numerator = Integer.getInteger(rawLength.substring(0, slashIndex));
                }
                if (slashIndex < rawLength.length()-1) {
                    denominator = Integer.getInteger(rawLength.substring(slashIndex+1));
                }
                length = new NoteLength(numerator, denominator);
            }
        }

        stack.push(length);
    }

    @Override
    public void enterTuplet(BodyParser.TupletContext ctx) {

    }

    @Override
    public void exitTuplet(BodyParser.TupletContext ctx) {
        int spec = Integer.getInteger(ctx.tupletspec().NUMBER().getText());
        List<TupletElement> elements = new ArrayList<>();
        for (BodyParser.TupletelementContext t : ctx.tupletelement()) {
            Music.Components type = stack.peek().getType();
            switch(type) {
                case CHORD:
                case NOTE:
                case REST:
                    elements.add(0, (TupletElement) stack.pop());
                    break;
                default:
                    throw new RuntimeException("Illegal TupletElement reached: " + type + stack.peek().toString());
            }

        }
        stack.push(new Tuplet(spec, elements.toArray(new TupletElement[elements.size()])));
    }

    @Override
    public void enterTupletelement(BodyParser.TupletelementContext ctx) {

    }

    @Override
    public void exitTupletelement(BodyParser.TupletelementContext ctx) {

    }

    @Override
    public void enterTupletspec(BodyParser.TupletspecContext ctx) {

    }

    @Override
    public void exitTupletspec(BodyParser.TupletspecContext ctx) {

    }

    @Override
    public void enterChord(BodyParser.ChordContext ctx) {

    }

    @Override
    public void exitChord(BodyParser.ChordContext ctx) {
        assert stack.peek().getType().equals(Music.Components.NOTELENGTH);
        NoteLength length = (NoteLength) stack.pop();

        List<Note> notes = new ArrayList<>();
        for (BodyParser.NoteContext n : ctx.note()) {
            assert stack.peek().getType().equals(Music.Components.NOTE);
            notes.add(0, (Note) stack.pop());
        }
        stack.push(new Chord(notes.toArray(new Note[notes.size()]), length));
    }

    @Override
    public void enterFieldvoice(BodyParser.FieldvoiceContext ctx) {

    }

    @Override
    public void exitFieldvoice(BodyParser.FieldvoiceContext ctx) {

    }

    @Override
    public void enterEndofline(BodyParser.EndoflineContext ctx) {

    }

    @Override
    public void exitEndofline(BodyParser.EndoflineContext ctx) {

    }

    @Override
    public void enterComment(BodyParser.CommentContext ctx) {

    }

    @Override
    public void exitComment(BodyParser.CommentContext ctx) {

    }

    @Override
    public void enterText(BodyParser.TextContext ctx) {

    }

    @Override
    public void exitText(BodyParser.TextContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}

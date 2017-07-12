package abc.parser;

import abc.music.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

/**
 * Builds Music object for Body from parse tree
 */
public class MusicBodyBuilder implements BodyListener {
    /**
     * stack contains the Music objects representing each parse subtree walked so far, but whose parent has not been
     * exited by the walk.  The stack is ordered by recency of visit, such that the item at the top of the stack is the
     * Music object for the most recently walked subtree.
     * <p>
     * When a node is exited by the walk, its children are on top of the stack.  The values are popped and combined and
     * a new Music object representing the entire subtree is pushed onto the stack.
     * <p>
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
        List<Section> elements = new ArrayList<>();
        for (BodyParser.SectionContext e : ctx.section()) {
            if (stack.peek().getType().equals(Music.Components.SECTION)) {
                elements.add(0, (Section) stack.pop());
            } else {
                throw new RuntimeException("Illegal section: " + stack.peek().getType().toString());
            }
        }
        assert stack.isEmpty();
        stack.push(new Body(elements));
    }

    @Override
    public void enterSection(BodyParser.SectionContext ctx) {

    }

    @Override
    public void exitSection(BodyParser.SectionContext ctx) {
    //section: (sectionelement+ sectionend? (endofline+ | EOF)) | ((voicepart endofline+)* (voicepart sectionend
    //    (endofline+ | EOF))+) | (voicepart (endofline+ | EOF))+;
        List<SectionElement> elements = new ArrayList<>();
        List<VoicePartElement> voicePartElements = new ArrayList<>();
        //for (BodyParser.VoicepartelementContext s : ctx.voicepartelement()) {
        Map<Voice, List<VoicePartElement>> sortedVoiceParts = new HashMap<>();
        List<Voice> voices = new ArrayList<>();
        //if the section contains voiceparts, add them to sortedVoiceParts
        if (ctx.voicepart() != null) {
            for (BodyParser.VoicepartContext vpc : ctx.voicepart()) {
                assert stack.peek().getType().equals(Music.Components.VOICEPART);
                VoicePart voicePart = (VoicePart) stack.pop();
                if (!voices.contains(voicePart.getVoice())) {
                    voices.add(voicePart.getVoice());
                    sortedVoiceParts.put(voicePart.getVoice(), new ArrayList<>());
                }
                sortedVoiceParts.get(voicePart.getVoice()).addAll(voicePart.getElements());
            }
        }
        //if the section contains voicepartelements (rather than voiceparts), add them to elements
        if (ctx.sectionelement() != null && !ctx.sectionelement().isEmpty()) {
            for (BodyParser.SectionelementContext sec : ctx.sectionelement()) {
                for (BodyParser.VoicepartelementContext vpec : sec.voicepartelement()) {
                    assert (stack.peek().getType().equals(Music.Components.LINE) || stack.peek().getType().equals
                            (Music.Components.REPEAT) || stack.peek().getType().equals(Music.Components
                            .PARTIALREPEAT));
                    VoicePartElement element = (VoicePartElement) stack.pop();
                    voicePartElements.add(0, element);
                }
            }
            elements.addAll(simplifyVoicePartElements(voicePartElements));
        }
        //either all elements should be VoiceParts or all elements should be VoicePartElements in a given Section
        assert (sortedVoiceParts.isEmpty() || elements.isEmpty());
        if (!sortedVoiceParts.isEmpty()) {
            for (Voice v : voices) {
                elements.add(0, new VoicePart(v, simplifyVoicePartElements(sortedVoiceParts.get(v))));
            }
        }
        //}
        stack.push(new Section(elements));
    }

    @Override
    public void enterSectionelement(BodyParser.SectionelementContext ctx) {

    }

    /**
     * Builds and pushes to stack Sections.  Simplifies voice parts and repeats such that there is one voice part per
     * voice, and repeats are complete (have repeated lines or measures from beginning of piece or section or
     * repeatstart to end of repeat, and consolidate endings to one array)
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitSectionelement(BodyParser.SectionelementContext ctx) {
//        //sectionelement: BARLINE? (SECTIONBEGINBAR? (voicepartelement endofline+)* voicepartelement);
//        List<SectionElement> elements = new ArrayList<>();
//        //for (BodyParser.VoicepartelementContext s : ctx.voicepartelement()) {
//            Map<Voice, List<VoicePartElement>> sortedVoiceParts = new HashMap<>();
//            List<Voice> voices = new ArrayList<>();
//            //if the section contains voiceparts, add them to sortedVoiceParts
//            if (ctx.voicepart() != null) {
//                for (BodyParser.VoicepartContext vpc : ctx.voicepart()) {
//                    assert stack.peek().getType().equals(Music.Components.VOICEPART);
//                    VoicePart voicePart = (VoicePart) stack.pop();
//                    if (!voices.contains(voicePart.getVoice())) {
//                        voices.add(voicePart.getVoice());
//                        sortedVoiceParts.put(voicePart.getVoice(), new ArrayList<>());
//                    }
//                    sortedVoiceParts.get(voicePart.getVoice()).addAll(voicePart.getElements());
//                }
//            }
//            //if the section contains voicepartelements (rather than voiceparts), add them to elements
//            if (ctx.voicepartelement() != null) {
//                for (BodyParser.VoicepartelementContext vpec : ctx.voicepartelement()) {
//                    assert (stack.peek().getType().equals(Music.Components.LINE) || stack.peek().getType().equals
//                            (Music.Components.REPEAT) || stack.peek().getType().equals(Music.Components.PARTIALREPEAT));
//                    VoicePartElement element = (VoicePartElement) stack.pop();
//                    elements.add(0, element);
//                }
//            }
//            //either all elements should be VoiceParts or all elements should be VoicePartElements in a given Section
//            assert (sortedVoiceParts.isEmpty() || elements.isEmpty());
//            if (!sortedVoiceParts.isEmpty()) {
//                for (Voice v : voices) {
//                    elements.add(0, new VoicePart(v, simplifyVoicePartElements(sortedVoiceParts.get(v))));
//                }
//            }
//        //}
//        stack.push(new Section(elements));
    }

    @Override
    public void enterVoicepart(BodyParser.VoicepartContext ctx) {

    }

    /**
     * Builds and pushes to stack a VoicePart with lines or repeats available.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitVoicepart(BodyParser.VoicepartContext ctx) {
        String voice = ctx.fieldvoice().getText().substring(2).trim();
        List<VoicePartElement> elements = new ArrayList<>();

        for (BodyParser.VoicepartelementContext e : ctx.voicepartelement()) {
            assert stack.peek().getType().equals(Music.Components.REPEAT) || stack.peek().getType().equals(Music.Components.PARTIALREPEAT) || stack
                    .peek().getType().equals(Music.Components.LINE);
            VoicePartElement element = (VoicePartElement) stack.pop();
            elements.add(0, element);
        }

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
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitRepeatstart(BodyParser.RepeatstartContext ctx) {
        List<RepeatElement> repeated = new ArrayList<>();
        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            repeated.add(0, (Measure) stack.pop());
        }
        List<Line> repeatedLine = new ArrayList<>();
        repeatedLine.add(simplifyLines(repeated));
        stack.push(new PartialRepeat(repeatedLine, null, PartialRepeat.RepeatFragment.START));
    }

    @Override
    public void enterRepeatend(BodyParser.RepeatendContext ctx) {

    }

    /**
     * Builds and pushes to stack a Repeat using lines or measures available.  Additional endings may be on other lines.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitRepeatend(BodyParser.RepeatendContext ctx) {
        List<RepeatElement> repeated = new ArrayList<>();
        List<Line> endings = new ArrayList<>();

        for (BodyParser.RepeatendingContext e : ctx.repeatending()) {
            assert stack.peek().getType().equals(Music.Components.REPEAT) || stack.peek().getType().equals(Music.Components.PARTIALREPEAT);
            Repeat ending = (Repeat) stack.pop();
            assert ending.getRepeatedLines() == null;
            endings.addAll(0, ending.getEndings());
        }

        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            repeated.add(0, (Measure) stack.pop());
        }
        List<Line> repeatedLine = new ArrayList<>();
        repeatedLine.add(simplifyLines(repeated));

        stack.push(new PartialRepeat(repeatedLine, endings, PartialRepeat.RepeatFragment.ENDING));
    }

    @Override
    public void enterRepeatfull(BodyParser.RepeatfullContext ctx) {

    }

    /**
     * Builds and pushes to stack a Repeat using lines or measures.  Endings assumed to fit in one line.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitRepeatfull(BodyParser.RepeatfullContext ctx) {
        List<Measure> repeated = new ArrayList<>();
        List<Line> endings = new ArrayList<>();

        for (BodyParser.RepeatendingContext e : ctx.repeatending()) {
            assert stack.peek().getType().equals(Music.Components.REPEAT) || stack.peek().getType().equals(Music.Components.PARTIALREPEAT);
            Repeat ending = (Repeat) stack.pop();
            assert ending.getRepeatedLines() == null;
            List<RepeatElement> currentEndings = new ArrayList<>();
            currentEndings.addAll(ending.getEndings());
            endings.add(0, simplifyLines(currentEndings));
        }

        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            repeated.add(0, (Measure) stack.pop());
        }
        List<Line> repeatedLine = new ArrayList<>();
        repeatedLine.add(new Line(repeated));
        stack.push(new Repeat(repeatedLine, endings));
    }

    @Override
    public void enterRepeatendingline(BodyParser.RepeatendinglineContext ctx) {

    }

    @Override
    public void exitRepeatendingline(BodyParser.RepeatendinglineContext ctx) {
        List<Line> endings = new ArrayList<>();

        //accumulate endings - each assumed to be complete
        for (BodyParser.RepeatendingContext e : ctx.repeatending()) {
            assert stack.peek().getType().equals(Music.Components.PARTIALREPEAT);
            Repeat ending = (Repeat) stack.pop();
            assert ending.getRepeatedLines() == null;

            List<Measure> nthending = new ArrayList<>();
            for (RepeatElement endingElement : ending.getEndings()) {
                if (endingElement.getType().equals(Music.Components.LINE)) {
                    endings.add(0, (Line) endingElement);
                } else if (endingElement.getType().equals(Music.Components.MEASURE)){
                    nthending.add((Measure) endingElement);
                }
            }
            if (!nthending.isEmpty()) {
                endings.add(0, new Line(nthending));
            }
        }

        stack.push(new PartialRepeat(null, endings, PartialRepeat.RepeatFragment.ENDING));
    }

    @Override
    public void enterRepeatending(BodyParser.RepeatendingContext ctx) {

    }

    /**
     * Builds and pushes to stack a Repeat using lines or measures available, with only endings.
     *
     * @param ctx the parse tree
     */
    @Override
    public void exitRepeatending(BodyParser.RepeatendingContext ctx) {
        List<Measure> nthending = new ArrayList<>();

        for (BodyParser.MeasureContext m : ctx.measure()) {
            assert stack.peek().getType().equals(Music.Components.MEASURE);
            nthending.add(0, (Measure) stack.pop());
        }
        List<Line> endingLine = new ArrayList<>();
        endingLine.add(new Line(nthending));
        stack.push(new PartialRepeat(null, endingLine, PartialRepeat.RepeatFragment.ENDING));
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
        for (BodyParser.MeasureelementContext e : ctx.measureelement()) {
            Music.Components type = stack.peek().getType();
            switch (type) {
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
        stack.push(new Measure(elements));
    }

    @Override
    public void enterMeasureelement(BodyParser.MeasureelementContext ctx) {

    }

    @Override
    public void exitMeasureelement(BodyParser.MeasureelementContext ctx) {

    }

    @Override
    public void enterTupletelement(BodyParser.TupletelementContext ctx) {

    }

    @Override
    public void exitTupletelement(BodyParser.TupletelementContext ctx) {

    }

    @Override
    public void enterNote(BodyParser.NoteContext ctx) {

    }

    @Override
    public void exitNote(BodyParser.NoteContext ctx) {
        assert stack.peek().getType().equals(Music.Components.NOTELENGTH);
        NoteLength length = (NoteLength) stack.pop();
        if (!stack.isEmpty()) {
            if (stack.peek().getType().equals(Music.Components.PITCH)) {
                Pitch pitch = (Pitch) stack.pop();
                stack.push(new Note(pitch, length));
            } else {
                stack.push(new Rest(length));
            }
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

        int octave = 0;
        if (rawBaseNote.equals(rawBaseNote.toLowerCase())) {
            octave += 1;
        }

        Music.BaseNote basenote = Music.BaseNote.valueOf(rawBaseNote.toUpperCase());

        if (!ctx.octave().isEmpty()) {
            String rawOctave = ctx.octave(0).getText();
            if (rawOctave.contains("'")) {
                octave += ctx.octave().size();
            } else if (rawOctave.contains(",")) {
                octave -= ctx.octave().size();
            }
        }


        Pitch.Accidental accidental = Pitch.Accidental.NONE;
        if (ctx.ACCIDENTAL() != null) {
            String rawAccidental = ctx.ACCIDENTAL().getText();
            switch (rawAccidental) {
                case "^":
                    accidental = Pitch.Accidental.SHARP;
                    break;
                case "^^":
                    accidental = Pitch.Accidental.DOUBLESHARP;
                    break;
                case "_":
                    accidental = Pitch.Accidental.FLAT;
                    break;
                case "__":
                    accidental = Pitch.Accidental.DOUBLEFLAT;
                    break;
                case "=":
                    accidental = Pitch.Accidental.NATURAL;
                    break;
                default:
                    accidental = Pitch.Accidental.NONE;
            }
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
                length = new NoteLength(Integer.valueOf(rawLength), 1);
            } else {
                int slashIndex = rawLength.indexOf("/");
                Integer numerator = null;
                Integer denominator = null;
                if (slashIndex > 0) {
                    numerator = Integer.valueOf(rawLength.substring(0, slashIndex));
                }
                if (slashIndex < rawLength.length() - 1) {
                    denominator = Integer.valueOf(rawLength.substring(slashIndex + 1));
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
        int spec = Integer.valueOf(ctx.TUPLETSPEC().getText().substring(1));
        List<TupletElement> elements = new ArrayList<>();
        for (BodyParser.TupletelementContext t : ctx.tupletelement()) {
            Music.Components type = stack.peek().getType();
            switch (type) {
                case CHORD:
                case NOTE:
                case REST:
                    elements.add(0, (TupletElement) stack.pop());
                    break;
                default:
                    throw new RuntimeException("Illegal TupletElement reached: " + type + stack.peek().toString());
            }

        }
        stack.push(new Tuplet(spec, elements));
    }

    @Override
    public void enterChord(BodyParser.ChordContext ctx) {

    }

    @Override
    public void exitChord(BodyParser.ChordContext ctx) {
        assert stack.peek().getType().equals(Music.Components.NOTELENGTH);
        //NoteLength length = (NoteLength) stack.pop();

        List<Note> notes = new ArrayList<>();
        for (BodyParser.NoteContext n : ctx.note()) {
            assert stack.peek().getType().equals(Music.Components.NOTE);
            notes.add(0, (Note) stack.pop());
        }
        NoteLength length = notes.get(0).getLength();
        stack.push(new Chord(notes, length));
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

    /**
     * Simplifies VoicePartElements for a given Voice so that incomplete repeats stored across multiple structures are
     * stored in one Repeat, and other lines are stored as lines.  Preserves order of elements.
     *
     * @param elementList List of VoicePartElements which may have non-contiguous sections
     * @return Simplified list of VoicePartElements
     */
    private List<VoicePartElement> simplifyVoicePartElements(List<VoicePartElement> elementList) {
        //list of simplified VoicePartElements
        List<VoicePartElement> simplifiedElements = new ArrayList<>();
        //each list in sortedElements will be a full repeat or line and will result in a single VoicePartElement
        List<List<VoicePartElement>> sortedElements = new ArrayList<>();
        //list of indices of repeats in sortedElements
        List<Integer> repeatIndices = new ArrayList<>();
        List<VoicePartElement> workingElement = new ArrayList<>();
        for (VoicePartElement current : elementList) {
            if (current.getType().equals(Music.Components.PARTIALREPEAT)) {
                PartialRepeat partial = (PartialRepeat) current;
                if (partial.getFragment().equals(PartialRepeat.RepeatFragment.START)) {
                    if (!workingElement.isEmpty()) {
                        sortedElements.add(workingElement);
                        workingElement = new ArrayList<>();
                    }
                    workingElement.add(current);
                    //next element in sortedElements will be a repeat
                    if (!repeatIndices.contains(sortedElements.size())) {
                        repeatIndices.add(sortedElements.size());
                    }
                } else {
                    workingElement.add(current);
                }
            } else if (current.getType().equals(Music.Components.REPEAT)) {
                if (!workingElement.isEmpty()) {
                    sortedElements.add(workingElement);
                    workingElement = new ArrayList<>();
                }
                workingElement.add(current);
                //next element in sortedElements will be a repeat
                if (!repeatIndices.contains(sortedElements.size())) {
                    repeatIndices.add(sortedElements.size());
                }

            } else {
                //current is a Line
                //if previous element was the end of a repeat, add workingElement to sortedElements and re-initialize
                // workingElement
                if (!workingElement.isEmpty()) {
                    VoicePartElement previous = workingElement.get(workingElement.size() - 1);
                    if (previous.getType().equals(Music.Components.REPEAT)) {
                        sortedElements.add(workingElement);
                        workingElement = new ArrayList<>();
                    } else if (previous.getType().equals(Music.Components.PARTIALREPEAT)) {
                        PartialRepeat partial = (PartialRepeat) previous;
                        if (partial.getFragment().equals(PartialRepeat.RepeatFragment.ENDING)) {
                            if (!repeatIndices.contains(sortedElements.size())) {
                                repeatIndices.add(sortedElements.size());
                            }
                            sortedElements.add(workingElement);
                            workingElement = new ArrayList<>();
                        }
                    }
                }
                workingElement.add(current);
            }
        }
        sortedElements.add(workingElement);

        for (int i = 0; i < sortedElements.size(); i++) {
            if (repeatIndices.contains(i)) {
                //sortedElements[i] contains elements for a repeat
                simplifiedElements.add(simplifyRepeat(sortedElements.get(i)));
            } else {
                //sortedElements[i] contains elements for a line
                List<RepeatElement> line = new ArrayList<>();
                for (VoicePartElement e : sortedElements.get(i)) {
                    assert e.getType().equals(Music.Components.LINE) || e.getType().equals(Music.Components.MEASURE);
                    RepeatElement re = (RepeatElement) e;
                    line.add(re);
                }
                simplifiedElements.add(simplifyLines(line));
            }
        }

        return simplifiedElements;
    }

    /**
     * Simplifies list of measures and lines into a single line
     *
     * @param elementList list of elements to be consolidated; list should contain only Lines and Measures
     * @return a Line containing all measures obtained from elementList
     */
    private Line simplifyLines(List<RepeatElement> elementList) {
        List<Measure> measures = new ArrayList<>();
        for (RepeatElement e : elementList) {
            if (e.getType().equals(Music.Components.MEASURE)) {
                measures.add((Measure) e);
            } else if (e.getType().equals(Music.Components.LINE)) {
                Line line = (Line) e;
                measures.addAll(line.getMeasures());
            } else {
                throw new IllegalArgumentException("Elements other than Lines and Measures cannot be simplified into " +
                        "a Line");
            }
        }
        return new Line(measures);
    }

    /**
     * Simplifies a list of Repeats and RepeatElements into a single repeat
     *
     * @param elementList list of elements to be consolidated
     * @return a Repeat containing all elements obtained from elementList
     */
    private Repeat simplifyRepeat(List<VoicePartElement> elementList) {
        List<RepeatElement> repeatedElements = new ArrayList<>();
        List<Line> endings = new ArrayList<>();

        for (VoicePartElement e : elementList) {
            if (e.getType().equals(Music.Components.PARTIALREPEAT) || e.getType().equals(Music.Components.REPEAT)) {
                Repeat current = (Repeat) e;
                List<Line> repeated = current.getRepeatedLines();
                List<Line> ending = current.getEndings();
                if (repeated != null) {
                    repeatedElements.addAll(repeated);
                }
                if (ending != null) {
                    endings.addAll(ending);
                }
            }
        }
        Line repeatedLine = simplifyLines(repeatedElements);
        List<Line> repeatedLines = new ArrayList<>();
        repeatedLines.add(repeatedLine);
        return new Repeat(repeatedLines, endings);
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

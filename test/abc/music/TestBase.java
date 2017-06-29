package abc.music;

import abc.parser.*;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

class TestBase {
    Note n1 = createNote();
    Note n2 = new Note(new Pitch(Music.BaseNote.D), createNoteLength());
    Note n3 = new Note(new Pitch(Music.BaseNote.E), createNoteLength());
    Rest r = createRest();

    private NoteLength createNoteLength() {
        return new NoteLength(1,1);
    }

    Pitch createPitch() {
        return new Pitch(Music.BaseNote.C);
    }

    private Note createNote() {
        return new Note(createPitch(), createNoteLength());
    }

    private List<Note> createNoteList() {
        List<Note> notes = new ArrayList<>();
        notes.add(n1);
        notes.add(n2);
        notes.add(n3);
        return notes;
    }

    Rest createRest() {
        return new Rest(createNoteLength());
    }

    Chord createChord() {
        return new Chord(createNoteList(), createNoteLength());
    }

    Tuplet createTuplet() {
        List<TupletElement> elements = new ArrayList<>();
        elements.addAll(createNoteList());
        return new Tuplet(3, elements);
    }

    Tuplet createTuplet(Note note) {
        List<TupletElement> elements = new ArrayList<>();
        elements.add(n1);
        elements.add(n1);
        elements.add(note);
        return new Tuplet(3, elements);
    }

    Measure createMeasure() {
        List<MeasureElement> elements = new ArrayList<>();
        elements.add(n1);
        elements.add(n2);
        elements.add(n3);
        elements.add(r);
        return new Measure(elements);
    }

    Measure createMeasure(MeasureElement element) {
        List<MeasureElement> elements = new ArrayList<>();
        elements.add(element);
        elements.add(n1);
        elements.add(n2);
        elements.add(n3);
        return new Measure(elements);
    }

    Line createLine() {
        List<Measure> measures = new ArrayList<>();
        measures.add(createMeasure());
        return new Line(measures);
    }

    Line createLine(Measure measure) {
        List<Measure> measures = new ArrayList<>();
        measures.add(measure);
        return new Line(measures);
    }

    Repeat createRepeat() {
        List<RepeatElement> repeated = new ArrayList<>();
        List<RepeatElement> endings = new ArrayList<>();
        repeated.add(createLine());
        endings.add(createLine());
        endings.add(createMeasure());
        return new Repeat(repeated, endings);
    }

    Repeat createRepeat(RepeatElement element) {
        List<RepeatElement> repeated = new ArrayList<>();
        List<RepeatElement> endings = new ArrayList<>();
        repeated.add(createLine());
        endings.add(createMeasure());
        endings.add(element);
        return new Repeat(repeated, endings);
    }

    Header parseHeader(String toParse) {
        ANTLRInputStream stream = new ANTLRInputStream(toParse);

        HeaderLexer lexer = new HeaderLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HeaderParser parser = new HeaderParser(tokens);
        ParseTree headerTree = parser.root().getChild(0);

        HeaderListener headerListener = new MusicHeaderBuilder();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(headerListener, headerTree);
        MusicHeaderBuilder hb = (MusicHeaderBuilder) headerListener;
        Header header = (Header) hb.getHeader();

        return header;
    }

    Body parseBody(String toParse) {
        ANTLRInputStream stream = new ANTLRInputStream(toParse);

        BodyLexer lexer = new BodyLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BodyParser parser = new BodyParser(tokens);
        ParseTree bodyTree = parser.body();

        Trees.inspect(bodyTree, parser);

        BodyListener bodyListener = new MusicBodyBuilder();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(bodyListener, bodyTree);
        MusicBodyBuilder bb = (MusicBodyBuilder) bodyListener;
        Body body = (Body) bb.getBody();

        return body;
    }
}

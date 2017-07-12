package abc.music;

import abc.parser.*;
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

    Chord createChord(Note note) {
        List<Note> notes = createNoteList();
        notes.add(note);
        return new Chord(notes, createNoteLength());
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
        List<Line> repeated = new ArrayList<>();
        List<Line> endings = new ArrayList<>();
        repeated.add(createLine());
        endings.add(createLine());
        endings.add(createLine());
        return new Repeat(repeated, endings);
    }

    Repeat createRepeat(Line line) {
        List<Line> repeated = new ArrayList<>();
        List<Line> endings = new ArrayList<>();
        repeated.add(createLine());
        endings.add(createLine(createMeasure()));
        endings.add(line);
        return new Repeat(repeated, endings);
    }

    VoicePart createVoicePart() {
        Voice voice = new Voice("Test Voice");
        List<VoicePartElement> elements = new ArrayList<>();
        elements.add(createLine());
        elements.add(createRepeat());
        return new VoicePart(voice, elements);
    }

    VoicePart createVoicePart(VoicePartElement element) {
        Voice voice = new Voice("Test Voice with Element");
        List<VoicePartElement> elements = new ArrayList<>();
        elements.add(element);
        return new VoicePart(voice, elements);
    }

    Section createSection() {
        List<SectionElement> elements = new ArrayList<>();
        elements.add(createLine());
        return new Section(elements);
    }

    Section createSection(SectionElement element) {
        List<SectionElement> elements = new ArrayList<>();
        elements.add(element);
        return new Section(elements);
    }

    Body createBody() {
        List<Section> sections = new ArrayList<>();
        sections.add(createSection());
        sections.add(createSection());
        return new Body(sections);
    }

    Body createBody(Section section) {
        List<Section> sections = new ArrayList<>();
        sections.add(section);
        sections.add(createSection(createRepeat()));
        return new Body(sections);
    }

    Header createHeader(Index index) {
        return new Header(index, new Title("Title"), new Key(Key.Keys.AMAJOR));
    }

    Header createHeader(Title title) {
        return new Header(new Index(0), title, new Key(Key.Keys.AMAJOR));
    }

    Header createHeader(Key key) {
        return new Header(new Index(0), new Title("Title"), key);
    }

    Header createHeader(Meter meter) {
        return new Header(new Index(0), new Title("Title"), new Key(Key.Keys.AMAJOR), meter, null, null, null,
                null);
    }

    Header createHeader(DefaultNoteLength length) {
        return new Header(new Index(0), new Title("Title"), new Key(Key.Keys.AMAJOR), null, length, null, null,
                null);
    }

    Header createHeader(DefaultNoteLength length, Meter meter) {
        return new Header(new Index(0), new Title("Title"), new Key(Key.Keys.AMAJOR), meter, length, null, null,
                null);
    }

    Header createHeader(Tempo tempo) {
        return new Header(new Index(0), new Title("Title"), new Key(Key.Keys.AMAJOR), null, null, tempo, null,
                null);
    }

    Header createHeader(Tempo tempo, DefaultNoteLength length) {
        return new Header(new Index(0), new Title("Title"), new Key(Key.Keys.AMAJOR), null, length, tempo, null,
                null);
    }

    Header createHeader(Composer composer) {
        return new Header(new Index(0), new Title("Title"), new Key(Key.Keys.AMAJOR), null, null, null, composer,
                null);
    }

    Header createHeader(Voice voice) {
        List<Voice> voices = new ArrayList<>();
        voices.add(voice);
        return new Header(new Index(0), new Title("Title"), new Key(Key.Keys.AMAJOR), null, null, null, null,
                voices);
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

        BodyListener bodyListener = new MusicBodyBuilder();
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(bodyListener, bodyTree);
        MusicBodyBuilder bb = (MusicBodyBuilder) bodyListener;
        Body body = (Body) bb.getBody();

        return body;
    }
}

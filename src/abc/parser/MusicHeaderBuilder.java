package abc.parser;

import abc.music.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Builds Music object for Header from parse tree
 */
public class MusicHeaderBuilder implements HeaderListener {
    /**
     * The stack contains the Music objects representing each parse subtree walked so far, but whose parent has not been
     * exited by the walk.  The stack is ordered by recency of visit, such that the item at the top of the stack is the
     * Music object for the most recently walked subtree.
     * <p>
     * When a node is exited by the walk, its children are on top of the stack.  The values are popped and combined and
     * a new Music object representing the entire subtree is pushed onto the stack.
     * <p>
     * When a walk is completed, the Music object representing the entire tree is the sole object on the stack.
     */
    private final Stack<Music> stack = new Stack<>();

    public Music getHeader() {
        return stack.get(0);
    }

    @Override
    public void enterRoot(HeaderParser.RootContext ctx) {

    }

    @Override
    public void exitRoot(HeaderParser.RootContext ctx) {

    }

    @Override
    public void enterHeader(HeaderParser.HeaderContext ctx) {

    }

    @Override
    public void exitHeader(HeaderParser.HeaderContext ctx) {
        Index index = null;
        Title title = null;
        Key key = null;
        Composer composer = null;
        Meter meter = null;
        DefaultNoteLength length = null;
        Tempo tempo = null;
        List<Voice> voiceList = new ArrayList<>();
        Voice[] voices = null;

        while (!stack.isEmpty()) {
            Music field = stack.peek();
            switch (field.getType()) {
                case INDEX:
                    index = (Index) stack.pop();
                    break;
                case TITLE:
                    title = (Title) stack.pop();
                    break;
                case KEY:
                    key = (Key) stack.pop();
                    break;
                case COMPOSER:
                    composer = (Composer) stack.pop();
                    break;
                case METER:
                    meter = (Meter) stack.pop();
                    break;
                case DEFAULTNOTELENGTH:
                    length = (DefaultNoteLength) stack.pop();
                    break;
                case TEMPO:
                    tempo = (Tempo) stack.pop();
                    break;
                case VOICE:
                    voiceList.add(0, (Voice) stack.pop());
                    break;
            }
            if (voiceList.size() > 0) {
                voices = voiceList.toArray(new Voice[voiceList.size()]);
            }
        }
        stack.push(new Header(index, title, key, meter, length, tempo, composer, voices));
    }

    @Override
    public void enterFieldindex(HeaderParser.FieldindexContext ctx) {

    }

    @Override
    public void exitFieldindex(HeaderParser.FieldindexContext ctx) {
        Integer index;
        if (ctx.getChild(1).getText().trim().length() > 0) {
            index = Integer.parseInt(ctx.getChild(1).getText());
        } else {
            index = null;
        }
        stack.push(new Index(index));
    }

    @Override
    public void enterFieldtitle(HeaderParser.FieldtitleContext ctx) {

    }

    @Override
    public void exitFieldtitle(HeaderParser.FieldtitleContext ctx) {
        stack.push(new Title(ctx.getChild(1).getText()));
    }

    @Override
    public void enterOtherfields(HeaderParser.OtherfieldsContext ctx) {

    }

    @Override
    public void exitOtherfields(HeaderParser.OtherfieldsContext ctx) {

    }

    @Override
    public void enterFieldcomposer(HeaderParser.FieldcomposerContext ctx) {

    }

    @Override
    public void exitFieldcomposer(HeaderParser.FieldcomposerContext ctx) {
        stack.push(new Composer(ctx.getChild(1).getText()));
    }

    @Override
    public void enterFieldlength(HeaderParser.FieldlengthContext ctx) {

    }

    @Override
    public void exitFieldlength(HeaderParser.FieldlengthContext ctx) {
        DefaultNoteLength length;
        String raw = ctx.getChild(1).getText();
        int index = raw.indexOf("/");
        if (index == -1) {
            length = new DefaultNoteLength(Integer.parseInt(raw), 1);
        } else {
            length = new DefaultNoteLength(Integer.parseInt(raw.substring(0, index)), Integer.parseInt(raw.substring
                    (index + 1)));
        }
        stack.push(length);
    }

    @Override
    public void enterFieldmeter(HeaderParser.FieldmeterContext ctx) {

    }

    @Override
    public void exitFieldmeter(HeaderParser.FieldmeterContext ctx) {
        Meter meter;
        String raw = ctx.getChild(1).getText();
        int index = raw.indexOf("/");
        if (index > 0) {
            meter = new Meter(Integer.parseInt(raw.substring(0, index)), Integer.parseInt(raw.substring(index + 1)));
        } else if (raw.contains("C|")) {
            meter = new Meter(2, 2);
        } else if (raw.contains("C")) {
            meter = new Meter(4, 4);
        } else {
            throw new RuntimeException("Invalid meter received from parser: " + raw); //should not reach here - either
            // meter is specified and one of the above will be used or has not been specified and this method will
            // not be called.
        }
        stack.push(meter);
    }

    @Override
    public void enterFieldtempo(HeaderParser.FieldtempoContext ctx) {

    }

    @Override
    public void exitFieldtempo(HeaderParser.FieldtempoContext ctx) {
        Tempo tempo;
        String raw = ctx.getChild(1).getText();
        int slashIndex = raw.indexOf("/");
        int equalsIndex = raw.indexOf("=");
        tempo = new Tempo(Integer.parseInt(raw.substring(equalsIndex+1)), Integer.parseInt(raw.substring(0, slashIndex))
                , Integer.parseInt(raw.substring(slashIndex + 1, equalsIndex)));
        stack.push(tempo);
    }

    @Override
    public void enterFieldvoice(HeaderParser.FieldvoiceContext ctx) {

    }

    @Override
    public void exitFieldvoice(HeaderParser.FieldvoiceContext ctx) {
        stack.push(new Voice(ctx.getChild(1).getText().trim()));
    }

    @Override
    public void enterFieldkey(HeaderParser.FieldkeyContext ctx) {

    }

    @Override
    public void exitFieldkey(HeaderParser.FieldkeyContext ctx) {
        Key key;
        String raw = ctx.getChild(1).getText();
        StringBuilder keyName = new StringBuilder(raw.substring(0,1));
        if (raw.contains("#")) {
            keyName.append("SHARP");
        } else if (raw.contains("b")) {
            keyName.append("FLAT");
        }
        if (raw.contains("m")) {
            keyName.append("MINOR");
        } else {
            keyName.append("MAJOR");
        }
        key = new Key(Key.Keys.valueOf(keyName.toString()));
        stack.push(key);
    }

    @Override
    public void enterMeter(HeaderParser.MeterContext ctx) {

    }

    @Override
    public void exitMeter(HeaderParser.MeterContext ctx) {

    }

    @Override
    public void enterBody(HeaderParser.BodyContext ctx) {

    }

    @Override
    public void exitBody(HeaderParser.BodyContext ctx) {

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

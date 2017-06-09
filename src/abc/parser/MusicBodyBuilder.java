package abc.parser;

import abc.music.Music;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;

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
    private Stack<Music> stack = new Stack<Music>();

    @Override
    public void enterBody(BodyParser.BodyContext ctx) {

    }

    @Override
    public void exitBody(BodyParser.BodyContext ctx) {

    }

    @Override
    public void enterLine(BodyParser.LineContext ctx) {

    }

    @Override
    public void exitLine(BodyParser.LineContext ctx) {

    }

    @Override
    public void enterElement(BodyParser.ElementContext ctx) {

    }

    @Override
    public void exitElement(BodyParser.ElementContext ctx) {

    }

    @Override
    public void enterNoteelement(BodyParser.NoteelementContext ctx) {

    }

    @Override
    public void exitNoteelement(BodyParser.NoteelementContext ctx) {

    }

    @Override
    public void enterNote(BodyParser.NoteContext ctx) {

    }

    @Override
    public void exitNote(BodyParser.NoteContext ctx) {

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

    }

    @Override
    public void enterNotelengthstrict(BodyParser.NotelengthstrictContext ctx) {

    }

    @Override
    public void exitNotelengthstrict(BodyParser.NotelengthstrictContext ctx) {

    }

    @Override
    public void enterBasenote(BodyParser.BasenoteContext ctx) {

    }

    @Override
    public void exitBasenote(BodyParser.BasenoteContext ctx) {

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
    public void enterMultinote(BodyParser.MultinoteContext ctx) {

    }

    @Override
    public void exitMultinote(BodyParser.MultinoteContext ctx) {

    }

    @Override
    public void enterMidtunefield(BodyParser.MidtunefieldContext ctx) {

    }

    @Override
    public void exitMidtunefield(BodyParser.MidtunefieldContext ctx) {

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

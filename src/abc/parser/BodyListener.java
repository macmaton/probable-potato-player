// Generated from Body.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BodyParser}.
 */
public interface BodyListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link BodyParser#body}.
     *
     * @param ctx the parse tree
     */
    void enterBody(BodyParser.BodyContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#body}.
     *
     * @param ctx the parse tree
     */
    void exitBody(BodyParser.BodyContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#line}.
     *
     * @param ctx the parse tree
     */
    void enterLine(BodyParser.LineContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#line}.
     *
     * @param ctx the parse tree
     */
    void exitLine(BodyParser.LineContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#element}.
     *
     * @param ctx the parse tree
     */
    void enterElement(BodyParser.ElementContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#element}.
     *
     * @param ctx the parse tree
     */
    void exitElement(BodyParser.ElementContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#noteelement}.
     *
     * @param ctx the parse tree
     */
    void enterNoteelement(BodyParser.NoteelementContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#noteelement}.
     *
     * @param ctx the parse tree
     */
    void exitNoteelement(BodyParser.NoteelementContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#note}.
     *
     * @param ctx the parse tree
     */
    void enterNote(BodyParser.NoteContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#note}.
     *
     * @param ctx the parse tree
     */
    void exitNote(BodyParser.NoteContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#noterest}.
     *
     * @param ctx the parse tree
     */
    void enterNoterest(BodyParser.NoterestContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#noterest}.
     *
     * @param ctx the parse tree
     */
    void exitNoterest(BodyParser.NoterestContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#pitch}.
     *
     * @param ctx the parse tree
     */
    void enterPitch(BodyParser.PitchContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#pitch}.
     *
     * @param ctx the parse tree
     */
    void exitPitch(BodyParser.PitchContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#octave}.
     *
     * @param ctx the parse tree
     */
    void enterOctave(BodyParser.OctaveContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#octave}.
     *
     * @param ctx the parse tree
     */
    void exitOctave(BodyParser.OctaveContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#notelength}.
     *
     * @param ctx the parse tree
     */
    void enterNotelength(BodyParser.NotelengthContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#notelength}.
     *
     * @param ctx the parse tree
     */
    void exitNotelength(BodyParser.NotelengthContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#notelengthstrict}.
     *
     * @param ctx the parse tree
     */
    void enterNotelengthstrict(BodyParser.NotelengthstrictContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#notelengthstrict}.
     *
     * @param ctx the parse tree
     */
    void exitNotelengthstrict(BodyParser.NotelengthstrictContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#basenote}.
     *
     * @param ctx the parse tree
     */
    void enterBasenote(BodyParser.BasenoteContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#basenote}.
     *
     * @param ctx the parse tree
     */
    void exitBasenote(BodyParser.BasenoteContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#tupletelement}.
     *
     * @param ctx the parse tree
     */
    void enterTupletelement(BodyParser.TupletelementContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#tupletelement}.
     *
     * @param ctx the parse tree
     */
    void exitTupletelement(BodyParser.TupletelementContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#tupletspec}.
     *
     * @param ctx the parse tree
     */
    void enterTupletspec(BodyParser.TupletspecContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#tupletspec}.
     *
     * @param ctx the parse tree
     */
    void exitTupletspec(BodyParser.TupletspecContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#multinote}.
     *
     * @param ctx the parse tree
     */
    void enterMultinote(BodyParser.MultinoteContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#multinote}.
     *
     * @param ctx the parse tree
     */
    void exitMultinote(BodyParser.MultinoteContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#midtunefield}.
     *
     * @param ctx the parse tree
     */
    void enterMidtunefield(BodyParser.MidtunefieldContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#midtunefield}.
     *
     * @param ctx the parse tree
     */
    void exitMidtunefield(BodyParser.MidtunefieldContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#fieldvoice}.
     *
     * @param ctx the parse tree
     */
    void enterFieldvoice(BodyParser.FieldvoiceContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#fieldvoice}.
     *
     * @param ctx the parse tree
     */
    void exitFieldvoice(BodyParser.FieldvoiceContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#endofline}.
     *
     * @param ctx the parse tree
     */
    void enterEndofline(BodyParser.EndoflineContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#endofline}.
     *
     * @param ctx the parse tree
     */
    void exitEndofline(BodyParser.EndoflineContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#comment}.
     *
     * @param ctx the parse tree
     */
    void enterComment(BodyParser.CommentContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#comment}.
     *
     * @param ctx the parse tree
     */
    void exitComment(BodyParser.CommentContext ctx);

    /**
     * Enter a parse tree produced by {@link BodyParser#text}.
     *
     * @param ctx the parse tree
     */
    void enterText(BodyParser.TextContext ctx);

    /**
     * Exit a parse tree produced by {@link BodyParser#text}.
     *
     * @param ctx the parse tree
     */
    void exitText(BodyParser.TextContext ctx);
}
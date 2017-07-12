// Generated from /home/margaret/workspace/abcplayer/src/abc/parser/Body.g4 by ANTLR 4.7
package abc.parser;

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
	 * @param ctx the parse tree
	 */
	void enterBody(BodyParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(BodyParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(BodyParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(BodyParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#sectionelement}.
	 * @param ctx the parse tree
	 */
	void enterSectionelement(BodyParser.SectionelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#sectionelement}.
	 * @param ctx the parse tree
	 */
	void exitSectionelement(BodyParser.SectionelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#voicepart}.
	 * @param ctx the parse tree
	 */
	void enterVoicepart(BodyParser.VoicepartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#voicepart}.
	 * @param ctx the parse tree
	 */
	void exitVoicepart(BodyParser.VoicepartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#voicepartelement}.
	 * @param ctx the parse tree
	 */
	void enterVoicepartelement(BodyParser.VoicepartelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#voicepartelement}.
	 * @param ctx the parse tree
	 */
	void exitVoicepartelement(BodyParser.VoicepartelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#repeatstart}.
	 * @param ctx the parse tree
	 */
	void enterRepeatstart(BodyParser.RepeatstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#repeatstart}.
	 * @param ctx the parse tree
	 */
	void exitRepeatstart(BodyParser.RepeatstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#repeatend}.
	 * @param ctx the parse tree
	 */
	void enterRepeatend(BodyParser.RepeatendContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#repeatend}.
	 * @param ctx the parse tree
	 */
	void exitRepeatend(BodyParser.RepeatendContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#repeatfull}.
	 * @param ctx the parse tree
	 */
	void enterRepeatfull(BodyParser.RepeatfullContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#repeatfull}.
	 * @param ctx the parse tree
	 */
	void exitRepeatfull(BodyParser.RepeatfullContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#repeatendingline}.
	 * @param ctx the parse tree
	 */
	void enterRepeatendingline(BodyParser.RepeatendinglineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#repeatendingline}.
	 * @param ctx the parse tree
	 */
	void exitRepeatendingline(BodyParser.RepeatendinglineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#repeatending}.
	 * @param ctx the parse tree
	 */
	void enterRepeatending(BodyParser.RepeatendingContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#repeatending}.
	 * @param ctx the parse tree
	 */
	void exitRepeatending(BodyParser.RepeatendingContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(BodyParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(BodyParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#measure}.
	 * @param ctx the parse tree
	 */
	void enterMeasure(BodyParser.MeasureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#measure}.
	 * @param ctx the parse tree
	 */
	void exitMeasure(BodyParser.MeasureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#measureelement}.
	 * @param ctx the parse tree
	 */
	void enterMeasureelement(BodyParser.MeasureelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#measureelement}.
	 * @param ctx the parse tree
	 */
	void exitMeasureelement(BodyParser.MeasureelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#tupletelement}.
	 * @param ctx the parse tree
	 */
	void enterTupletelement(BodyParser.TupletelementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#tupletelement}.
	 * @param ctx the parse tree
	 */
	void exitTupletelement(BodyParser.TupletelementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(BodyParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(BodyParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#noterest}.
	 * @param ctx the parse tree
	 */
	void enterNoterest(BodyParser.NoterestContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#noterest}.
	 * @param ctx the parse tree
	 */
	void exitNoterest(BodyParser.NoterestContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#pitch}.
	 * @param ctx the parse tree
	 */
	void enterPitch(BodyParser.PitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#pitch}.
	 * @param ctx the parse tree
	 */
	void exitPitch(BodyParser.PitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#octave}.
	 * @param ctx the parse tree
	 */
	void enterOctave(BodyParser.OctaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#octave}.
	 * @param ctx the parse tree
	 */
	void exitOctave(BodyParser.OctaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#notelength}.
	 * @param ctx the parse tree
	 */
	void enterNotelength(BodyParser.NotelengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#notelength}.
	 * @param ctx the parse tree
	 */
	void exitNotelength(BodyParser.NotelengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#tuplet}.
	 * @param ctx the parse tree
	 */
	void enterTuplet(BodyParser.TupletContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#tuplet}.
	 * @param ctx the parse tree
	 */
	void exitTuplet(BodyParser.TupletContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#chord}.
	 * @param ctx the parse tree
	 */
	void enterChord(BodyParser.ChordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#chord}.
	 * @param ctx the parse tree
	 */
	void exitChord(BodyParser.ChordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#fieldvoice}.
	 * @param ctx the parse tree
	 */
	void enterFieldvoice(BodyParser.FieldvoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#fieldvoice}.
	 * @param ctx the parse tree
	 */
	void exitFieldvoice(BodyParser.FieldvoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#endofline}.
	 * @param ctx the parse tree
	 */
	void enterEndofline(BodyParser.EndoflineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#endofline}.
	 * @param ctx the parse tree
	 */
	void exitEndofline(BodyParser.EndoflineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(BodyParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(BodyParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BodyParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(BodyParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BodyParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(BodyParser.TextContext ctx);
}
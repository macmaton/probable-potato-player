// Generated from Header.g4 by ANTLR 4.5.1

package abc.parser;
// Do not edit this .java file! Edit the .g4 file and re-run Antlr.

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HeaderParser}.
 */
public interface HeaderListener extends ParseTreeListener {
  /**
   * Enter a parse tree produced by {@link HeaderParser#root}.
   * @param ctx the parse tree
   */
  void enterRoot(HeaderParser.RootContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#root}.
   * @param ctx the parse tree
   */
  void exitRoot(HeaderParser.RootContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#header}.
   * @param ctx the parse tree
   */
  void enterHeader(HeaderParser.HeaderContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#header}.
   * @param ctx the parse tree
   */
  void exitHeader(HeaderParser.HeaderContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#fieldindex}.
   * @param ctx the parse tree
   */
  void enterFieldindex(HeaderParser.FieldindexContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#fieldindex}.
   * @param ctx the parse tree
   */
  void exitFieldindex(HeaderParser.FieldindexContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#fieldtitle}.
   * @param ctx the parse tree
   */
  void enterFieldtitle(HeaderParser.FieldtitleContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#fieldtitle}.
   * @param ctx the parse tree
   */
  void exitFieldtitle(HeaderParser.FieldtitleContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#fieldkey}.
   * @param ctx the parse tree
   */
  void enterFieldkey(HeaderParser.FieldkeyContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#fieldkey}.
   * @param ctx the parse tree
   */
  void exitFieldkey(HeaderParser.FieldkeyContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#otherfields}.
   * @param ctx the parse tree
   */
  void enterOtherfields(HeaderParser.OtherfieldsContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#otherfields}.
   * @param ctx the parse tree
   */
  void exitOtherfields(HeaderParser.OtherfieldsContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#fieldcomposer}.
   * @param ctx the parse tree
   */
  void enterFieldcomposer(HeaderParser.FieldcomposerContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#fieldcomposer}.
   * @param ctx the parse tree
   */
  void exitFieldcomposer(HeaderParser.FieldcomposerContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#fieldlength}.
   * @param ctx the parse tree
   */
  void enterFieldlength(HeaderParser.FieldlengthContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#fieldlength}.
   * @param ctx the parse tree
   */
  void exitFieldlength(HeaderParser.FieldlengthContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#fieldmeter}.
   * @param ctx the parse tree
   */
  void enterFieldmeter(HeaderParser.FieldmeterContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#fieldmeter}.
   * @param ctx the parse tree
   */
  void exitFieldmeter(HeaderParser.FieldmeterContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#fieldtempo}.
   * @param ctx the parse tree
   */
  void enterFieldtempo(HeaderParser.FieldtempoContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#fieldtempo}.
   * @param ctx the parse tree
   */
  void exitFieldtempo(HeaderParser.FieldtempoContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#fieldvoice}.
   * @param ctx the parse tree
   */
  void enterFieldvoice(HeaderParser.FieldvoiceContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#fieldvoice}.
   * @param ctx the parse tree
   */
  void exitFieldvoice(HeaderParser.FieldvoiceContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#meter}.
   * @param ctx the parse tree
   */
  void enterMeter(HeaderParser.MeterContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#meter}.
   * @param ctx the parse tree
   */
  void exitMeter(HeaderParser.MeterContext ctx);
  /**
   * Enter a parse tree produced by {@link HeaderParser#body}.
   * @param ctx the parse tree
   */
  void enterBody(HeaderParser.BodyContext ctx);
  /**
   * Exit a parse tree produced by {@link HeaderParser#body}.
   * @param ctx the parse tree
   */
  void exitBody(HeaderParser.BodyContext ctx);
}
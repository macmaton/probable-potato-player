/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Header;
import Configuration;

root: header body;
header: fieldindex comment* fieldtitle otherfields* fieldkey;
fieldindex: 'X:' DIGIT+ endofline;
fieldtitle: 'T:' text endofline;
otherfields: fieldcomposer | fieldlength | fieldmeter | fieldtempo | fieldvoice | comment;
fieldcomposer: 'C:' text endofline;
fieldlength: 'L:' notelengthstrict endofline;
fieldmeter: 'M:' meter endofline;
fieldtempo: 'Q:' tempo endofline;
fieldvoice: 'V:' text endofline;
fieldkey: 'K:' ('A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g') ('m'?) (('#' | 'b')?) endofline;

notelengthstrict: DIGIT+ '/' DIGIT+;

meter: 'C' | 'C|' | fraction;
fraction: DIGIT+ '/' DIGIT+;

tempo: fraction '=' DIGIT+;

endofline: comment | NEWLINE;
comment: '%' text NEWLINE;

body: (text NEWLINE)* EOF;

text: CHAR+;

DIGIT: [0-9];
NEWLINE: '\n' | '\r''\n'?;
WHITESPACE: ' ' | '\t';
CHAR: ~[NEWLINE];

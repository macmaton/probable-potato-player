/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Body;
import Configuration;

body: line+;
line: element* endofline | midtunefield | comment;
element: noteelement WHITESPACE? | tupletelement WHITESPACE | BARLINE WHITESPACE? | NTHREPEAT WHITESPACE?;
noteelement: note | multinote;
note: noterest notelength;
noterest: pitch | REST;
pitch: ACCIDENTAL? basenote octave?;
octave: '\'' | ',';
notelength: (DIGIT+)? ('/' (DIGIT+)?)?;
notelengthstrict: DIGIT+ '/' DIGIT+;
basenote: ('A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g');

tupletelement: tupletspec noteelement+;
tupletspec: '(' DIGIT;
multinote: '[' note+ ']';

midtunefield: fieldvoice;
fieldvoice: 'V:' text endofline;

endofline: comment | NEWLINE;
comment: '%' text* NEWLINE;

text: CHAR+;

ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';
NTHREPEAT: '[1' | '[2';
REST: 'z';
DIGIT: [0-9];
NEWLINE: '\n' | '\r''\n'? | EOF;
WHITESPACE: ' ' | '\t';
CHAR: ~[NEWLINE];

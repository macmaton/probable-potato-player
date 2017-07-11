/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Body;
import Configuration;

body: NEWLINE* section+;
section: sectionelement+;
//TODO: parse section start/end (invention, paddy
sectionelement: BARLINE? ((SECTIONBEGINBAR? voicepartelement+) | voicepart+);
voicepart: fieldvoice WHITESPACE? SECTIONBEGINBAR? voicepartelement+;
//sectionstart: SECTIONBEGINBAR voicepartelement;
voicepartelement: repeatstart | repeatend | repeatfull | repeatendingline | line;
repeatstart: REPEATBEGINBAR (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? (endofline+);
repeatend: (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? repeatending? REPEATENDBAR repeatending*
(endofline+ | EOF);
repeatfull: REPEATBEGINBAR (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? repeatending? REPEATENDBAR
repeatending* (endofline+ | EOF);
repeatendingline: (measure BARLINE WHITESPACE?)* repeatending+ (endofline+ | EOF);
repeatending: NTHREPEAT WHITESPACE? (measure BARLINE? WHITESPACE?)+;
line: WHITESPACE* (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? sectionend? (endofline+ | EOF);
measure: WHITESPACE* (measureelement WHITESPACE*)+;
//TODO: adjust parsing of tuplets to allow tuplet BARLINE as well as tuplet WHITESPACE (fur elise)
measureelement: (tuplet WHITESPACE) | tupletelement;
tupletelement: note WHITESPACE? | chord WHITESPACE?;
note: noterest notelength;
noterest: pitch | REST;
pitch: ACCIDENTAL? BASENOTE octave*;
octave: '\'' | ',';
notelength: NUMBER? ('/' NUMBER?)?;
tuplet: TUPLETSPEC tupletelement+;
//tupletspec: '(' NUMBER;
chord: '[' note+? ']' notelength;

//midtunefield: fieldvoice;
fieldvoice: 'V:' WHITESPACE? text endofline;

endofline: (comment | NEWLINE);
comment: '%' text* NEWLINE;
sectionend: SECTIONENDBAR;

text: ((BASENOTE | WHITESPACE)* (CHAR|NUMBER)+ (BASENOTE | WHITESPACE)*)+;

NEWLINE: EOF | '\n' | '\r''\n'? | '\r';
TUPLETSPEC: '(' NUMBER;
BASENOTE: ('A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g');
ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';
BARLINE : '|' | '||';
REPEATBEGINBAR: '|:';
REPEATENDBAR: ':|';
NTHREPEAT: '[1' | '[2';
SECTIONBEGINBAR: '[|' | '[';
SECTIONENDBAR: '|]' | ']';
REST: 'z';
NUMBER: DIGIT+;
WHITESPACE: ' ' | '\t';
CHAR: ~[\r\n];

fragment
DIGIT: [0-9];
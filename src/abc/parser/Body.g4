/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Body;
import Configuration;

body: bodyelement+ EOF;
bodyelement: sectionelement+;
sectionelement: voicepart | line;
voicepart: fieldvoice line;
line: (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? (endofline+ | EOF);
measure: NTHREPEAT? WHITESPACE? measureelement+;
measureelement: tupletelement WHITESPACE? | tuplet WHITESPACE;
tupletelement: note WHITESPACE? | chord WHITESPACE?;
note: noterest notelength;
noterest: pitch | REST;
pitch: ACCIDENTAL? BASENOTE octave*;
octave: '\'' | ',';
notelength: (DIGIT+)? ('/' (DIGIT+)?)?;

tuplet: tupletspec tupletelement+ WHITESPACE;
tupletspec: '(' DIGIT;
chord: '[' note+ ']';

//midtunefield: fieldvoice;
fieldvoice: 'V:' WHITESPACE? text endofline;

endofline: comment | NEWLINE;
comment: '%' text* NEWLINE;

text: (CHAR|DIGIT)+;

BASENOTE: ('A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g');
ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';
NTHREPEAT: '['DIGIT;
REST: 'z';
DIGIT: [0-9];
NEWLINE: '\n' | '\r''\n'? | '\r' | EOF;
WHITESPACE: ' ' | '\t';
CHAR: ~[NEWLINE];
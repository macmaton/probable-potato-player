/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Body;
import Configuration;

body: bodyelement+ EOF;
bodyelement: sectionelement+;
sectionelement: voicepart+ | voicepartelement+;
voicepart: fieldvoice voicepartelement+;
voicepartelement: repeatstart | repeatend | repeatfull | repeatendingline | line;
repeatstart: REPEATBEGINBAR (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? (endofline+);
repeatend: (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? repeatending? REPEATENDBAR repeatending*
(endofline+ | EOF);
repeatfull: REPEATBEGINBAR (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? repeatending? REPEATENDBAR
repeatending* (endofline+ | EOF);
repeatendingline: (measure BARLINE WHITESPACE?)* repeatending+ (endofline+ | EOF);
repeatending: NTHREPEAT WHITESPACE? (measure BARLINE? WHITESPACE?)+;
line: (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? (endofline+ | EOF);
measure: WHITESPACE? (measureelement WHITESPACE?)+;
measureelement: tupletelement | tuplet;
tupletelement: note WHITESPACE? | chord WHITESPACE?;
note: noterest notelength;
noterest: pitch | REST;
pitch: ACCIDENTAL? BASENOTE octave*;
octave: '\'' | ',';
notelength: NUMBER? ('/' NUMBER?)?; //TODO: when there is an accidental followed by '/' notelength does not parse

tuplet: tupletspec tupletelement+;
tupletspec: '(' NUMBER;
chord: '[' note+? ']' notelength;

//midtunefield: fieldvoice;
fieldvoice: 'V:' WHITESPACE? text endofline;

endofline: comment | NEWLINE;
comment: '%' text* NEWLINE;

text: (CHAR|NUMBER)+;

NEWLINE: EOF | '\n' | '\r''\n'? | '\r';
BASENOTE: ('A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g');
ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';
BARLINE : '|' | '||' | '[|' | '|]' ;
REPEATBEGINBAR: '|:';
REPEATENDBAR: ':|';
NTHREPEAT: '[1' | '[2';
REST: 'z';
NUMBER: DIGIT+;
WHITESPACE: ' ' | '\t';
CHAR: ~[\r\n];

fragment
DIGIT: [0-9];
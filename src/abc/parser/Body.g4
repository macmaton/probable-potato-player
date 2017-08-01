/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Body;
import Configuration;

body: NEWLINE* section+;
section: (sectionelement+ SECTIONENDBAR? WHITESPACE* (endofline+ EOF? | EOF)) | ((voicepart endofline+)* (voicepart
SECTIONENDBAR (endofline+ EOF? | EOF))) | (voicepart (endofline+ EOF? | EOF))+;
sectionelement: BARLINE? (SECTIONBEGINBAR? (voicepartelement endofline+)* voicepartelement);
voicepart: fieldvoice WHITESPACE? SECTIONBEGINBAR? (voicepartelement endofline+)* voicepartelement;
voicepartelement: repeatfull | repeatendingline | repeatstart | repeatend | line;
repeatstart: REPEATBEGINBAR (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)?;
repeatend: (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? repeatending+;
repeatfull: REPEATBEGINBAR (measure BARLINE WHITESPACE?)* measure (BARLINE WHITESPACE?)? (repeatending+ | REPEATENDBAR);
repeatendingline: /*(measure BARLINE WHITESPACE?)* */repeatending+;
repeatending: NTHREPEAT WHITESPACE* (measure BARLINE WHITESPACE?)* (measure REPEATENDBAR WHITESPACE?);
line: WHITESPACE* ((measure BARLINE WHITESPACE?)+ measure? | measure WHITESPACE*) ;
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
chord: '[' note+? ']' /*notelength*/;

//midtunefield: fieldvoice;
fieldvoice: 'V:' WHITESPACE? text endofline;

endofline: (comment | NEWLINE);
comment: '%' text* NEWLINE;

text: ((BASENOTE | WHITESPACE)* (CHAR|NUMBER)+ (BASENOTE | WHITESPACE)*)+;

NEWLINE: '\r\n' | '\r' | '\n';
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
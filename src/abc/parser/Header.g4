/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Header;
import Configuration;

root: header body;
header: fieldindex endofline* fieldtitle otherfields* fieldkey;
fieldindex: INDEXMARKER DIGIT+ endofline;
fieldtitle: TITLEMARKER text endofline;
fieldkey: KEYMARKER endofline;
otherfields: fieldcomposer | fieldlength | fieldmeter | fieldtempo | fieldvoice | comment;
fieldcomposer: COMPOSERMARKER text endofline;
fieldlength: LENGTHMARKER notelengthstrict endofline;
fieldmeter: METERMARKER meter endofline;
fieldtempo: TEMPOMARKER tempo endofline;
fieldvoice: VOICEMARKER text endofline;

notelengthstrict: DIGIT+ '/' DIGIT+;

meter: 'C' | 'C|' | fraction;
fraction: DIGIT+ FRACTIONLINE DIGIT+;

tempo: fraction '=' DIGIT+;

endofline: comment | NEWLINE;
comment: COMMENTMARKER text+ NEWLINE;

body: (text+ NEWLINE)* EOF;

text: CHAR+;

INDEXMARKER: 'X:' ' '?;
TITLEMARKER: 'T:' ' '?;
KEYMARKER: 'K:' ' '? ('A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G') ('m'?) (('#' | 'b')?);
COMPOSERMARKER: 'C:' ' '?;
LENGTHMARKER: 'L:' ' '?;
METERMARKER: 'M:' ' '?;
TEMPOMARKER: 'Q:' ' '?;
VOICEMARKER: 'V:' ' '?;
FRACTIONLINE: '/';
COMMENTMARKER: '%';
DIGIT: [0-9];
NEWLINE: '\n' | '\r''\n'?;
WHITESPACE: ' ' | '\t';
CHAR: .;
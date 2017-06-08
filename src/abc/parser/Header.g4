/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Header;
import Configuration;

root: header;
header: fieldindex ENDOFLINE* fieldtitle otherfields* fieldkey body;
fieldindex: INDEXMARKER NUMBER ENDOFLINE;
fieldtitle: TITLEMARKER TEXT ENDOFLINE;
fieldkey: KEYMARKER ('A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G') ('m'?) (('#' | 'b')?) ENDOFLINE;
otherfields: fieldcomposer | fieldlength | fieldmeter | fieldtempo | fieldvoice | COMMENT;
fieldcomposer: COMPOSERMARKER TEXT ENDOFLINE;
fieldlength: LENGTHMARKER (FRACTION | NUMBER) ENDOFLINE;
fieldmeter: METERMARKER meter ENDOFLINE;
fieldtempo: TEMPOMARKER TEMPO ENDOFLINE;
fieldvoice: VOICEMARKER NUMBER?TEXT* ENDOFLINE;

meter: 'C' | 'C|' | FRACTION;

body: (VOICEMARKER? (TEXT | NUMBER | BARLINE)* ENDOFLINE)* EOF;

INDEXMARKER: 'X:' WHITESPACE?;
TITLEMARKER: 'T:' WHITESPACE?;
KEYMARKER: 'K:' WHITESPACE?;
COMPOSERMARKER: 'C:' WHITESPACE?;
LENGTHMARKER: 'L:' WHITESPACE?;
METERMARKER: 'M:' WHITESPACE?;
NUMBER: [0-9]+;
FRACTION: NUMBER '/' NUMBER;
TEMPOMARKER: 'Q:' WHITESPACE?;
TEMPO: FRACTION '=' NUMBER;
VOICEMARKER: 'V:' WHITESPACE?;
ENDOFLINE: (COMMENT NEWLINE) | NEWLINE;
COMMENT: '%' TEXT?;
BARLINE : '|' | '||' | '[|' | '|]' | ':|' | '|:';
TEXT: CHAR+;

fragment
WHITESPACE: ' ' | '\t';
NEWLINE: '\n' | '\r''\n'?;
CHAR: ~[:\n];
grammar FunctionCraft;

// Lexer rules
// The lexer rules define patterns for recognizing tokens like numbers, booleans, strings,
// comments, keywords, identifiers, and operators in the input text. These rules are used
// by the lexer to break the input into a token stream.

// TODO

// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

// TODO

// PARSER RULES

functionCraft : (function | comment | pattern)* main comment* ;

comment : SINGLE_LINE_COMMENT | MULTY_LINE_COMMENT ;

pattern : patternDeclaration (CASE condition ASSIGN value)+ SEMICOLON;

patternDeclaration : PATTERN IDENTIFIER LPAR (declerationArgs) RPAR ;//shayad lazem shod next line ezafe she!

declerationArgs : normalArgs (LBRACKET defaultArgs RBRACKET)? ;

normalArgs : (arg COMMA?)* ;

arg : IDENTIFIER ;

defaultArgs : (arg ASSIGN directValue COMMA?)*;

intVal : (PLUS | MINUS)? INT_VAL ;

floatVal : (PLUS | MINUS)? FLOAT_VAL ;

directValue : intVal | STRING_VAL | floatVal | TRUE | FALSE ;

condition : ;

value : expresion ;

expresion : IDENTIFIER operator expresion | IDENTIFIER | directValue operator expresion | directValue ;//should be checked and completed!

operator : logicalOperator | arithmaticOperator | relationalOperator ;

logicalOperator : AND | OR | NOT ;

arithmaticOperator : PLUS | MINUS | MULT | DIV | MOD ;

relationalOperator : GEQ | LEQ | GTR | LES | EQL | NEQ ;

function : FUNCTION IDENTIFIER LPAR (declerationArgs) RPAR body END_OF_SCOPE;

body : (statement | comment)* ;

statement : ifStatement ;

// IF-ELSEIF-ELSE RULES:

ifStatement : ifBlock elseifBlock* (elseBlock | END_OF_SCOPE) ;

ifBlock : IF condition body ;

elseifBlock : ELSEIF condition body ;

elseBlock : ELSE body END_OF_SCOPE;

declaration : IDENTIFIER assignment value ;

assignment : ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | MOD_ASSIGN ;

main : ;

// LEXICAL RULES

// Keywords

FUNCTION:     'def';
END_OF_SCOPE: 'end';
LAMDA:        '->';
MAIN:         'main';
RETURN:       'return';
IF:           'if';
ELSEIF:       'elseif';
ELSE:         'else';
CHOP:         'chop';
CHOMP:        'chomp';
PUSH:         'push';
PUTS:         'puts';
METHOD:       'method';
LENGTH:       'len';
PATTERN:      'pattern';
MATCH:        'match';
NEXT:         'next';
BREAK:        'break';
LOOP:         'loop';
DO:           'do';
FOR:          'for';
IN:           'in';

// Type Values

FLOAT_VAL:   [0-9]+ '.' [0-9]+;
INT_VAL:     [0-9]+;
TRUE: 'true';
FALSE: 'false';
STRING_VAL: '"' ~["]* '"';

// Parenthesis

LPAR: '(';
RPAR: ')';

// Brackets (list element access)

LBRACKET: '[';
RBRACKET: ']';

// Arithmetic Operators

PLUS:  '+';
MINUS: '-';
MULT:  '*';
DIV:   '/';
MOD:   '%';

// Relational Operators

GEQ: '>=';
LEQ: '<=';
GTR: '>';
LES: '<';
EQL: '==';
NEQ: '!=';

// Logical Operators

AND: '&&';
OR:  '||';
NOT:   '!';

// Other Operators

ASSIGN: '=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

// Symbols

LBRACE:    '{';
RBRACE:    '}';
COMMA:     ',';
SEMICOLON: ';';
CASE:      '\t|' | '    |';

// Other

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT:    '#' ~[\r\n]* -> skip;
MULTY_LINE_COMMENT:'=begin' .*? '=end' -> skip;
WS:         [ \t\r\n]+ -> skip;
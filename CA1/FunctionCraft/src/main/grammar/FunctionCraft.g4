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
//main function comes after all custome functions
program : (function | comment | pattern)* main comment* ;

comment : SINGLE_LINE_COMMENT | MULTY_LINE_COMMENT ;

pattern : patternDeclaration (NEW_LINE CASE condition ASSIGN expression)+ SEMICOLON;

patternDeclaration : PATTERN IDENTIFIER LPAR (declerationArgs) RPAR ;//shayad lazem shod next line ezafe she!

declerationArgs : normalArgs (LBRACKET defaultArgPlural RBRACKET)? ; //TODO: can bracets be empty?

normalArgs : ((declerationArg COMMA)* declerationArg) |;

declerationArg : IDENTIFIER ;   //arg name while decleration

defaultArg : declerationArg ASSIGN expression ;

defaultArgPlural : ((defaultArg COMMA)* defaultArg) |  ;

intVal : (PLUS | MINUS)? INT_VAL ;

floatVal : (PLUS | MINUS)? FLOAT_VAL ;

booleanVal : TRUE | FALSE ;

directValue : intVal | STRING_VAL | floatVal | booleanVal | list;

// func(a); (function call)
// lambda call
// pettern matching call
// directVal
// Identifier
// (y < 5)
compare : expression relationalOperator expression; //TODO

value : IDENTIFIER | directValue | functionCall | lamdaCall | append | functionPointer | patternCall ;

operation : ;

functionCall : (IDENTIFIER LPAR inputArgs RPAR) | builtIn ;

patternCall : IDENTIFIER DOT MATCH LPAR inputArgs RPAR ;

inputArgs : ((expression COMMA)* expression ) | ;

operator : logicalOperator | arithmaticOperator | relationalOperator ;

logicalOperator : AND | OR | NOT ;

arithmaticOperator : PLUS | MINUS | MULT | DIV | MOD ;

relationalOperator : GEQ | LEQ | GTR | LES | EQL | NEQ ;

returnStatement: RETURN (expression | LAMDA)? SEMICOLON; //TODO: update due to expression changes

lambdaFuncDecleration : LAMDA LPAR (declerationArgs) RPAR LBRACE body RBRACE; //TODO: cleaner code

function : FUNCTION IDENTIFIER LPAR (declerationArgs) RPAR body returnStatement? END_OF_SCOPE;

functionPointer : METHOD LPAR COLON IDENTIFIER RPAR ;

lamdaCall : lambdaFuncDecleration LPAR inputArgs RPAR ;

body : | (statement | comment)+ ;

statement : (ifStatement | loopDo | forLoop | builtIn | declaration | lambdaFuncDecleration | expression) SEMICOLON; //TODO: function call

// IF-ELSEIF-ELSE RULES:

ifStatement : ifBlock elseifBlock* (elseBlock | END_OF_SCOPE) ;

//condition :  (value relationalOperator value) ; //TODO: if (1)
condition :  expression | (LPAR expression RPAR logicalOperator)* LPAR expression RPAR ;

//conditionalOperator: GEQ | LEQ | GTR | LES |EQL | NEQ;

ifBlock : IF condition body ;

elseifBlock : ELSEIF condition body;

elseBlock : ELSE body END_OF_SCOPE;

// LOOP-DO RULES :

loopDo : LOOP DO loopBody END_OF_SCOPE;

// FOR-LOOP RULES :

forLoop : FOR IDENTIFIER IN (IDENTIFIER | range) loopBody END_OF_SCOPE ;

range : LPAR intVal DOT DOT INT_VAL RPAR ;

// IF LOOP :

ifLoopStatement : ifLoopBlock elseifLoopBlock* (elseLoopBlock | END_OF_SCOPE) ;

ifLoopBlock : IF condition (body | break | next) ;

elseifLoopBlock : ELSEIF condition (body | break | next) ;

elseLoopBlock : ELSE (body | break | next) END_OF_SCOPE;

next : NEXT SEMICOLON | nextif ;

nextif : NEXT IF LPAR condition RPAR SEMICOLON ;

break : BREAK SEMICOLON | breakif ;

breakif : BREAK IF LPAR condition RPAR SEMICOLON ;

loopBody : (statement | comment | ifLoopStatement | break | next)+ ;

// BUILTIN FUCNTIONS :

builtIn : chop | chomp | len | puts | push;

chop : (IDENTIFIER ASSIGN)? CHOP LPAR (IDENTIFIER | STRING_VAL) RPAR SEMICOLON;

chomp : (IDENTIFIER ASSIGN)? CHOMP LPAR (IDENTIFIER | STRING_VAL) RPAR SEMICOLON;

len : (IDENTIFIER ASSIGN)? LENGTH LPAR (IDENTIFIER | STRING_VAL | list) RPAR SEMICOLON ;

list : LBRACKET (  | (expression COMMA)* expression) RBRACKET ;

puts : PUTS LPAR (IDENTIFIER | expression) RPAR SEMICOLON ;

push : PUSH LPAR IDENTIFIER COMMA expression RPAR SEMICOLON ;

elementAccess : expression LBRACKET expression RBRACKET ;

declaration : IDENTIFIER assignment expression SEMICOLON;

assignment : ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | MOD_ASSIGN ;

main : FUNCTION MAIN LPAR RPAR {System.out.println("MAIN BODY");} body returnStatement? END_OF_SCOPE;

// OPERATORS :

unaryPostfixOperator : PLUS_PLUS | MINUS_MINUS ;

unaryPrefixOperator : MINUS | NOT ;

multDevideRemainderOperator : MULT | DIV | MOD ;

plusMinusOperator : PLUS | MINUS ;

comparisonOperator : LEQ | LES | GEQ | GTR ;

equalityOperator : EQL | NEQ ;

// EXPRESIONS :

expression : append | orExpression ;

orExpression : or | andExpression ;

andExpression : and | equalityExpression ;

equalityExpression : equality | comparisonExpression ;

comparisonExpression : comparison | incrementOrDecrementExpression ;

incrementOrDecrementExpression : incrementOrDecrement | multOrDevideOrRemainderExpression ;

multOrDevideOrRemainderExpression : multOrDevideOrRemainder | unaryPrefixExpression ;

unaryPrefixExpression : unaryPrefix | unaryPostfixExpression ;

unaryPostfixExpression : unaryPostfix | elementAccessExpression ;

elementAccessExpression : elementAccess | parenthesesExpression ;

parenthesesExpression : LPAR expression RPAR ;

unaryPostfix : expression unaryPostfixOperator ;

unaryPrefix : unaryPostfixOperator expression ;

multOrDevideOrRemainder : expression multDevideRemainderOperator expression ;

incrementOrDecrement : expression plusMinusOperator ;

comparison : expression comparisonOperator expression ;

equality : expression equalityOperator expression ;

and : expression AND expression ;

or : expression OR expression ;

append: expression APPEND expression ;

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
PLUS_PLUS: '++';
MINUS_MINUS: '--';

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
UNARY_INCREMENT: '++';
UNARY_DECREMENT: '--';
APPEND: '<<';

// Symbols

LBRACE:    '{';
RBRACE:    '}';
COMMA:     ',';
SEMICOLON: ';';
CASE:      '\t|' | '    |';
DOT: '.';
NEW_LINE: '\n' | '\r' ;

// Other

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT:    '#' ~[\r\n]* -> skip;
MULTY_LINE_COMMENT:'=begin' .*? '=end' -> skip;
WS:         [ \t\r\n]+ -> skip;

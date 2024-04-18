grammar FunctionCraft;


program : (function | comment | pattern)* main comment* ;

//Declerations:

main : FUNCTION MAIN LPAR RPAR {System.out.println("MAIN");} body returnStatement? END_OF_SCOPE;

pattern : patternDeclaration (('\r\n    |' | '\r\n\t|') condition ASSIGN expression)+ SEMICOLON;

patternDeclaration : PATTERN name = IDENTIFIER {System.out.println("PatternDec: "+$name.text);} LPAR (declerationArgs) RPAR ;//shayad lazem shod next line ezafe she!

comment : SINGLE_LINE_COMMENT | MULTY_LINE_COMMENT ;

declerationArgs : (normalArgs (COMMA LBRACKET defaultArgPlural RBRACKET)?) |
                   normalArgs | LBRACKET defaultArgPlural RBRACKET | //epsilon
                   ;
normalArgs : ((declerationArg COMMA)* declerationArg);

declerationArg : IDENTIFIER ;

defaultArg : declerationArg ASSIGN expression ;

defaultArgPlural : ((defaultArg COMMA)* defaultArg) |  ;


//ٰValues
directValue : intVal | STRING_VAL | floatVal | booleanVal | list;

intVal : (PLUS | MINUS)? INT_VAL ;

floatVal : (PLUS | MINUS)? FLOAT_VAL ;

booleanVal : TRUE | FALSE ;


//Function calls
functionCall : (IDENTIFIER {System.out.println("FunctionCall");} LPAR inputArgs RPAR) | builtIn ;

patternCall : IDENTIFIER DOT MATCH LPAR inputArgs RPAR ;

inputArgs : ((expression COMMA)* expression ) | ;

logicalOperator : AND | OR | NOT ;

returnStatement: RETURN {System.out.println("RETURN");} (expression | lamdaCall)? SEMICOLON;

lambdaFuncDecleration : LAMBDA {System.out.println("Structure: LAMBDA");} LPAR (declerationArgs) RPAR LBRACE body returnStatement? RBRACE;

function : FUNCTION name = IDENTIFIER {System.out.println("FuncDec: "+$name.text);} LPAR (declerationArgs) RPAR body returnStatement? END_OF_SCOPE;

functionPointer : METHOD LPAR COLON IDENTIFIER RPAR;

lamdaCall : lambdaFuncDecleration LPAR inputArgs RPAR ;

body : (statement | comment)* ;

assignmentStatement: name = IDENTIFIER ((LBRACKET (expression) RBRACKET)+)? {System.out.println("Assignment: "+$name.text);} assignmentOperators expression;

statement : (( assignmentStatement | lambdaFuncDecleration | expression | functionCall) SEMICOLON) | ifStatement | loopDo | forLoop;

// IF-ELSEIF-ELSE RULES:

ifStatement : ifBlock elseifBlock* (elseBlock | END_OF_SCOPE) ;

//condition :  (value relationalOperator value) ; //TODO: if (1)
condition :  expression | (LPAR expression RPAR logicalOperator)* LPAR expression RPAR ;

//conditionalOperator: GEQ | LEQ | GTR | LES |EQL | NEQ;

ifBlock : IF {System.out.println("Decision: IF");}   condition body ;

elseifBlock : ELSEIF {System.out.println("Decision: ELSE IF");} condition body;

elseBlock : ELSE {System.out.println("Decision: ELSE");} body END_OF_SCOPE;

// LOOP-DO RULES :

loopDo : LOOP DO {System.out.println("Loop: DO");} loopBody END_OF_SCOPE;

// FOR-LOOP RULES :

forLoop : FOR {System.out.println("Loop: FOR");} IDENTIFIER IN (IDENTIFIER | range) loopBody END_OF_SCOPE ;

range : LPAR intVal DOT DOT INT_VAL RPAR ;

// IF LOOP :

ifLoopStatement : ifLoopBlock elseifLoopBlock* (elseLoopBlock | END_OF_SCOPE) ;

ifLoopBlock : IF {System.out.println("Decision: IF");} condition loopBody ;

elseifLoopBlock : ELSEIF {System.out.println("Decision: ELSE IF");} condition loopBody ;

elseLoopBlock : ELSE {System.out.println("Decision: ELSE");} loopBody END_OF_SCOPE;

next : (NEXT SEMICOLON {System.out.println("Control: NEXT");}) | nextif ;

nextif : NEXT IF {System.out.println("Control: NEXT");} LPAR condition RPAR SEMICOLON ; //TODO: Semicolon

break : (BREAK SEMICOLON {System.out.println("Control: BREAK");}) | breakif ;

breakif : BREAK IF {System.out.println("Control: BREAK");} LPAR condition RPAR SEMICOLON ;

loopBody : (statement | comment | ifLoopStatement | break | next )+ ; //TODO: in loop body there can also be another loop

// BUILTIN FUCNTIONS :

builtIn : (chop )| (chomp ) | (len )
        | (puts ) | (push );

chop : CHOP {System.out.println("Built-In: CHOP");} LPAR expression RPAR;

chomp : CHOMP {System.out.println("Built-In: CHOMP");} LPAR expression RPAR;

len : LENGTH {System.out.println("Built-In: LEN");} LPAR expression RPAR ;

list : LBRACKET (  | (expression COMMA)* expression) RBRACKET ;

listAccess: IDENTIFIER (LBRACKET (expression) RBRACKET)+;

puts : PUTS {System.out.println("Built-In: PUTS");} LPAR expression RPAR ;

push : PUSH {System.out.println("Built-In: PUSH");} LPAR expression COMMA expression RPAR ;

assignmentOperators : ASSIGN| PLUS_ASSIGN | MINUS_ASSIGN |MULT_ASSIGN |DIV_ASSIGN |MOD_ASSIGN;

expression
  : expr_append
  ;

expr_append
  :expr_or expr_append_
  ;

expr_append_
  : APPEND expr_or {System.out.println("Operator: <<");}  expr_append_
  |
  ;

expr_or
  : LPAR expression RPAR expr_or_
  | expr_and
  ;

expr_or_
  : OR  {System.out.println("Operator: ||");} LPAR expression RPAR expr_or_
  |
  ;

expr_and
  : LPAR expression  RPAR expr_and_
  | expr_eq
  ;

expr_and_
  : AND {System.out.println("Operator: &&");} LPAR expression RPAR expr_and_
  |
  ;

expr_eq
  : expr_cmp expr_eq_
  ;

expr_eq_
  : EQL  {System.out.println("Operator: ==");} expr_cmp expr_eq_
  | NEQ  {System.out.println("Operator: !=");} expr_cmp expr_eq_
  |
  ;

expr_cmp
  : expr_add_sub expr_cmp_
  ;

expr_cmp_ //TODO: place of prints
  : GTR  {System.out.println("Operator: >");} expr_add_sub expr_cmp_
  | LES {System.out.println("Operator: <");} expr_add_sub expr_cmp_
  | GEQ {System.out.println("Operator: >=");} expr_add_sub expr_cmp_
  | LEQ {System.out.println("Operator: <=");} expr_add_sub expr_cmp_
  |
  ;

expr_add_sub
  : expr_mul_div expr_add_sub_
  ;

expr_add_sub_
  : PLUS  expr_mul_div {System.out.println("Operator: +");} expr_add_sub_
  | MINUS  expr_mul_div {System.out.println("Operator: -");} expr_add_sub_
  |
  ;

expr_mul_div
  : expr_unary expr_mul_div_
  ;

expr_mul_div_ //TODO: DIV {System.out.println("Operator: /");} expr_unary expr_mul_div_
  : MULT  expr_unary {System.out.println("Operator: *");} expr_mul_div_
  | DIV  expr_unary {System.out.println("Operator: /");} expr_mul_div_
  | MOD expr_unary  {System.out.println("Operator: %");}expr_mul_div_
  |
  ;

expr_unary
  : NOT {System.out.println("Operator: !");} expr_unary_postfix
  | MINUS {System.out.println("Operator: -");} expr_unary_postfix
  | expr_unary_postfix
  ;

expr_unary_postfix
  : expr_other PLUS_PLUS {System.out.println("Operator: ++");} //TODO: print after expr_other or after plus plus?
  | expr_other MINUS_MINUS{System.out.println("Operator: --");}
  | expr_other
  ;

expr_other
  : LPAR expression RPAR
  | list
  | directValue
  | (IDENTIFIER | listAccess) (PLUS_PLUS | MINUS_MINUS)?
  | functionCall
  | functionPointer
  | lamdaCall
  | lambdaFuncDecleration
  |patternCall
  ;

// LEXICAL RULES
// Keywords

FUNCTION:     'def';
END_OF_SCOPE: 'end';
LAMBDA:        '->';
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
APPEND: '<<';

// Symbols

LBRACE:    '{';
RBRACE:    '}';
COMMA:     ',';
SEMICOLON: ';';
DOT: '.';
COLON: ':';

// Other characters

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT:    '#' ~[\r\n]* -> skip;
MULTY_LINE_COMMENT:'=begin' .*? '=end' -> skip;
WS:         [ \t\r\n] [ \t\r\n]? [ \t\r\n]? -> skip;


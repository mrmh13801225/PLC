grammar FunctionCraft;


program : (function | comment | pattern)* main comment* ;

body : (statement | comment)* returnStatement? ;

//Declerations:

main : FUNCTION MAIN LPAR RPAR {System.out.println("MAIN");} body END_OF_SCOPE;

//      Decleration-Arg-Rules:

declerationArg : IDENTIFIER ;

defaultArg : declerationArg ASSIGN expression ;

normalArgs : ((declerationArg COMMA)* declerationArg) ;

defaultArgs : ((defaultArg COMMA)* defaultArg)? ;

declerationArgs : (normalArgs (COMMA LBRACKET defaultArgs RBRACKET)?)
                   | LBRACKET defaultArgs RBRACKET | //epsilon
                   ;

//      Pattern-Decleration-Rules:

patternDeclaration : PATTERN name = IDENTIFIER
                     {System.out.println("PatternDec: "+$name.text);}
                     LPAR (declerationArgs) RPAR ;

pattern : patternDeclaration (('\r\n    |' | '\r\n\t|' | '\n    |' | '\n\t|') condition ASSIGN expression)+ SEMICOLON;

//      Function-Decleration-Rules:

functionDecleration : FUNCTION name = IDENTIFIER
                      {System.out.println("FuncDec: "+$name.text);}
                      LPAR (declerationArgs) RPAR ;

function :  functionDecleration body END_OF_SCOPE;

//      Lambda-Decleration-Rules:

lambdaFunctionDecleration : LAMBDA {System.out.println("Structure: LAMBDA");} LPAR (declerationArgs) RPAR ;

lambdaFunction : lambdaFunctionDecleration LBRACE body RBRACE;

// Input-Args :

inputArgs : ((expression COMMA)* expression )? ;

// Operators:

assignmentOperators : ASSIGN| PLUS_ASSIGN | MINUS_ASSIGN |MULT_ASSIGN |DIV_ASSIGN |MOD_ASSIGN;

logicalOperator : AND | OR | NOT ;

// ٰValues

//      Direct-Values:

directValue : intVal | STRING_VAL | floatVal | booleanVal ;

intVal : (PLUS | MINUS)? INT_VAL ;

floatVal : (PLUS | MINUS)? FLOAT_VAL ;

booleanVal : TRUE | FALSE ;

list : LBRACKET (  | (expression COMMA)* expression) RBRACKET ;

listAccess: IDENTIFIER (LBRACKET (expression) RBRACKET)+;

//      Condition :

//condition : (LPAR expression RPAR logicalOperator)* LPAR expression RPAR ;
condition : LPAR expression RPAR ;

//      Calls:

functionCall : (IDENTIFIER {System.out.println("FunctionCall");} LPAR inputArgs RPAR) | builtIn ;

patternCall : IDENTIFIER DOT MATCH LPAR inputArgs RPAR ;

lamdaCall : lambdaFunction LPAR inputArgs RPAR ;

functionPointer : METHOD LPAR COLON IDENTIFIER RPAR;

// BUILTIN FUCNTIONS :

builtIn : (chop )| (chomp ) | (len )
        | (puts ) | (push );

chop : CHOP {System.out.println("Built-In: CHOP");} LPAR expression RPAR;

chomp : CHOMP {System.out.println("Built-In: CHOMP");} LPAR expression RPAR;

len : LENGTH {System.out.println("Built-In: LEN");} LPAR expression RPAR ;

puts : PUTS {System.out.println("Built-In: PUTS");} LPAR expression RPAR ;

push : PUSH {System.out.println("Built-In: PUSH");} LPAR expression COMMA expression RPAR ;

//

// Expression-Rules:

expression
  : exprAppend
  ;

exprAppend
  :exprOr exprAppend_
  ;

exprAppend_
  : APPEND exprOr {System.out.println("Operator: <<");}  exprAppend_
  |
  ;

exprOr
  : LPAR expression RPAR exprOr_
  | exprAnd
  ;

exprOr_
  : OR  {System.out.println("Operator: ||");} LPAR expression RPAR exprOr_
  |
  ;

exprAnd
  : LPAR expression  RPAR exprAnd_
  | exprEq
  ;

exprAnd_
  : AND {System.out.println("Operator: &&");} LPAR expression RPAR exprAnd_
  |
  ;

exprEq
  : exprCmp exprEq_
  ;

exprEq_
  : EQL  {System.out.println("Operator: ==");} exprCmp exprEq_
  | NEQ  {System.out.println("Operator: !=");} exprCmp exprEq_
  |
  ;

exprCmp
  : exprAddSub exprCmp_
  ;

exprCmp_
  : GTR  {System.out.println("Operator: >");} exprAddSub exprCmp_
  | LES {System.out.println("Operator: <");} exprAddSub exprCmp_
  | GEQ {System.out.println("Operator: >=");} exprAddSub exprCmp_
  | LEQ {System.out.println("Operator: <=");} exprAddSub exprCmp_
  |
  ;

exprAddSub
  : exprMultDiv exprAddSub_
  ;

exprAddSub_
  : PLUS  exprMultDiv {System.out.println("Operator: +");} exprAddSub_
  | MINUS  exprMultDiv {System.out.println("Operator: -");} exprAddSub_
  |
  ;

exprMultDiv
  : exprUnary exprMultDiv_
  ;

exprMultDiv_
  : MULT  exprUnary {System.out.println("Operator: *");} exprMultDiv_
  | DIV  exprUnary {System.out.println("Operator: /");} exprMultDiv_
  | MOD exprUnary  {System.out.println("Operator: %");}exprMultDiv_
  |
  ;

exprUnary
  : NOT {System.out.println("Operator: !");} exprUnaryPostfix
  | MINUS {System.out.println("Operator: -");} exprUnaryPostfix
  | exprUnaryPostfix
  ;

exprUnaryPostfix
  : exprValues PLUS_PLUS {System.out.println("Operator: ++");}
  | exprValues MINUS_MINUS{System.out.println("Operator: --");}
  | exprValues
  ;

exprValues
  : LPAR expression RPAR
  | list
  | directValue
  | (IDENTIFIER | listAccess) (PLUS_PLUS | MINUS_MINUS)?
  | functionCall
  | functionPointer
  | lamdaCall
  | lambdaFunction
  | patternCall
  ;

// Statements:

statement : (( assignmentStatement | expression) SEMICOLON) | ifStatement | loopDo | forLoop;

returnStatement: RETURN {System.out.println("RETURN");} (expression)? SEMICOLON;

assignmentStatement: name = IDENTIFIER ((LBRACKET (expression) RBRACKET)+)?
                     {System.out.println("Assignment: "+$name.text);}
                     assignmentOperators expression;

//      IF-ELSEIF-ELSE RULES:

ifStatement : ifBlock elseifBlock* (elseBlock | END_OF_SCOPE) ;

ifBlock : IF {System.out.println("Decision: IF");} condition body ;

elseifBlock : ELSEIF {System.out.println("Decision: ELSE IF");} condition body;

elseBlock : ELSE {System.out.println("Decision: ELSE");} body END_OF_SCOPE;

//      LOOPS:

//              LOOP-DO RULES:

loopDo : LOOP DO {System.out.println("Loop: DO");} loopBody END_OF_SCOPE;

//              FOR-LOOP RULES:

forLoop : FOR {System.out.println("Loop: FOR");} IDENTIFIER IN (IDENTIFIER | range) loopBody END_OF_SCOPE ;

//      Loop-Statements-Rules:

range : LPAR intVal DOT DOT INT_VAL RPAR ;

loopBody : (statement | comment | ifLoopStatement | break | next )* returnStatement? ;

//              Loop-If-Elseif-Else-Rules:

ifLoopStatement : ifLoopBlock elseifLoopBlock* (elseLoopBlock | END_OF_SCOPE) ;

ifLoopBlock : IF {System.out.println("Decision: IF");} condition loopBody ;

elseifLoopBlock : ELSEIF {System.out.println("Decision: ELSE IF");} condition loopBody ;

elseLoopBlock : ELSE {System.out.println("Decision: ELSE");} loopBody END_OF_SCOPE;

//              Next-Break-Rules:

next : (NEXT SEMICOLON {System.out.println("Control: NEXT");}) | nextif ;

nextif : NEXT IF {System.out.println("Control: NEXT");} condition SEMICOLON ;

break : (BREAK SEMICOLON {System.out.println("Control: BREAK");}) | breakif ;

breakif : BREAK IF {System.out.println("Control: BREAK");} condition SEMICOLON ;

//

comment : SINGLE_LINE_COMMENT | MULTY_LINE_COMMENT ;

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

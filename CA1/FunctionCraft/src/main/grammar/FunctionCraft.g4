grammar FunctionCraft;

program : (function | comment | pattern)* main comment* ;
main : FUNCTION MAIN LPAR RPAR {System.out.println("MAIN BODY");} body returnStatement? END_OF_SCOPE;

comment : SINGLE_LINE_COMMENT | MULTY_LINE_COMMENT ;

//pattern : patternDeclaration ( NEW_LINE CASE condition ASSIGN expression)+ SEMICOLON;
//pattern : patternDeclaration (indentation CASE condition ASSIGN expression)+ SEMICOLON;
pattern : patternDeclaration (('\r\n    |' | '\r\n\t') condition ASSIGN expression)+ SEMICOLON;

indentation : INDENT;


patternDeclaration : PATTERN IDENTIFIER LPAR (declerationArgs) RPAR ;//shayad lazem shod next line ezafe she!

declerationArgs : normalArgs (LBRACKET defaultArgPlural RBRACKET)? ; //TODO: can bracets be empty?

normalArgs : ((declerationArg COMMA)* declerationArg) |;

declerationArg : IDENTIFIER ;   //arg name while decleration

defaultArg : declerationArg ASSIGN expression ;

defaultArgPlural : ((defaultArg COMMA)* defaultArg) |  ;


//ٰValues
directValue : intVal | STRING_VAL | floatVal | booleanVal | list;

value : IDENTIFIER | directValue | functionCall | lamdaCall | functionPointer | patternCall | listAccess;

intVal : (PLUS | MINUS)? INT_VAL ;

floatVal : (PLUS | MINUS)? FLOAT_VAL ;

booleanVal : TRUE | FALSE ;


//Function calls
functionCall : (IDENTIFIER LPAR inputArgs RPAR) | builtIn ;

patternCall : IDENTIFIER DOT MATCH LPAR inputArgs RPAR ;

inputArgs : ((expression COMMA)* expression ) | ;

logicalOperator : AND | OR | NOT ;

returnStatement: RETURN (expression | lamdaCall)? SEMICOLON;

lambdaFuncDecleration : LAMDA LPAR (declerationArgs) RPAR LBRACE body returnStatement? RBRACE;

function : FUNCTION IDENTIFIER LPAR (declerationArgs) RPAR body returnStatement? END_OF_SCOPE;

functionPointer : METHOD LPAR COLON IDENTIFIER RPAR ;

lamdaCall : lambdaFuncDecleration LPAR inputArgs RPAR ;

body : (statement | comment)* ;

assignmentStatement: (IDENTIFIER|listAccess) assignmentOperators expression;

//TODO: doesnt work
statement : (( assignmentStatement | lambdaFuncDecleration | expression | functionCall) SEMICOLON) | ifStatement | loopDo | forLoop;

// IF-ELSEIF-ELSE RULES:

ifStatement : ifBlock elseifBlock* (elseBlock | END_OF_SCOPE) ;

//condition :  (value relationalOperator value) ; //TODO: if (1)
condition :  expression | (LPAR expression RPAR logicalOperator)* LPAR expression RPAR ;

//conditionalOperator: GEQ | LEQ | GTR | LES |EQL | NEQ;

ifBlock : IF condition body ; //TODO: loopbody?

elseifBlock : ELSEIF condition body; // TODO: loopbody?

elseBlock : ELSE body END_OF_SCOPE; // TODO: loopbody?

// LOOP-DO RULES :

loopDo : LOOP DO loopBody END_OF_SCOPE;

// FOR-LOOP RULES :

forLoop : FOR IDENTIFIER IN (IDENTIFIER | range) loopBody END_OF_SCOPE ;

range : LPAR intVal DOT DOT INT_VAL RPAR ;

// IF LOOP :

ifLoopStatement : ifLoopBlock elseifLoopBlock* (elseLoopBlock | END_OF_SCOPE) ;

ifLoopBlock : IF condition loopBody ;

elseifLoopBlock : ELSEIF condition loopBody ;

elseLoopBlock : ELSE loopBody END_OF_SCOPE;

next : NEXT SEMICOLON | nextif ;

nextif : NEXT IF LPAR condition RPAR SEMICOLON ; //TODO: Semicolon

break : BREAK SEMICOLON | breakif ;

breakif : BREAK IF LPAR condition RPAR SEMICOLON ;

loopBody : (statement | comment | ifLoopStatement | break | next )+ ; //TODO: in loop body there can also be another loop

// BUILTIN FUCNTIONS :

builtIn : chop | chomp | len | puts | push;

chop : (IDENTIFIER ASSIGN)? CHOP LPAR (IDENTIFIER | STRING_VAL) RPAR;

chomp : (IDENTIFIER ASSIGN)? CHOMP LPAR (IDENTIFIER | STRING_VAL) RPAR;

len : (IDENTIFIER ASSIGN)? LENGTH LPAR (IDENTIFIER | STRING_VAL | list) RPAR ;

list : LBRACKET (  | (directValue COMMA)* directValue) RBRACKET ;

listAccess: IDENTIFIER (LBRACKET (expression) RBRACKET)+;

puts : PUTS LPAR (IDENTIFIER | expression) RPAR ;

push : PUSH LPAR IDENTIFIER COMMA expression RPAR ;

//elementAccess : expression LBRACKET expression RBRACKET ;

//declaration : IDENTIFIER assignment expression;

//assignment : ASSIGN | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN | MOD_ASSIGN ;

assignmentOperators : ASSIGN| PLUS_ASSIGN | MINUS_ASSIGN |MULT_ASSIGN |DIV_ASSIGN |MOD_ASSIGN; //operators:      = += -= *= /= %=
append: expression APPEND expression ;

expression
  : expr_append
  ;

expr_append
  : expr_or expr_append_
  ;

expr_append_
  : APPEND expr_or expr_append_ {System.out.println("Operator: <<");}
  |
  ;

expr_or
  : LPAR expression RPAR expr_or_
  | expr_and
  ;

expr_or_
  : OR LPAR expression RPAR expr_or_ {System.out.println("Operator: ||");}
  |
  ;

expr_and
  : LPAR expression RPAR expr_and_
  | expr_eq
  ;

expr_and_
  : AND LPAR expression RPAR expr_and_ {System.out.println("Operator: &&");}
  |
  ;

expr_eq
  : expr_cmp expr_eq_
  ;

expr_eq_
  : EQL expr_cmp expr_eq_  {System.out.println("Operator: ==");}
  | NEQ expr_cmp expr_eq_  {System.out.println("Operator: !=");}
  |
  ;

expr_cmp
  : expr_add_sub expr_cmp_
  ;

expr_cmp_
  : GTR expr_add_sub expr_cmp_  {System.out.println("Operator: >");}
  | LES expr_add_sub expr_cmp_  {System.out.println("Operator: <");}
  | GEQ expr_add_sub expr_cmp_  {System.out.println("Operator: >=");}
  | LEQ expr_add_sub expr_cmp_  {System.out.println("Operator: <=");}
  |
  ;

expr_add_sub
  : expr_mul_div expr_add_sub_
  ;

expr_add_sub_
  : PLUS expr_mul_div expr_add_sub_  {System.out.println("Operator: +");}
  | MINUS expr_mul_div expr_add_sub_  {System.out.println("Operator: -");}
  |
  ;

expr_mul_div
  : expr_unary expr_mul_div_
  ;

expr_mul_div_
  : MULT expr_unary expr_mul_div_  {System.out.println("Operator: *");}
  | DIV expr_unary expr_mul_div_  {System.out.println("Operator: /");}
  | MOD expr_unary expr_mul_div_  {System.out.println("Operator: %");}
  |
  ;

expr_unary
  : NOT expr_unary_postfix  {System.out.println("Operator: !");}
  | MINUS expr_unary_postfix  {System.out.println("Operator: -");}
  | expr_unary_postfix
  ;

expr_unary_postfix
  : expr_other  PLUS_PLUS {System.out.println("Operator: ++");} //TODO: print after expr_other or after plus plus?
  | expr_other  MINUS_MINUS{System.out.println("Operator: --");}
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
//  | primitive_value
//  | matching
//  | function_ptr

//
//expression : append | orExpression ;
//
//orExpression : or | andExpression ;
//
//andExpression : and | equalityExpression ;
//
//equalityExpression : equality | comparisonExpression ;
//
//comparisonExpression : comparison | incrementOrDecrementExpression ;
//
//incrementOrDecrementExpression : incrementOrDecrement | multOrDevideOrRemainderExpression ;
//
//multOrDevideOrRemainderExpression : multOrDevideOrRemainder | unaryPrefixExpression ;
//
//unaryPrefixExpression : unaryPrefix | unaryPostfixExpression ;
//
//unaryPostfixExpression : unaryPostfix | elementAccessExpression ;
//
//elementAccessExpression : elementAccess | parenthesesExpression ;
//
//parenthesesExpression : LPAR expression RPAR ;
//
//unaryPostfix : expression unaryPostfixOperator ;
//
//unaryPrefix : unaryPostfixOperator expression ;
//
//multOrDevideOrRemainder : expression multDevideRemainderOperator expression ;
//
//incrementOrDecrement : expression plusMinusOperator ;
//
//comparison : expression comparisonOperator expression ;
//
//equality : expression equalityOperator expression ;
//
//and : expression AND expression ;
//
//or : expression OR expression ;
//



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
APPEND: '<<';

// Symbols

LBRACE:    '{';
RBRACE:    '}';
COMMA:     ',';
SEMICOLON: ';';
CASE:      '\t|' | '    |';
DOT: '.';
COLON: ':';

// Othercr
INDENT : [ \t]+ -> channel(HIDDEN);//, type(INDENT);
//NEW_LINE : '\r\n';
NEW_LINE : '\r'? '\n' -> channel(HIDDEN);//,type(NEW_LINE);

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
SINGLE_LINE_COMMENT:    '#' ~[\r\n]* -> skip;
MULTY_LINE_COMMENT:'=begin' .*? '=end' -> skip;
WS:         [ \t\r\n] [ \t\r\n]? [ \t\r\n]? -> skip;




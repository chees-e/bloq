// Canvas: 100, 100

// watershape:
// 11
// 11

// Define Function PlaceWater(x,y):  ?? (Do at the end)
// For i From 1 To 100 Step 2:
// {
// If (i % 2 == 1) {
// Block: Water 
// Start: i, i  (Optional)
// Shape: water_shape  (Optional)
// } 
// }


// Block 

// Call Function PlaceWater(1,2)

// For i From 1 To 100:
// Block: Water
// Start: i, i

// For i: 1 To 100:
// Start: i, i
// If (i == odd) 
// {
// Block: Water
// } //could remove curly braces later if easier

// Referenced some grammar from
// https://github.com/antlr/grammars-v4/

// Tokenizer
grammar test;
CANVAS: 'canvas';
BLOCK: 'block';
START: 'start';
FOR: 'for';
SHAPE:'shape';
IF:'if';
TO: 'to';
DEFINE: 'define';
CALL: 'call';

EQUAL: '==';
GREATER: '>';
GREATEREQ: '>=';
LESS: '<';
LESSRQ: '<=';
NOTEQ: '!=';

PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';

NUMBER: '-'? [0-9]+;
TEXT: [a-zA-Z0-9]+;
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
OPENCURLY: '{';
CLOSECURLY: '}';
OPENBRACKET: '(';
CLOSEBRACKET: ')';
NEWLINE: '\n';
WS: [\r ]+ -> skip; 

// Parser
// program: (Header WS)? Body; 
// Header: CANVAS COLON WS? NUMBER WS? COMMA WS? NUMBER;
// Body:  (Block | Variable | Loop)+;
// Block:  BLOCK COLON WS? TEXT WS? Start? WS? Shape?;
// Value: (NUMBER WS | Variable);
// Start: START COLON WS? Value WS? COMMA WS? Value;
// Shape: SHAPE COLON WS? (Row+ | Variable);
// Row: NUMBER SEMICOLON WS; 
// Variable: TEXT WS | TEXT COLON WS? (NUMBER WS | Row+);
// Loop: FOR WS Variable COLON WS? Value WS TO WS Value WS? OPENBRACKET WS InLoop WS? CLOSEBRACKET;
// InLoop: (BLOCK | If)+;
// If: IF WS? OPENBRACKET WS? Condition WS? CLOSEBRACKET WS? OPENBRACKET WS InLoop+ WS? CLOSEBRACKET;
// Condition: Expression WS? COMPARISON WS? Expression;
// Expression: Value | Value WS? OPERATOR WS? Expression;

// Header: CANVAS COLON NUMBER COMMA NUMBER;
// Body:  (Block | Variable | Loop)+;
// Block:  BLOCK COLON TEXT Start? Shape?;
// Comparison: (EQUAL | GREATER | GREATEREQ | LESS | LESSRQ | NOTEQ) ;
// Operator: (PLUS | MINUS | MULTIPLY | DIVIDE | MODULO);

// Value: (NUMBER | Variable);
// Start: START COLON Value COMMA Value;
// Shape: SHAPE COLON (Row+ | Variable);
// Row: NUMBER SEMICOLON; 
// Variable: TEXT | TEXT COLON (NUMBER | Row+);
// Loop: FOR Variable COLON Value TO Value OPENBRACKET InLoop CLOSEBRACKET;
// InLoop: (BLOCK | If)+;
// If: IF OPENBRACKET Condition CLOSEBRACKET OPENBRACKET InLoop+ CLOSEBRACKET;
// Condition: Expression COMPARISON Expression;
// Expression: Value | Value OPERATOR Expression;

program: statement+;
statement: ((assignment_statement | function_statement | block_statement | loop_statement | if_statement) NEWLINE+);

assignment_statement: (canvas_assignment | simple_assignment | shape_assignment);
canvas_assignment: CANVAS COLON NUMBER COMMA NUMBER;
simple_assignment: variable COLON (variable | NUMBER);
shape_assignment: variable COLON NEWLINE shape_row+;

function_statement: (define_function | call_function | if_statement);
define_function: DEFINE variable OPENBRACKET args CLOSEBRACKET OPENCURLY NEWLINE* in_function_statement+ NEWLINE* CLOSECURLY;
call_function: CALL variable OPENBRACKET args CLOSEBRACKET;
in_function_statement: (block_statement | loop_statement);

block_statement: BLOCK COLON variable NEWLINE (block_substatement NEWLINE)*;
block_substatement: (block_start_statement | block_shape_statement);
block_start_statement: START COLON value COMMA value;
block_shape_statement: SHAPE COLON NEWLINE? (shape_row+ | variable);

loop_statement: FOR variable COLON Value TO Value OPENCURLY in_loop_statement+ CLOSECURLY;
in_loop_statement: (assignment_statement | block_statement | if_statement); // Allow nested loops?

args: (value (COMMA value)*);
shape_row: NUMBER SEMICOLON NEWLINE?;
variable: TEXT;
value: NUMBER | TEXT;
 

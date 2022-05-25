// Referenced some grammar from
// https://github.com/antlr/grammars-v4/


/*** Commands ***\

antlr4 .\bloq.g4
javac bloq*.java
grun bloq program -gui

canvas: 100, 100

watershape:
001;
010;
100;

lavax: 10

define draw(x,y){
    block: water
    start: x, 10
    shape: watershape

    block: lava
    start: lavax, y
    shape: 
    11;
    01;

    block: land
    start: 10, 10    
}

for i : 1 to 10 {
    if (i % 2 == 1) {
        call draw(i, i)
    }
}

^Z
\****************/

// Parser
grammar bloq;
program: statement+;
statement: ((assignment_statement | function_statement | block_statement | loop_statement | if_statement) NEWLINE+);

assignment_statement: (canvas_assignment | simple_assignment | shape_assignment);
canvas_assignment: CANVAS COLON NUMBER COMMA NUMBER;
simple_assignment: variable COLON (variable | NUMBER);
shape_assignment: variable COLON NEWLINE shape_row+;

function_statement: (define_function | call_function);
define_function: DEFINE variable OPENBRACKET args CLOSEBRACKET OPENCURLY NEWLINE* (in_function_statement NEWLINE+)+ CLOSECURLY;
call_function: CALL variable OPENBRACKET args CLOSEBRACKET;
in_function_statement: (block_statement | loop_statement | call_function| if_statement); // allow calling function in definition

block_statement: BLOCK COLON variable (NEWLINE block_substatement)*;
block_substatement: (block_start_statement | block_shape_statement);
block_start_statement: START COLON value COMMA value;
block_shape_statement: SHAPE COLON NEWLINE? (shape_row+ | variable);

loop_statement: FOR variable COLON value TO value OPENCURLY NEWLINE* (in_loop_statement NEWLINE+)+ CLOSECURLY; 
in_loop_statement: (assignment_statement | block_statement | if_statement | call_function); // not allowing nested loops

if_statement: IF OPENBRACKET condition CLOSEBRACKET OPENCURLY NEWLINE* (in_if_statement NEWLINE+)+ CLOSECURLY;
in_if_statement : (assignment_statement | block_statement | call_function);
condition: expression comparator expression;
expression: (value (operator value)*); // Not allowing parentesses atm 

args: (value (COMMA value)*);
shape_row: NUMBER SEMICOLON NEWLINE?;
variable: TEXT;
value: NUMBER | TEXT;
comparator: (EQUAL | GREATER | GREATEREQ | LESS | LESSRQ | NOTEQ) ;
operator: (PLUS | MINUS | MULTIPLY | DIVIDE | MODULO);

// Lexer
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
TEXT: [a-zA-Z0-9]+; // no underscore
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
OPENCURLY: '{';
CLOSECURLY: '}';
OPENBRACKET: '(';
CLOSEBRACKET: ')';
NEWLINE: '\n';
WS: [\r ]+ -> skip; 

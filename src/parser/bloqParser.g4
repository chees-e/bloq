// Referenced some grammar from
// https://github.com/antlr/grammars-v4/


/*** Commands ***\

antlr4 .\bloq*.g4 -visitor -o ./gen/
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
\****************/

//  Parser
parser grammar bloqParser;
@header{
package parser.gen;
}
options { tokenVocab=bloqLexer;}
program: statement+;
statement: ((canvas_statement | simple_assignment_statement | shape_assignment_statement | define_statement | call_statement | block_statement | loop_statement | if_statement) NEWLINE+);

canvas_statement: CANVAS COLON NUMBER COMMA NUMBER;
simple_assignment_statement: variable COLON expression;
shape_assignment_statement: variable COLON NEWLINE shape_row+;

call_statement: CALL variable OPENBRACKET args CLOSEBRACKET;
// define_statement: DEFINE variable OPENBRACKET args CLOSEBRACKET OPENCURLY NEWLINE* (in_function_statement NEWLINE+)+ CLOSECURLY;
// in_function_statement: (block_statement | loop_statement | call_statement| if_statement); // allow calling function in definition
define_statement: DEFINE variable OPENBRACKET args CLOSEBRACKET OPENCURLY NEWLINE* ((simple_assignment_statement | shape_assignment_statement | block_statement | loop_statement | call_statement| if_statement) NEWLINE+)+ CLOSECURLY;

// block_statement: BLOCK COLON variable (NEWLINE block_substatement)*;
// block_substatement: (block_start_statement | block_shape_statement | block_extra_statement); // allowing multiple block initializations
block_statement: BLOCK COLON args (NEWLINE (block_start_statement | block_shape_statement))*;

// This way you can include multiple blocks in one pattern
// But it also means each block must be separted by a newline
block_start_statement: START COLON value COMMA value;
block_shape_statement: SHAPE COLON NEWLINE? (shape_row+ | variable);

// loop_statement: FOR variable COLON value TO value OPENCURLY NEWLINE* (in_loop_statement NEWLINE+)+ CLOSECURLY;
// in_loop_statement: (simple_assignment_statement | shape_assignment_statement | block_statement | if_statement | call_statement); // not allowing nested loops
loop_statement: FOR variable COLON value TO value OPENCURLY NEWLINE* ((simple_assignment_statement | shape_assignment_statement | block_statement | if_statement | call_statement) NEWLINE+)+ CLOSECURLY;

// if_statement: IF OPENBRACKET condition CLOSEBRACKET OPENCURLY NEWLINE* (in_if_statement NEWLINE+)+ CLOSECURLY;
// in_if_statement : (simple_assignment_statement | shape_assignment_statement | block_statement | call_statement);
if_statement: IF OPENBRACKET condition CLOSEBRACKET OPENCURLY NEWLINE* ((simple_assignment_statement | shape_assignment_statement | block_statement | call_statement) NEWLINE+)+ CLOSECURLY;

condition: expression comparator expression;
expression: (value (operator value)*); // Not allowing parentesses atm 

args: (value (COMMA value)*);
shape_row: NEWLINE? NUMBER SEMICOLON;
variable: TEXT;
value: NUMBER | TEXT;
comparator: (EQUAL | GREATER | GREATEREQ | LESS | LESSRQ | NOTEQ) ;
operator: (PLUS | MINUS | MULTIPLY | DIVIDE | MODULO);
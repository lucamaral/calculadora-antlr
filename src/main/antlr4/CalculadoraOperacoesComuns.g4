lexer grammar CalculadoraOperacoesComuns;

@header {package br.com.handit.calculadora.parser;}

FLOAT       : DIGIT+ '.' DIGIT*
            |        '.' DIGIT+
            | DIGIT+
            ;
NEWLINE     : '\r'? '\n' ;
WS          : [ \t]+ -> skip ;
POT         : '^';
MUL         : '*';
DIV         : '/';
ADD         : '+';
SUB         : '-';

fragment
DIGIT       : [0-9] ;


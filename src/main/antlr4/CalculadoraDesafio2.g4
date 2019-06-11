grammar CalculadoraDesafio2;
import CalculadoraOperacoesComuns;

calc: stmt+ ;

stmt        : expr                                  # expression
            | VAR '=' expr                          # assign 
            | expr NEWLINE                          # expressionNewLine
            | VAR '=' expr NEWLINE                  # assignNewLine
            | NEWLINE                               # newLine
            ;

expr        : expr operator=('*'|'/') expr          # mulDiv
            | expr operator=('+'|'-') expr          # addSub
            | expr '^' expr                         # pot
            | FLOAT                                 # float
            | VAR                                   # var
            | '(' expr ')'                          # parens
            ;

VAR         : [a-zA-Z]+ ;
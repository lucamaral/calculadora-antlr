grammar CalculadoraDesafio1;
import CalculadoraOperacoesComuns;

calc: stmt+ ;

stmt        : expr                                  # expression
            | expr NEWLINE                          # expressionNewLine
            | NEWLINE                               # newLine
            ;

expr        : expr operator=('*'|'/') expr          # mulDiv
            | expr operator=('+'|'-') expr          # addSub
            | expr '^' expr                         # pot
            | FLOAT                                 # float
            | '(' expr ')'                          # parens
            ;
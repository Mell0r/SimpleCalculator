grammar SimpleCalculator;

calculation : (assign ';') | (statement ';');
assign      : ID '=' statement;
statement   : statement '*' statement | statement '+' statement | '(' statement ')' | ID | INT;

fragment DIGIT  : [0-9];
fragment LETTER : [a-z] | [A-Z];

ID  : (LETTER | '_') ((LETTER | '_') | DIGIT)*;
INT : DIGIT+;
WS  : [ \t\n]+ -> skip;
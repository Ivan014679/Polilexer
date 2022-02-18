package polilexer;
%%
%class Lexer
%column
%line

%{
    public String errlex="";
    public ArrayList<Token> token = new ArrayList<>();
%}

//Polinomios

n = [1-9]
c = [0-9]
s = [+|-]
space = [ \n\t\r]

m = ({n}{c}?)*"x"("^"{n})?
p = "-"?{m}({s}{m}|{s}{n}{c}?)*

%%
{p} {token.add(new Token("Polinomio", yytext()));}

{space} {}
. {errlex+="\nERROR LÉXICO. Palabra no reconocida en línea " + (yyline + 1) + " columna " + (yycolumn + 1);}
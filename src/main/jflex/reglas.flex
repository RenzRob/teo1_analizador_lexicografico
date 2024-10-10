package org.example;

import java_cup.runtime.*;
import java.util.*;
import org.example.*;

%%

%public
%class Lexico
%line
%column
%char
%type Simbolo

LETRA = [a-zA-Z]
DIGITO = [0-9]

ID = {LETRA} ({LETRA}|{DIGITO}|_)*

CTE_STR = \"({LETRA}|{DIGITO})*\"
CTE_E = {DIGITO}+
CTE_B = 0b(0|1)+
CTE_F = ({DIGITO}+ "." {DIGITO}* ) | ("." {DIGITO}+)

COMENTARIO = "//*" ~ "//*" ~ "*//" ~ "*//" | "//*" ~ "*//"

ESPACIO = [ \t\f\n\r\n]+

%eofval{
    return new Simbolo(Token.EOF, null, null, null, null, false);
%eofval}

%{
    private Simbolo rangoEnteroAceptable(String value){
        int i = Integer.parseInt(value);

        if (i >= -32768 && i <= 32767){
            return new Simbolo(Token.CTE_E, "_"+value, null, value, null, true);
        }

        throw new Error("["+ yyline + ":" + yycolumn + "] - Constante entera fuera de rango [-32768, 32767]: " + value);
    }

    private Simbolo rangoFloatAceptable(String value){
        double f = Double.parseDouble(value);

        if (f >= -2147483648.0D && f <= 2147483647.0D){
            return new Simbolo(Token.CTE_F, "_"+value, null, value, null, true);
        }

        throw new Error("["+ yyline + ":" + yycolumn + "] - Constante float fuera de rango [-2147483648, 2147483647]: " + value);
    }

    private Simbolo largoCadenaAceptable(String value){
        if (value.length() <= 30){
            String name = "_"+value.replace("\"", "");

            return new Simbolo(Token.CTE_STR, name, null, value, value.length(), true);
        }

        throw new Error("["+ yyline + ":" + yycolumn + "] - Constante string '" + value + "'" + " muy larga. Max 30 caracteres");
    }
%}


%%

<YYINITIAL>{
    /* Palabras reservadas */
    "if"            { return new Simbolo(Token.IF, yytext(), null, yytext(), null, false);}
    "else"          { return new Simbolo(Token.ELSE, yytext(), null, yytext(), null, false);}
    "then"          { return new Simbolo(Token.THEN, yytext(), null, yytext(), null, false);}
    "while"         { return new Simbolo(Token.WHILE, yytext(), null, yytext(), null, false);}
    "declare"       { return new Simbolo(Token.DECLARE, yytext(), null, yytext(), null, false);}
    "enddeclare"    { return new Simbolo(Token.ENDDECLARE, yytext(), null, yytext(), null, false);}
    "program"       { return new Simbolo(Token.PROGRAM, yytext(), null, yytext(), null, false);}
    "endprogram"    { return new Simbolo(Token.ENDPROGRAM, yytext(), null, yytext(), null, false);}
    "section"       { return new Simbolo(Token.SECTION, yytext(), null, yytext(), null, false);}
    "write"         { return new Simbolo(Token.WRITE, yytext(), null, yytext(), null, false);}
    "filter"        { return new Simbolo(Token.FILTER, yytext(), null, yytext(), null, false);}

    /* Operadores */
    "=="            { return new Simbolo(Token.OP_IGUAL, yytext(), null, yytext(), null, false);}
    "!="            { return new Simbolo(Token.OP_DIST, yytext(), null, yytext(), null, false);}
    ":="            { return new Simbolo(Token.OP_DECLARACION, yytext(), null, yytext(), null, false);}
    "::="           { return new Simbolo(Token.OP_ASIGNACION, yytext(), null, yytext(), null, false);}
    "<"             { return new Simbolo(Token.OP_MENOR, yytext(), null, yytext(), null, false);}
    "<="            { return new Simbolo(Token.OP_MENOR_IG, yytext(), null, yytext(), null, false);}
    ">"             { return new Simbolo(Token.OP_MAYOR, yytext(), null, yytext(), null, false);}
    ">="            { return new Simbolo(Token.OP_MAYOR_IG, yytext(), null, yytext(), null, false);}

    /* Parentesis, llaves, corchetes y otros simbolos */
    "("             { return new Simbolo(Token.A_PARENT, yytext(), null, yytext(), null, false);}
    ")"             { return new Simbolo(Token.C_PARENT, yytext(), null, yytext(), null, false);}
    "{"             { return new Simbolo(Token.A_LLAVE, yytext(), null, yytext(), null, false);}
    "}"             { return new Simbolo(Token.C_LLAVE, yytext(), null, yytext(), null, false);}
    "["             { return new Simbolo(Token.A_CORCHETE, yytext(), null, yytext(), null, false);}
    "]"             { return new Simbolo(Token.C_CORCHETE, yytext(), null, yytext(), null, false);}
    ","             { return new Simbolo(Token.COMA, yytext(), null, yytext(), null, false);}
    ";"             { return new Simbolo(Token.P_Y_C, yytext(), null, yytext(), null, false);}
    "_"             { return new Simbolo(Token.GUION_BAJO, yytext(), null, yytext(), null, false);}

    /* Operadores logicos */
    "&&"            { return new Simbolo(Token.OPL_AND, yytext(), null, yytext(), null, false);}
    "||"            { return new Simbolo(Token.OPL_OR, yytext(), null, yytext(), null, false);}
    "!"             { return new Simbolo(Token.OPL_NOT, yytext(), null, yytext(), null, false);}

    /* Operadores matematicos */
    "+"             { return new Simbolo(Token.OP_SUMA, yytext(), null, yytext(), null, false);}
    "-"             { return new Simbolo(Token.OP_RESTA, yytext(), null, yytext(), null, false);}
    "+="            { return new Simbolo(Token.OP_MAS_IGUAL, yytext(), null, yytext(), null, false);}

    /* Constantes */
    {CTE_STR}       { return largoCadenaAceptable(yytext()); }
    {CTE_F}         { return rangoFloatAceptable(yytext()); }
    {CTE_E}         { return rangoEnteroAceptable(yytext());}
    {CTE_B}         {
                        String binValue = String.valueOf(yytext()).substring(2);
                        Integer decValue = Integer.parseInt(binValue, 2);
                        String decValueStr = String.valueOf(decValue);

                        return new Simbolo(Token.CTE_B, yytext(), null, decValueStr, null, true);
                    }

    /* Identificadores */
    {ID}*           { return new Simbolo(Token.ID, yytext(), null, yytext(), null, true);}

    /* Comentarios */
    {COMENTARIO}    { /* Se ignoran */ }

    /* Ignorar espacios y saltos de linea */
    {ESPACIO}       { /* Se ignoran */ }
}

[^]  {throw new Error("["+ yyline + ":" + yycolumn + "] - No se encontro un token para el lexema: " + yytext());}
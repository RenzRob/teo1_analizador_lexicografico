package org.example;

import java_cup.runtime.*;
import java.util.*;
import org.example.*;

%%

%cup
%public
%class Lexico
%line
%column
%char

LETRA = [a-zA-Z]
DIGITO = [0-9]

ID = {LETRA} ({LETRA}|{DIGITO}|_)*

CTE_STR = \"({LETRA}|{DIGITO}|\s)*\"
CTE_E = {DIGITO}+
CTE_B = 0b(0|1)+
CTE_F = ({DIGITO}+ "." {DIGITO}* ) | ("." {DIGITO}+)

COMENTARIO = "//*" ~ "//*" ~ "*//" ~ "*//" | "//*" ~ "*//"

ESPACIO = [ \t\f\n\r\n]+

%eofval{
    return new Symbol(sym.EOF, null);
%eofval}

%{
    public List<Symbol> symbolsTable = new ArrayList<>();

    public List<String> errors = new ArrayList<>();

    private Symbol rangoEnteroAceptable(String value){
        Long i = Long.parseLong(value);

        if (i < -32768 || i > 32767){
            errors.add("["+ yyline + ":" + yycolumn + "] - Constante entera fuera de rango [-32768, 32767]: " + value);
        }

        String name = "_"+value;

        return new Symbol(sym.CTE_E, yyline, yycolumn, name);
    }

    private Symbol rangoFloatAceptable(String value){
        double f = Double.parseDouble(value);

        if (f < -2147483648.0D || f > 2147483647.0D){
            errors.add("["+ yyline + ":" + yycolumn + "] - Constante float fuera de rango [-2147483648, 2147483647]: " + value);
        }

        String name = "_"+value;

        return new Symbol(sym.CTE_F, yyline, yycolumn, name);
    }

    private Symbol largoCadenaAceptable(String value){
        if (value.length() > 30){
            errors.add("["+ yyline + ":" + yycolumn + "] - Constante string '" + value + "'" + " muy larga. Max 30 caracteres");
        }

        String name = "_"+value.replace("\"", "");

        return new Symbol(sym.CTE_STR, yyline, yycolumn, name);
    }

    private void addIfNotExists(Symbol symbol){
        if (symbol == null) return;

        boolean already_exists = false;

        for (Symbol s: this.symbolsTable){
            if (s.value.equals(symbol.value)){
                already_exists = true;
                break;
            }
        }

        if (!already_exists) this.symbolsTable.add(symbol);
    }
%}


%%

<YYINITIAL>{
    /* Palabras reservadas */
    "if"            { return new Symbol(sym.IF, yyline, yycolumn, yytext());}
    "else"          { return new Symbol(sym.ELSE, yyline, yycolumn, yytext());}
    "while"         { return new Symbol(sym.WHILE, yyline, yycolumn, yytext());}
    "declare.section"       { return new Symbol(sym.INI_DECLARE, yyline, yycolumn, yytext());}
    "enddeclare.section"    { return new Symbol(sym.END_DECLARE, yyline, yycolumn, yytext());}
    "program.section"       { return new Symbol(sym.INI_PROGRAM, yyline, yycolumn, yytext());}
    "endprogram.section"    { return new Symbol(sym.END_PROGRAM, yyline, yycolumn, yytext());}
    "write"         { return new Symbol(sym.WRITE, yyline, yycolumn, yytext());}
    "filter"        { return new Symbol(sym.FILTER, yyline, yycolumn, yytext());}

    /* Operadores */
    "=="            { return new Symbol(sym.OP_IGUAL, yyline, yycolumn, yytext());}
    "!="            { return new Symbol(sym.OP_DIST, yyline, yycolumn, yytext());}
    ":="            { return new Symbol(sym.OP_DECLARACION, yyline, yycolumn, yytext());}
    "::="           { return new Symbol(sym.OP_ASIGNACION, yyline, yycolumn, yytext());}
    "<"             { return new Symbol(sym.OP_MENOR, yyline, yycolumn, yytext());}
    "<="            { return new Symbol(sym.OP_MENOR_IG, yyline, yycolumn, yytext());}
    ">"             { return new Symbol(sym.OP_MAYOR, yyline, yycolumn, yytext());}
    ">="            { return new Symbol(sym.OP_MAYOR_IG, yyline, yycolumn, yytext());}

    /* Parentesis, llaves, corchetes y otros simbolos */
    "("             { return new Symbol(sym.A_PARENT, yyline, yycolumn, yytext());}
    ")"             { return new Symbol(sym.C_PARENT, yyline, yycolumn, yytext());}
    "{"             { return new Symbol(sym.A_LLAVE, yyline, yycolumn, yytext());}
    "}"             { return new Symbol(sym.C_LLAVE, yyline, yycolumn, yytext());}
    "["             { return new Symbol(sym.A_CORCHETE, yyline, yycolumn, yytext());}
    "]"             { return new Symbol(sym.C_CORCHETE, yyline, yycolumn, yytext());}
    ","             { return new Symbol(sym.COMA, yyline, yycolumn, yytext());}
    ";"             { return new Symbol(sym.PYC, yyline, yycolumn, yytext());}
    "_"             { return new Symbol(sym.GUION_BAJO, yyline, yycolumn, yytext());}

    /* Operadores logicos */
    "&&"            { return new Symbol(sym.OPL_AND, yyline, yycolumn, yytext());}
    "||"            { return new Symbol(sym.OPL_OR, yyline, yycolumn, yytext());}
    "!"             { return new Symbol(sym.OPL_NOT, yyline, yycolumn, yytext());}

    /* Operadores matematicos */
    "+"             { return new Symbol(sym.OP_SUMA, yyline, yycolumn, yytext());}
    "-"             { return new Symbol(sym.OP_RESTA, yyline, yycolumn, yytext());}
    "*"             { return new Symbol(sym.OP_MULTIPLICACION, yyline, yycolumn, yytext());}
    "/"             { return new Symbol(sym.OP_DIVISION, yyline, yycolumn, yytext());}

    "FLOAT"            { return new Symbol(sym.TYPE_FLOAT, yyline, yycolumn, yytext());}
    "INT"            { return new Symbol(sym.TYPE_INT, yyline, yycolumn, yytext());}
    "STRING"            { return new Symbol(sym.TYPE_STRING, yyline, yycolumn, yytext());}

    /* Constantes */
    {CTE_STR}       {
                        Symbol symbol = largoCadenaAceptable(yytext());

                        addIfNotExists(symbol);

                        return symbol;
                    }
    {CTE_F}         {
                        Symbol symbol = rangoFloatAceptable(yytext());

                        addIfNotExists(symbol);

                        return symbol;
                     }
    {CTE_E}         {
                        Symbol symbol = rangoEnteroAceptable(yytext());

                        addIfNotExists(symbol);

                        return symbol;
                    }
    {CTE_B}         {
                        String binValue = String.valueOf(yytext()).substring(2);
                        Integer decValue = Integer.parseInt(binValue, 2);
                        String decValueStr = String.valueOf(decValue);

                        Symbol symbol = new Symbol(sym.CTE_B, yytext());

                        addIfNotExists(symbol);

                        return symbol;
                    }

    /* Identificadores */
    {ID}*           {
                        Symbol symbol = new Symbol(sym.ID, yytext());

                        addIfNotExists(symbol);

                        return symbol;
                    }

    /* Comentarios */
    {COMENTARIO}    { /* Se ignoran */ }

    /* Ignorar espacios y saltos de linea */
    {ESPACIO}       { /* Se ignoran */ }
}

[^]  {errors.add("["+ yyline + ":" + yycolumn + "] - No se encontro un token para el lexema: " + yytext());}
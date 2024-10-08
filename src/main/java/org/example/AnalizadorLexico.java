package org.example;

import org.example.Simbolo;
import org.example.Token;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class AnalizadorLexico {
    private final List<Simbolo> simbolos = new ArrayList<>();
    private final List<String> errors = new ArrayList<>();

    public void analyze( String code ) {
        simbolos.clear();
        errors.clear();

        try {
            Lexico lexico = new Lexico(new StringReader(code));

            Simbolo simbolo = lexico.yylex();

            this.simbolos.add(simbolo);

            while (!simbolo.getToken().equals(Token.EOF)){
                try {
                    simbolo = lexico.yylex();

                    this.simbolos.add(simbolo);
                }catch (Error e){
                    this.errors.add(e.getMessage());
                }
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public List<Simbolo> getSimbolos() {
        return simbolos;
    }

    public List<String> getErrors() {
        return errors;
    }
}

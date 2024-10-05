package org.example;

import org.example.token.Simbolo;
import org.example.token.Token;

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
            Lexic lexic = new Lexic(new StringReader(code));

            Simbolo simbolo = lexic.yylex();

            while (!simbolo.getToken().equals(Token.EOF)){
                this.simbolos.add(simbolo);

                try {
                    simbolo = lexic.yylex();
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

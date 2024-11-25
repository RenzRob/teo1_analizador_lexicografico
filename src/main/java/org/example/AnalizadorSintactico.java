package org.example;

import java_cup.runtime.Symbol;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalizadorSintactico {
    private final List<Simbolo> simbolos = new ArrayList<>();
    private List<String> reglas = new ArrayList<>();
    private List<String> alErrors = new ArrayList<>();
    private List<String> asErrors = new ArrayList<>();

    private final Map<Integer, String> tokenCodeMapping = new HashMap<>();

    public AnalizadorSintactico() {
        tokenCodeMapping.put(2, "ID");
        tokenCodeMapping.put(4, "CTE_E");
        tokenCodeMapping.put(5, "CTE_B");
        tokenCodeMapping.put(6, "CTE_F");
        tokenCodeMapping.put(7, "CTE_STR");
    }

    public void analyze(String code) {
        simbolos.clear();
        alErrors.clear();

        try {
            Lexico lexer = new Lexico(new StringReader(code));

            parser parser = new parser(lexer);
            parser.parse();

            alErrors = lexer.errors;
            asErrors = parser.errors;
            reglas = parser.reglas;

            for (Symbol s: lexer.symbolsTable){
                if (s == null) continue;

                String token = tokenCodeMapping.get(s.sym);

                String name = s.value.toString();

                String value = name.substring(1);

                String type = parser.idsDataTypeMapping.get(name);

                Integer length = null;
                if (token.equals("CTE_STR")) {
                    length = value.length();
                }

                if (token.equals("ID")){
                    value = "";
                }

                Simbolo simbolo = new Simbolo(token, name, type, value, length);

                this.simbolos.add(simbolo);
            }
        }catch (Exception e){
            new RuntimeException("Unexpected error: " + e.getMessage(), e);
        }
    }

    public List<Simbolo> getSimbolos() {
        return simbolos;
    }

    public List<String> getAlErrors() {
        return alErrors;
    }

    public List<String> getAsErrors() {
        return asErrors;
    }

    public List<String> getReglas() {
        return reglas;
    }
}

package org.example;

import org.example.Token;

public class Simbolo {
    private final Token token;
    private final String nombre;
    private final String tipo;
    private final String valor;
    private final Integer length;
    private final Boolean addSymbolsTable;

    public Simbolo(Token token, String nombre, String tipo, String valor, Integer length, Boolean addSymbolsTable) {
        this.token = token;
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.length = length;
        this.addSymbolsTable = addSymbolsTable;
    }

    public Token getToken() {
        return token;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public Integer getLength() {
        return length;
    }

    public Boolean getAddSymbolsTable() {
        return addSymbolsTable;
    }

    @Override
    public String toString() {
        return "Token{" +
                "tokenType=" + token +
                ", name='" + nombre + '\'' +
                ", dataType='" + tipo + '\'' +
                ", value='" + valor + '\'' +
                ", length=" + length +
                ", addSymbolsTable=" + addSymbolsTable +
                '}';
    }
}

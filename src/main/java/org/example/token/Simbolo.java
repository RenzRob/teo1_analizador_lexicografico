package org.example.token;

public class Simbolo {
    private Token token;
    private String nombre;
    private String tipo;
    private String valor;
    private Integer length;
    private Boolean addSymbolsTable;

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

    public void setToken(Token token) {
        this.token = token;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Boolean getAddSymbolsTable() {
        return addSymbolsTable;
    }

    public void setAddSymbolsTable(Boolean addSymbolsTable) {
        this.addSymbolsTable = addSymbolsTable;
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

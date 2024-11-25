package org.example;

public class Simbolo {
    private final String token;
    private final String nombre;
    private final String tipo;
    private final String valor;
    private final Integer length;

    public Simbolo(String token, String nombre, String tipo, String valor, Integer length) {
        this.token = token;
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.length = length;
    }

    public String getToken() {
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

    @Override
    public String toString() {
        return "Simbolo{" +
                "token=" + token +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", valor='" + valor + '\'' +
                ", length=" + length +
                '}';
    }
}

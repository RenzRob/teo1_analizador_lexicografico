package org.example;

import org.example.Simbolo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWritter {
    public static void escribirSimbolosCSV(List<Simbolo> listaSimbolos, String archivoCSV) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV))) {
            // Escribir encabezados del CSV
            bw.write("Nombre,Token,Tipo,Valor,Length");
            bw.newLine();

            // Recorrer la lista de Simbolo y escribir cada instancia en el archivo
            for (Simbolo simbolo : listaSimbolos) {
                bw.write( simbolo.getNombre()+ "," +
                        simbolo.getToken() + "," +
                        simbolo.getTipo() + "," +
                        simbolo.getValor() + "," +
                        simbolo.getLength());
                bw.newLine();  // Ir a la siguiente línea
            }

        } catch (IOException e) {
            e.printStackTrace();  // Manejar error en caso de que haya un problema con la escritura
        }
    }
}

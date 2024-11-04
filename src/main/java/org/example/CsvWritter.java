package org.example;

import org.example.Simbolo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWritter {
    public static void escribirSimbolosCSV(List<Simbolo> listaSimbolos, String archivoCSV) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCSV))) {
            bw.write("Nombre,Token,Tipo,Valor,Length");
            bw.newLine();

            for (Simbolo simbolo : listaSimbolos) {
                if (!simbolo.getAddSymbolsTable()) continue;

                bw.write( simbolo.getNombre()+ "," +
                        simbolo.getToken() + "," +
                        simbolo.getTipo() + "," +
                        simbolo.getValor() + "," +
                        simbolo.getLength());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

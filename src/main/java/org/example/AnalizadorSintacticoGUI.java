package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.List;

public class AnalizadorSintacticoGUI extends JFrame {
    private JTextArea textArea;
    private JButton btnCargarArchivo, btnCompilar;
    private JTable tableResultados;
    private JTextArea textAreaErrores;
    private JTextArea textAreaReglas;

    private AnalizadorSintactico analizadorSintactico;

    public AnalizadorSintacticoGUI() {
        this.analizadorSintactico = new AnalizadorSintactico();

        setTitle("Analizador Lexicográfico - IDE");
        setSize(1200, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComponents();
    }

    private void initComponents() {
        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPaneCodigo = new JScrollPane(textArea);

        btnCargarArchivo = new JButton("Cargar Archivo");
        btnCompilar = new JButton("Compilar");

        String[] columnas = {"Nombre", "Token", "Tipo", "Valor", "Long"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0);
        tableResultados = new JTable(model);
        JScrollPane scrollPaneTablaTokens = new JScrollPane(tableResultados);

        textAreaErrores = new JTextArea();
        textAreaErrores.setEditable(false);
        textAreaErrores.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPaneErrores = new JScrollPane(textAreaErrores);

        textAreaReglas = new JTextArea();
        textAreaReglas.setEditable(false);
        textAreaReglas.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPaneReglas = new JScrollPane(textAreaReglas);

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnCargarArchivo);
        panelBotones.add(btnCompilar);

        btnCargarArchivo.addActionListener(e -> cargarArchivo());
        btnCompilar.addActionListener(e -> compilarCodigo(model));

        JPanel panelPrincipal = new JPanel(new GridLayout(1, 2));
        JPanel panelIzquierda = new JPanel(new GridLayout(1, 1));
        JPanel panelDerecha = new JPanel(new GridLayout(3, 1));

        panelIzquierda.add(scrollPaneCodigo);

        panelDerecha.add(scrollPaneTablaTokens);
        panelDerecha.add(scrollPaneReglas);
        panelDerecha.add(scrollPaneErrores);

        panelPrincipal.add(panelIzquierda);
        panelPrincipal.add(panelDerecha);

        add(panelBotones, BorderLayout.NORTH);
        add(panelPrincipal, BorderLayout.CENTER);
    }

    private void cargarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                textArea.setText("");
                String linea;
                while ((linea = br.readLine()) != null) {
                    textArea.append(linea + "\n");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void compilarCodigo(DefaultTableModel model) {

        String codigo = textArea.getText();

        model.setRowCount(0);
        textAreaErrores.setText("");
        textAreaReglas.setText("");

        this.analizadorSintactico.analyze(codigo);

        // Mostrar tabla de simbolos
        for (Simbolo simbolo : this.analizadorSintactico.getSimbolos()) {
            Object[] fila = {simbolo.getNombre(), simbolo.getToken(), simbolo.getTipo(), simbolo.getValor(), simbolo.getLength()};
            model.addRow(fila);
        }

        // Mostrar reglas de la gramatica
        for (String regla : this.analizadorSintactico.getReglas()){
            textAreaReglas.append(regla + "\n");
        }

        // Mostrar errores de analizador lexico
        if (this.analizadorSintactico.getAlErrors().isEmpty()) {
            textAreaErrores.append("[AL] - No se encontraron errores.\n");
        } else {
            for (String error : this.analizadorSintactico.getAlErrors()) {
                textAreaErrores.append("[AL] - " + error + "\n");
            }
        }

        // Mostrar errores de analizador sintactico
        if (this.analizadorSintactico.getAsErrors().isEmpty()) {
            textAreaErrores.append("[AS] - No se encontraron errores.\n");
        } else {
            for (String error : this.analizadorSintactico.getAsErrors()) {
                textAreaErrores.append("[AS] - " + error + "\n");
            }
        }

        CsvWritter.escribirSimbolosCSV(this.analizadorSintactico.getSimbolos(), "ts.csv");
    }
}
package org.example;

import org.example.token.Simbolo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
import java.util.List;

public class AnalizadorLexicoGUI extends JFrame {
    private JTextArea textArea;
    private JButton btnCargarArchivo, btnCompilar;
    private JTable tableResultados;
    private JTextArea textAreaErrores;
    private JTextArea textAreaAllTokens;

    private AnalizadorLexico analizadorLexico;

    public AnalizadorLexicoGUI() {
        this.analizadorLexico = new AnalizadorLexico();

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

        textAreaAllTokens = new JTextArea();
        textAreaAllTokens.setEditable(false);
        textAreaAllTokens.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollAllTokens = new JScrollPane(textAreaAllTokens);

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
        panelDerecha.add(scrollPaneErrores);
        panelDerecha.add(scrollAllTokens);

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
        textAreaAllTokens.setText("");

        this.analizadorLexico.analyze(codigo);

        List<Simbolo> simbolos = this.analizadorLexico.getSimbolos();

        List<String> errores = this.analizadorLexico.getErrors();

        for (Simbolo simbolo : simbolos) {
            if (simbolo.getAddSymbolsTable()){
                Object[] fila = {simbolo.getNombre(), simbolo.getToken(), simbolo.getTipo(), simbolo.getValor(), simbolo.getLength()};
                model.addRow(fila);
            }
            textAreaAllTokens.append(String.format("%s --> %s\n", simbolo.getToken(), simbolo.getValor()));
        }

        if (errores.isEmpty()) {
            textAreaErrores.append("No se encontraron errores.\n");
        } else {
            for (String error : errores) {
                textAreaErrores.append(error + "\n");
            }
        }

        CsvWritter.escribirSimbolosCSV(simbolos, "ts.csv");
    }
}
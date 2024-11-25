package org.example;

import javax.swing.*;

public class App
{
    public static void main( String[] args ) {
        SwingUtilities.invokeLater(() -> {
            AnalizadorSintacticoGUI gui = new AnalizadorSintacticoGUI();
            gui.setVisible(true);
        });
    }
}

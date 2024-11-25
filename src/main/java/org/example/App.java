package org.example;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class App
{
    private static Map<Integer, String> tokenCodeMapping = new HashMap<>();

    public static void main( String[] args ) throws Exception {
        SwingUtilities.invokeLater(() -> {
            AnalizadorSintacticoGUI gui = new AnalizadorSintacticoGUI();
            gui.setVisible(true);
        });
    }
}

package org.example;

import javax.swing.*;
import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        SwingUtilities.invokeLater(() -> {
            AnalizadorLexicoGUI gui = new AnalizadorLexicoGUI();
            gui.setVisible(true);
        });
    }
}

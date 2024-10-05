package org.example;

import org.example.token.Simbolo;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //FileReader f = new FileReader("prueba.txt");
        //LexicAnalizer lexer = new LexicAnalizer(f);

        SwingUtilities.invokeLater(() -> {
            AnalizadorLexicoGUI gui = new AnalizadorLexicoGUI();
            gui.setVisible(true);
        });
    }
}

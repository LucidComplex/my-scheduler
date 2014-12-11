package main;


import java.io.IOException;
import javax.swing.JFrame;
import manager.NoteManager;
import org.json.simple.parser.ParseException;
import ui.MainWindow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException, InstantiationException, IllegalAccessException, java.text.ParseException {;
        JFrame main = new MainWindow();
        main.setVisible(true);
    }
}

package main;


import java.awt.Color;
import java.io.IOException;
import org.json.simple.parser.ParseException;

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
    public static void main(String[] args) throws IOException, ParseException, InstantiationException, IllegalAccessException, java.text.ParseException {
        Color color = new Color(2,2,2);
        String colorString = String.valueOf(color.getRGB());
        System.out.println(colorString);
        System.out.println(new Color(Integer.parseInt(colorString)));
    }
}

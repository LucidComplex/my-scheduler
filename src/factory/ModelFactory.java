/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import model.Note;

/**
 *
 * @author tan
 */
public class ModelFactory {
    
    /**
     * 
     * @return a new Note
     * 
     */
    public static Note createNote(){
        return new Note();
    }
}

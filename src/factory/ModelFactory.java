/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.util.Map;
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
    
    /**
     * 
     * @param args a Map that holds "title", "body", "deadline"
     * @return a new Note with the details inside the Map.
     */
    public static Note createNote(Map args){
        return new Note(args);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import base.ModelManager;
import factory.ModelFactory;
import java.util.Map;
import model.Note;

/**
 *
 * @author tan
 */
public class NoteManager extends ModelManager {
    
    public NoteManager(String filepath){
        saveFile = filepath;
    }
    
    /**
     * Sorts notes by deadline.
     * 
     * Closest deadline first.
     * 
     */
    public void sortByDeadline(){ 
        throw new UnsupportedOperationException(
                "Implement " + this.getClass().getName() + "#sortByDeadline()."
        );
    }
    
    /**
     * Creates and adds a note from a map.
     * 
     * @param args a Map containing the fields of a note.
     * 
     * @see factory.ModelFactory#createNote(java.util.Map) 
     */
    public void createNote(Map args){
        Note note = ModelFactory.createNote(args);
        super.addModel(note);
    }
}

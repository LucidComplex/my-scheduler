/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import base.ModelManager;
import factory.JSONModelFactory;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;
import model.Note;
import persistence.JSONReader;
import persistence.JSONWriter;

/**
 *
 * @author tan
 */
public class NoteManager extends ModelManager {
    
    public NoteManager(String filepath) throws IOException{
        this();
        saveFile = filepath;
        file = new File(filepath);
        JSONWriter.setFile(file);
        JSONReader.setFile(file);
    }
    
    public NoteManager(){
        modelList = new LinkedList<>();
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
    public void createNote(Map args) throws InstantiationException, IllegalAccessException{
        Note note = (Note) JSONModelFactory.create(Note.class);
        super.manage(note);
    }
    
    public void searchNoteByTitle(String title){
        throw new UnsupportedOperationException(
                "Implement " + this.getClass().getName() +
                "#searchNoteByTitle(java.util.String)."
        );
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import base.ModelManager;
import base.NoteComparator;
import exceptions.NotReadyException;
import factory.JSONModelFactory;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.PriorityQueue;
import model.Note;
import org.json.simple.parser.ParseException;
import persistence.JSONReader;
import persistence.JSONWriter;

/**
 *
 * @author tan
 */
public final class NoteManager extends ModelManager {    
    private static boolean ready = false;
    
    public static Note getNextNote(){
        return (Note) modelQueue.peek();
    }
    
    /**
     * Initializes the manager.
     * 
     * @param filepath the filename to save the notes.
     * @throws IOException 
     */
    public static void initManager(String filepath) throws IOException, ParseException, InstantiationException, IllegalAccessException{
        saveFile = filepath;
        modelQueue = new PriorityQueue(11, new NoteComparator());
        file = new File(filepath);
        JSONReader.setFile(file);
        NoteManager.loadModels();
        JSONWriter.setFile(file);
        ready = true;
    }
    
    /**
     * Creates and adds a note from a map.
     * 
     * @param args a Map containing the fields of a note.
     * 
     * @see factory.ModelFactory#createNote(java.util.Map) 
     */
    public static void createNote(Map args) throws InstantiationException, IllegalAccessException, NotReadyException{
        if(!ready)
            throwException();
        Note note = (Note) JSONModelFactory.create(Note.class);
        ModelManager.manage(note);
    }
    
    public static void searchNoteByTitle(String title) throws NotReadyException{
        if(!ready)
            throwException();
        throw new UnsupportedOperationException(
                "Implement " + NoteManager.class.getName() +
                "#searchNoteByTitle(java.util.String)."
        );
    }
    
    private static void throwException() throws NotReadyException{
        throw new NotReadyException("Initialize the Manager first.");
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.io.File;
import java.io.IOException;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import persistence.JSONReader;
import persistence.JSONWriter;
import model.Note;
import org.json.simple.parser.ParseException;

/**
 * An abstract manager class, holds Models.
 * 
 * @author tan
 */
public abstract class ModelManager {
    protected static AbstractQueue modelQueue;
    protected static String saveFile;
    protected static File file;
    
    /**
     * Manages a model.
     * 
     * @param model adds JSONModel to the manager
     * 
     * @see List#add(java.lang.Object) 
     */
    public static void manage(JSONModel model){
        modelQueue.add(model); // can be improved, implement a list/pq?
    }
    
    /**
     * 
     * @param model the JSONModel to be unmanaged
     * @return true when the model exists
     * in the list and was removed, false
     * otherwise.
     * 
     * @see List#remove(java.lang.Object) 
     */
    public static boolean removeModel(JSONModel model){
        return modelQueue.remove(model);
    }
    
    /**
     * Saves the Models to a file in JSON format.
     * 
     * @throws IOException 
     */
    public static void saveModels() throws IOException{
        JSONWriter.writeModels(modelQueue);
    }
    
    /**
     * Load the Models from a JSON formatted file.
     * 
     * @throws IOException
     * @throws ParseException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public static void loadModels() throws IOException, ParseException, InstantiationException, IllegalAccessException{
        modelQueue = JSONReader.getModels(Note.class);
    }
    
    /**
     * Checks if JSONModel m is managed by this manager.
     * @param m the JSONModel to check the list against.
     * @return true if m is managed, false otherwise.
     * 
     * @see List#contains(java.lang.Object) 
     */
    public static boolean manages(JSONModel m){
        return modelQueue.contains(m);
    }
    
    public static List toList(){
        Iterator i = modelQueue.iterator();
        List modelList = new LinkedList();
        
        while(i.hasNext()){
            modelList.add(i.next());
        }
        
        return modelList;
    }
    
}

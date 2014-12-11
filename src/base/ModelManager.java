/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    protected List<JSONModel> modelList;
    protected String saveFile;
    protected File file;
    
    /**
     * Manages a model.
     * 
     * @param model adds JSONModel to the manager
     * 
     * @see List#add(java.lang.Object) 
     */
    public void manage(JSONModel model){
        modelList.add(model); // can be improved, implement a list/pq?
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
    public boolean removeModel(JSONModel model){
        return modelList.remove(model);
    }
    
    /**
     * Saves the Models to a file in JSON format.
     * 
     * @throws IOException 
     */
    public void saveModels() throws IOException{
        JSONWriter.writeModelList(modelList);
    }
    
    /**
     * Load the Models from a JSON formatted file.
     * 
     * @throws IOException
     * @throws ParseException
     * @throws InstantiationException
     * @throws IllegalAccessException 
     */
    public void loadModels() throws IOException, ParseException, InstantiationException, IllegalAccessException{
        modelList = JSONReader.getModelList(Note.class);
    }
    
    /**
     * Checks if JSONModel m is managed by this manager.
     * @param m the JSONModel to check the list against.
     * @return true if m is managed, false otherwise.
     * 
     * @see List#contains(java.lang.Object) 
     */
    public boolean manages(JSONModel m){
        return modelList.contains(m);
    }
    
    public JSONModel getModel(int index){
        return modelList.get(index);
    }
    
}

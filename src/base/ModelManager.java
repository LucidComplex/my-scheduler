/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import json.JSONWriter;

/**
 * An abstract manager class, holds Models.
 * 
 * @author tan
 */
public abstract class ModelManager {
    protected List<Model> modelList;
    protected String saveFile;
    
    /**
     * 
     * @param model adds a Model to the manager
     * 
     * @see List#add(java.lang.Object) 
     */
    public void addModel(Model model){
        modelList.add(model); // can be improved, implement a list/pq?
    }
    
    /**
     * 
     * @param model the Model to be unmanaged
     * @return true when the model exists
     * in the list and was removed, false
     * otherwise.
     * 
     * @see List#remove(java.lang.Object) 
     */
    public boolean removeModel(Model model){
        return modelList.remove(model);
    }
    
    /**
     * Saves the Models to a file in JSON format.
     * 
     * @throws IOException 
     */
    public void saveModels() throws IOException{
        JSONWriter.setFile(new File(saveFile));
        JSONWriter.writeModelList(modelList);
    }
    
    /**
     * Checks if Model m is managed by this manager.
     * @param m the Model to check the list against.
     * @return true if m is managed, false otherwise.
     * 
     * @see List#contains(java.lang.Object) 
     */
    public boolean manages(Model m){
        return modelList.contains(m);
    }
    
}

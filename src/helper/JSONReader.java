/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import base.JSONObject;
import base.Model;
import factory.ModelFactory;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import model.Note;

/**
 * A file reader class with static methods
 * @author tan
 * 
 */
public class JSONReader {
    static BufferedReader file;
    
    /**
     *
     * @param file
     * @throws FileNotFoundException
     */
    public void setFile(File file) throws FileNotFoundException{
        JSONReader.file = new BufferedReader(new FileReader(file));
    }
    
    /**
     * 
     * @return a List of Models from a JSON formatted file.
     * @throws java.io.IOException
     */
    public static List<Model> getLine() throws IOException{
        List<Model> modelList;
        Note note;
        String json = file.readLine();
        while(json!=null){
            note = ModelFactory.createNote();
            note.fromJSON(json);
        }
    }
    
    public static JSONObject createJSONObject(){
        
    }
    
}

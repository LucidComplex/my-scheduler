/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import base.JSONModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.AbstractQueue;
import java.util.PriorityQueue;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * A file reader class with static methods
 * @author tan
 * 
 */
public class JSONReader {
    private static BufferedReader file;
    
    /**
     *
     * @param file
     * @throws FileNotFoundException
     */
    public static void setFile(File file) throws FileNotFoundException{
        JSONReader.file = new BufferedReader(new FileReader(file));
    }
    
    /**
     * 
     * @param c the class of the Models expected
     * @return a List of Models from a JSON formatted file.
     * @throws java.io.IOException
     * @throws org.json.simple.parser.ParseException
     */
    public static AbstractQueue<JSONModel> getModels(Class c) throws IOException, ParseException, InstantiationException, IllegalAccessException{
        AbstractQueue<JSONModel> modelQueue = new PriorityQueue();
        JSONModel model;
        JSONParser parser = new JSONParser();
        
        String json = file.readLine();
        while(json!=null){
            model = (JSONModel) c.newInstance();
            JSONObject jsonObject = (JSONObject) parser.parse(json);
            model.fromJSON(jsonObject);
            modelQueue.add(model);
            json = file.readLine();
        }
        
        return modelQueue;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import base.Model;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
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
    public static List<Model> getModelList(Class c) throws IOException, ParseException, InstantiationException, IllegalAccessException{
        List<Model> modelList = new LinkedList();
        Model model;
        JSONParser parser = new JSONParser();
        
        String json = file.readLine();
        while(json!=null){
            model = (Model) c.newInstance();
            JSONObject jsonObject = (JSONObject) parser.parse(json);
            model.fromJSON(jsonObject);
            modelList.add(model);
            json = file.readLine();
        }
        
        return modelList;
    }
}

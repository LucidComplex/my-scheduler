/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import base.JSONModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractQueue;

/**
 *
 * @author tan
 */
public class JSONWriter {
    private static BufferedWriter file;
    
    public static void setFile(File file) throws IOException{
        JSONWriter.file = new BufferedWriter(new FileWriter(file, true));
    }
    
    public static void writeModels(AbstractQueue<JSONModel> modelList) throws IOException{
        for(JSONModel m : modelList){
            file.write(m.toJSON().toString());
            file.newLine();
        }
        file.flush();
    }
}

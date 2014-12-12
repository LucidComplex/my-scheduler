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
    private static BufferedWriter bufferedWriter;
    private static File file;
    public static void setFile(File file) throws IOException{
        JSONWriter.file = file;
        JSONWriter.bufferedWriter = new BufferedWriter(new FileWriter(file, true));
    }
    
    public static void writeModels(AbstractQueue<JSONModel> modelList) throws IOException{
        BufferedWriter temp = JSONWriter.bufferedWriter;
        
        // rewrite file
        JSONWriter.bufferedWriter = new BufferedWriter(new FileWriter(file));
        for(JSONModel m : modelList){
            bufferedWriter.write(m.toJSON().toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        JSONWriter.bufferedWriter = temp;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

import base.Model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author tan
 */
public class JSONWriter {
    private static BufferedWriter file;
    
    public static void setFile(File file) throws IOException{
        JSONWriter.file = new BufferedWriter(new FileWriter(file, true));
    }
    
    public static void writeModelList(List<Model> modelList) throws IOException{
        for(Model m : modelList){
            System.out.println(m.toJSON());
            file.write(m.toJSON().toString());
            file.newLine();
        }
        file.flush();
    }
}

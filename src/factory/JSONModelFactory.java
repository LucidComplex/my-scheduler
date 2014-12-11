/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import base.JSONModel;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Note;

/**
 *
 * @author tan
 */
public abstract class JSONModelFactory {

    /**
     * Creates a JSONModel object.
     * 
     * @param aClass a JSONModel Class to be instantiated.
     * @return a new instance of the JSONModel
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    public static JSONModel create(Class<? extends JSONModel> aClass) throws InstantiationException, IllegalAccessException {
        return aClass.newInstance();
    }
    
}

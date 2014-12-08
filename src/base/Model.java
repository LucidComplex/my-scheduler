/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import org.json.simple.JSONObject;

/**
 *
 * @author tan
 */
public interface Model {
    
    /**
     * 
     * @return a JSONObject format of the model.
     */
    public JSONObject toJSON();
    
    /**
     * Parses a JSONObject into a model
     * 
     * @param json the JSONObject to convert to model
     */
    public void fromJSON(JSONObject json);
}

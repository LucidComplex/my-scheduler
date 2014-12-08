/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author tan
 */
public interface Model {
    /**
     * 
     * @return a JSON string format of the model
     */
    public String toJSON();
    
    /**
     * Parses a JSON string into a model
     * 
     * @param json the JSON string to parse
     */
    public void fromJSON(String json);
}

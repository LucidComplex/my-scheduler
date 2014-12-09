/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import base.Model;
import java.time.Instant;
import java.util.Map;
import org.json.simple.JSONObject;

/**
 * A class that represents a note.
 * 
 * @author tan
 */
public class Note implements Model {
    
    private String title;
    private String body;
    private Instant deadline;
    
    public Note(){
        title = "";
        body = "";
    }
    
    public Note(Map<String, String> keys){
        title = keys.get("title");
        body = keys.get("body");
        deadline = Instant.parse(keys.get("deadline"));
    }
    
    /**
     * 
     * @return the title of the note
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * 
     * @return the body of the note
     */
    public String getBody(){
        return body;
    }
    
    /**
     * 
     * @param aTitle the new title of this note
     */
    public void setTitle(String aTitle){
        title = aTitle;
    }
    
    /**
     * 
     * @param aBody the new body of this note
     */
    public void setBody(String aBody){
        body = aBody;
    }

    /**
     * 
     * @see base.Model#toJSON() 
     */
    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        
        json.put("title", title);
        json.put("body", body);
        json.put("deadline", deadline.toString());
        
        return json;
    }

    /**
     * 
     * @see base.Model#fromJSON(org.json.simple.JSONObject)
     */
    @Override
    public void fromJSON(JSONObject json) {
        title = (String) json.get("title");
        body = (String) json.get("body");
        deadline = Instant.parse((String) json.get("deadline"));
    }
    
}

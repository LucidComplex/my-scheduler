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
    private Instant begin;
    
    public Note(){
        title = "";
        body = "";
    }
    
    public Note(Map<String, String> keys){
        title = keys.get("title");
        body = keys.get("body");
        deadline = Instant.parse(keys.get("deadline"));
        begin = Instant.parse(keys.get("begin"));
    }
    
//<editor-fold defaultstate="collapsed" desc="Accessors">
    
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
     * @return the begin
     */
    public Instant getBegin() {
        return begin;
    }
    
    /**
     * @param begin the begin to set
     */
    public void setBegin(Instant begin) {
        this.begin = begin;
    }
    
        /**
     * @return the deadline
     */
    public Instant getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(Instant deadline) {
        this.deadline = deadline;
    }
//</editor-fold>
    
    /**
     * 
     * @see base.Model#toJSON() 
     */
    @Override
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        
        json.put("title", title);
        json.put("body", body);
        json.put("deadline", getDeadline().toString());
        json.put("begin", begin.toString());
        
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
        deadline = (Instant.parse((String) json.get("deadline")));
        begin = Instant.parse((String) json.get("begin"));
    }
    
    /**
     * 
     * @return returns true if Note is still in range.
     */
    public boolean isActive(){
        return Instant.now().isAfter(begin) && Instant.now().isBefore(getDeadline());
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import base.JSONModel;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import org.json.simple.JSONObject;

/**
 * A class that represents a note.
 * 
 * @author tan
 */
public class Note implements JSONModel {
    
    private String title;
    private String body;
    private Date deadline;
    private Date begin;
    
    public Note(){
        title = "";
        body = "";
        deadline = Date.from(Instant.now());
        begin = Date.from(Instant.now());
    }
    
    public Note(Map<String, String> keys){
        title = keys.get("title");
        body = keys.get("body");
        deadline = new Date();
        begin = new Date();
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
    public Date getBegin() {
        return begin;
    }
    
    /**
     * @param begin the begin to set
     */
    public void setBegin(Date begin) {
        this.begin = begin;
    }
    
        /**
     * @return the deadline
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * @param deadline the deadline to set
     */
    public void setDeadline(Date deadline) {
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
        json.put("deadline", deadline.toString());
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
        deadline = new Date();
        begin = new Date();
    }
    
    /**
     * 
     * @return returns true if Note is still in deadline range.
     */
    public boolean isActive(){
        Date now = new Date();
        return now.after(begin) &&
                now.before(deadline);
    }

}

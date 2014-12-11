/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import base.JSONModel;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private Date reminder;
    private Color color;
    private DateFormat df;
    
    public Note(){
        title = "";
        body = "";
        deadline = Date.from(Instant.now());
        begin = Date.from(Instant.now());
        reminder = Date.from(Instant.now());
        df = new SimpleDateFormat();
    }
    
    public Note(Map<String, String> keys){
        title = keys.get("title");
        body = keys.get("body");
        deadline = new Date();
        begin = new Date();
        reminder = new Date();
        df = new SimpleDateFormat();
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
    
    /**
     * @param reminder the reminder to set
     */
    public void setReminder(Date reminder){
        this.reminder = reminder;
    }
    
    /**
     * @return the reminder
     */
    public Date getReminder(){
        return reminder;
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
        json.put("deadline", formatDate(deadline));
        json.put("begin", formatDate(begin));
        json.put("reminder", formatDate(reminder));
        json.put("color", String.valueOf(color.getRGB()));
        return json;
    }
    
    /**
     * Formats a Date into a String.
     * 
     * @param date the date to format.
     * @return a String formatted Date.
     */
    private String formatDate(Date date){
        return df.format(date);
    }

    /**
     * 
     * @see base.Model#fromJSON(org.json.simple.JSONObject)
     */
    @Override
    public void fromJSON(JSONObject json) {
        try {
            title = (String) json.get("title");
            body = (String) json.get("body");
            deadline = parseDate((String) json.get("deadline"));
            begin = parseDate((String) json.get("begin"));
            reminder = parseDate((String) json.get("reminder"));
            color = new Color(Integer.parseInt((String) json.get("color")));
        } catch (ParseException ex) {
            Logger.getLogger(Note.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @param date the date in String to parse
     * @return a parsed Date
     */
    private Date parseDate(String dateString) throws ParseException{
        return df.parse(dateString);
    }
    
    /**
     * 
     * @return returns true if Note is still in deadline range.
     */
    public boolean isActive(){
        Date now = new Date();
        return now.after(begin) && now.before(deadline);
    }

}

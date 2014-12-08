/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import base.Model;
import java.util.Calendar;

/**
 * A class that represents a note.
 * 
 * @author tan
 */
public class Note implements Model {
    
    private String title;
    private String body;
    private Calendar deadline;
    
    public Note(){
        title = "";
        body = "";
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
    public String toJSON() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @see base.Model#fromJSON(java.lang.String) 
     */
    @Override
    public void fromJSON(String json) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

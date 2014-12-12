/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import manager.GameElement;
import manager.NoteManager;
import model.Note;

/**
 *
 * @author MiriamMarie
 */
public class ExtendCommand extends Command{
    Map fields;
 
    public ExtendCommand(UI ui){
        this.ui = ui;
        fields = ui.getFields();
    }
    
    public void execute() {
        JSpinner daySpinner = (JSpinner) fields.get("DaysExtend");
        JSpinner hourSpinner = (JSpinner) fields.get("HoursExtend");
        JSpinner minSpinner = (JSpinner) fields.get("MinExtend");
        Note note = (Note) fields.get("note");
        
        int day = (int) daySpinner.getValue();
        int hour = (int) hourSpinner.getValue();
        int min = (int) minSpinner.getValue();
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(note.getDeadline());
        
        cal.add(Calendar.DATE, day);
        cal.add(Calendar.HOUR, hour);
        cal.add(Calendar.MINUTE, min);
        
        note.setDeadline(cal.getTime());
        try {
            NoteManager.saveModels();
        } catch (IOException ex) {
            Logger.getLogger(ExtendCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            GameElement.decreaseExperience(100);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(ExtendCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ExtendCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

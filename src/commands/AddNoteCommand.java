/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import factory.JSONModelFactory;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSpinner;
import javax.swing.text.JTextComponent;
import manager.NoteManager;
import model.Note;

/**
 * A command that creates a note, gets input from the UI, and adds it into the
 * NoteManager.
 * 
 * @author tan
 */
public class AddNoteCommand extends Command {

    public AddNoteCommand(UI ui){
        this.ui = ui;
    }
    
    @Override
    public void execute() {
        Map fields = ui.getFields();
        Note note = null;
        JTextComponent taskTitle = (JTextComponent) fields.get("TaskTitle");
        JTextComponent descriptionBox = (JTextComponent) fields.get("DescriptionBox");
        Date startDate = getStartDate(fields);
        
        try {
            note = (Note) JSONModelFactory.create(Note.class);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AddNoteCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        note.setTitle(taskTitle.getText());
        note.setBody(descriptionBox.getText());
        note.setBegin(getStartDate(fields));
        note.setDeadline(getEndDate(fields));
        
        NoteManager.manage(note);
        
        try {
            NoteManager.saveModels();
        } catch (IOException ex) {
            Logger.getLogger(AddNoteCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Date getStartDate(Map fields){
        int[] times = new int[5];
        
        times[0] = (int) ((JSpinner) fields.get("StartDay")).getValue();
        times[1] = (int) ((JSpinner) fields.get("StartMonth")).getValue();
        times[2] = (int) ((JSpinner) fields.get("StartYear")).getValue();
        times[3] = (int) ((JSpinner) fields.get("StartHour")).getValue();
        times[4] = (int) ((JSpinner) fields.get("StartMinutes")).getValue();
        
        return makeCalendar(times).getTime();
    }
    
    private Date getEndDate(Map fields){
        int[] times = new int[5];
        
        times[0] = (int) ((JSpinner) fields.get("EndDay")).getValue();
        times[1] = (int) ((JSpinner) fields.get("EndMonth")).getValue();
        times[2] = (int) ((JSpinner) fields.get("EndYear")).getValue();
        times[3] = (int) ((JSpinner) fields.get("EndHour")).getValue();
        times[4] = (int) ((JSpinner) fields.get("EndMinutes")).getValue();
        
        return makeCalendar(times).getTime();
    }
    
    private Calendar makeCalendar(int[] times){
        Calendar cal = new GregorianCalendar();
        
        cal.set(Calendar.DATE, times[0]);
        cal.set(Calendar.MONTH, times[1]);
        cal.set(Calendar.YEAR, times[2]);
        cal.set(Calendar.HOUR, times[3]);
        cal.set(Calendar.MINUTE, times[4]);
        
        return cal;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import factory.JSONModelFactory;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.JTextComponent;
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
        
        try {
            note = (Note) JSONModelFactory.create(Note.class);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(AddNoteCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        note.setTitle(taskTitle.getText());
        note.setBody(descriptionBox.getText());
    }
    
}

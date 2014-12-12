/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import manager.GameElement;
import manager.NoteManager;

/**
 *
 * @author MiriamMarie
 */
public class AccomplishCommand extends Command {
    Map fields;
    public AccomplishCommand(UI ui){
        this.ui=ui;
        fields=ui.getFields();  
    }
    @Override
    public void execute() {
        JList noteList = (JList) fields.get("TaskList1");
        try {
            GameElement.increaseExperience(50);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(AccomplishCommand.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AccomplishCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            NoteManager.deleteNoteByIndex(noteList.getSelectedIndex());
        } catch (IOException ex) {
            Logger.getLogger(AccomplishCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}

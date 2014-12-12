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
import manager.NoteManager;

/**
 *
 * @author MiriamMarie
 */
public class DeleteCommand extends Command {
    Map fields;
    public DeleteCommand(UI ui){
        this.ui = ui;
        fields = ui.getFields();
    }
    @Override
    public void execute() {
        JList noteList = (JList) fields.get("TaskList1");
        int index = noteList.getSelectedIndex();
        try {
            NoteManager.deleteNoteByIndex(index);
        } catch (IOException ex) {
            Logger.getLogger(DeleteCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

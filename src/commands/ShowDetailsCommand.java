/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import manager.NoteManager;
import model.Note;

/**
 *
 * @author MiriamMarie
 */
public class ShowDetailsCommand extends Command{
    Map fields;
    public ShowDetailsCommand(UI ui){
        this.ui=ui;
        fields = ui.getFields();
    }
    @Override
    public void execute() {
        JLabel title = (JLabel) fields.get("TaskTitle1");
        JLabel sched = (JLabel) fields.get("TaskSched1");
        JTextArea description = (JTextArea) fields.get("Description1");
        JList list = (JList) fields.get("TaskList1");
        
        int index = list.getSelectedIndex();
        Note note = NoteManager.getNoteByIndex(index);
        
        title.setText(note.getTitle());
        sched.setText(note.getDeadline().toString());
        description.setText(note.getBody());
       
    }
    
}

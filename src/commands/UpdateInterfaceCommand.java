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
import manager.NoteManager;
import model.Note;

/**
 *
 * @author tan
 */
public class UpdateInterfaceCommand extends Command {
    
    public UpdateInterfaceCommand(UI ui){
        this.ui = ui;
    }

    @Override
    public void execute() {
        Map fields = ui.getFields();
        JLabel runningTask = (JLabel) fields.get("RunningTaskTitle");
        Note latest = NoteManager.getNextNote();
        if(latest==null)
            runningTask.setText("No task!");
        else
            runningTask.setText(latest.getTitle());
    }
    
}

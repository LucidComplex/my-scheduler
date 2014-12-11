/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import java.util.Calendar;
import java.util.Map;
import javax.swing.JLabel;
import manager.NoteManager;
import model.Note;

/**
 *
 * @author tan
 */
public class UpdateInterfaceCommand extends Command {
    Map fields;
    public UpdateInterfaceCommand(UI ui){
        this.ui = ui;
        fields = ui.getFields();
    }

    @Override
    public void execute() {
        updateRunningTaskLabel();
        updateTodayIsWhat();
    }
    
    /**
     * updates the RunningTask label.
     */
    private void updateRunningTaskLabel(){
        Note latest = NoteManager.getNextNote();
        JLabel runningTask = (JLabel) fields.get("RunningTaskTitle");
        if(latest==null)
            runningTask.setText("No task!");
        else
            runningTask.setText(latest.getTitle());
    }
    
    /**
     * updates the TodayIsWhat label.
     */
    private void updateTodayIsWhat(){
        JLabel todayIsWhat = (JLabel) fields.get("TodayIsWhat");
        StringBuilder builder = new StringBuilder("Today is ");
        builder.append(intToDayOfWeek(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)));
        todayIsWhat.setText(builder.toString());
    }
    
    private String intToDayOfWeek(int day){
        switch(day){
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
        }
        return null;
    }
    
}

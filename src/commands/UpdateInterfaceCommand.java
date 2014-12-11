/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import javax.swing.JLabel;
import manager.GameElement;
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
        updateDateOnTile();
        updateTaskTodayCount();
        updateExp();
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
    
    /**
     * updates DateOnTile label.
     */
    private void updateDateOnTile(){
        JLabel dateOnTile = (JLabel) fields.get("DateOnTile");
        Calendar now = Calendar.getInstance();
        StringBuilder builder = new StringBuilder();
        builder.append(intToMonth(now.get(Calendar.MONTH))).append(", ");
        builder.append(now.get(Calendar.DATE)).append(" ");
        builder.append(now.get(Calendar.YEAR));
        dateOnTile.setText(builder.toString());
    }
    
    private void updateTaskTodayCount(){
        JLabel taskTodayCount = (JLabel) fields.get("TaskTodayCount");
        List<Note> noteList = NoteManager.toList();
        
        // only account for active tasks "today" tasks
        int taskCount = 0;
        for(Note n : noteList)
            if(n.isActive())
                taskCount++;
        
        taskTodayCount.setText(String.valueOf(taskCount));
    }
    
    private void updateExp(){
        JLabel exp = (JLabel) fields.get("XPPoints");
        exp.setText(String.valueOf(GameElement.getExperience()));
    }
    
    //<editor-fold defaultstate="collapsed" desc="Helper methods">
    
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
    
    private String intToMonth(int month){
        String monthString = "no month";
        
        switch(month){
            case 0:
                monthString = "January";
                break;
            case 1:
                monthString = "February";
                break;
            case 2:
                monthString = "March";
                break;
            case 3:
                monthString = "April";
                break;
            case 4:
                monthString = "May";
                break;
            case 5:
                monthString = "June";
                break;
            case 6:
                monthString = "July";
                break;
            case 7:
                monthString = "August";
                break;
            case 8:
                monthString = "September";
                break;
            case 9:
                monthString = "October";
                break;
            case 10:
                monthString = "November";
                break;
            case 11:
                monthString = "December";
                break;                
        }
        
        return monthString;
    }
            
//</editor-fold>
}

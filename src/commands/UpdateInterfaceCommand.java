/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import base.UI;
import com.sun.prism.paint.Color;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
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
        updateTodayCompleted();
        updateTodaysTaskTable();
        updateTaskLevel();
        updateUpcomingTasks();
        updatePanelColor();
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
    
    private void updateTaskLevel(){
        JLabel taskLevel = (JLabel) fields.get("TaskingLevel");
        JLabel rank = (JLabel) fields.get("RankTop");
        int level = GameElement.getLevel();
        taskLevel.setText(intToTaskingLevel(level));
        rank.setText(intToTaskingLevel(level));
    }
    
    private void updatePanelColor(){
        JPanel panel1 = (JPanel) fields.get("Upcoming1Accent");
        JPanel panel2 = (JPanel) fields.get("Upcoming2Accent");
        JPanel panel3 = (JPanel) fields.get("Upcoming3Accent");
        JPanel [] panels = {panel1,panel2,panel3};
        
        List<Note> noteList = NoteManager.toList();
        long now = Calendar.getInstance().getTime().getTime();
        int i;
        for(i=0; i<noteList.size() && i<3; i++){
            long deadline = noteList.get(i).getDeadline().getTime();
            long days = deadline - now;
            if (days < 86400000*3)
                panels[i].setBackground(java.awt.Color.red);
        }
        
        while(i<3)
            panels[i++].setBackground(java.awt.Color.GRAY);

    }
    
    private void updateUpcomingTasks(){
        JLabel task1Title = (JLabel) fields.get("Upcoming1Title");
        JLabel task2Title = (JLabel) fields.get("Upcoming2Title");
        JLabel task3Title = (JLabel) fields.get("Upcoming3Title");
        JLabel [] tasks = {task1Title,task2Title,task3Title};
        
        JLabel task1Sched = (JLabel) fields.get("Upcoming1Sched");
        JLabel task2Sched = (JLabel) fields.get("Upcoming2Sched");
        JLabel task3Sched = (JLabel) fields.get("Upcoming3Sched");
        JLabel [] taskScheds = {task1Sched,task2Sched,task3Sched};
        
        List <Note> noteList = NoteManager.toList();
        int i;
        for (i = 0; i < noteList.size() && i < 3; i++){
            Note note = noteList.get(i);
            tasks[i].setText(note.getTitle().toString());
            taskScheds[i].setText(note.getDeadline().toString());
        }
        
        while(i<3){
            tasks[i].setText("");
            taskScheds[i++].setText("");
        }
        
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
        
        // only account for active tasks "today" tasks
        int taskCount = NoteManager.size();
        
        taskTodayCount.setText(String.valueOf(taskCount));
    }
    
    private void updateExp(){
        JLabel exp = (JLabel) fields.get("XPPoints");
        exp.setText(String.valueOf(GameElement.getExperience()));
    }
    
    private void updateTodayCompleted(){
        JLabel AccomplishedTodayCount = (JLabel) fields.get("AccomplishedTodayCount");
        List<Note> noteList = NoteManager.toList();
        Calendar now = Calendar.getInstance();
        Calendar completionDate = Calendar.getInstance();
        int todayDate = now.get(Calendar.DATE);
        int todayMonth = now.get(Calendar.MONTH);
        int todayYear = now.get(Calendar.YEAR);
        int taskDate;
        int taskMonth;
        int taskYear;
        
        int taskCount = 0;
        for(Note n : noteList){
            completionDate.setTime(n.getCompletionDate());
            taskDate = completionDate.get(Calendar.DATE);
            taskMonth = completionDate.get(Calendar.MONTH);
            taskYear = completionDate.get(Calendar.YEAR);
            
            if(
                n.isDone() && (
                    todayDate==taskDate &&
                    todayMonth==taskMonth &&
                    todayYear==taskYear
                )
            )
                taskCount++;
        }
    }
    
    private void updateTodaysTaskTable(){
        JList list = (JList) fields.get("TaskList1");
        List<Note> todaysNotes = getTodaysTaskList();
        
        list.setModel(
            new AbstractListModel<Note>(){
                public int getSize(){
                    return todaysNotes.size();
                }

                @Override
                public Note getElementAt(int index) {
                    return todaysNotes.get(index);
                }
            }
        );
        
        
    }
    
    //<editor-fold defaultstate="collapsed" desc="Helper methods">
    
    private List<Note> getTodaysTaskList(){
        List<Note> todaysNotes = NoteManager.toList();
        Calendar now = Calendar.getInstance();
        Calendar completionDate = Calendar.getInstance();
        int todayDate = now.get(Calendar.DATE);
        int todayMonth = now.get(Calendar.MONTH);
        int todayYear = now.get(Calendar.YEAR);
        int taskDate;
        int taskMonth;
        int taskYear;
        
        Iterator<Note> i = todaysNotes.iterator();
        while(i.hasNext()){
            Note n = i.next();
            completionDate.setTime(n.getCompletionDate());
            taskDate = completionDate.get(Calendar.DATE);
            taskMonth = completionDate.get(Calendar.MONTH);
            taskYear = completionDate.get(Calendar.YEAR);
            
            if(!(todayDate==taskDate && todayMonth==taskMonth && todayYear==taskYear))
                i.remove();
        }
        
        return todaysNotes;
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
   
    private String intToTaskingLevel(int level){
        switch(level){
            case 1:
                return "Slow Poke";
            case 2:
                return "Procastinator";
            case 3:
                return "Clock Work";
            case 4:
                return "Over-Achiever";
            case 5:
                return "GodLike";
        }
        return "Beyond GodLike";
    }
            
//</editor-fold>
}

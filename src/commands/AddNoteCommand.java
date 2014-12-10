/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commands;

import base.Command;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * A command that creates a note, gets input from the UI, and adds it into the
 * NoteManager.
 * 
 * @author tan
 */
public class AddNoteCommand implements Command {

    @Override
    public void execute() {
        
        
    }
    
    /**
     * Extracts values from a Calendar.
     * Values are stored month first, then second, then third.
     * 
     * @param calendar
     * @return a List of integers containing the month in the first index,
     * date in the second, and the year in the third.
     */
    private List<Integer> extractValues(Calendar calendar){
        List<Integer> calendarValues = new ArrayList<>();
        
        calendarValues.add(calendar.get(Calendar.MONTH));
        calendarValues.add(calendar.get(Calendar.DAY_OF_MONTH));
        calendarValues.add(calendar.get(Calendar.YEAR));
        
        return calendarValues;
    }
    
}

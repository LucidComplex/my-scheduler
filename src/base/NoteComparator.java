/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.Comparator;
import model.Note;

/**
 *
 * @author tan
 */
public class NoteComparator implements Comparator<Note> {

    @Override
    public int compare(Note o1, Note o2) {
        if(o1.getDeadline().before(o2.getDeadline()))
            return 1;
        else if(o1.getDeadline().after(o2.getDeadline()))
            return -1;
        else
            return 0;
    }
    
}

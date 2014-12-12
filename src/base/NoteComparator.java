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
        return o1.compareTo(o2);
    }
    
}

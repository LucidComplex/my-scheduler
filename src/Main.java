
import base.JSONModel;
import factory.JSONModelFactory;
import java.io.IOException;
import manager.NoteManager;
import model.Note;
import org.json.simple.parser.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tan
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException, InstantiationException, IllegalAccessException {
        JSONModel note = JSONModelFactory.create(Note.class);
        NoteManager nm = new NoteManager("notes.json");
        nm.manage(note);
        System.out.println(note.toJSON());
        nm.saveModels();
    }
}

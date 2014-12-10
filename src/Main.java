
import factory.ModelFactory;
import java.io.IOException;
import java.time.Instant;
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
        NoteManager nm = new NoteManager("note.json");
        nm.loadModels();
        
        System.out.println(nm.getModel(0).toJSON().toString());
        
    }
}

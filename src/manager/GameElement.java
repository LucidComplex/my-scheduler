/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractQueue;
import java.util.PriorityQueue;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import persistence.JSONReader;
import persistence.JSONWriter;

/**
 *
 * @author tan
 */
public final class GameElement {
    private static int level;
    private static int streak;
    private static int experience;
    
    /**
     * Increases experience by the amount.
     * 
     * @param delta the amount of experience to increase
     */
    public static void increaseExperience(int delta) throws IllegalArgumentException {
        if(delta<0)
            throw new IllegalArgumentException(
                    "Delta can not be negative."
            );
        experience += delta;
        updateLevel();
    }
    
    /**
     * Decreases experience by the amount. Experience can not go below 0
     * 
     * @param delta the amount of experience to decrease
     * 
     * @throws IllegalArgumentException
     */
    public static void decreaseExperience(int delta) throws IllegalArgumentException {
        if(delta<0)
            throw new IllegalArgumentException(
                    "Delta can not be negative."
            );
        if(getExperience()-delta<0)
            return;
        experience -= delta;
        updateLevel();
    }
    
    /**
     * updates the level based on the experience.
     */
    private static void updateLevel(){
        level = 1 + experience/100;
    }
    
    /**
     * increases streak by 1
     */
    public static void increaseStreak(){
        streak++;
    }
    
    /**
     * breaks the streak
     */
    public static void breakStreak(){
        streak = 0;
    }
    
    public static void save() throws IOException{
        JSONWriter.setFile(new File("scores.json"));
        AbstractQueue temp = new PriorityQueue(1);
        temp.add(GameElement.toJSON());
        JSONWriter.writeModels(temp);
    }
    
    public static void load() throws FileNotFoundException, IOException, ParseException, InstantiationException, IllegalAccessException{
        JSONReader.setFile(new File("scores.json"));
        fromJSON(JSONReader.loadModels(GameElement.class).poll().toJSON());
    }

//<editor-fold defaultstate="collapsed" desc="Accessors">
    /**
     * @return the level
     */
    public static int getLevel() {
        return level;
    }
    
    /**
     * @return the streak
     */
    public static int getStreak() {
        return streak;
    }
    
    /**
     * @return the experience
     */
    public static int getExperience() {
        return experience;
    }
//</editor-fold>

    public static JSONObject toJSON() {
        JSONObject json = new JSONObject();
        
        json.put("level", level);
        json.put("experience", experience);
        json.put("streak", streak);
        
        return json;
    }

    public static void fromJSON(JSONObject json) {
        level = (int) json.get("level");
        experience = (int) json.get("experience");
        streak = (int) json.get("streak");
    }
    
}

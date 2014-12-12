/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author tan
 */
public final class GameElement {
    private static int level = 1;
    private static int streak;
    private static int experience;
    
    /**
     * Increases experience by the amount.
     * 
     * @param delta the amount of experience to increase
     */
    public static void increaseExperience(int delta) throws IllegalArgumentException, IOException {
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
    public static void decreaseExperience(int delta) throws IllegalArgumentException, IOException {
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
    private static void updateLevel() throws IOException{
        level = 1 + experience/100;
        save();
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
        BufferedWriter bw = new BufferedWriter(new FileWriter("scores.json"));
        bw.write(toJSON().toJSONString());
        bw.flush();
    }
    
    public static void load() throws FileNotFoundException, IOException, ParseException, InstantiationException, IllegalAccessException{
        BufferedReader br = new BufferedReader(new FileReader("scores.json"));
        JSONParser parser = new JSONParser();
        String line = br.readLine();
        if(line!=null)
            fromJSON((JSONObject) parser.parse(line));
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
        
        json.put("level", String.valueOf(level));
        json.put("experience", String.valueOf(experience));
        json.put("streak", String.valueOf(streak));
        
        return json;
    }

    public static void fromJSON(JSONObject json) {
        level = Integer.valueOf((String) json.get("level"));
        experience = Integer.valueOf((String) json.get("experience"));
        streak = (int) Integer.valueOf((String) json.get("streak"));
    }
    
}

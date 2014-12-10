/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author tan
 */
public class GameElement {
    private int level;
    private int streak;
    private int experience;
    
    /**
     * Increases experience by the amount.
     * 
     * @param delta the amount of experience to increase
     */
    public void increaseExperience(int delta) throws IllegalArgumentException {
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
    public void decreaseExperience(int delta) throws IllegalArgumentException {
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
    private void updateLevel(){
        level = 1 + experience/100;
    }
    
    /**
     * increases streak by 1
     */
    public void increaseStreak(){
        streak++;
    }
    
    /**
     * breaks the streak
     */
    public void breakStreak(){
        streak = 0;
    }

//<editor-fold defaultstate="collapsed" desc="Accessors">
    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * @return the streak
     */
    public int getStreak() {
        return streak;
    }
    
    /**
     * @return the experience
     */
    public int getExperience() {
        return experience;
    }
//</editor-fold>
    
}

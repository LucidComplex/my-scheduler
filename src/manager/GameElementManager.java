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
public class GameElementManager {
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
        if(experience-delta<0)
            return;
        experience -= delta;
    }
    
}

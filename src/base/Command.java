/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 * A class to de-couple the GUI from the logic behind it.
 * 
 * @author tan
 */
public interface Command {
    
    /**
     * Executes the command
     */
    public void execute();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;
import manager.EventManager;

/**
 *
 * @author tan
 */

public class CommandNotFoundException extends Exception {
    
    public CommandNotFoundException(String msg){
        Logger.getLogger(EventManager.class.getName())
                .log(Level.SEVERE, msg, this);
    }
    
}


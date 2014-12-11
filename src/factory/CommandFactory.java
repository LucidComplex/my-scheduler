/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import base.Command;

/**
 *
 * @author tan
 */
public abstract class CommandFactory {
    
    /**
     * Creates a Command object to use.
     * 
     * @param aClass the Command Class to instantiate.
     * @return a Command instance.
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static Command create(Class<? extends Command> aClass) throws InstantiationException, IllegalAccessException {
        return aClass.newInstance();
    }
    
}

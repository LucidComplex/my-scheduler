/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import base.Command;
import exceptions.CommandNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * Manager that handles events such as button events
 * 
 * @author tan
 */
public abstract class EventManager {
    private static Map<Class, Command> commands = new HashMap();
    
    public static void put(Class aClass, Command command){
        commands.put(aClass, command);
    }
    
    public static void execute(Class aClass) throws CommandNotFoundException{
        Command command = commands.get(aClass);
        if(command==null)
            throw new CommandNotFoundException(
                    "This manager does not contain the command."
            );
        else
            command.execute();
    }
}

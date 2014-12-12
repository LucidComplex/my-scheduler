/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import base.Command;
import base.UI;
import commands.*;
import ui.ExtendSched;
import ui.MainWindow;

/**
 *
 * @author tan
 */
public abstract class CommandFactory {
    
    /**
     *
     * @param ui the UI to bind this command to.
     * @return an add note command
     */
    public static Command createAddNoteCommand(UI ui){
        return new AddNoteCommand(ui);
    }
    
    public static Command createUpdateInterfaceCommand(UI ui){
        return new UpdateInterfaceCommand(ui);
    }
    
    public static Command createAccomplishCommand(UI ui){
        return new AccomplishCommand(ui);
    }

    public static Command createShowDetailsCommand(UI ui) {
        return new ShowDetailsCommand(ui);
    }

    public static Command createDeleteCommand(UI ui) {
        return new DeleteCommand(ui);
    }

    public static Command createExtendCommand(UI ui) {
        return new ExtendCommand(ui);
    }
}

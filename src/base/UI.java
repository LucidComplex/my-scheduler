/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.util.Map;

/**
 *
 * @author tan
 */
public interface UI {
    
    /**
     * 
     * Gets the fields of the UI, the components are mapped by the variable
     * names in java.util.String format.
     * 
     * <blockquote>
     * Ex.
     * <p>
     * Map fields = window.getFields();
     * JLabel fieldLabel = fields.get("jLabel1");
     * </blockquote>
     * 
     * @return a Map of the UI's fields.
     */
    public Map getFields();
}

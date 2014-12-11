/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author tan
 */
public class NotReadyException extends Exception {
    public NotReadyException(String msg){
        System.out.println(msg);
    }
}

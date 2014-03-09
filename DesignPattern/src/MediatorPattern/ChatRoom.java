/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MediatorPattern;

import java.util.Date;

/**
 *
 * @author nghiatc
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}

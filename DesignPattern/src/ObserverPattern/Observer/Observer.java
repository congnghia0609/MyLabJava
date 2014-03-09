/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern.Observer;

import ObserverPattern.Subject;

/**
 *
 * @author nghiatc
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

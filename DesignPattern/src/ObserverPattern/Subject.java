/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import ObserverPattern.Observer.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nghiatc
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

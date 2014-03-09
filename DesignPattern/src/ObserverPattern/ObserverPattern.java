/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPattern;

import ObserverPattern.Observer.BinaryObserver;
import ObserverPattern.Observer.HexaObserver;
import ObserverPattern.Observer.Observer;
import ObserverPattern.Observer.OctalObserver;

/**
 *
 * @author nghiatc Observer pattern is used when there is one to many
 * relationship between objects such as if one object is modified, its
 * depenedent objects are to be notified automatically.
 */
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subject subject = new Subject();

        Observer o1 = new HexaObserver(subject);
        Observer o2 = new OctalObserver(subject);
        Observer o3 = new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}

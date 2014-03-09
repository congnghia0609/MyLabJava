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
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
    
}

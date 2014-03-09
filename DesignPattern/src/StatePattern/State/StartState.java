/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern.State;

import StatePattern.Context;

/**
 *
 * @author nghiatc
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}

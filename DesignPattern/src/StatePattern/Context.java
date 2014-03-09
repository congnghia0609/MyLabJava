/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.State.State;

/**
 *
 * @author nghiatc
 */
public class Context {

    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

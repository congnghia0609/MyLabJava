/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

import StatePattern.State.StartState;
import StatePattern.State.StopState;

/**
 *
 * @author nghiatc In State pattern a class behavior changes based on its state.
 * In State pattern, we create objects which represent various states and a
 * context object whose behavior varies as its state object changes.
 */
public class StatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}





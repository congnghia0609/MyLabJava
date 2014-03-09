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
public interface State {
    public void doAction(Context context);
}

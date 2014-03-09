/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoPattern;

/**
 *
 * @author nghiatc
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

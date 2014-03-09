/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MementoPattern;

import java.util.*;

/**
 *
 * @author nghiatc
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}

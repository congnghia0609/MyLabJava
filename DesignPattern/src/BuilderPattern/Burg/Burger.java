/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern.Burg;

import BuilderPattern.Item;
import BuilderPattern.Pack.Packing;
import BuilderPattern.Pack.Wrapper;

/**
 *
 * @author nghiatc
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

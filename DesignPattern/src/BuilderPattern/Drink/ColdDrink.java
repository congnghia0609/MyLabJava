/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern.Drink;

import BuilderPattern.Item;
import BuilderPattern.Pack.Bottle;
import BuilderPattern.Pack.Packing;

/**
 *
 * @author nghiatc
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

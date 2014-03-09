/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern.Burg;

/**
 *
 * @author nghiatc
 */
public class VegBurger extends Burger{

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
    
}

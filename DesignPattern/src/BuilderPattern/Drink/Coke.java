/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern.Drink;

/**
 *
 * @author nghiatc
 */
public class Coke extends ColdDrink{

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
    
}

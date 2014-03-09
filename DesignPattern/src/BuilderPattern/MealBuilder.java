/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import BuilderPattern.Burg.ChickenBurger;
import BuilderPattern.Burg.VegBurger;
import BuilderPattern.Drink.Coke;
import BuilderPattern.Drink.Pepsi;

/**
 *
 * @author nghiatc
 */
public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

import AbstractFactoryPattern.Color.ColorFactory;
import AbstractFactoryPattern.CommonFactory.FactoryType;
import AbstractFactoryPattern.Shape.ShapeFactory;

/**
 *
 * @author nghiatc
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType){
        if(factoryType == null){
            return null;
        }
        switch(factoryType){
            case SHAPE:{
                return new ShapeFactory();
            }
            case COLOR:{
                return new ColorFactory();
            }
        }
        return null;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern.Shape;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.CommonFactory;

/**
 *
 * @author nghiatc
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(CommonFactory.ColorType colorType) {
        return null;
    }

    @Override
    public Shape getShape(CommonFactory.ShapeType shapeType) {
        if(shapeType == null){
            return null;
        }
        switch(shapeType){
            case CIRCLE: {
                return new Circle();
            }
            case RECTANGLE:{
                return new Rectangle();
            }
            case SQUARE:{
                return new Square();
            }
        }
        return null;
    }
}

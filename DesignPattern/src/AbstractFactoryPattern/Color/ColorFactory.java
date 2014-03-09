/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern.Color;

import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.CommonFactory;
import AbstractFactoryPattern.Shape.Shape;

/**
 *
 * @author nghiatc
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Color getColor(CommonFactory.ColorType colorType) {
        if(colorType == null){
            return null;
        }
        switch(colorType){
            case RED:{
                return new Red();
            }
            case GREEN:{
                return new Green();
            }
            case BLUE:{
                return new Blue();
            }
        }
        return null;
    }

    @Override
    public Shape getShape(CommonFactory.ShapeType shapeType) {
        return null;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

import AbstractFactoryPattern.Color.Color;
import AbstractFactoryPattern.CommonFactory.ColorType;
import AbstractFactoryPattern.CommonFactory.ShapeType;
import AbstractFactoryPattern.Shape.Shape;

/**
 *
 * @author nghiatc
 */
public abstract class AbstractFactory {
    public abstract Color getColor(ColorType colorType);
    public abstract Shape getShape(ShapeType shapeType);
    
}

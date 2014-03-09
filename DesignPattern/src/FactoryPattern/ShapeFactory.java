/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

import FactoryPattern.CommonFactory.ShapeType;

/**
 *
 * @author nghiatc
 */
public class ShapeFactory {
    //use getShape method to get object of type shape
    public Shape getShape(ShapeType shapeType){
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

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
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shapeFactory = new ShapeFactory();
        
        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        //call draw method of Circle
        shape1.draw();
        
        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
        //call draw method of circle
        shape3.draw();
    }
}

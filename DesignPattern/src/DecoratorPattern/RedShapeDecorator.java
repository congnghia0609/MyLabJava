/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

import DecoratorPattern.Shape.Shape;

/**
 *
 * @author nghiatc
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }
    
    @Override
    public void draw(){
        decorratedShape.draw();
        setRedBorder(decorratedShape);
    }
    
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}

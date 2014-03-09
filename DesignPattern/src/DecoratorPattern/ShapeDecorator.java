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
public abstract class ShapeDecorator implements Shape{
    protected Shape decorratedShape;

    public ShapeDecorator(Shape decorratedShape) {
        this.decorratedShape = decorratedShape;
    }
    
    @Override
    public void draw(){
        decorratedShape.draw();
    }
}

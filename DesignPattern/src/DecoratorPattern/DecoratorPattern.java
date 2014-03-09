/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPattern;

import DecoratorPattern.Shape.Circle;
import DecoratorPattern.Shape.Rectangle;
import DecoratorPattern.Shape.Shape;

/**
 *
 * @author nghiatc Decorator pattern allows to add new functionality an existing
 * object without altering its structure.
 */
public class DecoratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}

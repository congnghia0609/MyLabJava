/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern;

import FacadePattern.Shape.Circle;
import FacadePattern.Shape.Rectangle;
import FacadePattern.Shape.Shape;
import FacadePattern.Shape.Square;

/**
 *
 * @author nghiatc
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }
    
    public void drawCircle(){
        circle.draw();
    }
    
    public void drawRectangle(){
        rectangle.draw();
    }
    
    public void drawSquare(){
        square.draw();
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyweightPattern;

import FlyweightPattern.Shape.Circle;
import FlyweightPattern.Shape.Shape;
import java.util.HashMap;

/**
 *
 * @author nghiatc
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

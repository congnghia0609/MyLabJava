/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePattern;

import java.util.Hashtable;

/**
 *
 * @author nghiatc
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeTable = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeTable.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeTable.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeTable.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeTable.put(rectangle.getId(), square);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FlyweightPattern;

import FlyweightPattern.Shape.Circle;

/**
 *
 * @author nghiatc Flyweight pattern is primarily used to reduce the number of
 * objects created, to decrease memory footprint and increase performance.
 */
public class FlyweightPattern {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

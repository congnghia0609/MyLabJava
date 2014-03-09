/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author nghiatc
 */
public class CommonFactory {
    public static enum ShapeType{CIRCLE, RECTANGLE, SQUARE}
    public static enum ColorType{RED, GREEN, BLUE}
    public static enum FactoryType{SHAPE, COLOR}
}

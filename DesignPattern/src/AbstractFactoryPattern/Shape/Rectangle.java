/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern.Shape;

/**
 *
 * @author nghiatc
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
    
}

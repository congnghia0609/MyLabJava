/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern.Color;

/**
 *
 * @author nghiatc
 */
public class Green implements Color{

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
    
}

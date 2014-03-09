/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BridgePattern;

/**
 *
 * @author nghiatc
 */
public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}

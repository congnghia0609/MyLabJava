/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern;

import TemplatePattern.Game.Cricket;
import TemplatePattern.Game.Football;
import TemplatePattern.Game.Game;

/**
 *
 * @author nghiatc
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
 */
public class TemplatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}








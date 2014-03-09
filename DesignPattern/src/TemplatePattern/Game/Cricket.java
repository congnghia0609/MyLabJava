/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplatePattern.Game;

/**
 *
 * @author nghiatc
 */
public class Cricket extends Game{

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
    
}

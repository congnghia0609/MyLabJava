/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.AdvancedMediaPlayer;

/**
 *
 * @author nghiatc
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

import AdapterPattern.MediaPlayer.AudioPlayer;

/**
 *
 * @author nghiatc Adapter pattern works as a bridge between two incompatible
 * interfaces.
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}




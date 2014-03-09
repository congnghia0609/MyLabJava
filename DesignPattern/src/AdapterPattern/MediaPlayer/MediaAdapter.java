/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern.MediaPlayer;

import AdapterPattern.AdvancedMediaPlayer.AdvancedMediaPlayer;
import AdapterPattern.AdvancedMediaPlayer.Mp4Player;
import AdapterPattern.AdvancedMediaPlayer.VlcPlayer;

/**
 *
 * @author nghiatc
 */
public class MediaAdapter implements MediaPlayer {
    
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}

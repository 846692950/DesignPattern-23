package DesignPattern.b6适配器模式.MediaPlayerImpl;

import DesignPattern.b6适配器模式.AdvancedMediaPlayer;
import DesignPattern.b6适配器模式.AdvancedMediaPlayerImpl.Mp4Player;
import DesignPattern.b6适配器模式.AdvancedMediaPlayerImpl.VlcPlayer;
import DesignPattern.b6适配器模式.MediaPlayer;

/**
 * 这是一个媒体适配器类
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

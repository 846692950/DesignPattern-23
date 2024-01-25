package DesignPattern.b6适配器模式.MediaPlayerImpl;

import DesignPattern.b6适配器模式.MediaPlayer;

/**
 * 这是一个音频播放器类
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //播放 mp3 音乐文件的内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放 mp3 文件！ 名字: "+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("无效媒体！"+ audioType + " 不支持格式！");
        }
    }
}
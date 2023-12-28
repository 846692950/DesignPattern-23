package DesignPattern.b6适配器模式.AdvancedMediaPlayerImpl;

import DesignPattern.b6适配器模式.AdvancedMediaPlayer;

/**
 * 高级媒体播放器的 VLC 播放器
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("正在播放 VLC 文件！ 名称: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}

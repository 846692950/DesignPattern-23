package DesignPattern.b6适配器模式.AdvancedMediaPlayerImpl;

import DesignPattern.b6适配器模式.AdvancedMediaPlayer;

/**
 * 高级媒体播放器的 MP4 播放器
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("正在播放 MP4 文件！ 名称: " + fileName);
    }
}

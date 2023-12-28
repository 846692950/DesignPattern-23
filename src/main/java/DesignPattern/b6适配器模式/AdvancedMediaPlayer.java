package DesignPattern.b6适配器模式;

/**
 * 这是一个高级媒体播放器类
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
package DesignPattern.b6适配器模式;

import DesignPattern.b6适配器模式.MediaPlayerImpl.AudioPlayer;

/**
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。
 * 这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 *
 * 这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。
 * 举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。
 * 您将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。
 *
 * 我们通过下面的实例来演示适配器模式的使用。
 * 其中，音频播放器设备只能播放 mp3 文件，通过使用一个更高级的音频播放器来播放 vlc 和 mp4 文件。
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "我笑江南烟雨多.mp3");
        audioPlayer.play("mp4", "泼天的富贵.mp4");
        audioPlayer.play("vlc", "月下舞姬.vlc");
        audioPlayer.play("avi", "lost rivers.avi");
    }
}

package DesignPattern.b8代理模式.ImageImpl;

import DesignPattern.b8代理模式.Image;

/**
 * 真实的图像类
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("显示 " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("加载 " + fileName);
    }
}

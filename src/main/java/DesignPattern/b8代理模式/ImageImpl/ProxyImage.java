package DesignPattern.b8代理模式.ImageImpl;

import DesignPattern.b8代理模式.Image;

/**
 * 代理的图像类
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

package DesignPattern.b8代理模式;

import DesignPattern.b8代理模式.ImageImpl.ProxyImage;

/**
 * 在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。
 * 这种类型的设计模式属于结构型模式。
 *
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 * 比如下边的例子，用代理对象只需要加载一次资源，后边就不用加载了。
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("美女.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}

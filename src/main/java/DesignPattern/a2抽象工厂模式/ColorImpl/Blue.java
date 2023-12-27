package DesignPattern.a2抽象工厂模式.ColorImpl;

import DesignPattern.a2抽象工厂模式.Color;

/**
 * 定义一个蓝色类实现颜色接口并重写颜色填充方法
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("蓝色的颜色填充方法！");
    }
}

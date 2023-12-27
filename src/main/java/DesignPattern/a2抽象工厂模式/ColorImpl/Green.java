package DesignPattern.a2抽象工厂模式.ColorImpl;

import DesignPattern.a2抽象工厂模式.Color;

/**
 * 定义一个绿色类实现颜色接口并重写颜色填充方法
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("绿色的颜色填充方法！");
    }
}

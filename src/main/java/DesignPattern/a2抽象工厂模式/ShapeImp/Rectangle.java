package DesignPattern.a2抽象工厂模式.ShapeImp;

import DesignPattern.a2抽象工厂模式.Shape;

/**
 * 定义一个长方形类实现形状接口并重写画画方法
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("长方形的画画方法！");
    }
}

package DesignPattern.a1工厂模式.ShapeImp;

import DesignPattern.a1工厂模式.Shape;

/**
 * 定义一个圆形类实现形状接口并重写画画方法
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("圆形的画画方法！");
    }
}
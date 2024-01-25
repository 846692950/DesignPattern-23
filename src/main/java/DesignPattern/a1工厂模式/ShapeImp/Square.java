package DesignPattern.a1工厂模式.ShapeImp;

import DesignPattern.a1工厂模式.Shape;

/**
 * 定义一个正方形类实现形状接口并重写画画方法
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("正方形的画画方法！");
    }
}
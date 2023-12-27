package DesignPattern.a5原型模式.ShapeImpl;

import DesignPattern.a5原型模式.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "长方形";
    }

    @Override
    public void draw() {
        System.out.println("这是长方形的画画方法！");
    }
}

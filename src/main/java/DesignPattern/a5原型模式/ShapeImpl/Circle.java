package DesignPattern.a5原型模式.ShapeImpl;

import DesignPattern.a5原型模式.Shape;

public class Circle extends Shape {

    public Circle() {
        type = "圆型";
    }

    @Override
    public void draw() {
        System.out.println("这是圆形的画画方法！");
    }
}
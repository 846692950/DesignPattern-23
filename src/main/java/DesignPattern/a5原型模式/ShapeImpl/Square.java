package DesignPattern.a5原型模式.ShapeImpl;

import DesignPattern.a5原型模式.Shape;

public class Square extends Shape {

    public Square() {
        type = "正方形";
    }

    @Override
    public void draw() {
        System.out.println("这是正方形的画画方法！");
    }
}

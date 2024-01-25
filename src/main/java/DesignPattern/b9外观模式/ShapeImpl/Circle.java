package DesignPattern.b9外观模式.ShapeImpl;

import DesignPattern.b9外观模式.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画了一个圆形！");
    }
}

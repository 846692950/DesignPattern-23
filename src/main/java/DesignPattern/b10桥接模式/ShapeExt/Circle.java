package DesignPattern.b10桥接模式.ShapeExt;

import DesignPattern.b10桥接模式.DrawAPI;
import DesignPattern.b10桥接模式.Shape;

/**
 * 创建实现了 Shape 抽象类的实体类。
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

package DesignPattern.b10桥接模式;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape。
 * 用于充当桥梁
 */
public abstract class Shape {

    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

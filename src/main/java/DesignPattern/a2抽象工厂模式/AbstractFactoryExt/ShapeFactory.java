package DesignPattern.a2抽象工厂模式.AbstractFactoryExt;

import DesignPattern.a2抽象工厂模式.AbstractFactory;
import DesignPattern.a2抽象工厂模式.Color;
import DesignPattern.a2抽象工厂模式.Shape;
import DesignPattern.a2抽象工厂模式.ShapeImp.Circle;
import DesignPattern.a2抽象工厂模式.ShapeImp.Rectangle;
import DesignPattern.a2抽象工厂模式.ShapeImp.Square;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("圆形")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("长方形")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("正方形")) {
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
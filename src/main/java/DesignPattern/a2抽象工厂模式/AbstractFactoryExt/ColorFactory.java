package DesignPattern.a2抽象工厂模式.AbstractFactoryExt;

import DesignPattern.a2抽象工厂模式.AbstractFactory;
import DesignPattern.a2抽象工厂模式.Color;
import DesignPattern.a2抽象工厂模式.ColorImpl.Blue;
import DesignPattern.a2抽象工厂模式.ColorImpl.Green;
import DesignPattern.a2抽象工厂模式.ColorImpl.Red;
import DesignPattern.a2抽象工厂模式.Shape;

/**
 * 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("红色")) {
            return new Red();
        } else if (color.equalsIgnoreCase("绿色")) {
            return new Green();
        } else if (color.equalsIgnoreCase("蓝色")) {
            return new Blue();
        }
        return null;
    }
}

package DesignPattern.a2抽象工厂模式;

import DesignPattern.a2抽象工厂模式.AbstractFactoryExt.ColorFactory;
import DesignPattern.a2抽象工厂模式.AbstractFactoryExt.ShapeFactory;

/**
 * 创建一个工厂创造器/生成器类，通过传递形状或颜色信息来获取工厂。
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("形状工厂")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("颜色工厂")) {
            return new ColorFactory();
        }
        return null;
    }
}

package DesignPattern.b10桥接模式;

import DesignPattern.b10桥接模式.DrawAPIImpl.GreenCircle;
import DesignPattern.b10桥接模式.DrawAPIImpl.RedCircle;
import DesignPattern.b10桥接模式.ShapeExt.Circle;

/**
 * 桥接（Bridge）是用于把抽象化与实现化解耦，使得二者可以独立变化。
 * 这种类型的设计模式属于结构型模式，它通过提供抽象化和实现化之间的桥接结构，来实现二者的解耦。
 * <p>
 * 这种模式涉及到一个作为桥接的接口，使得实体类的功能独立于接口实现类，这两种类型的类可被结构化改变而互不影响。
 * <p>
 * 桥接模式的目的是将抽象与实现分离，使它们可以独立地变化，该模式通过将一个对象的抽象部分与它的实现部分分离，使它们可以独立地改变。
 * 它通过组合的方式，而不是继承的方式，将抽象和实现的部分连接起来。
 * <p>
 * 以下是桥接模式的几个关键角色：
 * 抽象（Abstraction）：定义抽象接口，通常包含对实现接口的引用。
 * 扩展抽象（Refined Abstraction）：对抽象的扩展，可以是抽象类的子类或具体实现类。
 * 实现（Implementor）：定义实现接口，提供基本操作的接口。
 * 具体实现（Concrete Implementor）：实现实现接口的具体类。
 * <p>
 * 我们通过下面的实例来演示桥接模式（Bridge Pattern）的用法。
 * 其中，可以使用相同的抽象类方法但是不同的桥接实现类，来画出不同颜色的圆。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
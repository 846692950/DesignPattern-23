package DesignPattern.b12享元模式;

import DesignPattern.b12享元模式.ShapeImpl.Circle;

/**
 * 享元模式（Flyweight Pattern）主要用于减少创建对象的数量，以减少内存占用和提高性能。
 * 这种类型的设计模式属于结构型模式，它提供了减少对象数量从而改善应用所需的对象结构的方式。
 * <p>
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
 * 我们将通过创建 5 个对象来画出 20 个分布于不同位置的圆来演示这种模式。
 * 由于只有 5 种可用的颜色，所以 color 属性被用来检查现有的 Circle 对象。
 * <p>
 * 使用该工厂，通过传递颜色信息来获取实体类的对象。
 * 该程序只会创建 5 个颜色对应数量的对象，其它的输出都是使用现成的。
 */
public class FlyweightPatternDemo {

    private static final String colors[] = {"红色", "绿色", "蓝色", "黑色", "白色"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}

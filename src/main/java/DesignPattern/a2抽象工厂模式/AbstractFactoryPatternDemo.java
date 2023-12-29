package DesignPattern.a2抽象工厂模式;

/**
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
 * 该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。
 * 每个生成的工厂都能按照工厂模式提供对象。
 *
 * 抽象工厂模式提供了一种创建一系列相关或相互依赖对象的接口，而无需指定具体实现类。
 * 通过使用抽象工厂模式，可以将客户端与具体产品的创建过程解耦，使得客户端可以通过工厂接口来创建一族产品。
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("形状工厂");

        //获取形状为 圆形 的对象
        Shape shape1 = shapeFactory.getShape("圆形");
        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 长方形 的对象
        Shape shape2 = shapeFactory.getShape("长方形");
        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 正方形 的对象
        Shape shape3 = shapeFactory.getShape("正方形");
        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("颜色工厂");

        //获取颜色为 红色 的对象
        Color color1 = colorFactory.getColor("红色");
        //调用 Red 的 fill 方法
        color1.fill();

        //获取颜色为 绿色 的对象
        Color color2 = colorFactory.getColor("绿色");
        //调用 Green 的 fill 方法
        color2.fill();

        //获取颜色为 蓝色 的对象
        Color color3 = colorFactory.getColor("蓝色");
        //调用 Blue 的 fill 方法
        color3.fill();

    }

}

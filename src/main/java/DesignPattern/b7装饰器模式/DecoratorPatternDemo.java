package DesignPattern.b7装饰器模式;

import DesignPattern.b7装饰器模式.IEquipExt.IEquipDecoratorImpl.BlueGemDecorator;
import DesignPattern.b7装饰器模式.IEquipExt.IEquipDecoratorImpl.RedGemDecorator;
import DesignPattern.b7装饰器模式.IEquipExt.IEquipDecoratorImpl.YellowGemDecorator;
import DesignPattern.b7装饰器模式.IEquipImpl.ArmEquip;
import DesignPattern.b7装饰器模式.IEquipImpl.ShoeEquip;

/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。
 * 这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 *
 * 装饰器模式通过将对象包装在装饰器类中，以便动态地修改其行为。
 *
 * 这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 *
 * 装饰器模式包含以下几个核心角色：
 * 抽象组件（Component）：定义了原始对象和装饰器对象的公共接口或抽象类，可以是具体组件类的父类或接口。
 * 具体组件（Concrete Component）：是被装饰的原始对象，它定义了需要添加新功能的对象。
 * 抽象装饰器（Decorator）：继承自抽象组件，它包含了一个抽象组件对象，并定义了与抽象组件相同的接口，同时可以通过组合方式持有其他装饰器对象。
 * 具体装饰器（Concrete Decorator）：实现了抽象装饰器的接口，负责向抽象组件添加新的功能。
 *
 * 我们通过下面的实例来演示装饰器模式的用法。
 * 其中，我们将把一个形状装饰上不同的颜色，同时又不改变形状类。
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        IEquip equip;
        // 一个镶嵌2颗红宝石，1颗蓝宝石的靴子
        System.out.println(" 一个镶嵌2颗红宝石，1颗蓝宝石的靴子");
        equip = new RedGemDecorator(new RedGemDecorator(new BlueGemDecorator(new ShoeEquip())));
        System.out.println("攻击力: " + equip.caculateAttack());
        System.out.println("描述: " + equip.description());
        System.out.println("-------");
        // 一个镶嵌1颗红宝石，1颗蓝宝石的武器
        System.out.println(" 一个镶嵌1颗红宝石，1颗蓝宝石,1颗黄宝石的武器");
        equip = new RedGemDecorator(new BlueGemDecorator(new YellowGemDecorator(new ArmEquip())));
        System.out.println("攻击力: " + equip.caculateAttack());
        System.out.println("描述: " + equip.description());
        System.out.println("-------");
    }
}

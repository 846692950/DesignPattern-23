package DesignPattern.a4建造者模式.ItemImpl;

import DesignPattern.a4建造者模式.Item;
import DesignPattern.a4建造者模式.Packing;
import DesignPattern.a4建造者模式.PackingImpl.Wrapper;

/**
 * 创建实现 Item 接口的抽象类，该类提供了默认的功能。
 * 抽象汉堡类
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

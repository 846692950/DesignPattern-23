package DesignPattern.a4建造者模式.ItemImpl.BurgerExt;

import DesignPattern.a4建造者模式.ItemImpl.Burger;

/**
 * 这是一个鸡肉汉堡类，扩展了 Burger
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "鸡肉汉堡！";
    }
}

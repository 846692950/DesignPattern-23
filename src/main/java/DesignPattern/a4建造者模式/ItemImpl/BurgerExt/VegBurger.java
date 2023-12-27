package DesignPattern.a4建造者模式.ItemImpl.BurgerExt;

import DesignPattern.a4建造者模式.ItemImpl.Burger;

/**
 * 这是一个蔬菜汉堡类，扩展了 Burger
 */
public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "蔬菜汉堡！";
    }
}

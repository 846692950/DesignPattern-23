package DesignPattern.a4建造者模式.ItemImpl.ColdDrinkExt;

import DesignPattern.a4建造者模式.ItemImpl.ColdDrink;

/**
 * 这是一个可口可乐类，扩展了 ColdDrink
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "可口可乐！";
    }
}

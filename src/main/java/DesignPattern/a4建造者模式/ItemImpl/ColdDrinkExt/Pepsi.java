package DesignPattern.a4建造者模式.ItemImpl.ColdDrinkExt;

import DesignPattern.a4建造者模式.ItemImpl.ColdDrink;

/**
 * 这是一个百世可乐类，扩展了 ColdDrink
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "百世可乐！";
    }
}
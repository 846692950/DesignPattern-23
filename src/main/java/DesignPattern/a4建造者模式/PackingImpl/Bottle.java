package DesignPattern.a4建造者模式.PackingImpl;

import DesignPattern.a4建造者模式.Packing;

/**
 * 饮料瓶子类
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "瓶子！";
    }
}

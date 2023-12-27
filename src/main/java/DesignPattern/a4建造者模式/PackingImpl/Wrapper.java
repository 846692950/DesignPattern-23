package DesignPattern.a4建造者模式.PackingImpl;

import DesignPattern.a4建造者模式.Packing;

/**
 * 食物包装材料类
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "包装纸！";
    }
}

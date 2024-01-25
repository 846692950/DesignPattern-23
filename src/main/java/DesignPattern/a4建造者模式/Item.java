package DesignPattern.a4建造者模式;

/**
 * 创建一个表示食物条目和食物包装的接口。
 */
public interface Item {
    public String name();//食物名
    public Packing packing();//包装
    public float price();//价格
}

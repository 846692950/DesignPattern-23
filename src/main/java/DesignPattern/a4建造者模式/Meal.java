package DesignPattern.a4建造者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 这是一个套餐类
 */
public class Meal {

    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("食物 : " + item.name());
            System.out.print(", 包装 : " + item.packing().pack());
            System.out.println(", 价格 : " + item.price());
        }
    }
}

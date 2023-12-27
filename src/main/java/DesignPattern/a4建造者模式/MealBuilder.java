package DesignPattern.a4建造者模式;

import DesignPattern.a4建造者模式.ItemImpl.BurgerExt.ChickenBurger;
import DesignPattern.a4建造者模式.ItemImpl.BurgerExt.VegBurger;
import DesignPattern.a4建造者模式.ItemImpl.ColdDrinkExt.Coke;
import DesignPattern.a4建造者模式.ItemImpl.ColdDrinkExt.Pepsi;

/**
 * 这是一个套餐构建类
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

package DesignPattern.a4建造者模式;

/**
 * 建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *
 * 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("素食套餐");
        vegMeal.showItems();
        System.out.println("总价: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n肉食套餐");
        nonVegMeal.showItems();
        System.out.println("总价: " + nonVegMeal.getCost());
    }

}

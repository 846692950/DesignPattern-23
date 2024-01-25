package DesignPattern.c20状态模式;

/**
 * 在状态模式（State Pattern）中，类的行为是基于它的状态改变的。
 * 这种类型的设计模式属于行为型模式。
 * <p>
 * 以下是自动售卖机的例子！
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(10);
        //模拟投币操作
        for (int i = 0; i < 20; i++) {
            machine.insertMoney();//投币
            machine.turnCrank();//转动手柄
        }
    }
}
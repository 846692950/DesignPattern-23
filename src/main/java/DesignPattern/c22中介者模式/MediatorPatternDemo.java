package DesignPattern.c22中介者模式;

/**
 * 中介者模式（Mediator Pattern）是用来降低多个对象和类之间的通信复杂性。
 * 这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。
 * 中介者模式属于行为型模式。
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User qy = new User("清漪");
        qy.sendMessage("Hi! 月婵!");
        System.out.println("--------------------");
        User yc = new User("月婵");
        yc.sendMessage("Hello! 清漪!");
    }
}

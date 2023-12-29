package DesignPattern.c21访问者模式;

import DesignPattern.c21访问者模式.ComputerPartImpl.Computer;
import DesignPattern.c21访问者模式.ComputerPartImpl.Keyboard;
import DesignPattern.c21访问者模式.ComputerPartImpl.Mouse;
import DesignPattern.c21访问者模式.ComputerPartVisitorImpl.ComputerPartDisplayVisitor;

/**
 * 在访问者模式（Visitor Pattern）中，我们使用了一个访问者类，它改变了元素类的执行算法。
 * 通过这种方式，元素的执行算法可以随着访问者改变而改变。
 * 这种类型的设计模式属于行为型模式。
 * 根据模式，元素对象已接受访问者对象，这样访问者对象就可以处理元素对象上的操作。
 *
 * Computer 使用实体访问者来执行相应的动作。
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
        System.out.println("--------------------------");
        Keyboard keyboard = new Keyboard();
        keyboard.accept(new ComputerPartDisplayVisitor());
        System.out.println("--------------------------");
        Mouse mouse = new Mouse();
        mouse.accept(new ComputerPartDisplayVisitor());
    }
}
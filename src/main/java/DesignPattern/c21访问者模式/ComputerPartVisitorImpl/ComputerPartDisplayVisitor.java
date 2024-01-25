package DesignPattern.c21访问者模式.ComputerPartVisitorImpl;

import DesignPattern.c21访问者模式.ComputerPartImpl.Computer;
import DesignPattern.c21访问者模式.ComputerPartImpl.Keyboard;
import DesignPattern.c21访问者模式.ComputerPartImpl.Monitor;
import DesignPattern.c21访问者模式.ComputerPartImpl.Mouse;
import DesignPattern.c21访问者模式.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("展示电脑！");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("展示鼠标！");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("展示键盘！");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("展示显示器！");
    }
}

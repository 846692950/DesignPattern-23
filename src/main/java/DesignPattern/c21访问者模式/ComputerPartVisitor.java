package DesignPattern.c21访问者模式;

import DesignPattern.c21访问者模式.ComputerPartImpl.Computer;
import DesignPattern.c21访问者模式.ComputerPartImpl.Keyboard;
import DesignPattern.c21访问者模式.ComputerPartImpl.Monitor;
import DesignPattern.c21访问者模式.ComputerPartImpl.Mouse;

/**
 * 定义一个表示访问者的接口。
 * 定义了访问者类的操作。
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}

package DesignPattern.c21访问者模式.ComputerPartImpl;

import DesignPattern.c21访问者模式.ComputerPart;
import DesignPattern.c21访问者模式.ComputerPartVisitor;

/**
 * 显示器
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
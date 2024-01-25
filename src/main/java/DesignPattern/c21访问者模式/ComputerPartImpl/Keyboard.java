package DesignPattern.c21访问者模式.ComputerPartImpl;

import DesignPattern.c21访问者模式.ComputerPart;
import DesignPattern.c21访问者模式.ComputerPartVisitor;

/**
 * 键盘
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

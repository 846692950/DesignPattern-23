package DesignPattern.c21访问者模式.ComputerPartImpl;

import DesignPattern.c21访问者模式.ComputerPart;
import DesignPattern.c21访问者模式.ComputerPartVisitor;

/**
 * 电脑
 */
public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}

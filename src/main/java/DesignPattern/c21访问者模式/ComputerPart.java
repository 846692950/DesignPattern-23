package DesignPattern.c21访问者模式;

/**
 * 计算机组成部分接口
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}

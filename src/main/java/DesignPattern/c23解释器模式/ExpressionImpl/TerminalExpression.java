package DesignPattern.c23解释器模式.ExpressionImpl;

import DesignPattern.c23解释器模式.Expression;

/**
 * 作为上下文中主要解释器的 TerminalExpression 类
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}

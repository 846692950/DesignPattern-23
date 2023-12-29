package DesignPattern.c23解释器模式.ExpressionImpl;

import DesignPattern.c23解释器模式.Expression;

/**
 * 用于创建组合式表达式 <and>
 */
public class AndExpression implements Expression {

    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
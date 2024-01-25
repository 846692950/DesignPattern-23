package DesignPattern.c23解释器模式;

import DesignPattern.c23解释器模式.ExpressionImpl.AndExpression;
import DesignPattern.c23解释器模式.ExpressionImpl.OrExpression;
import DesignPattern.c23解释器模式.ExpressionImpl.TerminalExpression;

/**
 * 解释器模式（Interpreter Pattern）提供了评估语言的语法或表达式的方式，它属于行为型模式。
 * 这种模式实现了一个表达式接口，该接口解释一个特定的上下文。
 * 这种模式被用在 SQL 解析、符号处理引擎等。
 */
public class InterpreterPatternDemo {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("石昊是男的吗? " + isMale.interpret("石昊"));
        System.out.println("清漪是已婚女性吗? " + isMarriedWoman.interpret("清漪是个已婚的女子！"));
    }

    //规则：石昊 和 叶凡 是男性
    public static Expression getMaleExpression() {
        Expression shiHao = new TerminalExpression("石昊");
        Expression yeFan = new TerminalExpression("叶凡");
        return new OrExpression(shiHao, yeFan);
    }

    //规则：清漪 是一个已婚的女性
    public static Expression getMarriedWomanExpression() {
        Expression qingYi = new TerminalExpression("清漪");
        Expression married = new TerminalExpression("已婚");
        return new AndExpression(qingYi, married);
    }

}

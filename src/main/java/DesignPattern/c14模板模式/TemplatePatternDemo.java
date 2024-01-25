package DesignPattern.c14模板模式;

import DesignPattern.c14模板模式.GameExt.CF;
import DesignPattern.c14模板模式.GameExt.DNF;

/**
 * 在模板模式（Template Pattern）中，一个抽象类公开定义了执行它的方法的方式/模板。
 * 它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行。
 * 这种类型的设计模式属于行为型模式。
 * <p>
 * 模版模式使得子类可以在不改变算法结构的情况下，重新定义算法的步骤。
 * 例子里边还添加了一个时间钩子，在需要的时候在子类重写。
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new DNF();
        game.play();
        System.out.println("---------------------------");
        game = new CF();
        game.play();
    }
}

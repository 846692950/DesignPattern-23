package DesignPattern.c13策略模式;

import DesignPattern.c13策略模式.IAttackBehaviorImpl.AttackJYSG;
import DesignPattern.c13策略模式.IAttackBehaviorImpl.AttackQKYZ;
import DesignPattern.c13策略模式.IDefendBehaviorImpl.DefendQJS;
import DesignPattern.c13策略模式.IDefendBehaviorImpl.DefendTBS;
import DesignPattern.c13策略模式.IDisplayBehaviorImpl.DisplayLLQ;
import DesignPattern.c13策略模式.IDisplayBehaviorImpl.DisplayTKJ;
import DesignPattern.c13策略模式.IRunBehaviorImpl.RunJCTQ;
import DesignPattern.c13策略模式.RoleExt.RoleMan;
import DesignPattern.c13策略模式.RoleExt.RoleWoman;

/**
 * 在策略模式（Strategy Pattern）中一个类的行为或其算法可以在运行时更改。
 * 这种类型的设计模式属于行为型模式。
 * <p>
 * 在策略模式定义了一系列算法或策略，并将每个算法封装在独立的类中，使得它们可以互相替换。
 * 通过使用策略模式，可以在运行时根据需要选择不同的算法，而不需要修改客户端代码。
 * <p>
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。
 * 策略对象改变 context 对象的执行算法。
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Role roleWoman = new RoleWoman("云曦");
        roleWoman.setAttackBehavior(new AttackQKYZ());
        roleWoman.setDefendBehavior(new DefendQJS());
        roleWoman.setDisplayBehavior(new DisplayLLQ());
        roleWoman.setRunBehavior(new RunJCTQ());
        System.out.println("角色" + ":" + roleWoman.name);
        roleWoman.run();
        roleWoman.attack();
        roleWoman.defend();
        roleWoman.display();
        System.out.println("----------------------------------------");
        Role roleMan = new RoleMan("石昊");
        roleMan.setAttackBehavior(new AttackJYSG());
        roleMan.setDefendBehavior(new DefendTBS());
        roleMan.setDisplayBehavior(new DisplayTKJ());
        roleMan.setRunBehavior(new RunJCTQ());
        System.out.println("角色" + ":" + roleMan.name);
        roleMan.run();
        roleMan.attack();
        roleMan.defend();
        roleMan.display();
    }
}

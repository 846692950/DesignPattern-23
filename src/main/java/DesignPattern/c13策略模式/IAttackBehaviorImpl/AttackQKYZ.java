package DesignPattern.c13策略模式.IAttackBehaviorImpl;

import DesignPattern.c13策略模式.IAttackBehavior;

public class AttackQKYZ implements IAttackBehavior {

    @Override
    public void attack() {
        System.out.println("攻击技能：乾坤一掷");
    }

}

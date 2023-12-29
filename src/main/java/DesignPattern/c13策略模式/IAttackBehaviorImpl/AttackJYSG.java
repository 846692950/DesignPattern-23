package DesignPattern.c13策略模式.IAttackBehaviorImpl;

import DesignPattern.c13策略模式.IAttackBehavior;

public class AttackJYSG implements IAttackBehavior {

    @Override
    public void attack() {
        System.out.println("攻击技能：九阳神功");
    }

}

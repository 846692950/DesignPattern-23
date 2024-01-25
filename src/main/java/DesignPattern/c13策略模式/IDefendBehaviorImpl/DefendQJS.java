package DesignPattern.c13策略模式.IDefendBehaviorImpl;

import DesignPattern.c13策略模式.IDefendBehavior;

public class DefendQJS implements IDefendBehavior {

    @Override
    public void defend() {
        System.out.println("防御技能：千机伞");
    }

}

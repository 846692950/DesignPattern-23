package DesignPattern.c13策略模式.IRunBehaviorImpl;

import DesignPattern.c13策略模式.IRunBehavior;

public class RunJCTQ implements IRunBehavior {

    @Override
    public void run() {
        System.out.println("逃跑技能：金蝉脱壳");
    }

}

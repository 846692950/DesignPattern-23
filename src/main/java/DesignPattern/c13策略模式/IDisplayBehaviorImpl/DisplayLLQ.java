package DesignPattern.c13策略模式.IDisplayBehaviorImpl;

import DesignPattern.c13策略模式.IDisplayBehavior;

public class DisplayLLQ implements IDisplayBehavior {

    @Override
    public void display() {
        System.out.println("装备：琉璃裙");
    }

}

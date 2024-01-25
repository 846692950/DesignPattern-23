package DesignPattern.c13策略模式.IDisplayBehaviorImpl;

import DesignPattern.c13策略模式.IDisplayBehavior;

public class DisplayTKJ implements IDisplayBehavior {

    @Override
    public void display() {
        System.out.println("装备：天空甲");
    }

}

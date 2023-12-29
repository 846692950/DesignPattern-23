package DesignPattern.c18命令模式;

import DesignPattern.c18命令模式.CommandImpl.*;

/**
 * 命令模式（Command Pattern）是一种数据驱动的设计模式，它属于行为型模式。
 * 请求以命令的形式包裹在对象中，并传给调用对象。
 * 调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        /**
         * 三个家电
         */
        Light light = new Light();
        Door door = new Door();
        Computer computer = new Computer();
        /**
         * 一个控制器，假设是我们的app主界面
         */
        ControlPanel controlPanel = new ControlPanel();
        // 为每个按钮设置功能
        controlPanel.setCommand(0, new LightOnCommond(light));
        controlPanel.setCommand(1, new LightOffCommond(light));
        controlPanel.setCommand(2, new ComputerOnCommond(computer));
        controlPanel.setCommand(3, new ComputerOffCommond(computer));
        controlPanel.setCommand(4, new DoorOnCommond(door));
        controlPanel.setCommand(5, new DoorOffCommond(door));

        // 模拟点击
        controlPanel.keyPressed(0);
        controlPanel.keyPressed(2);
        controlPanel.keyPressed(4);
        controlPanel.keyPressed(1);
        controlPanel.keyPressed(3);
        controlPanel.keyPressed(5);
        controlPanel.keyPressed(8);// 这个没有指定，但是不会出任何问题，我们的NoCommand的功劳
    }
}

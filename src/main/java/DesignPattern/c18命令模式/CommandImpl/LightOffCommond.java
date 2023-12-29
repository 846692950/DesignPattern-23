package DesignPattern.c18命令模式.CommandImpl;

import DesignPattern.c18命令模式.Command;
import DesignPattern.c18命令模式.Light;

/**
 * 关闭电灯的命令
 */
public class LightOffCommond implements Command {

    private Light light;

    public LightOffCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

}
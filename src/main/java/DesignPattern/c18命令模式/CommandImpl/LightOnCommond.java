package DesignPattern.c18命令模式.CommandImpl;

import DesignPattern.c18命令模式.Command;
import DesignPattern.c18命令模式.Light;

/**
 * 打开电灯的命令
 */
public class LightOnCommond implements Command {

    private Light light;

    public LightOnCommond(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}

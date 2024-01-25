package DesignPattern.c18命令模式.CommandImpl;

import DesignPattern.c18命令模式.Command;
import DesignPattern.c18命令模式.Door;

/**
 * 打开门的命令
 */
public class DoorOnCommond implements Command {

    private Door door;

    public DoorOnCommond(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

}
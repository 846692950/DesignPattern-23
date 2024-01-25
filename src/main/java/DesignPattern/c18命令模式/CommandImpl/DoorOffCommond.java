package DesignPattern.c18命令模式.CommandImpl;

import DesignPattern.c18命令模式.Command;
import DesignPattern.c18命令模式.Door;

/**
 * 关闭门的命令
 */
public class DoorOffCommond implements Command {

    private Door door;

    public DoorOffCommond(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }

}
package DesignPattern.c18命令模式.CommandImpl;

import DesignPattern.c18命令模式.Command;
import DesignPattern.c18命令模式.Computer;

/**
 * 关电脑的命令
 */
public class ComputerOffCommond implements Command {

    private Computer computer;

    public ComputerOffCommond(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }


}

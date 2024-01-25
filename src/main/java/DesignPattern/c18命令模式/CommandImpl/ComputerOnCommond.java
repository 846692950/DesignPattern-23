package DesignPattern.c18命令模式.CommandImpl;

import DesignPattern.c18命令模式.Command;
import DesignPattern.c18命令模式.Computer;

/**
 * 开电脑的命令
 */
public class ComputerOnCommond implements Command {

    private Computer computer;

    public ComputerOnCommond(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }

}

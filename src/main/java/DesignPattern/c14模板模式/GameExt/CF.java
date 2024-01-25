package DesignPattern.c14模板模式.GameExt;

import DesignPattern.c14模板模式.Game;

public class CF extends Game {

    @Override
    public void initialize() {
        System.out.println("CF 已经启动！");
    }

    @Override
    public void startPlay() {
        System.out.println("开始玩 CF！");
    }

    @Override
    public void endPlay() {
        System.out.println("结束玩 CF！");
    }

    @Override
    public boolean isNeedPrintDate() {
        return true;
    }
}

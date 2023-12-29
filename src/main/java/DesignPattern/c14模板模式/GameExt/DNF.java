package DesignPattern.c14模板模式.GameExt;

import DesignPattern.c14模板模式.Game;

public class DNF extends Game {

    @Override
    public void initialize() {
        System.out.println("DNF 已经启动！");
    }

    @Override
    public void startPlay() {
        System.out.println("开始玩 DNF！");
    }

    @Override
    public void endPlay() {
        System.out.println("结束玩 DNF！");
    }

}
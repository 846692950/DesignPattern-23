package DesignPattern.c14模板模式;

import java.util.Date;

public abstract class Game {

    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    //模板
    public final void play() {
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
        //结束游戏时间
        exitGame();
    }

    public boolean isNeedPrintDate() {
        return false;
    }

    /**
     * 游戏结束
     */
    public void exitGame() {
        if (isNeedPrintDate()) {
            System.out.print(new Date().toLocaleString() + "-->");
        }
        System.out.println("游戏结束！");
    }
}
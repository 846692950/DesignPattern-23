package DesignPattern.c19备忘录模式;

/**
 * 备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。
 * 备忘录模式属于行为型模式。
 *
 * 下面编写一个简单的程序测试一下，编写逻辑大致为打boss前存档，打boss失败了，读档。
 */
public class MementoPatternDemo {

    public static void main(String[] args) {

        //打boss前
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.stateDisplay();

        //保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(gameRole.saveState());

        //打boss失败
        gameRole.fight();
        gameRole.stateDisplay();

        //恢复状态
        gameRole.recoveryState(caretaker.getMemento());
        gameRole.stateDisplay();
    }

}

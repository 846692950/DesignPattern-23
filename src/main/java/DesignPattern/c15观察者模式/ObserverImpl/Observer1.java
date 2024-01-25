package DesignPattern.c15观察者模式.ObserverImpl;

import DesignPattern.c15观察者模式.Observer;
import DesignPattern.c15观察者模式.Subject;

public class Observer1 implements Observer {

    private Subject subject;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        System.out.println("observer1 得到 3D 号码  -->" + msg + ", 我要记下来。");
    }

}

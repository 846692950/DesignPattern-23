package DesignPattern.c15观察者模式;

import DesignPattern.c15观察者模式.ObserverImpl.Observer1;
import DesignPattern.c15观察者模式.ObserverImpl.Observer2;
import DesignPattern.c15观察者模式.SubjectImpl.ObjectFor3D;

/**
 * 观察者模式是一种行为型设计模式，它定义了一种一对多的依赖关系。
 * 当一个对象的状态发生改变时，其所有依赖者都会收到通知并自动更新。
 * <p>
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。
 * 比如，当一个对象被修改时，则会自动通知依赖它的对象。
 * <p>
 * 观察者模式包含以下几个核心角色：
 * 主题（Subject）：也称为被观察者或可观察者，它是具有状态的对象，并维护着一个观察者列表。主题提供了添加、删除和通知观察者的方法。
 * 观察者（Observer）：观察者是接收主题通知的对象。观察者需要实现一个更新方法，当收到主题的通知时，调用该方法进行更新操作。
 * 具体主题（Concrete Subject）：具体主题是主题的具体实现类。它维护着观察者列表，并在状态发生改变时通知观察者。
 * 具体观察者（Concrete Observer）：具体观察者是观察者的具体实现类。它实现了更新方法，定义了在收到主题通知时需要执行的具体操作。
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        //模拟一个3D的服务号
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        //客户
        Observer observer1 = new Observer1(subjectFor3d);
        Observer observer2 = new Observer2(subjectFor3d);

        subjectFor3d.setMsg("123456");
        subjectFor3d.setMsg("654321");
    }
}

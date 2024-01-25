package DesignPattern.a3单例模式;

import DesignPattern.a3单例模式.双检锁式.SingletonDoubleCheckLock;
import DesignPattern.a3单例模式.懒汉式.SingletonLanHan;
import DesignPattern.a3单例模式.枚举式.SingletonEnum;
import DesignPattern.a3单例模式.静态内部类式.SingletonIn;
import DesignPattern.a3单例模式.饿汉式.SingletonEHan;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        //线程不安全的懒汉式单例模式
        SingletonLanHan instanceNoSafe = SingletonLanHan.getInstanceNoSafe();
        instanceNoSafe.showMessage();

        //线程安全的懒汉式单例模式
        SingletonLanHan instanceYesSafe = SingletonLanHan.getInstanceYesSafe();
        instanceYesSafe.showMessage();

        //线程安全饿汉式单例模式
        SingletonEHan instance = SingletonEHan.getInstance();
        instance.showMessage();

        //双检锁式单例模式
        SingletonDoubleCheckLock singleton = SingletonDoubleCheckLock.getSingleton();
        singleton.showMessage();

        //静态内部类式单例模式
        SingletonIn singletonIn = SingletonIn.getInstance();
        singletonIn.showMessage();

        //枚举式的单例模式
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        System.out.println("枚举单例模式！");
        singletonEnum.MONDAY();
        singletonEnum.TUESDAY();
        singletonEnum.WEDNESDAY();
        singletonEnum.THURSDAY();
        singletonEnum.FRIDAY();
        singletonEnum.SATURDAY();
        singletonEnum.SUNDAY();

    }
}

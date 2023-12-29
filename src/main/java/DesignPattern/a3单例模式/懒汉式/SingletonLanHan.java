package DesignPattern.a3单例模式.懒汉式;

import lombok.Data;

/**
 * 在懒汉式中，实例在第一次使用时才被创建，也就是说，它延迟加载实例对象。
 * 懒汉式的线程安全性通常需要额外的同步措施来保证，因为多个线程可能同时请求创建实例。
 */
@Data
public class SingletonLanHan {

    private SingletonLanHan() {}
    private static SingletonLanHan instance;

    private String message = "";
    public void showMessage() {
        System.out.println(message);
    }

    /**
     * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程
     */
    public static SingletonLanHan getInstanceNoSafe() {
        if (instance == null) {
            instance = new SingletonLanHan();
        }
        instance.setMessage("这是线程不安全的懒汉式单例模式！");
        return instance;
    }

    /**
     * 这种方式是最基本的实现方式，在以上的基础上加了 synchronized 支持多线程
     */
    public static synchronized SingletonLanHan getInstanceYesSafe() {
        if (instance == null) {
            instance = new SingletonLanHan();
        }
        instance.setMessage("这是线程安全的懒汉式单例模式！");
        return instance;
    }
}
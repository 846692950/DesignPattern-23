package DesignPattern.a3单例模式.饿汉式;

import lombok.Data;

/**
 * 在饿汉式中，实例在类加载时就被创建，即“饿”的时候就创建了实例对象。
 * 饿汉式由于在类加载时就完成了实例化，所以是天生线程安全的。
 */
@Data
public class SingletonEHan {

    private SingletonEHan() {}
    private static SingletonEHan instance = new SingletonEHan();

    private String message = "";
    public void showMessage() {
        System.out.println(message);
    }

    /**
     * 线程安全
     * 这种方式比较常用，但容易产生垃圾对象
     * 类加载时就初始化，浪费内存
     */
    public static SingletonEHan getInstance() {
        instance.setMessage("这是饿汉式的单例模式！");
        return instance;
    }
}

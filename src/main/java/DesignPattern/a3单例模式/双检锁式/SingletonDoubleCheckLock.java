package DesignPattern.a3单例模式.双检锁式;

import lombok.Data;

/**
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * 使用 synchronized (Singleton.class) 确保在同一时间只有一个线程可以执行下面的代码块。
 * 这是为了防止多个线程同时创建多个实例，从而确保只有一个实例被创建。
 * 在同步代码块内，再次检查 singleton 是否为 null。
 * 如果是，说明还没有创建实例，那么就创建一个新的实例。
 * 这样，只有第一个检查到 singleton 为 null 的线程可以创建实例，其他线程则因为 singleton 不再为 null 而直接返回该实例。
 */
@Data
public class SingletonDoubleCheckLock {

    private SingletonDoubleCheckLock (){}
    private volatile static SingletonDoubleCheckLock singleton;

    private String message = "";
    public void showMessage() {
        System.out.println(message);
    }

    public static SingletonDoubleCheckLock getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleCheckLock.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheckLock();
                }
            }
        }
        singleton.setMessage("这是双检锁式的单例模式！");
        return singleton;
    }
}

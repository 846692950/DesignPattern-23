package DesignPattern.a3单例模式.静态内部类式;

import lombok.Data;

/**
 * 这种方式跟饿汉式方式采用的机制类似，但又有不同。
 * 两者都是采用了类装载的机制来保证初始化实例时只有一个线程。
 * 不同的地方:
 * 在饿汉式方式是只要Singleton类被装载就会实例化,
 * 内部类是在需要实例化时，调用getInstance方法，才会装载SingletonHolder类
 * 优点：避免了线程不安全，延迟加载，效率高。
 */
@Data
public class SingletonIn {

    private SingletonIn() {}

    private String message = "";
    public void showMessage() {
        System.out.println(message);
    }

    private static class SingletonHolder {
        private static final SingletonIn INSTANCE = new SingletonIn();
    }

    public static final SingletonIn getInstance() {
        SingletonIn instance = SingletonHolder.INSTANCE;
        instance.setMessage("这是静态内部类式的单例模式！");
        return instance;
    }
}

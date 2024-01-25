package DesignPattern.a3单例模式.枚举式;

public enum SingletonEnum {

    INSTANCE;

    public void MONDAY() {
        System.out.println("今天周一");
    }

    public void TUESDAY() {
        System.out.println("今天周二");
    }

    public void WEDNESDAY() {
        System.out.println("今天周三");
    }

    public void THURSDAY() {
        System.out.println("今天周四");
    }

    public void FRIDAY() {
        System.out.println("今天周五");
    }

    public void SATURDAY() {
        System.out.println("今天周六");
    }

    public void SUNDAY() {
        System.out.println("今天周日");
    }
}
package DesignPattern.c16迭代器模式;

import DesignPattern.c16迭代器模式.ContainerImpl.NameRepository;

/**
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。
 * 这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
 *
 * 迭代器模式属于行为型模式。
 * 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
 *
 * 使用 NameRepository 来获取迭代器，并打印名字。
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {

        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("姓名 : " + name);
        }
    }
}

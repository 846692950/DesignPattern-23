package DesignPattern.c16迭代器模式.ContainerImpl;

import DesignPattern.c16迭代器模式.Container;
import DesignPattern.c16迭代器模式.Iterator;

/**
 * 创建实现了 Container 接口的实体类。
 * 该类有实现了 Iterator 接口的内部类 NameIterator。
 */
public class NameRepository implements Container {

    public String[] names = {"唐梦", "南絮", "清漪", "雪言"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
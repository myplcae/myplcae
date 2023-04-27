package src.com.Designpattern.behavior.iterator;

public abstract class Container {
    //添加元素
    public abstract void add(Object obj);
    //移除元素
    public abstract void  remove(Object obj);

    //接入迭代器
    public abstract Iterator getiterator();
}

package src.com.Designpattern.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContainer extends Container{

    private List<Object> list = new ArrayList<>();
    //添加元素
    @Override
    public void add(Object obj) {
        list.add(obj);
    }
    //移除元素
    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getiterator() {
        return new ConcreteIterator(this.list);
    }
}

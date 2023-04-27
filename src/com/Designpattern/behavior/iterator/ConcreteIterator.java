package src.com.Designpattern.behavior.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ConcreteIterator implements Iterator{
    //记录当前访问的第几个元素
    private int cursor;

    public static <E> ArrayList<E> newArrayList(Set set) {
        return new ArrayList<>();
    }

    private List<Object> list = new ArrayList<>();

    public ConcreteIterator (List list){
        this.cursor = 0;
        this.list = list;
    }

    public ConcreteIterator (Set set){
        this.cursor = 0;
        List<Integer> list = new ArrayList<Integer>();
        this.list =newArrayList(set);
    }

    @Override
    public Boolean hasNext() {
        if (cursor >= list.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()){
            obj = this.list.get(cursor);
            cursor +=1;
        }
        return obj;
    }
}

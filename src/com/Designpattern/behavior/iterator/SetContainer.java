package src.com.Designpattern.behavior.iterator;

import java.util.HashSet;
import java.util.Set;

public class SetContainer extends Container{

    private Set<Object> set = new HashSet<>();
    @Override
    public void add(Object obj) {
        set.add(obj);
    }

    @Override
    public void remove(Object obj) {
        set.remove(obj);
    }

    @Override
    public Iterator getiterator() {
        return new ConcreteIterator(this.set);
    }
}

package src.com.Designpattern.behavior.memorandum;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//备忘录记事本：管理备忘录
public class NoteBook {

    private Map<String,Memento> mementoMap = new ConcurrentHashMap<>();

    public void addMemento(Memento memento){
        mementoMap.put(memento.getFlag(), memento);
    }
    public Memento getMemento(String flag){
       return mementoMap.get(flag);
    }
}

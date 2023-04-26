package src.com.Designpattern.structure.combination;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private String name;

    private int person;

    public Composite(String name) {
        this.name = name;
    }

    private List<Component> child = new ArrayList<>();

    public void add(Component component){
        child.add(component);
    }

    public void remove(Component component){
        child.remove(component);
    }

    @Override
    public int cal() {
        if (null != child && child.size() > 0){
            for (Component component:child){
                person += component.cal();
            }
        }
        System.out.println(name + "总人口为："+person + "万");
        return person;
    }
}

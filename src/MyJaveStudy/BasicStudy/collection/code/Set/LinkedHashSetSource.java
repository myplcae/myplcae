package src.MyJaveStudy.BasicStudy.collection.code.Set;

import java.util.LinkedHashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(444);
        set.add(445);
        set.add(new Customer("张开国",1000));
        set.add(121);
        set.add("陈明明");

        System.out.println(" = " + set);
    }
}
class Customer{
    private String name;
    private int sal;

    public Customer(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}

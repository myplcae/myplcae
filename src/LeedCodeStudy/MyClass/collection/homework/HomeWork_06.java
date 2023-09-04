package src.LeedCodeStudy.MyClass.collection.homework;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HomeWork_06 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        People p1  = new People(1001,"AA");
        People p2  = new People(1002,"BB");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.setName("CC");
        hashSet.remove(p1);
        System.out.println(hashSet);
        hashSet.add(new People(1001,"CC"));
        System.out.println(hashSet);
        hashSet.add(new People(1001,"AA"));
        System.out.println(hashSet);
    }
}
class People{
    private int num;
    private String name;

    public People(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return num == people.num && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name);
    }

    @Override
    public String toString() {
        return "People{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
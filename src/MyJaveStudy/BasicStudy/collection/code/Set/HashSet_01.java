package src.MyJaveStudy.BasicStudy.collection.code.Set;

import java.util.HashSet;

public class HashSet_01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet set = new HashSet();
        //返回的是Boolean值
        System.out.println(set.add("小范"));
        System.out.println(set.add("西西姐"));
        System.out.println(set.add("西西姐"));
        System.out.println(set.add("小欢"));
        System.out.println(set.add("犟拐拐"));
        System.out.println(set.add("罗鹏云"));
        //删除
        set.remove("小范");
        System.out.println("set= " +set);

        set = new HashSet();
        //这里会输出空的set
        System.out.println(set);
        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println("set = " + set);

        //深入理解学习
        set.add(new String("jack"));
        set.add(new String("jack"));//加不了，底层String流与上一个相同
        System.out.println("set = " + set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}

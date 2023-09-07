package src.MyJaveStudy.BasicStudy.collection.code.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("all")
public class SetMethod {
    public static void main(String[] args) {
        Set set = new HashSet();
        //新增,从结果可见元素具有唯一性，并且可以为空，但是无序
        set.add("张开国");
        set.add("张开国");
        set.add("陈明明");
        set.add("小范");
        set.add("西西姐");
        set.add("1");
        set.add("a");
        set.add(null);
        set.add(null);
        System.out.println("Set集合结果为：" + set);
        //多模拟几次
        for (int i = 0; i < 10; i++) {
            System.out.println("Set集合结果为：" + set);
        }
        Iterator iterator = set.iterator();
        //迭代器输出
        System.out.println("===========迭代器输出============");
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("集合的元素包含：" + obj);
        }
        //增强for
        System.out.println("===========增强for============");
        for (Object o : set) {
            System.out.println("集合的元素包含：" + o);
        }
        //set不能通过普通for循环输出每个元素，因为是无序的没有get方法

        //删除
        set.remove("1");
        System.out.println(set);
    }
}

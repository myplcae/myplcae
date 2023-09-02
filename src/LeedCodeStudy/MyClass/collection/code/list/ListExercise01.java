package src.LeedCodeStudy.MyClass.collection.code.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张开国");
        list.add("陈明明");
        list.add("范旭");
        list.add("吴志友");
        list.add("小欢");
        list.add("李玲");
        list.add("谢老三");
        list.add("傅强强");
        list.add("西西姐");
        list.add("李波");
        list.add("罗鹏云");
        list.add(2,"韩顺平");
        System.out.println("list = " + list);
        System.out.println(list.get(5));
        list.remove(6);
        System.out.println("list = " + list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("集合里的元素有：" + obj);

        }
    }
}

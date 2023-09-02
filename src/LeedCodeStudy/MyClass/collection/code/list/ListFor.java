package src.LeedCodeStudy.MyClass.collection.code.list;

import java.util.*;

public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //list接口的实现子类 Verctor Linkedlist
        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList();
        list.add("jack");
        list.add("tomu");
        list.add("张开国");
        list.add("陈明明");

        //1.迭代器
        System.out.println("---------迭代器输出-------");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println("obj = " +obj);
        }
        System.out.println("————————增强for输出————————");
        //2、增强for
        for (Object o : list) {
            System.out.println("0 = " + o);
        }
        //3.普通for输出
        System.out.println("~~~~~~~~~~普通for循环输出~~~~~~~~~");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list = "+ list.get(i) );
        }
    }
}

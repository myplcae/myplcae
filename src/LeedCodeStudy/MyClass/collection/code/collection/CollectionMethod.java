package src.LeedCodeStudy.MyClass.collection.code.collection;

import java.util.ArrayList;
import java.util.List;
//collection常用方法
public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加
        list.add("java");
        list.add(120);//相当于是list.add(new Integer(120))
        list.add(true);
        System.out.println("list = " + list);
        //删除元素
        //list.remove(0);//删除第一个元素
        list.remove(true);//指定删除一个对象
        System.out.println("list = " + list);
        //查找元素是否存在  contains，存在则返回true，反之为false
        System.out.println(list.contains("java"));
        //size：返回元素的个数
        System.out.println(list.size());
        //isempty:判断集合是不是空的,不空为false,反之为true
        System.out.println(list.isEmpty());
        //clear：清空
        //list.clear();
        //System.out.println(list);
        //addall:添加多个对象,可以理解为直接添加一个新的集合进去
        ArrayList list1 = new ArrayList<>();
        list1.add("重庆市开县");
        list1.add("重庆市万州");
        list.addAll(list1);
        System.out.println(list);
        //contaisall:查找多个元素是否都存在
        System.out.println(list.containsAll(list1));
        //remaveall:删除多个元素
        list.add("重庆市云阳");
        list.removeAll(list1);
        System.out.println("list = " + list);
    }
}

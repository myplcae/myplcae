package src.LeedCodeStudy.MyClass.collection.code.list;

import java.util.ArrayList;
import java.util.List;

/**
 * list相关API
 * */
public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        //插入 void add（int index， object els）;在某个位置插入元素
        list.add("张开国");
        list.add("陈明明");
        //在索引位置为1的地方插入元素
        list.add(1,"大胖子");
        System.out.println("list = "+ list);
        //boolean addll（int index,Collection eles）:从index位置开始将eles中的所有元素添加进来
        List list1 = new ArrayList();
        list1.add("zhangkaiguo");
        list1.add("chenmingming");
        list.addAll(1,list1);
        System.out.println("list = "+ list);
        //Object get ，获取指定位置的元素
        System.out.println(list.get(2));
        //int indexOf(int index);返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("大胖子"));
        //last indexOf(Object obj) 返回obj在集合中末次出现的位置
        list.add("张开国");
        list.add("张开国");
        System.out.println(list.lastIndexOf("张开国"));
        //Object remove;移除指定位置的元素
        System.out.println("list = " + list);
        list.remove(1);
        System.out.println("list = " + list);
        //object set(int index,Object else);设置指定位置的元素，可以说是替换，如果没有那个下标会抛异常:IndexOutOfBoundsException
        //list.set(10,"小欢");
        list.set(2,"陈明明");
        System.out.println("list = " + list);
        //list subList(int formIndex,int toIndex):返回从fromIndex带toIndex位置的子集合
        //fromIndex <=subList <toIndex,左闭右开
        List relist = list.subList(0,2);
        System.out.println("relist = " + relist);
    }
}

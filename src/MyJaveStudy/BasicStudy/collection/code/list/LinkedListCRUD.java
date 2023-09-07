package src.MyJaveStudy.BasicStudy.collection.code.list;

import java.util.Iterator;
import java.util.LinkedList;
@SuppressWarnings("all")
public class LinkedListCRUD {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //新增
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("linkedList = " + linkedList);

        //删除
        linkedList.remove(1);
        //如果不给参数则会删除第一个
        //linkedList.remove();
        System.out.println("linkedList = " + linkedList);

        //修改
        linkedList.set(1,"kk");
        System.out.println("linkedList = " + linkedList);

        //得到某个对象
//        Object o = linkedList.get(1);
//        System.out.println(o);
        System.out.println(linkedList.get(3));
        System.out.println("~~~~~~增强for输出~~~~~~~~~");
        //增强for遍历
        for (Object linkedlist :linkedList) {
            System.out.println("最后的链表节点有：" + linkedlist);
        }
        System.out.println("========迭代器输出===========");
        //迭代器输出
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println("最后的链表节点有：" + obj);
        }
        System.out.println("========普通for输出===========");
        //普通for输出
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("最后的链表节点有：" + linkedList.get(i));
        }
    }
}

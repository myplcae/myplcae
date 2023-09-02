package src.LeedCodeStudy.MyClass.collection.code.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@SuppressWarnings("all")
public class ListExercise02 {
    public static void main(String[] args) {
        //第一种ArrayLis
        List list = new ArrayList();
        //第一种LinkedList
        //List list = new LinkedList();
        //第一种Vector
        //List list = new Vector();
        list.add(new Book("斗破苍穹",8.5,"天蚕土豆"));
        list.add(new Book("凡人修仙传",12.5,"忘语"));
        list.add(new Book("绝世唐门",6.6,"唐家三少"));
        list.add(new Book("求魔",8.5,"耳根"));
        list.add(new Book("择天记",9.8,"猫腻"));
        list.add(new Book("星战风暴",7.5,"骷髅精灵"));
        //增强for输出
        System.out.println("~~~~~~~~~增强for输出排序前~~~~~~~~~~~~~~");
        for (Object o : list) {
            System.out.println("o=" + o);
        }
        //冒泡排序
        sort(list);

        System.out.println("~~~~~~~~~~~~~~排序后的结果为~~~~~~~~~~~~~~");
        for (Object o : list) {
            System.out.println("o=" + o);
        }
    }
    //写一个对价格排序的方法
    private static void sort(List list){
        int listsize = list.size();
        for (int i = 0; i < listsize; i++) {
            for (int j = 0; j < listsize-1 -i; j++) {
                //取出价格对象
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    //交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}



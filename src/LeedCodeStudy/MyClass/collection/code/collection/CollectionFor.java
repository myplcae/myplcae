package src.LeedCodeStudy.MyClass.collection.code.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new book("三国演义","罗贯中",10.1));
        col.add(new book("红楼梦","曹雪芹",10.8));
        col.add(new book("水浒传","施耐庵",9.5));

        //使用增强for:增强for的底层是迭代器，简化版迭代器，快捷键：I+回车
        for (Object book:col){
            System.out.println("book= "+ book);
        }
        //数组中也可以用,例
//        int[] num = {1,2,5,11};
//        for(int i : num){
//            System.out.print(i+" ");
//        }
    }
}

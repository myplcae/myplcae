package src.MyJaveStudy.BasicStudy.collection.code.list;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //1、List集合类中元素有序（即添加顺序和输出顺序一致，可重复）

        List list = new ArrayList();
        list.add("旺财");
        list.add("云朵");
        list.add("小青");
        list.add("张开国");
        list.add("云朵");
        System.out.println("list = " + list);
        //2、list中的每个元素都有其顺序对应的索引，索引从0开始
        System.out.println(list.get(3));
    }
}

package src.MyJaveStudy.BasicStudy.collection.code.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /**
         * public HashSet() {
         *         map = new HashMap<>();
         *     }
         * 从源码可以看出本质上HashSet是一个HashMap转化来的
         * HashSet可以存放null对象但是只能存一个，因为它是唯一元素的集合
         * */
        Set hashSet = new HashSet();
        //添加元素
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet = " + hashSet);
    }
}

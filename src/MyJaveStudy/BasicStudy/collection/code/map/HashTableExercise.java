package src.MyJaveStudy.BasicStudy.collection.code.map;

import java.util.Hashtable;

@SuppressWarnings({"all"})
public class HashTableExercise {
    //Hashtable的键和值都不允许为空
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("陈明明",100);
        //table.put(null,100);//异常NullPointerException
        //table.put("陈明明",null);//异常NullPointerException
        table.put("张开国",100);
        table.put("小范",100);
        table.put("小范",88);
        System.out.println(table);
        //HashTable底层是一个数组HashTable$Entry[],初始化大小为11
        //临界值为11*0.75，扩容因子都是0.75
        //看源码
    }
}

package src.LeedCodeStudy.MyClass.collection.code.map;

import src.LeedCodeStudy.MyClass.collection.code.list.Book;

import java.util.*;

@SuppressWarnings({"all"})
public class MapFor {

    public static void main(String[] args) {
        Map map= new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超","马超");
        map.put("赵云","马超");
        map.put("莽莽","明明");
        map.put("小范",null);
        map.put(null,"西西姐");
        map.put("老妈","老爸");

        //先取出所有的key，再通过key取出所有的value
        Set keyset = map.keySet();
        //1、增强for
        System.out.println("~~~~~~增强for输出~~~~~~~");
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        //2、迭代器输出
        System.out.println("~~~~~~迭代器输出~~~~~~~");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + map.get(key));
        }
        //第二组：取出所有的value
        Collection values = map.values();
        //1、entrySet输出
        System.out.println("-----entrySet增强for输出-----");
        Set entrySet = map.entrySet();
        for (Object entry :entrySet) {
            //转map输出
            Map.Entry m = (Map.Entry)entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        //2、增强for
        System.out.println("-----增强for输出-----");
        for (Object value : values) {
            System.out.println("value包括：" + value);
        }
        //3、迭代器entry输出
        System.out.println("-----迭代器entry输出-----");
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object entry1 = iterator1.next();
            Map.Entry  m  = (Map.Entry)entry1;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //4,纯迭代器输出
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()){
            Object value = iterator2.next();
            System.out.println("value包括：" + value);
        }
    }
}

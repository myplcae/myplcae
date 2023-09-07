package src.MyJaveStudy.BasicStudy.collection.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class HomeWork_03 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        System.out.println(hashMap);
        //更改jack的工资
        hashMap.put("jack",2600);
        System.out.println(hashMap);
        //所有员工工资加1000
        Set keySey = hashMap.keySet();
        for (Object o :keySey) {
            hashMap.put(o, (Integer)hashMap.get(o) + 100);
        }
        System.out.println(hashMap);
        Set entrySet = hashMap.entrySet();
        //迭代器遍历
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry result =  (Map.Entry)iterator.next();
            //遍历所有员工
            System.out.println(result.getKey());
            //遍历所有工资
            System.out.println(result.getValue());
        }
    }
}
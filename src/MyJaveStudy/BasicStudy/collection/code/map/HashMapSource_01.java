package src.MyJaveStudy.BasicStudy.collection.code.map;

import java.util.HashMap;

@SuppressWarnings({"all"})
public class HashMapSource_01 {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("java",10);
        map.put("php",10);
        map.put("java",20);//替换掉第一个java

        System.out.println("map = " + map);
    }
}

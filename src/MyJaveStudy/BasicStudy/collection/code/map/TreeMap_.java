package src.MyJaveStudy.BasicStudy.collection.code.map;

import java.util.Comparator;
import java.util.TreeMap;

@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {
        //使用默认的构造器创建//无序的
        //TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap<>(new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                //按照传入的key的大小进行排序
                //return ((String)o1).compareTo((String) o2);
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("zhangkaiguo","张开国");
        treeMap.put("基友aaaa","jiyou");
        treeMap.put("smith","丝密斯");
        System.out.println("treemap = " + treeMap);
    }

}

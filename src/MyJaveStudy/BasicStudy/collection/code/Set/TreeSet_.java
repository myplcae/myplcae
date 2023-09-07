package src.MyJaveStudy.BasicStudy.collection.code.Set;

import java.util.Comparator;
import java.util.TreeSet;
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();

        TreeSet treeSet = new TreeSet<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //调用字符串的compareTo方法
                //return ((String)o1).compareTo((String)o2);//从a-z
                return ((String)o2).compareTo((String)o1);//从z-a
                //return ((String)o2).length() - ((String)o1).length();//长度排序

            }
        });

        //1、添加数据,由于return的是长度不一样的数据，所以这里添加进set集合的时候只会添加进去长度不一致的数据
        treeSet.add("a小范");
        treeSet.add("b张开国");
        treeSet.add("c陈明明d");
        treeSet.add("d小欢");
        treeSet.add("e西西姐");

        System.out.println(treeSet);
    }
}

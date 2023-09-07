package src.MyJaveStudy.BasicStudy.collection.code.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapSource_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","张开国");
        map.put("no2","陈明明");

        Set set = map.entrySet();
        System.out.println(set.getClass());//HashMap$Node
        for (Object obj : set) {

            //System.out.println(entry.getClass());
            //为了从HashMap$Node中取出k-v,先做一个向下转型
            Map.Entry entry= (Map.Entry)obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

    }
}

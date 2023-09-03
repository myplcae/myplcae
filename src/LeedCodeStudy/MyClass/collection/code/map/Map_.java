package src.LeedCodeStudy.MyClass.collection.code.map;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})
public class Map_ {

    public static void main(String[] args) {
        //map接口实现类的特点
            //1、Map作为双链的集合具有映射关系Key-value;K不能为空，value可以为空
        Map map = new HashMap();
        map.put("no1","张开国");
        map.put("no2","陈明明");
        map.put("no1","小范");
        map.put("no3","小范");
        map.put(null,null);
        map.put(null,"abc");
        map.put(1,"abcd");

        System.out.println("map = " + map);
        System.out.println(map.get(1));
    }
}

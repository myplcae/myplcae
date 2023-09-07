package src.MyJaveStudy.BasicStudy.collection.code.map;

import src.MyJaveStudy.BasicStudy.collection.code.list.Book;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
        Map map= new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超","马超");
        map.put("赵云","马超");
        map.put("莽莽","明明");
        map.put("小范",null);
        map.put(null,"西西姐");
        map.put("老妈","老爸");

        System.out.println("map = " + map);
        //remove
        map.remove(null);
        System.out.println("map = " + map);
        //get，获取键值对
        Object val = map.get("老妈");
        System.out.println("val = " + val);
        //size ,获取元素个数
        System.out.println(map.size());
        //isEmpty,判断是否为空
        System.out.println(map.isEmpty());
        //clear, 清除
        //map.clear();
        System.out.println("map = " + map);
        //containKey, 查找键是否存在，键为null时会出现错误结果
        /**
         * 上个bug的源码解释：
         *      default boolean remove(Object key, Object value) {
         *         Object curValue = get(key);
         *         if (!Objects.equals(curValue, value) ||
         *             (curValue == null && !containsKey(key))) {
         *             return false;
         *         }
         *         remove(key);
         *         return true;
         *     }
         *     是直接如果value为空了就直接返回false
         * */
        System.out.println(map.containsKey("小范"));
        System.out.println(map.containsKey(null));
    }
}

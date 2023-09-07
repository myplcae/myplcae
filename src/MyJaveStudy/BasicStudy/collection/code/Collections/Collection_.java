package src.MyJaveStudy.BasicStudy.collection.code.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//重量级集合
@SuppressWarnings({"all"})
public class Collection_ {
    public static void main(String[] args) {
        //创建测试用例
        List list = new ArrayList();
        list.add("张开国");
        list.add("张开国");
        list.add("张开国");
        list.add("陈明明明明");
        list.add("刘欢刘欢");
        list.add("黑哥");
        System.out.println("list = " + list);
//        for (Object o :list) {
//            System.out.println("list 的元素包括： " + list);
//        }
        //反转list中的元素,reserver
        Collections.reverse(list);
        System.out.println("list = " + list);
        //shuffle,对集合中的元素随机排序
        System.out.println("~~~~下面是测试shuffle~~~~~");
        for (int i = 0; i < 50; i++) {
            Collections.shuffle(list);
            System.out.println("list = " + list);
        }
        //sort 按照元素自然排序
        System.out.println("~~~~下面是测试sort~~~~~");
        Collections.sort(list);
        System.out.println("------排序后----");
        System.out.println("list = " + list);
        //按照字符串长度排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //可以加入校验代码
                return ((String)o1).length()-((String)o2).length();//找最长的
                //return ((String)o1).length()-((String)o2).length();
            }
        });
        System.out.println("排序后的集合为：" + list);
        //swap 集合中指定元素进行交换
        //超过范围的话会出异常：IndexOutOfBoundsException（下标越界）
        Collections.swap(list,0,3);
        System.out.println("********交换后的集合为list= " + list);
        //Object max(Collections) 根据元素的自然顺序，返回给定集合中的最大元素；
        System.out.println("自认顺序的最大元素为：" + Collections.max(list));
        //Object max(Collections ,Compare):根据Comparator指定的顺序，返回给定集合中的最大元素
        Object max = Collections.max(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();//找最长的
                //return ((String) o2).length() - ((String) o1).length();//找最短的
            }
        });
        System.out.println("长度最大的元素为：" + max);
        //Object max(Collections) 根据元素的自然顺序，返回给定集合中的最大元素；
        System.out.println("自认顺序的最小元素为：" + Collections.min(list));
        //Object min(Collections ,Compare):根据Comparator指定的顺序，返回给定集合中的最小元素
        Object min = Collections.min(list, new Comparator<Object>() {

            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("长度最小的元素为：" + min);
        //frequency,计算集合中某一个元素出现的次数
        System.out.println("张开国出现的次数为：" +Collections.frequency(list,"张开国"));
        //void copy (List dest,List src) 将src中的内容复制到dest中
        /**
         *  int srcSize = src.size();
         *         if (srcSize > dest.size())
         *             throw new IndexOutOfBoundsException("Source does not fit in dest");
         * */
        ArrayList dest = new ArrayList();
        //此时很可能会出现异常：IndexOutOfBoundsException（数组下标越界）,因此需要给被填充的那个集合先赋值到大小不小于被复制的那个集合
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        Collections.copy(dest,list);
        System.out.println("集合dest的参数为：" + dest);
        //Boolean replaceAll,:使用新的值替换原有值
        //把开国换成莽莽
        Collections.replaceAll(list,"张开国","张莽莽");
        System.out.println("~~~~~~~~~~~~替换后的集合为：" + list);
    }
}

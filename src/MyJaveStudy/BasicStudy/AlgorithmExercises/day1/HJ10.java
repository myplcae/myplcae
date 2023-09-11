package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在 ASCII 码范围内( 0~127 ，包括 0 和 127 )，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 例如，对于字符串 abaca 而言，有 a、b、c 三种不同的字符，因此输出 3 。
 * 输入：输入一行没有空格的字符串。
 * 输出：输出 输入字符串 中范围在(0~127，包括0和127)字符的种数。
 * 思路：HashSet去重
 * */
public class HJ10 {
    //bitset方法过滤
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String x = in.nextLine();
//        //通过BitSet函数去存字符串然后运算输出种数
//        BitSet bitSet = new BitSet(128);
//        //遍历剔除重复相同字符
//        for (char c : x.toCharArray()){
//            if (!bitSet.get(c)){
//                bitSet.set(c);
//            }
//        }
//        System.out.println(bitSet.cardinality());
//    }
    //HashSet去重
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            //创建hashSet集合存入输入的参数
            HashSet<Character> set = new HashSet<>();
            //遍历添加进set集合
            for (int i = 0; i < a.length(); i++) {
                set.add(a.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}

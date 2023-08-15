package src.LeedCodeStudy.MyClass.day7;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 将两个整型数组按照升序合并，并且过滤掉重复数组元素。
 * 输出时相邻两数之间没有空格。
 * 输入：1 输入第一个数组的个数
 *      2 输入第一个数组的数值
 *      3 输入第二个数组的个数
 *      4 输入第二个数组的数值
 * 输出：输出合并之后的数组
 * */
public class HJ80 {

    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            //定义TreeSet
            Set<Long> set = new TreeSet<>();
            //定义第一个数组的个数
            int a  = in.nextInt();
            //遍历添加进set集合
            for (int i = 0; i < a; i++) {
                set.add(in.nextLong());
            }
            //定义第二个数组的个数并添加进set
            int b = in.nextInt();
            for (int i = 0; i < b; i++) {
                set.add(in.nextLong());
            }
            //遍历输出
            for (long n:set){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}

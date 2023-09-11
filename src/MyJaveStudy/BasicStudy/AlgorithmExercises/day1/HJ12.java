package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.Scanner;

/**
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。
 * 输入：输入一行，为一个只包含小写字母的字符串。
 * 输出：输出该字符串反转后的字符串。
 * 思路：reverse函数
 * */
public class HJ12 {
    //方式一：使用StringBuffer类自带的reverse方法
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String x = in.nextLine();
//        StringBuffer str1 = new StringBuffer(x);
//        System.out.println(str1.reverse());
//    }
    //方式二：字符串倒序遍历输出
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            for (int i = a.length()-1; i >=0 ; i--) {
                System.out.print(a.charAt(i));
            }
        }
    }
}

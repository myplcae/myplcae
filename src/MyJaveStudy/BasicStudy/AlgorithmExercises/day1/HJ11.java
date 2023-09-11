package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.Scanner;

/**
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * 输入：输入一个int整数
 * 输出：将这个整数以字符串的形式逆序输出
 * 思路：通过string的reverse方法去逆序
 * */
public class HJ11 {
    //快捷方式直接调用StringBuffer类里的reverse方法
//    public static void main(String[] args) {
//        Scanner in= new Scanner(System.in);
//        String str = in.nextLine();
//        StringBuffer str1 =new StringBuffer(str);
//        System.out.println(str1.reverse());
//    }
    //正常方法，直接将字符串转为倒叙
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            for (int i = a.length()-1; i >=0 ; i--) {
                System.out.print(a.charAt(i));
            }
        }
    }
}

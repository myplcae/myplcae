package src.LeedCodeStudy.MyClass.day4;

import java.util.Scanner;

/**
 * 描述：输入一个正整数，计算它在二进制下的1的个数。
 * 输入：输入一个整数
 * 输出：计算整数二进制中1的个数
 * */
public class HJ62 {
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String j = Integer.toBinaryString(x);//这个方法用来将输入的数转换为二进制
        String xx = j.replaceAll("1","");//将1删除然后两个字符串相减
        System.out.println(j.length()-xx.length());
    }
}

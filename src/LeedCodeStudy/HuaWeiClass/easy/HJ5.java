package src.LeedCodeStudy.HuaWeiClass.easy;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * 输入：输入一个十六进制的数值字符串
 * 输出：输出该数值的十进制字符串。不同组的测试用例用\n隔开
 * 思路：用java的Integer.parseInt方法直接转换
 * */
public class HJ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(Integer.parseInt(s.substring(2),16));
    }
}

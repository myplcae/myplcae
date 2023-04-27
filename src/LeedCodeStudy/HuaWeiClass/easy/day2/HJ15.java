package src.LeedCodeStudy.HuaWeiClass.easy.day2;

import java.util.Scanner;

/**
 * 输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数。
 * 输入：输入一个整数（int类型）
 * 输出：这个数转换成2进制后，输出1的个数
 * 思路：先用Integer.toBinaryString方法转成二进制，再通过替换1为空，再通过长度相减得到1的个数
 * */
public class HJ15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String str = Integer.toBinaryString(x);
        String str1 = str.replaceAll("1", "");
        System.out.println(str.length()-str1.length());
    }
}

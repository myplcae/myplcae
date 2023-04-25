package src.LeedCodeStudy.HuaWeiClass.easy;

import java.util.Scanner;

/**
 * 描述：写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
 * 输入：第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符（保证该字符不为空格）。
 * 输出：输出输入字符串中含有该字符的个数。（不区分大小写字母）
 * 解题思路：通过替换元素为空再将两个字符串长度相减
 * */

public class HJ2 {
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        //这个是输入的字符串
        String str = in.nextLine();
        //这个是第二个准备替换的字符串
        String str1 = in.nextLine();
        //替换字符串
        String split = str.toUpperCase().replaceAll(str1.toUpperCase(),"");
        //两个字符串相减再输出结果
        System.out.println(str.length()-split.length());
    }
}

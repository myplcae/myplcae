package src.LeedCodeStudy.HuaWeiClass.day2;

import java.util.Scanner;

/**
 * 输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
 * 输入：输入一行字符串，可以有空格
 * 输出：统计其中英文字符，空格字符，数字字符，其他字符的个数
 * 思路：不同类型替换为空后和远字符串长度相减
 * */
public class HJ40 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
        String str1 = str.replaceAll("[A-Z]+|[a-z]+","");
        System.out.println("字母字符有："+(str.length()-str1.length())+"个");
        String str2 = str1.replaceAll(" ","");
        System.out.println("空格字符有："+(str1.length()-str2.length())+"个");
        String str3 = str2.replaceAll("[0-9]+","");
        System.out.println("数字字符有"+(str2.length()-str3.length())+"个"+"\n"+"还剩"+str3.length()+"个字符");
    }
}


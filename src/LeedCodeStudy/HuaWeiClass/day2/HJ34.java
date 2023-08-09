package src.LeedCodeStudy.HuaWeiClass.day2;

import java.util.Scanner;

/**
 * Lily上课时使用字母数字图片教小朋友们学习英语单词，每次都需要把这些图片按照大小
 * ASCII码值从小到大）排列收好。请大家给Lily帮忙，通过代码解决。
 * Lily使用的图片使用字符"A"到"Z"、"a"到"z"、"0"到"9"表示。
 * 输入：一行，一个字符串，字符串中的每个字符表示一张Lily使用的图片。
 * 输出：Lily的所有图片按照从小到大的顺序输出
 * */
public class HJ34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[128];
        String s = in.next();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i);
            x[k]++;
        }
        //从0开始输出
        for(int j = 48;j<x.length;j++){
            if(x[j] != 0)
                for(int b = 0;b<x[j];b++)
                    System.out.print((char)j);
        }
        System.out.println();
    }
}

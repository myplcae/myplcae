package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.Scanner;

/**
 * 输入两个字符串t和p，在t中找出和p相同的连续子串，输出这个子串的第一个字符在t中的下标
 * */
public class Test6 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println(getSubstring(in.nextLine(),in.nextLine()));
    }

    private static String getSubstring(String str1, String str2) {
        if (str1.length() < str2.length()){
            return "NO";
        }
        int index = str1.indexOf(str2);
        if (index == -1)
            return "NO";
        else
            return String.valueOf(index + 1);
    }
}

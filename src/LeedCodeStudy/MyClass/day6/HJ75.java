package src.LeedCodeStudy.MyClass.day6;

import java.util.Scanner;

/**
 * 参考65：输出一个整数，代表最大公共子串的长度
 * */
public class HJ75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String a = in.nextLine();
        String b = in.nextLine();
        String s1 = a.length()<b.length() ? a:b;//短的字符串
        String s2 = a.length()<b.length() ? b:a;//长的字符串
        int n = 0;
        for(int i = 0;i < s1.length();i++){
            for(int j = s1.length();j>i;j--){
                if(s2.contains(s1.substring(i,j))){
                    n = Math.max(j - i, n);
                }
            }
        }
        System.out.println(n);
    }
}


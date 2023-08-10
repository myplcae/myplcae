package src.LeedCodeStudy.MyClass.day5;

import java.util.Scanner;

/**
 * 查找两个字符串a,b中的最长公共子串。若有多个，输出在较短串中最先出现的那个。
 * 子串的定义:将一个字符串删去前缀和后缀（也可以不删）形成的字符串。请和“子序列”的概念分开！
 * 输入：输入两个字符串
 * 输出：返回重复出现的字符
 * */
public class HJ65 {
    public static void main(String[] args) {
        //输入
        Scanner in= new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            String b = in.nextLine();
            //定义一个用来找最长公共子串的方法
            maxlengthStr(a,b);
        }
    }
    //找公共子串的方法
    private static void maxlengthStr(String a, String b) {
        //先比较两个字符串长度
        //比较原因：可以更快节省找公共子串的时间
        String shortStr = a.length() < b.length() ? a : b;
        String longStr = a.length() > b.length() ? a : b;
        //定义最长和最短的公共子串的最大长度,定义最长和初始位置
        int shortlen = shortStr.length();//最短
        //int longlen = longStr.length();//最长
        int maxlen = 0;
        int start = 0;
        //两边逼近寻找公共子串并且输出
        for (int i = 0; i < shortlen; i++) {
            //如果子串长度超过短的那个字符串直接就停了
            if (shortlen-i+1 <=maxlen){
                break;
            }
            //两边一起向中间靠拢去找最大的公共子串
            for (int j = i, k = shortlen ; k>j; k--) {
                String substr = shortStr.substring(i,k);
                //截取公共子串
                if (longStr.contains(substr) && maxlen < substr.length()){
                    maxlen = substr.length();
                    start = j;
                    break;//找到了就停
                }
                
            }
        }
        System.out.println(shortStr.substring(start,start+maxlen));
    }
}

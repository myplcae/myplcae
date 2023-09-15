package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day12;

import java.util.Scanner;

//寻找最长公共子串
public class HJ65 {
    //    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str1 = in.nextLine();
//        String str2 = in.nextLine();
//        //定义一个找最长子串的方法
//        maxlengthstr(str1,str2);
//    }
//
//    private static void maxlengthstr(String str1, String str2) {
//        //先比较两个字符串的长度
//        String shortstr = str1.length()<str2.length()?str1:str2;
//        String longstr = str1.length()>str2.length()?str1:str2;
//        //定义最长和最短
//        int shortlen = shortstr.length();
//        int longlen = longstr.length();
//        //定义最长子序列的长度和起始位置
//        int maxlen = 0;
//        int start = 0;
//        for (int i = 0; i < shortlen; i++) {
//            if (shortlen - i + 1 <=maxlen){
//                break;//子串不能超过最长的公共子串的长度
//            }
//            //两边逼近找最长的子串
//            for (int j = i,k = shortlen; j < shortlen; j++) {
//                String substr = shortstr.substring(i,k);//截取公共子串
//                if (longstr.contains(substr) && maxlen < substr.length()){
//                    maxlen = substr.length();
//                    start = j;
//                    break;
//                }
//            }
//        }
//        System.out.println(shortstr.substring(start, start + maxlen));
//    }
    //B站直接方法
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strA = in.nextLine();
        String strB = in.nextLine();
        //记录两个字符串谁长谁段
        String str1 = strA.length() >= strB.length() ? strA : strB;
        String str2 = strA.equals(str1) ? strB : strA;
        //构建二维数组
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        int index = 0;//临时变量用来当标记
        int maxlen = 0;//临时变量记录子串长度
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                    if (dp[i][j] > maxlen){
                        maxlen = dp[i][j];
                        index = i;
                    }
                }
            }
        }
        System.out.println(str1.substring(index-maxlen,index));
    }
}

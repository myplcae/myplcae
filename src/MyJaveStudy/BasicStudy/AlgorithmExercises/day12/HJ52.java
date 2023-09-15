package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day12;

import java.util.Map;
import java.util.Scanner;

/**
 *Levenshtein 距离，又称编辑距离，指的是两个字符串之间，由一个转换成另一个所需的最少编辑操作次数。
 * 通过增加或是删掉字符 ”g” 的方式达到目的。这两种方案都需要一次操作。把这个操作所需要的次数定义为两个字符串的距离。
 * 给定任意两个字符串，写出一个算法计算它们的编辑距离。
 * 输入：每组用例一共2行，为输入的两个字符串
 * 输出：每组用例输出一行，代表字符串的距离
 * */
public class HJ52 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str  = in.nextLine();//第一个字符串
        String str1 = in.nextLine();//第二个字符串
        //转字符集
        char[] chars1 = str.toCharArray();
        char[] chars2 = str1.toCharArray();
        //初始化二维数组,两个维度长度都加1，用来比较
        int[][] dp = new int[chars1.length+1][chars2.length+1];
        //输入参数装载进dp数组
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (chars1[i-1] == chars2[j-1]){
                    dp[i][j] =dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1])+1;
                }
            }
        }
        System.out.println(dp[chars1.length][chars2.length]);
    }
}

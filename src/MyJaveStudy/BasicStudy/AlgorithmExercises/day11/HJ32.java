package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day11;

import java.util.Scanner;

/**
 * Catcher是MCA国的情报员，他工作时发现敌国会用一些对称的密码进行通信，比如像这些ABBA，ABA，A，123321，但是他们有时会在开始或结束时加入一些无关的字符以防止别国破解。
 * 比如进行下列变化 ABBA->12ABBA,ABA->ABAKK,123321->51233214　。因为截获的串太长了，而且存在多种可能的情况（abaaab可看作是aba,或baaab的加密形式），
 * Cathcer的工作量实在是太大了，他只能向电脑高手求助，你能帮Catcher找出最长的有效密码串吗？
 * 输入：输入一个字符串（字符串的长度不超过2500）
 * 输出：返回有效密码串的最大长度
 * */
@SuppressWarnings({"all"})
public class HJ32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入一串回文加密字符串
        String str = in.nextLine();
        System.out.println(getMax(str));
    }
    //用来计算密码串的函数
    public static int getMax(String str){
        boolean[][] dp = new boolean[str.length()][str.length()];//这个数组的长度是str字符串的长度
        for (int i = 0; i < str.length(); i++) {
            dp[i][i]  = true;
        }
        //先假设最大长度为一个值
        int result = 1;
        //遍历这个字符串去找回文字符
        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                //递推公式
                if (str.charAt(i) == str.charAt(j)){
                    if (i-1 >= j+1){
                        if (dp[i-1][j+1] == true){
                            dp[i][j] = true;
                        }
                    }else {
                        dp[i][j] = true;
                    }
                }
                if (dp[i][j] == true){
                    result = Math.max(result,i-j+1);
                }
            }
        }
        return result;
    }
}

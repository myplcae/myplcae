package src.MyJaveStudy.BasicStudy.basicAlgorithm.DynamicProgramming;

import java.util.Scanner;

//01背包问题最终优化版本
public class Class01problemFinalMethod {
    private static final int N = 500;//数据范围
    private static final int[] value = new int[N],weight = new int[N];//相关参数，金额和重量
    private static final int[] dp = new int[N];//dp数组，用来取值

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),v = in.nextInt();
        for (int i = 0; i <=n ; i++) {
            weight[i] = in.nextInt();
            value[i] = in.nextInt();
        }
        //完全背包
        for (int i = 1; i <= n; i++) {
            for (int j =weight[i] ;j<=v; j++) {
                dp[j] = Math.max(dp[j],dp[j-weight[i]]+value[i]);
            }
        }
        System.out.println(dp[v]);
        in.close();
    }
}

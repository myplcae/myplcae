package src.MyJaveStudy.BasicStudy.basicAlgorithm.DynamicProgramming;

import java.util.Scanner;

/**
 * 描述：01背包问题
 *      有n个苹果，他们有各自的体积和价值，给定容量为v的背包，如何让背包里的苹果的价值最大
 *      核心代码：
 *           for (int i = 1; i <= n; i++)
 *             for (int j = 0; j <= v; j++)
 *                 for (int k = 0; k*weight[i] <=j ; k++)
 *                     dp[i][j] = Math.max(dp[i][j],dp[i-1][j-k*weight[i]]+k*value[i]);
 * */
public class Class01problem {
    //先定义一些常量
    private static final int N = 510;
    private static final int[] value = new int[N],weight = new int[N];
    private static final int[][] dp = new int[N][N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v = in.nextInt();
        for (int i = 1; i <= n; i++) {
            weight[i] = in.nextInt();
            value[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++)
            for (int j = 0; j <= v; j++)
                for (int k = 0; k*weight[i] <=j ; k++)
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-k*weight[i]]+k*value[i]);
        System.out.println(dp[n][v]);

        in.close();
    }
}

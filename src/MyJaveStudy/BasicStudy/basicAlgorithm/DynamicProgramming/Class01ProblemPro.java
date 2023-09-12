package src.MyJaveStudy.BasicStudy.basicAlgorithm.DynamicProgramming;

import java.util.Scanner;

/**
 * 多重背包问题
 * 测试用例：
 * 3 8
 * 2 5 9
 * 3 9 2
 * 1 5 1
 * 结果：24
 * */
public class Class01ProblemPro {
    private static final int N = 5100;
    private static final  int[] weight = new int[N],value = new int[N],sum = new int[N];
    private static final int[][] dp = new int[N][N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int n = in.nextInt(),v = in.nextInt();
            //遍历存入数组
            for (int i = 1; i <= n; i++) {
                weight[i] = in.nextInt();
                value[i] = in.nextInt();
                sum[i] = in.nextInt();
            }
            for (int i = 1; i <= n; i++)
                for (int j = 0; j <= v; j++)
                    for (int k = 0; k <=sum[i] && k*weight[i]<=j; k++)
                        dp[i][j] = Math.max(dp[i][j],dp[i-1][j-k*weight[i]]+k*value[i]);
            System.out.println(dp[n][v]);

            in.close();
        }
}

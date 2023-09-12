package src.MyJaveStudy.BasicStudy.basicAlgorithm.DynamicProgramming;

import java.util.Scanner;

//分组背包问题
/**
 *
 * */
public class Class01Groupproblem {
    private static final int N = 500;//数据范围
    private static final int[][] value = new int[N][N],weight = new int[N][N];//第几堆的第几个
    private static final int[] group = new int[N];//第几堆有多少个苹果
    private static final int dp[] = new int[N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),v = in.nextInt();
        for (int i = 1; i <= n; i++) {
            group[i] = in.nextInt();
            for (int j = 0; j < group[i]; j++) {
                weight[i][j] = in.nextInt();
                value[i][j] = in.nextInt();
            }
        }
        //01优化版：递减枚举
        for (int i = 1; i <=n ; i++)
            for (int j = v; j >=0 ; j--)
                for (int k = 0; k < group[i]; k++)//循环每个组的苹果
                    if (weight[i][k] <= j)
                        dp[j] = Math.max(dp[j],dp[j-weight[i][k]]+value[i][k]);
        System.out.println(dp[v]);
        in.close();


    }
}

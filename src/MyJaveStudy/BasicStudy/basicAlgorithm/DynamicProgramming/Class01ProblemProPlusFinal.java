package src.MyJaveStudy.BasicStudy.basicAlgorithm.DynamicProgramming;

import java.util.Scanner;
/**
 * 测试数据：
 *         3 8
 *         2 5 9
 *         3 9 1
 *         1 5 1
 * 结果：   24
 * */
public class Class01ProblemProPlusFinal {
    private static final int N = 5100;
    private static final  int[] weight = new int[N],value = new int[N];
    private static final int[] dp = new int[N];
    static int count = 0;//定位

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),v = in.nextInt();
        while (n-- != 0){
            int ww = in.nextInt(),vv = in.nextInt(),ss = in.nextInt();//重量价格个数
            int k = 1;
            while (ss >= k){
                weight[++count] = k*ww;
                value[count] = k*vv;
                ss -=k;
                k <<= 1;//左移一位
            }
            if (ss > 0){
                weight[++count] = ss * ww;
                value[count] = ss * vv;
            }
        }
        for (int i = 0; i <= count; i++)
            for (int j = v; j >=weight[i] ; j--)
                dp[j] = Math.max(dp[j], dp[j-weight[i]]+value[i]);
        System.out.println(dp[v]);
        System.out.println(System.nanoTime());//740933331604900
        in.close();

    }
}

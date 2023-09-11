package src.MyJaveStudy.BasicStudy.basicAlgorithm.test;

import java.util.Scanner;

/**
 * 动态规划：
 * 背包问题：有N件物品和一个容量为V的背包，第I件物品的价值是C[i],求解价值最大的算法
 * */
@SuppressWarnings({"all"})
public class DynamicProgrammingClass1 {
    public static void main(String[] args) {
        //输入一串数
        Scanner in = new Scanner(System.in);
            //物品输了n
            int n = in.nextInt();
            //输入背包的容量
            int v = in.nextInt();
            //价值
            int[] values = new int[n+1];//因为需要看一个物品是否会拿
            //存放重量的数组
            int[] weight = new int[n+1];//同上
            //初始化一个数组存数量和容量
            int[][] result = new int[n+1][v+1];
            for (int i = 1; i < n+1; i++) {
                //价值
                values[i] = in.nextInt();
                weight[i] = in.nextInt();
            }
            //计算价值
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < v+1; j++) {
                    if (j < weight[i]){
                        result[i][j] = result[i-1][j];
                    }else {
                        result[i][j] = Math.max(result[i-1][j],result[i-1][j-weight[i]]+values[i]);
                    }
                }
            }
            System.out.println(result[n][v]);
        }

}

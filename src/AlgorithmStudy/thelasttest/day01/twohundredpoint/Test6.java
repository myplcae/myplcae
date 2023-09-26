package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 高效的任务规划：
 *  第一行输入：代表总共的M组数据
 *      每组数第一行为一个整数指定机器的数量
 *      随后的N行每行两个整数，第一个表示B，第二个表示J
 *      每组数据连续输入
 * 输出描述：输出最短完成时间
 * */
public class Test6 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int m = in.nextInt();
        int[][][] tasks = new int[m][][];
        for (int i = 0; i < m; i++) {
            int n = in.nextInt();
            int[][] tast = new int[n][2];
            for (int j = 0; j < n; j++) {
                tast[j][0] = in.nextInt();
                tast[j][1] = in.nextInt();
            }
            tasks[i]  = tast;
        }
        gentlestTime(tasks);
    }

    private static void gentlestTime(int[][][] tasks) {
        for (int[][] task : tasks) {
            Arrays.sort(task,(a,b)->b[1] -a[1]);
            int n = task.length;
            int[] dp = new int[n];
            dp[0] = task[0][0] + task[0][1];
            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i-1],dp[i-1]-task[i-1][1]+task[i][0]+task[i][1]);
            }
            System.out.println(dp[n-1]);
        }

    }
}

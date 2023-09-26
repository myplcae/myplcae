package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 分积木：
 *      输入：第一行代表积木个数
 *           第二行为空格分开的N个整数，表示第i块积木的重量
 *      输出：如果能让koko不哭，输出最大的solo的重量，否则输出“NO”
 * */
public class Test9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++)
            weights[i] = in.nextInt();
        System.out.println(getWeights(n,weights));
    }

    private static String getWeights(int n, int[] weights) {
        //排序先
        Arrays.sort(weights);
        int min = weights[0];//定义最小
        int trueNum = min;//正确的重量
        int faultNum = min;
        for (int i = 1; i < weights.length; i++) {
            trueNum += weights[i];
            faultNum ^= weights[i];
        }
        if (faultNum == 0){
            return trueNum - min + "";
        }else {
            return "NO";
        }
    }
}

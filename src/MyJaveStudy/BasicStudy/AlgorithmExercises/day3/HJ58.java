package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入n个整数，找出其中最小的k个整数并按升序输出
 * 输入：第一行输入两个整数n和k
 *      第二行输入一个整数数组
 * 输出：从小到大输出最小的k个整数，用空格分开
 * */
public class HJ58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //先输入两个整数
        int x = in.nextInt();
        int j = in.nextInt();
        //输入一个数组
        int[] arr = new int[x];
        for (int i = 0;i< x;i++){
            arr[i] = in.nextInt();
        }
        //排序
        Arrays.sort(arr);
        //输出最后的数组
        for (int i = 0;i <j;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

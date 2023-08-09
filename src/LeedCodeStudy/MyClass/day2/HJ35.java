package src.LeedCodeStudy.MyClass.day2;

import java.util.Scanner;

/**
 * 蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
 * 例如，当输入5时，应该输出的三角形为：
 * 1 3 6 10 15
 * 2 5 9 14
 * 4 8 13
 * 7 12
 * 11
 * 输入：输入正整数N（N不大于100）
 * 输出：输出一个N行的蛇形矩阵。
 * */
public class HJ35 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int n = in.nextInt();
        int[][] result = new int[n][];
        int t = 1;
        for (int i = 0;i < n;i++){
            result[i] = new int[n-i];
            for (int j =0;j < i+1;j++){
                result[i-j][j] = t;
                t++;
            }
        }
        for (int[] a:result){
            for (int a1:a)
                System.out.print(a1 + " ");
            System.out.println();
        }
    }
}

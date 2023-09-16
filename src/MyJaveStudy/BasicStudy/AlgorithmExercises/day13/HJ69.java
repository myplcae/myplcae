package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day13;

import java.util.Scanner;

/**
 * 输入两个矩阵
 *          第一行包含一个正整数x，代表第一个矩阵的行数
 *          第二行包含一个正整数y，代表第一个矩阵的列数和第二个矩阵的行数
 *          第三行包含一个正整数z，代表第二个矩阵的列数
 *          之后x行，每行y个整数，代表第一个矩阵的值
 *          之后y行，每行z个整数，代表第二个矩阵的值
 * 输出两个矩阵相乘得到的矩阵
 */
public class HJ69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //输入的第一个矩阵,并且装配进数组
        int[][] arr1 = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        //第二个矩阵
        int[][] arr2 = new int[b][c];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        //定义第三个矩阵代表第一第二个矩阵的乘积
        int[][] arr3 = new int[a][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < b; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];//这里不应该直接使用等于，因为矩阵相乘之后的值会不一样，所以使用+=
                }
            }
        }
        //遍历输出arr3
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(arr3[i][j]);
                if (j != c-1){
                    System.out.println(" ");
                }
            }
            System.out.println("");
        }
    }
}

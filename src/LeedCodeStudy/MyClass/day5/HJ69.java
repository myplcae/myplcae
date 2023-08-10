package src.LeedCodeStudy.MyClass.day5;

import sun.applet.Main;

import java.util.Scanner;

/**
 * 矩阵乘法
 * 输入：第一行包含一个正整数x，代表第一个矩阵的行数
 * 第二行包含一个正整数y，代表第一个矩阵的列数和第二个矩阵的行数
 * 第三行包含一个正整数z，代表第二个矩阵的列数
 * 之后x行，每行y个整数，代表第一个矩阵的值
 * 之后y行，每行z个整数，代表第二个矩阵的值
 * 输出：对于每组输入数据，输出x行，每行z个整数，代表两个矩阵相乘的结果
 * */
public class HJ69 {
    //无参构造
    public HJ69(){

    }
    //有参构造
    public int[][] mul(int[][] mat1,int[][] mat2){
        int x = mat1.length;
        int y = mat2.length;
        int z = mat2[0].length;
        int result[][] = new int[x][z];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                for (int k = 0; k < y; k++) {
                    result[i][j] += mat1[i][k]*mat2[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HJ69 solution = new HJ69();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            //定义一些必要的参数
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int[][] mat1 = new int[a][b];
            int[][] mat2 = new int[b][c];
            //定义第一个矩阵
            for (int i = 0; i <a;i++) {
                for (int j = 0; j < b; j++) {
                    mat1[i][j] = in.nextInt();
                }                
            }
            //定义第二个矩阵
            for (int i = 0; i < b; i++) {
                for (int j = 0;j < c;j++){
                    mat2[i][j] = in.nextInt();
                }
            }
            //定义输出数组
            int[][] result = solution.mul(mat1,mat2);
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

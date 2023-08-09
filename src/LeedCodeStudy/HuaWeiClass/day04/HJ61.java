package src.LeedCodeStudy.HuaWeiClass.day04;

import java.util.Scanner;

/**
 * 描述：把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？
 * 输入：两个int型整数
 * 输出：一个int型整数
 * */
public class HJ61 {
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        //处理case
        while (in.hasNextLine()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(count(a,b));
        }
    }
    //计算a个盘子的b个装法
    private static int count(int a, int b) {
        //使用二维数组来定义苹果和盘子
        int[][] arr= new int[a+1][b+1];
        //两种情况：1、没有苹果
        for (int j = 0; j <=b ; j++) {
            arr[0][j] = 1;
        }
        //2、有苹果
        for (int i = 1; i <=a ; i++) {
            for (int j = 1;j<=b;j++){
                if (i<j){
                    arr[i][j] = arr[i][j-1];
                }else {
                    arr[i][j] = arr[i][j-1]+arr[i-j][j];
                }
            }
        }

        return arr[a][b];
    }
}

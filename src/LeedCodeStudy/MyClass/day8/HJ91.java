package src.LeedCodeStudy.MyClass.day8;

import java.util.Scanner;

/**
 * 走方格的方案数:请计算n*m的棋盘格子从棋盘左上角出发沿着边缘线从左上角走到右下角，总共有多少种走法，
 * 输入：长a,宽b
 * 输出：结果
 * */
public class HJ91 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            //输入长和宽
            int a = in.nextInt();
            int b = in.nextInt();
            //用method方法输出结果
            System.out.println(method(a,b));
        }
    }

    private static int method(int a, int b) {

        if (a == 1 || b ==1){
            return  a+b;
        }
        return method(a-1,b)+method(a,b-1);
    }
}

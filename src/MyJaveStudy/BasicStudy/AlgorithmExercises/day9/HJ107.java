package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day9;

import java.util.Scanner;

/**
 * 求解立方根：计算一个浮点数的立方根，不使用库函数。保留一位小数。
 * 输入：待求解参数，为double类型（一个实数）
 * 输出：输出参数的立方根。保留一位小数。
 * */
public class HJ107 {
    //直接用二分查找
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            double num = in.nextDouble();
            double left = 0.0,right = num,mid = 0;
            right = Math.max(1.0,num);
            left = Math.min(-1.0,num);
            while (right-left > 0.01){
                mid = left + (right-left)/2;
                if (mid * mid * mid < num){
                    left = mid;
                }else if (mid * mid * mid > num){
                    right = mid;
                }else {
                    return;
                }
            }
            System.out.printf("%.1f",mid);
        }
    }
}

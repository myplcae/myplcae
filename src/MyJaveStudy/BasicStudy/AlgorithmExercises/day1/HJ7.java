package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。
 * 输入：一个小数
 * 输出：四舍五入取整
 * */
public class HJ7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            double a = in.nextDouble();
            System.out.println(Math.round(a));
        }
    }
}

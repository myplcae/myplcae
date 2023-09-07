package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day6;

import java.util.Scanner;

/**
 * 根据输入的日期，计算是这一年的第几天。
 * 输入：输入一行，每行空格分割，分别是年，月，日
 * 输出：输出是这一年的第几天
 * */
public class HJ73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int a = in.nextInt();//年
            int b = in.nextInt();//月
            int c = in.nextInt();//日
            int result = 0;
            //第一个数是年份，先判断是不是闰年
            if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {//平年
                int[] mounth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
                for (int i = 0; i < b-1; i++) {
                    result = result+mounth[i];
                }
            }else {//闰年
                int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
                for (int i = 0; i < b-1; i++) {
                    result = result+month[i];
                }
            }
            result = result + c;
            System.out.println(result);
        }
    }
}

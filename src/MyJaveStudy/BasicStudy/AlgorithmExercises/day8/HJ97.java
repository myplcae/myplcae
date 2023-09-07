package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day8;

import java.util.Scanner;

/**
 * 记负均正:首先输入要输入的整数个数n，然后输入n个整数。输出为n个整数中负数的个数，和所有正整数的平均值，结果保留一位小数。
 * 0即不是正整数，也不是负数，不计入计算。如果没有正数，则平均值为0。
 * 输入：首先输入一个正整数n，
 * 输出：然后输入n个整数。
 * */
public class HJ97 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int z = 0;
        int sum = 0;
        int index = in.nextInt();
        for (int i = 0; i < index; i++) {
            int x = in.nextInt();
            if (x ==0){
                continue;
            }else if (x < 0 ){
                num++;
            }else {
                sum += x;
                z++;
            }
        }
        System.out.print(num + " " + (sum == 0?0:Math.round(sum*10.0/z)/10.0));
    }
}

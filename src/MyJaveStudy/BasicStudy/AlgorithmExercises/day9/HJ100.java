package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day9;

import java.util.Scanner;

/**
 * 输入一个等差数列
 * 输出等差数列的前n项和
 * 输入：输入一个正整数n。
 * 输出：输出一个相加后的整数
 * */
public class HJ100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int length = in.nextInt();
            int first = 2,last = 3*length-1;
            System.out.println((first+last)*length/2);
        }
    }
}

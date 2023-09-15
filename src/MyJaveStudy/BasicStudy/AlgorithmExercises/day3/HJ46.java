package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day3;

import java.util.Scanner;

/**
 * 截取字符串：输入一个字符串和一个整数 k ，截取字符串的前k个字符并输出
 * */
public class HJ46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int a = in.nextInt();
        System.out.println(str.substring(0,a));
    }
}

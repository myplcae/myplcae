package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day9;

import java.util.Scanner;

/**
 * 自守数是指一个数的平方的尾数等于该数自身的自然数。
 * 输入一个数然后输出他的自守数
 * */
public class HJ99 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt();
            int num = 0;
            for (int i = 0; i <= a; i++) {
                int b = i*i;
                String str = String.valueOf(b);
                String str1 = String.valueOf(i);
                if (str.endsWith(str1)){
                    num ++;
                }
            }
            System.out.println(num);
        }
    }
}

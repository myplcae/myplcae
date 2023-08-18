package src.LeedCodeStudy.MyClass.day9;

import java.util.Scanner;

/**
 * 正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
 * 输入：输入两个正整数A和B。
 * 输出：输出A和B的最小公倍数。
 * */
public class HJ108 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a;                     //存储a的原始值，递归过程中使用。
        System.out.println(getAveragenum(a,b,c));
    }

    private static int getAveragenum(int a, int b, int c) {
        if (a%b== 0){                    //a累加过程中永远可以整除自身，所以可以整除b时就是最小公倍数！
            return a;
        }
        return getAveragenum(a+c,b,c);            //a累加自身原始值，例如a=4。  a=4,8,12,16....
    }
}

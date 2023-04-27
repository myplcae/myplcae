package src.LeedCodeStudy.HuaWeiClass.easy.day2;

import java.util.Scanner;

/**
 * 有一种兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子。
 * 例子：假设一只兔子第3个月出生，那么它第5个月开始会每个月生一只兔子。
 * 一月的时候有一只兔子，假如兔子都不死，问第n个月的兔子总数为多少？
 * 数据范围：输入满足1<=n<=31
 * 输入：输入一个int型整数表示第n个月
 * 输出：输出对应的兔子总数
 * */
public class HJ37 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  a = in.nextInt();
        System.out.println(f(a));
    }

    private static int f(int x) {

        if(x == 1 || x==2){
            return 1;
        }
        return f(x-1)+f(x-2);
    }
    }


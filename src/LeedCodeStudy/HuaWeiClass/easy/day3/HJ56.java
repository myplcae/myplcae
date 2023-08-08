package src.LeedCodeStudy.HuaWeiClass.easy.day3;

import java.util.Scanner;

/**
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
 * */
public class HJ56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int ans = count(n);
            System.out.println(ans);
        }
}
    //判断这个数是不是完全数
    public static int count(int n) {
        int count = 0;
        for (int i = 1;i<=n;i++){
            if (isPerfect(i))
                count++;
        }
        return count;
    }
    //完全数判断方式
    public static boolean isPerfect(int i) {
        int sum = 0;
        for (int j = 1;j <i;j++){
            if (i%j == 0)
                sum +=j;
        }
        return sum == i;

    }
}

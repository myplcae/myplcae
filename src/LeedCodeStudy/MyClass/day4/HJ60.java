package src.LeedCodeStudy.MyClass.day4;

import java.util.Scanner;

/**
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，
 * 本题目要求输出组成指定偶数的两个素数差值最小的素数对。
 * 输入：输入一个大于2的偶数
 * 输出：从小到大输出两个素数
 * 例子：输入：20
 *      输出：7 13
 * */
public class HJ60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            solution(a);
        }
    }
    //输出最后的值的solution方法
    public static void solution(int a){
        int min = Integer.MAX_VALUE;
        int[] res = new int[2];
        //开始遍历
        for (int i = 2; i < a; i++) {
            if (determinePrime(i) && determinePrime(a - i)) {
                if (Math.abs(a - i - i) < min) {
                    //数组保留这两个相距最近的数
                    res[0] = i;
                    res[1] = a - i;
                    min = Math.abs(a - i - i);
                }
            }
        }
        System.out.println(res[0]+"\n"+res[1]);
    }
    //判断是否素数
    private static boolean determinePrime(int a){
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
}

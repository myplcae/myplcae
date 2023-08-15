package src.LeedCodeStudy.MyClass.day7;

import java.util.Scanner;

/**
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和;
 * 输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。
 * 输入：输入一个int整数
 * 输出：输出分解后的string
 * */
public class HJ76 {

    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        //用来输出结果的方法
        while (in.hasNextInt()){
            //定义计算需要的参数
            int a = in.nextInt();
            long b = (long) Math.pow(a,3);//这个方法用来计算a的三次方
            //排列组合公式拿到结果
            int x = (int)b/a-(a-1);//需要强转
            //封装结果
            StringBuilder sb = new StringBuilder(Integer.toString(x));
            for (int i = 1; i < a; i++) {
                x =x+2;
                sb.append("+");
                sb.append(x);
            }
            System.out.println(sb);
        }
    }
}

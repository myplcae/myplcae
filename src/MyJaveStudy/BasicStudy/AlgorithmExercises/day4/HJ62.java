package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day4;

import java.util.Scanner;

/**
 * 描述：输入一个正整数，计算它在二进制下的1的个数。
 * 输入：输入一个整数
 * 输出：计算整数二进制中1的个数
 */
public class HJ62 {
    //    public static void main(String[] args) {
//        //输入，不满足多组输入
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        String j = Integer.toBinaryString(x);//这个方法用来将输入的数转换为二进制
//        String xx = j.replaceAll("1","");//将1删除然后两个字符串相减
//        System.out.println(j.length()-xx.length());
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int x = in.nextInt();
            int count = 0;
            while (x != 0) {
                if (x % 2 == 1) {
                    count++;
                    x = x >> 1;
                }
            }
            System.out.println(count);
        }
    }
}

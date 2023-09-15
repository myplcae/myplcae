package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 高精度加法：输入两个用字符串 str 表示的整数，求它们所表示的数之和
 * 范围：1-10000
 * */
public class HJ57 {
    //方法1调用方法
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BigInteger x = new BigInteger(sc.nextLine());
//        BigInteger y = new BigInteger(sc.nextLine());
//        System.out.println(x.add(y));
//    }
    //方法2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        //补长度为一样的
        int len1 = str1.length();
        int len2 = str2.length();
        StringBuffer sb = new StringBuffer();
        //判断
        int bet = len1-len2;
        int absBet = Math.abs(bet);
        if (bet > 0){
            sb.append(str2);
            for (int i = 0; i < absBet; i++) {
                sb.insert(0,'0');
            }
            str2 = sb.toString();
        }else {
            sb.append(str1);
            for (int i = 0; i < absBet; i++) {
                sb.insert(0,'0');
            }
            str1 = sb.toString();
        }
        //临时变量去接收两个值相加
        sb = new StringBuffer();
        int temp = 0;
        int len = str1.length();
        for (int i = len-1; i >=0 ; i--) {
            int num =Integer.valueOf(str1.charAt(i)+ "") + Integer.valueOf(str2.charAt(i) + "") + temp;
            sb.insert(0,num%10);
            temp = num/10;
        }
        if (temp >0){
            sb.insert(0,temp);
        }
        System.out.println(sb.toString());
    }
}

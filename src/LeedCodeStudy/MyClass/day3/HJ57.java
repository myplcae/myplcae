package src.LeedCodeStudy.MyClass.day3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 高精度加法：输入两个用字符串 str 表示的整数，求它们所表示的数之和
 * 范围：1-10000
 * */
public class HJ57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = new BigInteger(sc.nextLine());
        BigInteger y = new BigInteger(sc.nextLine());
        System.out.println(x.add(y));
    }
}

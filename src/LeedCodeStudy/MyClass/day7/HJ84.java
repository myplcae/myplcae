package src.LeedCodeStudy.MyClass.day7;

import java.util.Scanner;

/**
 * 描述：找出给定字符串中大写字符(即'A'-'Z')的个数。
 * 输入：对于每组样例，输入一行，代表待统计的字符串
 * 输出：输出一个整数，代表字符串中大写字母的个数
 * */
public class HJ84 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            System.out.println(in.nextLine().replaceAll("[^A-Z]","").length());
//        }
        while (in.hasNext()){
            String str = in.nextLine();
            String str2 = str.replaceAll("[^A-Z]", "");
            System.out.println(str2.length());
        }
    }
}

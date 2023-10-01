package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.Scanner;

/**
 * 数列描述：一个数列，每项都是数字，第一项是a[0] = 1;a[1] = 11,描述：第一项是1，连续出现了1个1；a[2] =21;描述：由两个1组成即21，出现了两次1
 * a[3] = 1211;描述：因为a[2] =21，然后又出现了一1，所以a[3] = 1211;
 * 输入一个数，输出对应的数列的内容
 * */
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(getsequence(a));
    }

    private static String getsequence(int a) {
        String base = "1";
        for (int i = 1; i <=a ; i++) {
            base = decribe(base);
        }
        return base;
    }

    private static String decribe(String base) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char ch = base.charAt(0);
        for (int i = 1; i < base.length();i++) {
            if (base.charAt(i) == base.charAt(i-1)){
                count++;
            }else {
                sb.append(count).append(ch);
                count = 1;
                ch = base.charAt(i);
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }
}

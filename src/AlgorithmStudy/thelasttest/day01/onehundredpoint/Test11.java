package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Scanner;

/**
 * 字符串加密：
 * 输入：一个数字，代表有这么多组数据
 * 被加密字符串，只有字母，长度不超过50
 * 加密方式：往后移动他所在数组下标位数的位数，例如a在第二位则往后移动两位
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String[] str = new String[a];
        //输入字符串
        for (int i = 0; i < a; i++) {
            str[i] = in.next();
        }
        //加密输出
        for (int i = 0; i < a; i++) {
            System.out.println(encrypt(str[i]));
        }
    }

    //加密
    public static String encrypt(String str) {
        int n = str.length();
        //定义一个数组
        long[] arr = new long[n];
        if (n > 0)
            arr[0] = 1;
        if (n > 1)
            arr[1] = 2;
        if (n > 2)
            arr[2] = 4;
        if (n > 3) {
            for (int i = 3; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }
        //添加偏移量
        char[] chars = str.toCharArray();
        for (int i = 0; i < n; i++) {
            chars[i] = (char) ((arr[i]+chars[i]-97)%26+97);
        }
        return new String(chars);
    }
}

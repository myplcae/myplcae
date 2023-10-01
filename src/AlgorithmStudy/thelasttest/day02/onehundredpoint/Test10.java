package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.Scanner;

/**
 * 密钥格式化：给定一个非空字符串S，它会被N个‘-’分割成N+1的子串，给定正整数K，要求除第一个子串外，其余的每K个用‘-’分割，并将小写字母转为大写
 * */
public class Test10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String str = in.next();
        System.out.println(getStr(k,str));
    }

    private static String getStr(int k, String str) {
        String[] arr = str.split("-");
        String first = arr[0];//第一个字母
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        String[] tmp = sb.toString().split("");
        StringBuilder up = new StringBuilder();
        up.append(first);
        for (int i = 0; i < tmp.length; i++) {
            String v = tmp[i].toUpperCase();//全转大写
            if (i%k == 0)
                v = "-" + v;
            up.append(v);
        }
        return up.toString();
    }
}

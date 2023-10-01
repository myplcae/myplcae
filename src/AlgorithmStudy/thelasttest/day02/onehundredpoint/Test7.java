package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 字符串变换最小字符串
 * 描述：给定一个字符串按规则变换，输出变换后的最小的字符串
 * 规则：交换字符串中任意两个不同位置的字符
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getchars(in.nextLine()));
    }

    private static String getchars(String s) {
        char[] minarr = s.toCharArray();
        Arrays.sort(minarr);
        String minstr = new String(minarr);
        if (s.equals(minstr))
            return s;
        char[] sarr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (sarr[i] != minarr[i]){
                char ch = sarr[i];
                sarr[i] = minarr[i];
                int swapIndex = s.lastIndexOf(minarr[i]);
                sarr[swapIndex] = ch;
                break;
            }
        }
        return new String(sarr);
    }
}

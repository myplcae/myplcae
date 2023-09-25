package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;


import java.util.LinkedList;
import java.util.Scanner;

//滑动窗口
/**
 * 输入一串字符，输出这串字符中最长数字字符的长度+数字前的那个字母，如果没有数字则输出-1
 * */
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getResult(in.next()));
    }

    private static int getResult(String str) {
        int maxlen = -1;
        boolean hasletter = false;
        int l = 0, r = 0;
        LinkedList<Integer> letterIdx = new LinkedList<>();

        while (r < str.length()) {
            char c = str.charAt(r);
            if (!isletter(c)) {
                hasletter = true;
                letterIdx.add(r);
                if (letterIdx.size() > 1) {
                    l = letterIdx.removeFirst() + 1;
                }
                if (r == 1) {
                    r++;
                    continue;
                }
            }
            maxlen = Math.max(maxlen, r - l + 1);
            r++;
        }
        if (!hasletter) return -1;
        return maxlen;
    }
    //判断是不是字母字符
    private static boolean isletter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }


}

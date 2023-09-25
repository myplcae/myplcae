package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 输入：使用换行隔开三个参数：
 * 英文文章内容，英文字符串
 * 带翻转内容起始下标
 * 带翻转内容最后一个下标
 */
public class Test13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(getTheStr(str, start, end));
    }

    private static String getTheStr(String str, int start, int end) {
        String[] arr = str.split(" ");
        //获取开始和结束位置的下标
        start = Math.min(Math.max(0, start), arr.length - 1);
        end = Math.min(Math.max(0, end), arr.length - 1);
        if (start > end)
            return str;
        int l = start;
        int r = end;
        //遍历换位置
        while (l < r) {
            String tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
        StringJoiner sj = new StringJoiner(" ");
        for (String t : arr)
            sj.add(t);
        return sj.toString();
    }
}

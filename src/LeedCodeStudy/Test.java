package src.LeedCodeStudy;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            String x = in.next();
            parseCmd(x, a);
        }
    }
    public static void parseCmd(String cmds, int n) {
        //起始位置
        int start = 1;
        //页面末位置
        int end = Math.min(n, 4);
        //光标的位置，三个位置都是从1开始
        int index = 1;
        for (int i = 0; i < cmds.length(); i++) {
            if (cmds.charAt(i) == 'U') {
                index = (index - 1 - 1 + n) % n + 1;
            } else if (cmds.charAt(i) == 'D') {
                index = index % n + 1;
            }
            //判断滑动窗口的位置是否需要改变
            if (index < start) {
                //逛遍在窗口之上
                start = index;
                end = start + 3;
            } else if (index > end) {
                end = index;
                start = end - 3;
            }
        }
        //输出
        for (int i = start ; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(index);
    }
}
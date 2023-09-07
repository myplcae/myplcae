package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 参数解析
 */
public class HJ74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String str = in.nextLine();
            StringBuilder sb = new StringBuilder();
            ArrayList<String> list = new ArrayList<>();
            boolean flag = false;
            //遍历输入的字符
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '"') {//遇到第一个引号，flag为true;第二个引号flag为false
                    flag = flag ? false : true;
                    continue;
                }
                //如果c是空格，且flag为false时，即使没有引号，或已经是第二个引号结束
                if (c == ' ' && !flag) {
                    list.add(sb.toString());//拼接字符串到集合中
                    sb = new StringBuilder();//重置字符串遍历下一个字符
                } else {
                    sb.append(c);
                }
            }
            //打印数组长度
            list.add(sb.toString());
            System.out.println(list.size());
            //打印命令
            for (String s1 : list) {
                System.out.println(s1);
            }
        }
    }
}


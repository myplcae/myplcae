package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day12;

import java.util.Scanner;

/**
 * 找出字符串中第一个只出现一次的字符
 * 输入：输入一个非空字符串
 * 输出：输出第一个只出现一次的字符，如果不存在输出-1
 * */
public class HJ59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean flag = false;
        //遍历去判断只出现一次的字符
        for (int i = 0; i < str.length(); i++) {
            //取字符的索引位置
            char c = str.charAt(i);
            //如果第一次出现的位置和最后一次出现的位置相等
            if (str.lastIndexOf(c) == str.indexOf(c)){
                System.out.println(c);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(-1);
        }
    }
}

package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 * 描述：输入一行，代表要计算的字符串，非空，长度小于5000。
 * 输出：输出一个整数，表示输入字符串最后一个单词的长度。
 * */
public class HJ1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        //判断最后一个单词之前一个空格的位置
        String[] empty = x.split(" ");
        //通过整个输入字符串长度减去最后一个单词之前的空格的位置得到最后一个单词长度
        System.out.println(empty[empty.length-1].length());
    }
}

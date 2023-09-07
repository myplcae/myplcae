package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.Scanner;

/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * 输入：输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。
 * 输出：得到逆序的句子
 * */
public class HJ13 {

    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        //定义空格
        String str = in.nextLine();
        String[] s = str.split(" ");
        //遍历判断
        for (int i = s.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(s[i] + " ");
            } else {
                System.out.print(s[i]);
            }
        }
    }
}

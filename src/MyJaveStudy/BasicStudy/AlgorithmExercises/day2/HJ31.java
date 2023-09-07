package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day2;

import java.util.Scanner;

/**
 * 对字符串中的所有单词进行倒排。
 * 说明：
 * 1、构成单词的字符只有26个大写或小写英文字母；
 * 2、非构成单词的字符均视为单词间隔符；
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 * 4、每个单词最长20个字母；
 * 输入：输入一行，表示用来倒排的句子
 * 输出：输出句子的倒排结果
 * */
public class HJ31 {

    public HJ31(){

    }

    public static void main(String[] args) {

        HJ31 solution = new HJ31();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String result = solution.reverse(str);
        System.out.println(result);

    }
    //倒装句方法
    private String reverse(String str) {
        String[] arr = str.split("[^A-Za-z]");//注意可能会写错
        StringBuilder result = new StringBuilder();
        //遍历改位置
        for (int i = arr.length-1;i>=0;i--){
            result.append(arr[i]).append(" ");
        }
        return result.toString().trim();
    }
}

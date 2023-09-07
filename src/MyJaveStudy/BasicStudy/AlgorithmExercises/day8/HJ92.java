package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 描述：输入一个字符串，返回其最长的数字子串，以及其长度。若有多个最长的数字子串，则将它们全部输出（按原字符串的相对位置）
 * 本题含有多组样例输入。
 * 输入：输入一个字符串。1<=len(字符串)<=200
 * 输出：输出字符串中最长的数字字符串和它的长度，中间用逗号间隔。如果有相同长度的串，则要一块儿输出（中间不要输出空格）。
 * */
public class HJ92 {

    public static void main(String[] args) {
        //输入
        Scanner in =new Scanner(System.in);
        while (in.hasNext()){
            String str = in.nextLine();//输入的字符串
            String[] arr = str.split("[^0-9]+");//找到数字字符
            int max = 0;//定义最长的数字子串长度
            //定义一个数组用来存数字字符并且计算其长度
            ArrayList<String> list = new ArrayList<>();
            for (String str1:arr){
                if (str1.length() > max){
                    max = str1.length();
                    list.clear();
                    list.add(str1);
                } else if (str1.length() == max) {
                    max = str1.length();
                    list.add(str1);
                }
            }
            //定义string build用来操作的到输出需要的结果
            StringBuilder sb = new StringBuilder();
            //遍历添加到sb
            for (String item:list){
                sb.append(item);
            }
            sb.append(",").append(max);
            System.out.println(sb.toString());
        }
    }
}

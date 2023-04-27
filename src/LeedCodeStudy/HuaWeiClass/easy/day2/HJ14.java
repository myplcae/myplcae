package src.LeedCodeStudy.HuaWeiClass.easy.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定 n 个字符串，请对 n 个字符串按照字典序排列
 * 输入：输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100)，字符串中只含有大小写字母。
 * 输出：数据输出n行，输出结果为按照字典序排列的字符串。
 * */
public class HJ14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();//定义字符串个数
        String[] arr = new String[a];//定义一个数组装字符串
        //遍历插入
        for (int i = 0;i < a;i++){
            arr[i] = in.nextLine();//装载字符串到数组里边
        }
        //通过sort方法自动排序
        Arrays.sort(arr);
        //遍历输出
        for (String str:arr){
            System.out.println(str);
        }
    }
}

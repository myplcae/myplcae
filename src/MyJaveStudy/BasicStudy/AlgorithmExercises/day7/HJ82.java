package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day7;

import java.util.Scanner;

/**
 * 分子为1的分数称为埃及分数。现输入一个真分数(分子比分母小的分数，叫做真分数)，请将该分数分解为埃及分数
 * 如：8/11 = 1/2+1/5+1/55+1/110。
 * 输入：输入一个真分数，String型
 * 输出：输出分解后的string
 * */
public class HJ82 {
    //定义结果参数
    static StringBuffer result;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String[] str = in.next().split("/");
            int a = Integer.parseInt(str[0]);//第一个位置的数是分子
            int b = Integer.parseInt(str[1]);//第二个位置的数是分母
            result = new StringBuffer();
            //定义一个计算埃及分数的方法process，传参为a,b,result
            process(a,b,result);
            //输出result
            System.out.println(result);
        }
    }
    //计算埃及分数的方法
    private static void process(int a, int b, StringBuffer result) {
        //如果有埃及分数
        if (result.length() != 0){
            result.append("+");
        }
        //定义分数
        int x = b/a;
        if (a==1 || b%a == 0){
            result.append("1/").append(x+1);
        }else {
            int y = b%a;
            result.append("1/").append(x+1);
            process(a-y,b*(x+1),result);
        }
    }
}

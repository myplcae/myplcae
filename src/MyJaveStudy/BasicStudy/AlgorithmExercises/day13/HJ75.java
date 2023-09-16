package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day13;
//公共子串计算


import java.util.Scanner;

public class HJ75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String s1 = str1.length() < str2.length() ? str1 : str2;//短的
        String s2 = str1.length() < str2.length() ? str2 : str1;//长的
        //定义一个常量
        int n = 0;
        //遍历
        for (int i = 0; i < s1.length(); i++) {
            for (int j =  s1.length();j > i; j--) {
                if (s2.contains(s1.substring(i,j))) {
                    n = j - i > n ? j - i : n;
                    continue;
                }
            }
        }
        System.out.println(n);
    }
}

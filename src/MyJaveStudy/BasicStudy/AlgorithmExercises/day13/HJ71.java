package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day13;

import java.util.Scanner;

/**
 * 描述：问题描述：在计算机中，通配符一种特殊语法，广泛应用于文件搜索、数据库、正则表达式等领域。现要求各位实现字符串通配符的算法。
 *
 * */
public class HJ71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String str1 = in.nextLine().toLowerCase();
            String str2 = in.nextLine().toLowerCase();
            str1 = str1.replaceAll("\\*{1,}", "[0-9A-Za-z]*");
            str1 = str1.replaceAll("\\?", "[0-9A-Za-z]{1}");
            boolean result = str2.matches(str1);
            System.out.println(result);
        }
    }
}

package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day7;

import java.util.Scanner;

/**
 * 给定一个仅包含小写字母的字符串，求它的最长回文子串的长度。
 * 所谓回文串，指左右对称的字符串。所谓子串，指一个字符串删掉其部分前缀和后缀（也可以不删）的字符串
 * 输入：输入一个仅包含小写字母的字符串
 * 输出：返回最长回文子串的长度
 * */
public class HJ85 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int max = 0;
        /**
         *双指针遍历找到最长子串
         */
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                String str = s.substring(i, j);
                if (isPalindromeString(str)) {
                    max = Math.max(max, j - i);
                }
            }
        }
        System.out.print(max);
    }

    /**
     *判断一个字符串是否是回文字符串的方法
     */
    static boolean isPalindromeString(String s) {
        return s.contentEquals(new StringBuilder(s).reverse());
    }
}

package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 字符匹配
 * 输入描述：
 *      第一行为空格分割的多个字符串，第二行为字符规律。
 * */
public class Test10 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        String reg = in.nextLine();
        System.out.println(getMatchStr(arr,reg));
    }

    private static String getMatchStr(String[] arr, String reg) {
        StringJoiner sj = new StringJoiner(",");
        for (int i = 0; i < arr.length; i++) {
            if (isMatch(arr[i],reg))
                sj.add(String.valueOf(i));
        }
        if (sj.length() == 0)
            return "-1";
        else
            return sj.toString();
    }

    private static boolean isMatch(String s, String p) {
        s = " " + s;
        p = " " + p;
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n][m];
        dp[0][0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (p.charAt(j) == '*'){
                    dp[i][j] = (j >= 2 && dp[i][j-2]) || (eq(p.charAt(j-1),s.charAt(i)) && i>= 1 && dp[i-1][j]);
                }else {
                    dp[i][j] = eq(p.charAt(j),s.charAt(i)) && i >= 1 && dp[i-1][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }

    private static boolean eq(char p,char s) {
        return p==s || p=='.';
    }
}

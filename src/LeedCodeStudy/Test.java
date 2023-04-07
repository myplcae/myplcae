package src.LeedCodeStudy;

import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //定义输入的两个数组和一个用来定义两个数组的差
            String s1 = sc.next();
            String s2 = sc.next();
            //定义输入的两串数
            int dp[][] = new int[s1.length() + 1][s2.length() + 1];
            dp[0][0] = 0;
            //遍历第一串数
            for (int i = 1; i < dp.length; i++) {
                dp[i][0] = i;
            }
            //遍历第二串数
            for (int i = 1; i < dp[0].length; i++) {
                dp[0][i] = i;
            }
            //两串数位数通过遍历的方式相减
            for (int i = 1; i < dp.length; i++) {
                for (int j = 1; j < dp[0].length; j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j - 1] + 1, Math.min(dp[i][j - 1] + 1,
                                dp[i - 1][j] + 1));
                    }
                }
            }
            System.out.println(dp[s1.length()][s2.length()]);
        }
    }
}
package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.Scanner;

/**
 * 字符串比较
 *  输入：输入三行：前两行为字符串，仅包含小写字符，第三行为整数
 *  输出：两个字符串的最大小于第三个输入的整数的连续子串的长度
 * */
public class Test3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int num = Integer.parseInt(in.nextLine());
        System.out.println(getSubstringlen(str1,str2,num));
    }

    private static int getSubstringlen(String str1, String str2, int num) {
        //定义常量
        int n = str1.length();
        //a,b字符串ASCII码值绝对值差距数组
        int[] preSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            preSum[i] = preSum[i-1] + Math.abs(str1.charAt(i-1)-str2.charAt(i-1));
        }
        int ans = 0;//定义最后要输出的值
        for (int l = 0; l <= n-1; l++) {
            for (int r = l+1; r <= n; r++) {
                if (preSum[r] - preSum[l] <=num){
                    ans = Math.max(ans,r-l);
                }
            }
        }
        return ans;
    }
}

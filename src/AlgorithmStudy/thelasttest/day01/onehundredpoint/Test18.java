package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Scanner;

/**
 * 输入：输入一个字符串仅包含大小写字母和数字，求字符串中包含的最长的非严格递增连续序列的长度，输入的字符串不超过255个字符
 * 输出：最长的非严格递增连续数字序列的长度
 * */
public class Test18 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(getIncstr(str));
    }

    private static int getIncstr(String str) {
        //先定义几个必要参数
        int l = 0,r = 0,maxlen = 0;
        while (r < str.length()){
            char c = str.charAt(r);
            if (c >= '0' && c <= '9'){
                if (l != r){
                    if (c >= str.charAt(r-1)){
                        maxlen = Math.max(maxlen,r-l+1);
                    }else {
                        maxlen = Math.max(maxlen,r-l);
                        l = r;
                    }
                    r++;
                }else {
                    maxlen = Math.max(maxlen,1);
                    r++;
                }
            }else {
                maxlen = Math.max(maxlen,r-l);
                r++;
                l = r;
            }
        }
        return maxlen;
    }
}

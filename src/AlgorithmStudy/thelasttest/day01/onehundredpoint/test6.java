package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Scanner;
import java.util.StringJoiner;

//小写比大写多则把所有大写字母转为小写，大写比小写多则把所有字母转为大写，如果大小写字母数相同则不做转换，第一个子串除外
public class test6 {
    static int[] fact;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();//子串长度
        String str = in.next();
        System.out.println(getResult(k, str));
    }

    private static String getResult(int k, String str) {
        String[] arr = str.split("-");//转成数组型方便拿到下标
        //第一个子串不处理
        StringJoiner sj = new StringJoiner("-");//定义一个stringjoin按位去截取输入的字符串
        sj.add(arr[0]);//第一个子串不处理直接添加进sj
        //剩余的子串重新添加进stringbuild并且处理
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++)
            sb.append(arr[i]);//添加输入的参数到stringbuilder
        String newStr = sb.toString();
        for (int i = 0; i < newStr.length(); i += k) {
            String substr = newStr.substring(i, Math.min(i + k, newStr.length()));
            sj.add(covert(substr));//cover函数对截取的字符串做题目要求的处理
        }
        return sj.toString();
    }
    //判断大小写字符那种更多，并且转换的方法
    private static String covert(String str) {
        int lowcount = 0;
        int upcount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z')
                lowcount++;
            else if (c >= 'A' && c <= 'Z')
                upcount++;
        }
        if (lowcount < upcount)
            return str.toUpperCase();
        else if (lowcount > upcount)
            return str.toLowerCase();
        else
            return str;
    }
}

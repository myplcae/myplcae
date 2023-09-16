package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day13;

import java.util.*;

/**
 * 通过字符串的api解析参数
 *      各个参数如下：
 *          参数1：命令字xcopy
 *          参数2：字符串/s
 *          参数3：字符串c:\\
 *          参数4: 字符串d:\\e
 *  规则：
 *      1.参数分隔符为空格
 *      2.对于用""包含起来的参数，如果中间有空格，不能解析为多个参数。注意输出参数时，需要将""去掉
 *      3.参数不定长
 *      4.输入由用例保证，不会出现不符合要求的输入
 * */
public class HJ74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!flag) {
                if (c == ' ') {
                    ans.add(sb.toString());
                    sb = new StringBuilder();
                } else if (c == '"') {
                    sb = new StringBuilder();
                    flag = true;
                } else {
                    sb.append(c);
                }
            } else {
                if (c == '"') {
                    ans.add(sb.toString());
                    sb = new StringBuilder();
                    flag = false;
                    i++;
                } else {
                    sb.append(c);
                }
            }
        }
        if (sb.length() > 0) ans.add(sb.toString());
        System.out.println(ans.size());
        for (String a : ans) {
            System.out.println(a);
        }
    }
}

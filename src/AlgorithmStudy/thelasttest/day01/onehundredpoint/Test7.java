package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//压缩字符串，超过两个相同的字母则压缩，例如：ddd压缩为3d,编写压缩函数和解压函数，不能压缩的返回！error
public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getResult(in.next()));
    }

    private static String getResult(String str) {
        String back_str = str;
        //只能包含字母和数字，否则非法输入
        if (!str.matches("[a-zA-Z0-9]+"))
            return "!error";
        //通过正则匹配如“4d”这种压缩过后的字符串
        Pattern pattern = Pattern.compile("(\\d+)([a-z])?");
        while (true){
            Matcher m = pattern.matcher(str);
            if (!m.find())
                break;
            //被替换的压缩子串
            String src = m.group();
            int repeat_times = Integer.parseInt(m.group(1));//查看字母出现的次数
            //超过两个相同的就压缩
            if (repeat_times < 3)
                return "!error";
            //异常情况
            String repeat_conent = m.group(2);
            if (repeat_conent == null)
                return "!error";
            //替换解压后的子串
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < repeat_times; i++)
                sb.append(repeat_conent);
            str = str.replace(src,sb.toString());
        }
        //解压字符串重新被压缩时，和输入的字符串不一致
        if (!compress(str).equals(back_str))
            return "!error";
        return str;
    }

    private static String compress(String str) {
        str += "-";
        StringBuilder ans = new StringBuilder();
        LinkedList<Character> stack = new LinkedList<>();
        int repeat = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (stack.size() == 0){
                stack.add(c);
                repeat++;
                continue;
            }
            char top = stack.getLast();
            if (top == c){
                repeat++;
                continue;
            }
            if (repeat >2){
                ans.append(repeat).append(top);
            }else {
                char[] tmp = new char[repeat];
                Arrays.fill(tmp,top);
                ans.append(new String(tmp));
            }
            stack.clear();
            stack.add(c);
            repeat = 1;
        }
        return ans.toString();
    }
}

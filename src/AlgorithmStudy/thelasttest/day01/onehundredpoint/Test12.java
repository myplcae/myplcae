package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Collections;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.TreeSet;

/**
 * 输入：英文单词和标点符号组成的句子，输入一个英文单词前缀
 * 输出：输出符合单词首字母的单词
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(getsentence(str1, str2));

    }

    private static String getsentence(String str1, String str2) {
        String[] tmp = str1.split("[^a-zA-Z]");
        TreeSet<String> set = new TreeSet<>();
        Collections.addAll(set,tmp);
        //StringJoiner
        StringJoiner sj = new StringJoiner(" ");
        set.stream().filter(s -> s.startsWith(str2)).forEach(sj::add);
        String ans = sj.toString();
        if (ans.length() > 0){
            return ans;
        }else {
            return str2;
        }
    }
}
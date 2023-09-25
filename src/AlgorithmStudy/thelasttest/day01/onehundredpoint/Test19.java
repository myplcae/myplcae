package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 输入描述：字符串，用空格分割的多个字符串，字母只考虑小写
 * 输出描述：含有相对开音节结构的子串个数
 * 重点：滑窗
 * */
public class Test19 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String[] words = in.nextLine().split(" ");
        System.out.println(getSyllable(words));
    }

    private static int getSyllable(String[] words) {
        //定义变量count
        int count = 0;
        //用正则匹配
        Pattern letter = Pattern.compile("[^a-z]");
        Pattern reg1 = Pattern.compile("[^aeiou][aeiou][^aeiour]e");
        Pattern reg2 = Pattern.compile("e[^aeiour][aeiou][^aeiou]");
        for (String word:words){
            Pattern reg = letter.matcher(word).find()?reg1:reg2;
            for (int i = 0; i <= word.length()-4; i++) {
                if (reg.matcher(word.substring(i,i+4)).find())
                    count++;
            }
        }
        return count;
    }
}

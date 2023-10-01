package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.Scanner;

/**
 * 输入两个字符串：S和L，判断S是否是L的有效子串
 * 判断规则：S的字符顺序应该在L中是一致的
 * 描述：输入两个字符串，都只能包含英文小写字母；
 *      输出S中最后一个有效字符在L中的位置
 * */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();//第一个字符串
        String str2 = in.nextLine();//第二个字符串
        System.out.println(getlen(str1,str2));
    }

    private static int getlen(String str1, String str2) {
        int i = 0,j = 0;
        while (i < str1.length() && j < str2.length()){
            if (str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            j++;
        }
        if (i == str1.length())
            return j-1;
        else
            return -1;
    }
}

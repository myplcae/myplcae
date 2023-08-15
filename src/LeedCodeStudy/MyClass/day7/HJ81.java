package src.LeedCodeStudy.MyClass.day7;

import java.util.Scanner;

/**
 * 描述：判断短字符串S中的所有字符是否在长字符串T中全部出现。
 * 输入：输入两个字符串。第一个为短字符串，第二个为长字符串。两个字符串均由小写字母组成。
 * 输出：如果短字符串的所有字符均在长字符串中出现过，则输出字符串"true"。否则输出字符串"false"。
 * */
public class HJ81 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        boolean flag = true;
        for (int i = 0; i < a.length(); i++) {
            if (b.indexOf(a.charAt(i)) == -1){
                System.out.println("false");
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("true");
        }
    }
}

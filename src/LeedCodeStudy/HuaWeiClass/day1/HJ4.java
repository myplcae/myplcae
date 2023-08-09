package src.LeedCodeStudy.HuaWeiClass.day1;

import java.util.Scanner;

/**
 * 字符串分隔输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；
 * •长度不是 8 整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入：连续输入字符串(每个字符串长度小于等于100)
 * 输出：。只输出八位，不足八位的用0填充
 * */
public class HJ4 {
    /**
     * 思路：使用substring进行分割
     * */
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.nextLine());
        while (s.length() > 8){
            System.out.println(s.substring(0,8));
            s = new StringBuilder(s.substring(8));
        }
        while (s.length() > 0 && s.length() < 8)
            s.append("0");
        System.out.println(s);
    }
}

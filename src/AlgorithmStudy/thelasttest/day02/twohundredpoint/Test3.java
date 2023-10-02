package src.AlgorithmStudy.thelasttest.day02.twohundredpoint;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 找最小数：给定一个正整数a，计算出新正整数b，b是a移除N位数字后的结果，需要b的值最小
 * 输入两个数，和要移除的字母的个数
 * 输出移除后的字符串
 * */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int num = Integer.parseInt(in.nextLine());
        System.out.println(getleastnum(str,num));
    }

    private static String getleastnum(String str, int num) {
        if (str.length() == num)
            return "0";
        int remainCount = str.length() - num;//剩余字符串长度
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            while (list.size() > 0 && num > 0 && list.getLast() > str.charAt(i)){
                list.removeLast();
                num--;
            }
            list.add(str.charAt(i));
        }
        while (list.size() > remainCount){
            list.removeLast();
        }
        while (list.getFirst() == '0' && list.size() != 1){
            list.removeFirst();
        }
        //输出结果
        StringBuilder sb = new StringBuilder();
        for (Character c : list)
            sb.append(c);
        return sb.toString();


    }
}

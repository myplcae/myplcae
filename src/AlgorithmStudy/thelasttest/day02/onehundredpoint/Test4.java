package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 计算最大乘积：给定一个元素类型为小写字符串的数组，请计算两个没有相同字符的元素的长度乘机的最大值
 * 如果没有合法的元素则返回0
 * 输入：输入一个半角逗号分割的小写字符串的数组，长度为2-100；字符串长度为0-50；
 * 输出：乘积的值
 * */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split(",");
        System.out.println(getproduct(strings));
    }

    private static int getproduct(String[] strings) {
        ArrayList<HashSet<Character>> list = new ArrayList<>();
        for (String s : strings) {
            HashSet<Character> set = new HashSet<>();
            for (char c : s.toCharArray())
                set.add(c);
            list.add(set);
        }
        int ans = 0;
        for (int i = 0; i < list.size(); i++) {
            HashSet<Character> a = list.get(i);
            for (int j = i+1; j < list.size(); j++) {
                HashSet<Character> b = list.get(j);
                if (Collections.disjoint(a,b)){
                    ans = Math.max(ans,strings[i].length()*strings[j].length());
                }
            }
        }
        return ans;
    }
}

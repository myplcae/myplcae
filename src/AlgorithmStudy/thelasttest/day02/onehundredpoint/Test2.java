package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 给定一个字符串检测其元音字符，输入其长度，如果找不到满足条件的元音字符则输出0
 * 输入：先输入一个数字代表预期的瑕疵度，然后输入一串字符串
 * 输出：输出一个整数，代表满足元音字符的子串长度
 * */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String s = in.next();
        System.out.println(getVowel(num,s));
    }

    private static int getVowel(int num, String s) {
        //先用字符集定义元音
        char[] chars = {'a','e','i','o','u','A','E','I','O','U'};
        //用HashSet添加元素
        HashSet<Character> set = new HashSet<>();
        for (char c : chars) {
            set.add(c);
        }
        //使用list去遍历添加元音字符
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i)))
                list.add(i);
        }
        //瑕疵度计算
        //先定义一些常量,ans是要输出的结果
        int ans = 0,n = list.size(),l = 0,r = 0,blem;
        while (r < n){
            if (r-l == list.get(r) - list.get(l)){
                blem = 0;
            }else {
                blem = list.get(r) - list.get(l) - (r - l);
            }
            if (blem > num){
                l++;
            } else if (blem < num) {
                r++;
            }else {
                ans = Math.max(ans,list.get(r) - list.get(l) + 1);
                r++;
            }
        }
        return ans;
    }
}

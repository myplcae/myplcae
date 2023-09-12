package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day10;

import java.util.*;

/**
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * */
public class HJ26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //初始化一个List接收字符串中的所有字母
        List<Character> list = new ArrayList<>();
        //初始化一个Map
        Map<Integer,Character> map = new HashMap<>();//为了记录字符的下标
        //转Character数组
        char[] chars = str.toCharArray();
        //装进数组
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            //判断是不是字母
            if ((ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <='z')){
                list.add(ch);//是字母的话就加到list
            }else {
                map.put(i,ch);
            }
        }
        list.sort(Comparator.comparingInt(Character::toLowerCase));
        StringBuilder sb = new StringBuilder();
        for (int i = 0,j = 0; i < str.length(); i++) {
            if (map.get(i) != null){
                sb.append(map.get(i));
            }else {
                sb.append(list.get(j++));
            }
        }
        System.out.println(sb);
    }
}

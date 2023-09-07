package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，
 * 则把出现次数最少的字符都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 输入：字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 * 输出：删除字符串中出现次数最少的字符后的字符串。
 *
 * getOrDefault:相同的K值记录一次，重复则加1
 * */
public class HJ23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HJ23 solution = new HJ23();

        while (in.hasNextLine()){
            String str = in.nextLine();
            String result = solution.delete(str);

            System.out.println(result);
        }

    }
    //删除出现次数最少的字符
    private String delete(String str) {

        //定义一个集合记录某个字符出现的次数
        Map<Character,Integer> map = new HashMap<>();
        //遍历存入map中

        for (char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //遍历这个map找出最小的一个key
        int min = Integer.MAX_VALUE;
        for (int times:map.values()) {
            min =Math.min(min,times);
        }
        //删除出现次数最少的字符
        StringBuilder sb = new StringBuilder();
        for (char c:str.toCharArray()){
            if (map.get(c) != min){
                sb.append(c);
            }
        }
        return sb.toString();
        }
}

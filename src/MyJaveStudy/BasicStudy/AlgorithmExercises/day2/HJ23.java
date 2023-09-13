package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day2;

import java.util.*;

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

        while (in.hasNext()){
            String str = in.nextLine();
            char[] chars = str.toCharArray();//转成char字符集
            //用hashMap去统计每种字符的数量
            HashMap<Character,Integer> map = new HashMap<>();
            //遍历添加进map
            for (char c : chars) {
                map.put(c,(map.getOrDefault(c,0) + 1));
            }
            //去找出现次数最少的字符，使用Collections
            Collection<Integer> times = map.values();
            Integer min = Collections.min(times);

            //replaceall替换该字符为空
            for (Character character : map.keySet()) {
                if (map.get(character) == min){
                    str = str.replaceAll(String.valueOf(character),"");
                }
            }
            System.out.println(str);
        }

    }
}

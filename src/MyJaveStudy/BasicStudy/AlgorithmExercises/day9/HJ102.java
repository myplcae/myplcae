package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 输入一个只包含小写英文字母和数字的字符串，按照不同字符统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASCII码由小到大排序输出。
 * 输入：一个只包含小写英文字母和数字的字符串。
 * 输出：一个字符串，为不同字母出现次数的降序表示。若出现次数相同，则按ASCII码的升序输出。
 * */
public class HJ102 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        // 注意 hasNext 和 hasNextLine 的区别
        while ((s = bf.readLine()) != null) { // 注意 while 处理多个 case
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),
                        0) + 1); //统计字符出现次数
            }
            ArrayList<Map.Entry> list = new ArrayList<>
                    (map.entrySet()); //把map放入list中。
            list.sort((o1, o2) -> {
                if (o1.getValue() !=
                        o2.getValue()) { //如果字符出现次数不同 按照出现次数从高到底
                    return (int) (o2.getValue()) - (int) (o1.getValue());
                } else { //若次数相同则对比ASCII的大小 按照升序排列
                    return (char) (o1.getKey()) - (char) (o2.getKey());
                }
            });
            //最后打印输出
            for (Map.Entry entry : list) {
                System.out.print(entry.getKey());
            }
            System.out.println();//换行 多组输入
        }
    }

}

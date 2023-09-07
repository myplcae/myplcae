package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 数据表记录包含表索引index和数值value（int范围的正整数），
 * 请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照index值升序进行输出。
 * 输入：先输入键值对的个数n（1 <= n <= 500）
 * 接下来n行每行输入成对的index和value值，以空格隔开
 * 输出：输出合并后的键值对（多行）
 * 思路：用map封装输入键值对参数再进行相同key的value相加
 * */
public class HJ8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>(size);
        for (int i = 0; i < size; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }
        for (Integer key : map.keySet()) {
            System.out.println( key + " " + map.get(key));
        }
    }

}

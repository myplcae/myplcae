package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.*;

/**
 * 全量和已占用字符集：输入一个字符串：包含@，@前为全量字符集，@后为已占用字符集
 * 已占用字符集中的字符一定是全量字符集中的字符；
 * 字符集中的字符跟字符间的字符使用英文逗号隔开；
 * 每个字符都表示为字符+数字的形式用英文冒号隔开；
 * 只允许英文字符，区分大小写；
 * 数字只考虑整数。不超过100；
 * 如果一个字符都没被占用，@标识仍然存在、
 * 输出描述：输出可用字符集；
 * 不同的输出字符集用回车换行，顺序要和输入一致，如果某个字符已全部被占用则不需要输出
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(getanswer(str));
    }

    private static String getanswer(String str) {
        String[][][] tmp = Arrays.stream(str.split("@"))
                .map(s1 -> Arrays.stream(s1.split(",")).map(s2 -> s2.split(":")).toArray(String[][]::new))
                .toArray(String[][][]::new);
        String[][] all = tmp[0];
        String[][] used = tmp[1];
        LinkedHashMap<String, Integer> allMap = new LinkedHashMap<>();
        for (String[] arr : all) {
            allMap.put(arr[0], Integer.parseInt(arr[1]));
        }
        HashMap<String, Integer> usedMap = new HashMap<>();
        for (String[] arr : used) {
            usedMap.put(arr[0], Integer.parseInt(arr[1]));
        }
        for (String key : usedMap.keySet()) {
            if (allMap.containsKey(key)) {
                int remain = allMap.get(key) - usedMap.get(key);
                if (remain > 0) {
                    allMap.put(key, remain);
                } else {
                    allMap.remove(key);
                }
            }
        }
        StringJoiner sj = new StringJoiner(",");
        for (Map.Entry<String, Integer> entry : allMap.entrySet()) {
            sj.add(entry.getKey() + ":" + entry.getValue());
        }
        return sj.toString();
    }
}

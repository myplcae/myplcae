package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * 现在有一种密码变换算法:
 * 九键手机键盘上的数字与字母的对应： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9,
 * 0--0，把密码中出现的小写字母都变成九键键盘对应的数字，如：a 变成 2，x 变成 9.而密码中出现的大写字母则变成小写之后往后移一位，
 * 如：X ，先变成小写，再往后移一位，变成了 y ，例外：Z 往后移是 a 。数字和其它的符号都不做变换。
 * 输入范围：1<= n <= 100
 *
 * 输入：输入一组密码，长度不超过100个字符。
 * 输出：输出密码变换后的字符串
 * */
public class HJ21 {

    //定义一个map来装配密码配置参数
    private static Map<String, String> map = new HashMap<>();

    //装参数
    static {
        map.put("1", "1");
        map.put("abc", "2");
        map.put("def", "3");
        map.put("ghi", "4");
        map.put("jkl", "5");
        map.put("mno", "6");
        map.put("pqrs", "7");
        map.put("tuv", "8");
        map.put("wxyz", "9");
        map.put("0", "0");
    }


    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] chars = str.toCharArray();
        //创建流塞到map里
        StringBuilder sb = new StringBuilder();
        //分辨大写
        for (char c : chars) {
            //如果是数字则不变
            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else if (c >= 'A' && c <= 'Y') {
                char newChar = (char) (c + 32 + 1);
                sb.append(newChar);
            } else if (c == 'Z') {
                sb.append('a');
            } else {
                Set<String> keys = map.keySet();
                for (String k : keys) {
                    if (k.contains(String.valueOf(c)))
                        sb.append(map.get(k));
                }
            }

        }
        System.out.println(sb);
    }
}

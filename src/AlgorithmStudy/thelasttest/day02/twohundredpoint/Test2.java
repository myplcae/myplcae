package src.AlgorithmStudy.thelasttest.day02.twohundredpoint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 比较两个版本号的大小：
 *  输入两个版本号，每个版本号由多个子串组成，子串之间用“.”隔开，由大小写字母，数字组成，并且至少有一个字符
 *      按照从左到右的顺序比较子版本号，规则如下：
 *              子版本号前面的0不用比较，小写>大写>数字
 *              空字符和0相等，比如1和1.0
 * */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(getVersion(str1, str2));
    }

    private static int getVersion(String str1, String str2) {
        String[] arr1 = convert(str1);
        String[] arr2 = convert(str2);
        int n = Math.max(arr1.length, arr2.length);
        for (int i = 0; i < n; i++) {
            String tmp1 = arr1.length > i ? arr1[i] : "0";
            String tmp2 = arr2.length > i ? arr2[i] : "0";
            try {
                int i1 = Integer.parseInt(tmp1);
                int i2 = Integer.parseInt(tmp2);
                if (i1 != i2)
                    return i1 > i2 ? 1 : -1;
            } catch (Exception e) {
                int res = tmp1.compareTo(tmp2);
                if (res != 0)
                    return res > 0 ? 1 : -1;
            }
        }
        return 0;
    }

    private static String[] convert(String version) {
        return Arrays.stream(version.split("\\.")).map(sub->{
            String s = sub.replaceAll("^0+","");
            return "".equals(s)?"0":s;
        }).toArray(String[]::new);
    }
}

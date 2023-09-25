package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.math.BigInteger;
import java.util.Scanner;

/**计算最小整数和
 * 输入：一个字符串：求这个字符串中所有的数字的最小和并输出
*/
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getResult(in.nextLine()));
    }

    private static String getResult(String s) {
        boolean flag = false;
        StringBuilder negative = new StringBuilder();
        BigInteger ans = new BigInteger("0");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c<= '9'){
                if (flag){
                    negative.append(c);
                }else {
                    ans = ans.add(new BigInteger(c +""));
                }
            }else {
                if (flag){
                    ans = ans.subtract(new BigInteger(negative.toString()));
                    negative = new StringBuilder();//stringBuild重置
                }
                flag = c == '-';//如果有负号直接出去
            }
        }
        if (negative.length() > 0){//有负数的计算方式直接把负号后面的变成一个数
            ans = ans.subtract(new BigInteger(negative.toString()));
        }
        return ans.toString();
    }
}

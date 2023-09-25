package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入：第一行输入由大小写字母组成的字符串
 *      第二行输入k，k必须大于0，k可以大于输入字符串的长度
 * 输出：输出字符串中第k个最小ASCII码值的字母所在的索引号
 *      如果k大于字符串长度则输出最大ASCII码值的字母所在位置的索引号
 *      如果第k个最小ASCII码值的字母存在重复则输出该字母的最小位置索引
 * */
public class Test15 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        System.out.println(getASC(str,k));
    }
    //找到索引号的方法
    private static int getASC(String str, int k) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//直接用Arrays的sort方法排序
        if (k > str.length())
            k = str.length();
        char ch = chars[k-1];//定义输入整数值的前一个位置为要求的值
        return str.indexOf(ch);
    }
}

package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day10;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *  密码验证合格程序
 *  要求：1.长度超过8位
 *       2.包括大小写字母.数字.其它符号,以上四种至少三种
 *       3.不能有长度大于2的包含公共元素的子串重复 （注：其他符号不含空格或换行）
 *  输入：一组字符串。
 *  输出：如果符合要求输出：OK，否则输出NG
 * */
@SuppressWarnings({"all"})
public class HJ20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//输入
        while (in.hasNext()){
            String str = in.nextLine();
            if (str.length() <= 8){
                System.out.println("NG");
                continue;
            }
            if (!checkString(str)){
                System.out.println("NG");
                continue;
            }
            if (!checksub(str)){
                System.out.println("NG");
                continue;
            }
            System.out.println("OK");
        }
    }
    //验证密码的方法1
    public static boolean checkString(String str){
        int[] arr = new int[4];//初始化一个数组声明有四种字符
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if ('A' <= c && c <= 'Z'){
                arr[0] = 1;
            } else if ('a' <=c && c<= 'z') {
                arr[1] = 1;
            } else if ('0' <=c && c <= '9') {
                arr[2] = 1;
            } else if (c != ' ' && c !='\n') {
                arr[3] = 1;
            }
        }
        int times = 0;
        for (int num : arr){
            times += num;
        }
        if (times > 2){
            return true;
        }else {
            return false;
        }
    }
    public static boolean checksub(String str){
        //使用Set集合去查看有没有相同的子串
        Set<String> set = new HashSet();
        for (int i = 0; i < str.length()-3; i++) {
            String substr = str.substring(i,i+3);
            if (set.contains(substr)){
                return false;
            }
            set.add(substr);
        }
        return true;
    }
}

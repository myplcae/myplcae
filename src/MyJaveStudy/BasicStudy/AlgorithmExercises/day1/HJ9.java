package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.Scanner;

/**
 * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 输入：输入一个int型整数
 * 输出：按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 * */
public class HJ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            String result = "";
            for (int i = a.length(); i >0 ; i--) {
                if (!result.contains(a.substring(i-1,i))){
                    result += a.substring(i-1,i);
                }
            }
            System.out.println(result);
        }
    }
}

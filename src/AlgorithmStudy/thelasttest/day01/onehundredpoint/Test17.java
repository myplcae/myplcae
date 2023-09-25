package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Scanner;

/**
 * 输入：一个url前缀和url后缀
 * 输出：拼接后的URl,用斜杠拼接
 * */
@SuppressWarnings({"all"})
public class Test17 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String[] arr = in.nextLine().split(",");
        //定义前后url
        String prefix = arr.length>0?arr[0] :"";
        String suffix = arr.length>1?arr[1] :"";
        String result = "/" + prefix+ "/"+suffix;
        System.out.println(result.replaceAll("/+","\\/"));
    }
}

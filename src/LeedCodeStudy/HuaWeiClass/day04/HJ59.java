package src.LeedCodeStudy.HuaWeiClass.day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 描述：找出字符串中第一个只出现一次的字符
 * 输入：输入一个非空字符串
 * 输出：输出第一个只出现一次的字符，如果不存在输出-1
 * 例：输入：asdfasdfo
 *    输出:o
 * */
public class HJ59 {
    //方法一
//    public static void main(String[] args) {
//        //输入
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String x = in.nextLine();
//            //信号量
//            int signal = 0;
//            //遍历输入的字符串
//            for (int i = 0; i < x.length(); i++) {
//                //判断每个字母是否出现第二次
//                if (x.indexOf(x.charAt(i)) == x.lastIndexOf(x.charAt(i))) {
//                    System.out.println(x.charAt(i));
//                    signal = 1;
//                    break;
//                }
//            }
//            //信号为零，则没有重复的字符串
//            if (signal == 0){
//                System.out.println(-1);
//            }
//            //读取一行则输入一个回车
//            System.out.println();
//        }
//    }
    //方法二
    public static void main(String[] args) throws IOException {
        //用BufferReader去查看输入的数组
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = bf.readLine()) != null){
            for (int i = 1;i < input.length();i++){
                char x = input.charAt(i);
                if (input.indexOf(x) == input.lastIndexOf(x)){
                    System.out.println(x);
                    break;
                }
                if (i == input.length() -1){
                    System.out.println(-1);
                }
            }
        }

    }
}

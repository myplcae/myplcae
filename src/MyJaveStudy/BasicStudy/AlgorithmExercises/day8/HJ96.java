package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 将一个字符串中所有的整数前后加上符号“*”，其他字符保持不变。连续的数字视为一个整数。
 * */
public class HJ96 {
    //1、正则
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()){
//            String str = in.nextLine();
//            System.out.println(str.replaceAll("([0-9]+)","*$1*"));
//        }
//    }
    //2、字符串遍历塞星号
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = bf.readLine()) != null){
            char[] c = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < c.length){
                if (c[i] >= '0' && c[i] <= '9'){
                    sb.append("*");
                    sb.append(c[i]);
                    while (++i < c.length && c[i] >= '0' && c[i] <= '9'){
                        sb.append(c[i]);
                    }
                    sb.append("*");
                }else {
                    sb.append(c[i]);
                    i++;
                }
            }
            System.out.println(sb.toString());
        }
    }
}

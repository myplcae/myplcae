package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Arrays;
import java.util.Scanner;

//IP地址和数字IP地址的转换
/**
 * getHexString
 * */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getResult(in.nextLine()));
    }

    public static String getResult(String sc) {
        try {
            //输入参数装载进数组进行条件判断
            Integer[] ip = Arrays.stream(sc.split("#")).map(Integer::parseInt).toArray(Integer[]::new);//正则获取IP地址的每一段数字
            if (ip.length != 4)//是不是有四段
                return "invalid IP";
            int p1 = ip[0], p2 = ip[1], p3 = ip[2], p4 = ip[3];
            if (p1 >= 0 && p1 <= 128 && p2 >= 0 && p2 <= 255 && p3 >= 0 && p3 <= 255 && p4 >= 0 && p4 <= 255) {//每一段的数字是不是在0-255内
                String tmp = getHexString(p1) + getHexString(p2) + getHexString(p3) + getHexString(p4);//用string去定义结果
                return String.valueOf(Long.parseLong(tmp, 16));
            } else {
                return "invalid IP";
            }
        }catch (Exception e){
            return "invalid IP";
        }
    }
    //转成10进制方法
    private static String getHexString(int num) {
        String tmp = Integer.toHexString(num);
        if (tmp.length() < 2)
            tmp = "0" + tmp;//不足的补0
        return tmp;
    }

}

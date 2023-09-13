package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day11;

import java.util.Scanner;

/**
 * 把ip地址的每一段转换为十进制的整数
 * 把整数转换为IP地址
 * */
@SuppressWarnings({"all"})
public class HJ33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ip地址
        String ipaddr = in.nextLine();
        //十进制ip
        String  ipNum = in.nextLine();
        //输出
        System.out.println(iptonum(ipaddr));
        System.out.println(numtoip(ipNum));
    }
    //IP地址转10进制
    public static Long iptonum(String ipaddr){
        String[] strs = ipaddr.split("\\.");
        StringBuilder sbi = new StringBuilder();
        StringBuilder sbn = new StringBuilder();

        for (String str : strs) {
            Integer num = Integer.parseInt(str);//转二进制
            String binary = Integer.toBinaryString(num);//转二进制串
            sbi = new StringBuilder(binary);
            while (sbi.length() != 8){
                sbi.insert(0,'0');//不足8位补0
            }
            sbn.append(sbi);
        }
        String binaryResult = sbn.toString();
        long result = Long.parseLong(binaryResult, 2);
        return result;
    }
    //十进制转IP地址
    public static String numtoip(String ipNum){
        Long num = Long.parseLong(ipNum);//转类型
        StringBuffer sb = new StringBuffer();
        String binary = Long.toBinaryString(num);
        sb = new StringBuffer(binary);
        while (sb.length() != 32){
            sb.insert(0,'0');
        }
        binary = sb.toString();
        sb = new StringBuffer();
        for (int i = 0; i < binary.length(); i+=8) {
            String temp = binary.substring(i,i+8);
            Integer number = Integer.parseInt(temp,2);
            if (i + 8 != 32){
                sb.append(number).append(".");
            }else {
                sb.append(number);
            }
        }
        return sb.toString();
    }
}

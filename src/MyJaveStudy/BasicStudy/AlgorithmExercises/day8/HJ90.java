package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day8;

import java.util.Scanner;

/**
 * 描述：IPV4地址可以用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此正号不需要出现）
 * 输入：输入一个ip地址，保证不包含空格
 * 输出：返回判断的结果YES or NO
 * */
public class HJ90 {

    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            //输入的字符串
            String a = in.next();
            //分割每一段
            String[] arr = a.split("\\.",-1);
            //初始化结果为true
            String result= "true";
            //开始判断：1、如果每一段都是四个字符则继续判断如果不是四个字符就直接返回false
            if (arr.length == 4){
                //遍历每一个输入的元素是否合法：包含只能为数字，不超过255不能以0开头等
                for (String str2:arr){
                    //每一段都不能超过三位数也不能为0
                    if (str2.length() == 0 || str2.length() > 3){
                        result = "NO";
                        break;
                    }
                    //字符规范判断
                    for (Character ch:str2.toCharArray()) {
                        if (!Character.isDigit(ch)){
                            result = "NO";
                            break;
                        }
                    }
                    //不能以0开头并且数字不能大于255
                    if (str2.charAt(0) == '0' && str2.length() != 1){
                        result = "NO";
                        break;
                    }
                    if (Integer.parseInt(str2) > 255){
                        result = "NO";
                        break;
                    }
                }
            }else {
                result = "NO";
            }
            System.out.println(result);
        }
    }
}

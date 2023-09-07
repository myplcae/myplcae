package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day4;

import java.util.Scanner;

/**
 * 描述：一个 DNA 序列由 A/C/G/T 四个字母的排列组合组成
 * */
public class HJ63 {
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String a = in.nextLine();
            int b = in.nextInt();
            System.out.println(getGC(a,b));
        }
    }

    private static String getGC(String a, int b) {
        //先定义一些需要的参数
        int maxnumber = 0;//GC字母数
        int start = 0;//初始位置
        //开始遍历输入的字符串来定位
        for (int i = 0; i < a.length(); i++) {
            int number = 0;
            for (int j = 0; j < i+b; j++) {
                //判断GC
                if (a.charAt(j) == 'C' || a.charAt(j) ==  'G'){
                    number++;
                }
            }
            if (number <maxnumber){
                start = i;
                maxnumber = number;
                //获取最后的字符串
                if (number == b){
                    return a.substring(start,start+b);
                }
            }
        }
        return a.substring(start,start+b);
    }

}

package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day9;

import java.util.Scanner;

/**
 * 输入 n 个整型数，统计其中的负数个数并求所有非负数的平均值，结果保留一位小数，如果没有非负数，则平均值为0
 * 本题有多组输入数据，输入到文件末尾。
 * 输入：输入任意个整数，每行输入一个。
 * 输出：输出负数个数以及所有非负数的平均值
 * */
public class HJ105 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int temp = 0;
        int countN = 0;
        int countP = 0;
        double sum = 0.0;
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            temp = in.nextInt();
            if(temp<0){
                countN++;
            }else if(temp>0){
                countP++;
                sum += temp;
            }
        }
        System.out.println(countN);
        if(countP==0){
            System.out.printf("0.0");
        }else{
            System.out.printf("%.1f\n",sum/countP);
        }
    }
}

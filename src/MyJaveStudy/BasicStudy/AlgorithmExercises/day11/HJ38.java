package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day11;

import java.util.Scanner;

/**
 * 假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半; 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？
 * 输入：输入起始高度，int型
 * 输出：分别输出第5次落地时，共经过多少米以及第5次反弹多高。
 *      注意：你可以认为你输出保留六位或以上小数的结果可以通过此题。
 * */
public class HJ38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //起始高度
        int high = in.nextInt();
        //直接结算五次，要转类型
        double length = high + high/2.0d*2 +high/4.0d*2 + high/8.0d*2 + high/16.0d*2;
        //第五次反弹的高度
        double higtlength = high/32.0d;

        System.out.println(length);
        System.out.println(higtlength);
    }
}

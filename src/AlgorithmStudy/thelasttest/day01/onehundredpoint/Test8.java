package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

//输入矩阵的长和宽
//输入矩阵
//输出矩阵的最大值
//描述：矩阵的每一行的值代表一个二进制的值，所有行相加代表矩阵的最大值
public class Test8 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a = Integer.parseInt(in.nextLine());
        //定义一个参数用来存结果值
        int result = 0;
        for (int i = 0; i < a; i++) {
            //用一个数组装配输入的矩阵的每一行
            LinkedList<Integer> dq = Arrays.stream(in.nextLine().split(","))
                                     .map(Integer::parseInt).collect(Collectors.toCollection(LinkedList::new));
            int max = getVal(dq);
            for (int j = 0; j < a; j++) {
                dq.addFirst(dq.removeLast());
                max = Math.max(max,getVal(dq));
            }
            result += max;
        }
        System.out.println(result);
    }

    private static int getVal(LinkedList<Integer> dq) {
        StringBuilder sb = new StringBuilder();
        for (Integer v : dq)
            sb.append(v);
        return Integer.parseInt(sb.toString(),2);//转成二进制
    }
}

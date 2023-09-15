package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day3;

import java.util.Scanner;

//输出单向链表的第k个节点
public class HJ51 {
    public static void main(String[] args) {
        //定义一个键盘输入扫描器，用于键盘输入数据
        Scanner sc = new Scanner(System.in);
        //当还有输入的时候
        while (sc.hasNext()){
            //输入一个整数，记录节点个数
            int nodeNum = Integer.parseInt(sc.nextLine());
            //定义节点的内容
            String s = sc.nextLine();
            //定义输入倒数第几个节点的内容
            int out = Integer.parseInt(sc.nextLine());
            //将节点以空格分隔开
            String[] split = s.split("\\s+");
            //输出倒数第几个节点
            System.out.println(split[nodeNum - out]);
        }
    }
}

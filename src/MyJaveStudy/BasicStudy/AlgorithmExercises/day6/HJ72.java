package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day6;

import java.util.Scanner;

/**
 * 100块买鸡：公鸡五块，母鸡三块、雏鸡一块，一百块买这三种鸡有哪几种购买方式
 * */
public class HJ72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            for(int x = 0;x<=14;x++){
                if ((100-7*x)%4 == 0){
                    int y = (100-7*x)/4;
                    int z = 100-x-y;
                    System.out.println(x+" "+y+" "+z);
                }
            }
        }
    }
}

package src.LeedCodeStudy.HuaWeiClass.easy.day3;

import java.util.Scanner;

public class HJ55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int xx = 0;
        for (int i = 1; i <=x;i++){
            if (String.valueOf(i).contains("7")){
                xx++;
            }else {
                if (i % 7 == 0){
                    xx++;
                }
            }
        }
        System.out.println(xx);
    }
}

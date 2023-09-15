package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day12;

import java.util.Scanner;

/**
 * 输入说明：
 * 1 输入歌曲数量
 * 2 输入命令 U或者D
 * 输出说明
 * 1 输出当前列表
 * 2 输出当前选中歌曲
 * 思路：滑动窗口
 * */
public class HJ64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String commands = in.next();
        char[] c = commands.toCharArray();
        //光标
        int index = 1;

        //判断情况
        if (num <= 4){
            for (char ch : c) {
                if (ch == 'U'){
                    if (index  == 1){
                        index  = num;
                    }else {
                        index--;
                    }
                }else {
                    if (index == num){
                        index = 1;
                    }else {
                        index++;
                    }
                }
            }
            for (int i = 1; i <= num; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else {
            //屏幕上下界
            int start = 1;
            int end = 4;
            for (char ch : c) {
                if (ch == 'U'){
                    if (index == 1){
                        index = num;
                        end = num;
                        start = end - 3;
                    }else {
                        index--;
                        if (index < start){
                            start--;
                            end--;
                        }
                    }
                }else {
                    if (index == num){
                        index = 1;
                        start = 1;
                        end = start + 3;
                    }else {
                        index++;
                        if (index > end){
                            end++;
                            start++;
                        }
                    }
                }
            }
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println(index);
    }
}

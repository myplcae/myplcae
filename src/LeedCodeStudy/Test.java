package src.LeedCodeStudy;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            String s1 = in.next();
            String s2 = in.next();
            //定义数组保存两串数
            int arr[][] = new int[s1.length()+1][s2.length()+1];
            //遍历相减
            for(int i = 1;i<arr.length;i++){
                arr[i][0] = i;
            }
            for(int i = 1;i<arr.length;i++){
                arr[0][i] = i;
            }
            //遍历相减
            for(int i =1;i < arr.length;i++){
                for(int j = 1;j<arr[0].length;j++){
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        arr[i][j] = arr[i-1][j-1];
                    }else{
                        arr[i][j] = Math.min(arr[i-1][j-1]+1,Math.min(arr[i][j-1]+1,arr[i-1][j+1]));
                    }
                }
            }
            System.out.println(arr[s1.length()][s2.length()]);
        }
    }
}
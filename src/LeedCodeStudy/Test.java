package src.LeedCodeStudy;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            int m = a.length();
            int n = b.length();
            int[][] arr = new int[m+1][n+1];
            int maxlength = 0;
            int maxl = 0,maxj = 0;
            for(int i = 0;i <= m; i++){
                for(int j = 1;j<=n;j++){
                    if(a.charAt(i-1) == b.charAt(j-1)){
                        arr[i][j] = 1 + arr[i-1][j-1];
                        if(arr[i][j] > maxlength){
                            maxlength =  arr[i][j];
                            maxl = i;
                            maxj = j;
                        }else if(arr[i][j] == maxlength){
                            if(m < n && maxl >i || n< m && maxj >j){
                                maxl = i;
                                maxj = j;
                            }
                        }
                    }
                }
            }
            System.out.println(a.substring(maxl-maxlength,maxl));

        }
    }
}
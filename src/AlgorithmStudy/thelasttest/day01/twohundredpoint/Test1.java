package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.Scanner;

/**
 * 输入描述：输入的第一行矩阵的行数和列数，接下来的n行为矩阵元素，元素间用","分割
 * 输出：输出一个整数，表示矩阵中最长位置相连的男生个数
 * */
public class Test1 {
    static int n;
    static int m;
    static String[][] matrix;
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in).useDelimiter("[,\n]");//输入且换行
        n = in.nextInt();
        m = in.nextInt();
        matrix = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.next();
            }
        }
        System.out.println(getNumboy());
    }

    private static int getNumboy() {
        int ans = 0;//常量
        int[][] offsets = {{0,1},{1,0},{1,1},{1,-1}};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ("M".equals(matrix[i][j])){
                    for (int[] offset: offsets){
                        int oldI = i-offset[0];
                        int oldJ = j-offset[1];
                        if (oldI >=0 && oldI < n && oldJ >=0 && oldJ < m && "M".equals(matrix[oldI][oldJ])){
                            continue;
                        }
                        int len = 1;
                        int newI = i + offset[0];
                        int newJ = i + offset[1];
                        while (newI >= 0 && newI < n && newJ >=0 && newJ < m && "M".equals(matrix[newI][newJ])){
                            len++;
                            newI += offset[0];
                            newJ += offset[1];
                        }
                        ans = Math.max(ans,len);
                    }
                }
            }
        }
        return ans;
    }
}

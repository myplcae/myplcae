package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ53 {
    //提交代码会内存溢出，应该是计算过程中产生了大量的无效计算
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()){
//            int N = in.nextInt();
//            int yh[][] = new int[N+1][2*N];
//            yh[1][1] = 1;
//            for (int i=1;i<=N;i++){
//                for (int j=1;j<=2*N-1;j++){
//                    for (int k = j-2;k<=j;k++){
//                        if (k<1|| k>(2*(i-1)-1)){
//                            continue;
//                        }
//                        yh[i][j] +=yh[i-1][k];
//                    }
//                }
//            }
//            int result = -1;
//            for (int m=1;m<=2*N-1;m++){
//                if (yh[N][m] % 2 == 0){
//                    result = m;
//                    break;
//                }
//            }
//            System.out.println(result);
//        }
//    }
    //大佬的方法
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null) {
            int n = Integer.parseInt(str);
            int res = -1;
            switch((n - 2)%4){
                case 1: res = 2;break;
                case 2: res = 3;break;
                case 3: res = 2;break;
                case 0: res = 4;break;
            }
            if(n <= 2) res = -1;
            System.out.println(res);
        }

    }
}



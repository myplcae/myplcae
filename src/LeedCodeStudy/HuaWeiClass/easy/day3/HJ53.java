package src.LeedCodeStudy.HuaWeiClass.easy.day3;

import java.util.Scanner;

public class HJ53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int N = in.nextInt();
            int yh[][] = new int[N+1][2*N];
            yh[1][1] = 1;
            for (int i=1;i<=N;i++){
                for (int j=1;j<=2*N-1;j++){
                    for (int k = j-2;k<=j;k++){
                        if (k<1|| k>(2*(i-1)-1)){
                            continue;
                        }
                        yh[i][j] +=yh[i-1][k];
                    }
                }
            }
            int result = -1;
            for (int m=1;m<=2*N-1;m++){
                if (yh[N][m] % 2 == 0){
                    result = m;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}



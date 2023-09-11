package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入的第 1 行，为两个正整数N，m，用一个空格隔开：
 * （其中 N （ N<32000 ）表示总钱数， m （m <60 ）为可购买的物品的个数。）
 * 从第 2 行到第 m+1 行，第 j 行给出了编号为 j-1 的物品的基本数据，每行有 3 个非负整数 v p q
 * （其中 v 表示该物品的价格（ v<10000 ）， p 表示该物品的重要度（ 1 ~ 5 ）， q 表示该物品是
 * 主件还是附件。如果 q=0 ，表示该物品为主件，如果 q>0 ，表示该物品为附件， q 是所属主件的编号）
 * 输出： 输出一个正整数，为张强可以获得的最大的满意度。
 * */
public class HJ16 {
    public static int dw=100;
    public static void main(String[] args) throws IOException {
        boolean flag=true;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        //总钱数
        int N = Integer.parseInt(arr[0]);
        //可购买物品个数
        int m = Integer.parseInt(arr[1]);
        Good[] A = new Good[m+1];
        //存数据进数组
        for (int i = 1; i <= m; i++) {
            arr = bf.readLine().split(" ");
            int v = Integer.parseInt(arr[0]);//存价格到数组
            int p = Integer.parseInt(arr[1]);//存重要度到数组
            int q = Integer.parseInt(arr[2]);//存是否主件附件到数组
            if (flag){
                if (v*dw !=0){
                    flag = false;
                    dw = 10;
                    for (int j = 1; j < i; j++)
                        A[i].setV(A[j].v*10);
                    }
                }
            v = v/dw;
            if (A[i] != null){
                A[i].setV(v);
                A[i].setP(p);
                A[i].setQ(q);
            }else {
                A[i] = new Good(v,p,q);
            }
            if (q>0){
                if (A[q] == null){
                    A[q] = new Good();
                }
                if (A[q].a1 == 0){
                    A[q].setA1(i);
                }else {
                    A[q].setA2(i);
                }
            }
            }
        N = N/dw;
        dp(N,A);
        }
    public static void dp(int N, Good[] A) {
        int[][] dp = new int[N+1][A.length];
        for (int i = 1; i < A.length; i++) {
            int v=-1,v1=-1,v2=-1,v3=-1,tempdp=-1,tempdp1=-1,tempdp2=-1,tempdp3=-1;
            v = A[i].v;
            tempdp = v*A[i].p;
            if (A[i].a1 !=0 && A[i].a2 !=0){
                v3 = v+A[A[i].a1].v+A[A[i].a2].v;
                tempdp3 = tempdp+A[A[i].a1].v*A[A[i].a1].p + A[A[i].a2].v*A[A[i].a2].p;
            }
            if (A[i].a1 != 0){
                v1 = v+A[A[i].a1].v;
                tempdp1 = tempdp + A[A[i].a1].v*A[A[i].a1].p;
            }
            if (A[i].a2 !=0){
                v2 = v + A[A[i].a2].v;
                tempdp2 = tempdp + A[A[i].a2].v*A[A[i].a2].p;
            }
            for (int j = 1; j < N+1; j++) {
                if (A[i].q > 0) {
                    dp[j][i] = dp[j][i - 1];
                }else {
                    if (j >= v && v!=-1)
                        dp[j][i] = Math.max(dp[j][i],dp[j-v][i-1]+tempdp);
                    if (j>=v1 && v1!=-1)
                        dp[j][i] = Math.max(dp[j][i],dp[j-v1][i-1] + tempdp1);
                    if (j >= v2 && v2 != -1)
                        dp[j][i] = Math.max(dp[j][i],dp[j-v2][i-1] + tempdp2);
                    if (j >= v3 && v3 != -1)
                        dp[j][i] = Math.max(dp[j][i],dp[j-v3][i-1] + tempdp3);
                }
            }
        }
        System.out.println(dp[N][A.length-1]*dw);
    }
}

//商品类
class Good {
    int v;
    int p;
    int q;
    int a1=0;
    int a2=0;
    Good(int v,int p,int q){
        this.v=v;
        this.p=p;
        this.q=q;
    }
    Good(){}
    public void setV(int v){
        this.v=v;
    }
    public void setP(int p){
        this.p=p;
    }
    public void setQ(int q){
        this.q=q;
    }
    public void setA1(int a1){
        this.a1=a1;
    }
    public void setA2(int a2){
        this.a2=a2;
    }
}
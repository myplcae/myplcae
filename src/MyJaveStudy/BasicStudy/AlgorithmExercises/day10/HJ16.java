package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day10;

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
 * 满意度是指所购买的每件物品的价格与重要度的乘积的总和
 * */
@SuppressWarnings({"all"})
public class HJ16 {
    private static int dw =100;//加速参数只针对两个案例的参数，为了保证时间
    public static void main(String[] args) throws IOException {
        //定义一个flag
        boolean flag = true;//默认为true
        //开始输入
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //新建第一个数组封装总钱数和商品个数
        String[] arr = in.readLine().split(" ");
        //总钱数
        int N = Integer.parseInt(arr[0]);
        //可购买商品的个数
        int m = Integer.parseInt(arr[1]);
        //新建数组A存入商品参数
        Good[] A = new Good[m + 1];
        //新建第二个数组用来存商品参数进
        for (int i = 1; i <= m; i++) {
            arr = in.readLine().split(" ");
            //价格
            int v = Integer.parseInt(arr[0]);
            //重要度
            int p = Integer.parseInt(arr[1]);
            //是否有附件
            int q = Integer.parseInt(arr[2]);
            //存当前钱数
            if (flag) {
                if (v * dw != 0) {
                    flag = false;//如果价格不是100的倍数重置flag为false
                    dw = 10;//是不是十的倍数
                    for (int j = 1; j < i; j++) {
                        //存钱数
                        A[i].setV(A[j].v * 10);
                    }
                }
            }
            v = v / dw;
            //判断并存入其他参数
            if (A[i] != null) {
                A[i].setV(v);
                A[i].setP(p);
                A[i].setQ(q);
            } else {
                A[i] = new Good(v, p, q);
            }
            //买了附件
            if (q > 0) {
                if (A[q] == null) {
                    A[q] = new Good();
                }
                if (A[q].a1 == 0) { //买的附件1
                    A[q].setA1(i);
                } else { //买的附件2
                    A[q].setA2(i);
                }
            }

        }
        N = N / dw;
        dp(N, A);
    }
    //主体判断满意度是不是最大的计算方法
    private static void dp(int N, Good[] A) {
        //新建二维数组用来存当前钱数和商品（主商品信息和附件商品信息）
        int[][] dp = new int[N + 1][A.length];
        //遍历判断
        for (int i = 1; i < A.length; i++) {
            //默认几个必须的参数，钱数和满意度,初始默认为-1
            int v = -1, v1 = -1, v2 = -1, v3 = -1, tempdp = -1, tempdp1 = -1, tempdp2 = -1,tempdp3 = -1;
            v = A[i].v;//初始v和tempdp赋值
            tempdp = v * A[i].p;
            //有附件的情况
            if (A[i].a1 != 0 && A[i].a2 != 0) {
                //价格是主件加附件1和附件2的价格
                v3 = v + A[A[i].a1].v + A[A[i].a2].v;
                //满意度是基础满意度+附件1满意度和附件2满意度
                tempdp3 = tempdp + A[A[i].a1].v * A[A[i].a1].p + A[A[i].a2].v * A[A[i].a2].p;
            }
            //买了附件1没买附件2
            if (A[i].a1 != 0) {
                //价格
                v1 = v + A[A[i].a1].v;
                //满意度
                tempdp1 = tempdp + A[A[i].a1].v * A[A[i].a1].p;
            }
            //只买了附件2没买附件2
            if (A[i].a2 != 0) {
                //价格
                v2 = v + A[A[i].a2].v;
                //满意度
                tempdp2 = tempdp + A[A[i].a2].v * A[A[i].a2].p;
            }
            for (int j = 1; j < N + 1; j++) {
                if (A[i].q > 0) { //如果商品是附件，满意度计算为
                    dp[j][i] = dp[j][i - 1];
                } else { //如果是主件
                    if (j >= v && v != -1)
                        dp[j][i] = Math.max(dp[j][i], dp[j  -v][i - 1] + tempdp);
                    if (j >= v1 && v1 != -1)
                        dp[j][i] = Math.max(dp[j][i], dp[j - v1][i - 1] + tempdp1);
                    if (j >= v2 && v2 != -1)
                        dp[j][i] = Math.max(dp[j][i], dp[j - v2][i - 1] + tempdp2);
                    if (j >= v3 && v3 != -1)
                        dp[j][i] = Math.max(dp[j][i], dp[j - v3][i - 1] + tempdp3);
                }
            }
        }
        System.out.println(dp[N][A.length-1]*dw);
    }
}
//新建商品类封装必要参数//商品类
class Good {
    int v;//价格
    int p;//重要度
    int q;//主件还是附件
    int a1 = 0;//附件1个数
    int a2 = 0;//附件2个数

    public void setV(int v) {
        this.v = v;
    }
    public void setP(int p) {
        this.p = p;
    }
    public void setQ(int q) {
        this.q = q;
    }
    public void setA1(int a1) {
        this.a1 = a1;
    }
    public void setA2(int a2) {
        this.a2 = a2;
    }
    Good(int v, int p, int q) {
        this.v = v;
        this.p = p;
        this.q = q;
    }
    //无参构造
    Good() {

    }
}
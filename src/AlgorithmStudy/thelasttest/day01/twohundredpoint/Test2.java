package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.Scanner;

/**
 * 输入描述：一行数据，表示二维数组的行，逗号分割，保证每行字符串的字符数一样
 *  输出描述：返回初始最少需要发生广播站的个数
 *  并查集
 * */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] matrix = in.nextLine().split(",");
        System.out.println(getBroadcastnum(matrix));
    }

    private static int getBroadcastnum(String[] matrix) {
        int n = matrix.length;//定义二维数组大小
        //定义并查集
        UnionFindSet ufs = new UnionFindSet(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i].charAt(j) == '1'){
                    ufs.union(i,j);
                }
            }
        }
        return ufs.count;
    }
}
class UnionFindSet{
    int[] fa;
    int count;
    //有参构造
    public UnionFindSet(int n){
        this.fa = new int[n];
        for (int i = 0;i < n;i++)
            fa[i] = i;
        this.count = n;
    }
    //寻找满足条件的广播站个数
    public int find(int x){
        if (x != this.fa[x]){
            this.fa[x]  = this.find(this.fa[x]);
            return this.fa[x];
        }
        return x;
    }
    //坐标函数
    public void union(int x,int y){
        int x_fa = this.find(x);
        int y_fa = this.find(y);
        if (x_fa != y_fa){
            this.fa[y_fa]  = x_fa;
            this.count--;
        }
    }
}

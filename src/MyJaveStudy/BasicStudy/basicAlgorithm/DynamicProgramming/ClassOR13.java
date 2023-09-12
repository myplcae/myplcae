package src.MyJaveStudy.BasicStudy.basicAlgorithm.DynamicProgramming;

import java.util.Arrays;

/**
 * 对于一个数字序列，请设计一个复杂度为O(nlogn)的算法，返回该序列的最长上升子序列的长度，
 * 这里的子序列定义为这样一个序列U1，U2...，其中Ui < Ui+1，且A[Ui] < A[Ui+1]。
 * 给定一个数字序列A及序列的长度n，请返回最长上升子序列的长度。
 * */
public class ClassOR13 {
    public int findLongest(int[] A, int n) {
        // write code here
        int dp[] = new int[4];
        Arrays.fill(dp,1);
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0){
                dp[i] = 1;
                continue;
            }
            int temp = 1;//用一个临时变量去找值
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]){
                    temp = Math.max(dp[j] +1,temp);
                }
            }
            dp[i] = temp;
            maxCount = Math.max(temp,maxCount);
        }
        return maxCount;
    }
}

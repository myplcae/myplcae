package src.MyJaveStudy.BasicStudy.basicAlgorithm.DynamicProgramming;
//进阶版
@SuppressWarnings({"all"})
public class ClassOR13Plus {
    public int findLongest(int[] A, int n) {
        int[] dp = new int[n+1];
        int length = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0){
                dp[i+1] = A[i];
                length++;
            }
            int low = 1;
            int higt = length;
            int num = A[i];
            int temp = 0;
            while (low <=higt){
                int mid = (low + higt)/2;
                if (dp[mid] < num){
                    low = mid + 1;
                }else {
                    if (mid == 1 || dp[mid -1] < num){
                        temp = mid;
                        break;
                    }
                    higt = mid - 1;
                }
            }
            if (temp == 0){
                length++;
                dp[length] = num;
            }else {
                dp[temp] = num;
            }
        }
        return length;
    }
}

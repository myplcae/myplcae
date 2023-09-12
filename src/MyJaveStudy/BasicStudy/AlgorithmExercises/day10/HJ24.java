package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day10;

import java.util.*;

/**
 * 用例两行数据，第一行是同学的总数 N ，第二行是 N 位同学的身高，以空格隔开;最少需要几位同学出列
 * 能找到一个同学，他的两边的同学身高都依次严格降低的队形就是合唱队形。
 * */
public class HJ24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //新建一个list去存输入的参数
        List<Integer> list = new ArrayList<>();
        while (in.hasNext()){
            int a = in.nextInt();
            list.add(a);
        }
        //新建一个数组
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        getDp(list,arr,n);

        Collections.reverse(list);
        int[] arrback = new int[n];
        Arrays.fill(arrback,1);
        getDp(list,arrback,n);

        int maxCount = 1;
        for (int i = 0; i < n; i++) {
            int num = arr[i] + arrback[n-1-i];
            maxCount = Math.max(num,maxCount);
        }
        System.out.println(n-maxCount+1);
    }
    //用来计算合唱队形的方法
    public static void getDp(List<Integer> list,int arr[],int n){
        for (int i = 0; i < n; i++) {
            if (i == 0){
                arr[i] = 1;
                continue;
            }
            int temp = 1;
            for (int j = 0; j < i; j++) {
                if (list.get(i) > list.get(j)){
                    temp = Math.max(temp,arr[j]+1);
                }
            }
            arr[i] = temp;
        }
    }
}

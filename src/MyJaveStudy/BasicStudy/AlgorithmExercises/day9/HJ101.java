package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * 输入：第一行输入数组元素个数
 *      第二行输入待排序的数组，每个数用空格隔开
 *      第三行输入一个整数0或1。0代表升序排序，1代表降序排序
 * 输出：输出排好序的数字
 * */
public class HJ101 {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = in.nextInt();
            }
            int flag = in.nextInt();
            Arrays.sort(arr);
            if (flag == 0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }else {
                for (int i = arr.length-1;i>=0; i--) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}

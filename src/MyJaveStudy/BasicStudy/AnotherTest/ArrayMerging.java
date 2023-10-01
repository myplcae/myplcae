package src.MyJaveStudy.BasicStudy.AnotherTest;

import java.util.Arrays;
import java.util.Scanner;

//数组合并
public class ArrayMerging {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] arrA = new int[a];
        int[] arrB = new int[b];
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = in.nextInt();
        }
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = in.nextInt();
        }
        //System.out.println(findMedianSortedArrays(arrA, arrB));
    }




}

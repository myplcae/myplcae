package src.MyJaveStudy.BasicStudy.basicAlgorithm;

import java.util.Arrays;

//堆排序
public class HeapSort {
    public static void main(String[] args) {
        int[] arr ={34,26,89,17,54,67,2,11,73,26,47};
        System.out.println("排序前的数组为：" + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("排序后的数组为:" + Arrays.toString(arr));
    }
    //主体方法代码
    private static void  sift(int[] arr,int low,int hight){
        int k = low;
        while (k * 2 + 1 <= hight){
            int biggerIndex = 2*k+1;//保证子节点中大的元素的值的下标
            if (biggerIndex < hight){
                if (arr[biggerIndex] < arr[biggerIndex + 1]){
                    biggerIndex++;
                }
            }
            //如果k节点的值小于其较大子节点的值
            if (arr[k] < arr[biggerIndex]){
                swap(arr,k,biggerIndex);
                //将biggerIndex的值赋给k，保证下一次循环子树也是一个大根堆
                k = biggerIndex;
            }else {
                break;
            }
        }
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    //对数组排序
    public static void heapSort(int[] arr){
        //1、建堆
        for (int i = (arr.length-2)/2; i >=0 ; i--) {
            sift(arr,i, arr.length-1);
        }
        //2、排序
        for (int i = 0; i < arr.length-1; i++) {
            //交换堆顶和最后一个元素
            swap(arr,0, arr.length-1-i);
            //System.out.println("建堆出来的数组为：" + Arrays.toString(arr));
            //重新建堆
            sift(arr,0, arr.length-2-i);
        }
    }
}

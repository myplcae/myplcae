package src.MyJaveStudy.BasicStudy.basicAlgorithm.SimpleSort;

import java.util.Arrays;

//归并排序
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,0,1,9,2,6,3,8,5,4};
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //外部方法
    public void mergeSort(int[] arr){
        //1、在外壳方法中，首先创建一个待排序得数组等长临时空间
        int[] temp = new int[arr.length];
        //2、直接第一次调用，并且对整体数组进行排序，并传递临时空间数组
        mergeSortInner(arr,0,arr.length-1,temp);

    }
    //这里得核心是二分排序
    private void mergeSortInner(int[] arr,int start,int end,int[] temp){
        //1、判断出口：如果待排序数组得空间长度大于1，那么继续2分排序
        if (end - start >= 1){
            //3、执行递归调用，对待排序部分分成左右两部分，分别递归进行排序，保证左右两部分区间内得元素有序
            int middle = (start + end)/2;//操作区间中值下标
            mergeSortInner(arr, start, middle, temp);//左边部分递归调用
            mergeSortInner(arr,middle+1, end, temp);//右边部分得递归调用
            //4、保证左右两部分元素有序之后合并左右两部分元素
            //4.1 将arr中指定空间范围内，左右两边得元素拷贝到临时数组temp中
            for (int i = start; i <= middle; i++) {//拷贝左半部分到temp中
                    temp[i] = arr[i];
            }
            for (int i = middle+1; i <= end; i++) {//拷贝右边部分边temp中
                    temp[i] = arr[i];
            }
            //4.2 执行有序数组合并操作
            int left = start;//操作左边有序数组得下标
            int right = middle+1;//操作右边有序数组的下标
            int result = start;//操作结果数组array存储合并结果的下标

            while (left <= middle && right <= end){
                if (temp[left] <= temp[right]){
                    arr[result] = temp[left];
                    left++;
                }else {
                    arr[result] = temp[right];
                    right++;
                }
                result++;
            }
            //4.3有一个部分会先合并完成，另一个部分中剩余的元素肯定比剩余的元素大，将没完成合并的剩余元素直接放到剩余空间中
            if (left <= middle){//左边没完成合并
                while (left <=middle){
                    arr[result++] = temp[left++];
                }
            }
            if (right <=end){//右边没完成合并
                while (right <=end){
                    arr[result++] = temp[right++];
                }
            }
        }else {
            //2、递归出口：end-start = 0,当前范围操作内只有一个元素，天然有序，直接结束就行
            return;
        }
    }
}

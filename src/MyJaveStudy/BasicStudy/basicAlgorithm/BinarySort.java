package src.MyJaveStudy.BasicStudy.basicAlgorithm;
//二分查找
public class BinarySort {
    /**
     * 用循环实现二分查找
     * @param arr 进行搜索的有序数组
     * @param target 能够在arr中找到目标元素返回的下标值，不存在则返回-1
     * */
    public int binarySearch(int[] arr,int target){
        //1、创建三个变量，代表搜索的起点，终点和中间下标
        int start = 0;
        int end = arr.length-1;
        //表达式的自动类型提升
        int middle = (start+end)/2;
        //2、循环的内部使用中值元素进行比较:还没有找到区间中的元素并且区间没有搜索完毕
        //由于while里的条件会导致直接搜索到中间值时返回-1，因此改为do-while
        do {
            //3、重置中值下标（由于每次操作元素位置发生了变化）
            middle = (start + end)/2;

            //2.1 目标元素比中值元素小，保留左侧区间
            if (target < arr[middle]){
                end = middle - 1;//起点不变终点-1
            }
            //2.2 目标元素比中值元素大，保留右侧区间
            if (target > arr[middle]){
                start = middle+1;
            }
            //2.3目标元素和中值元素相等则返回中值元素的下标
            if (target == arr[middle]){
                return middle;
            }
        }while (target !=arr[middle] && start <=end);
        //4、循环退出的时候代表没有找到需要的元素返回-1；
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{12,24,35,47,56,66,78,81,89,90};
        BinarySort bs = new BinarySort();
        int target = 56;
        System.out.println("目标元素：" + target + "，搜索结果：" + bs.binarySearch(arr,target));
    }
}

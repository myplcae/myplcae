package src.MyJaveStudy.BasicStudy.basicAlgorithm.SimpleSort;
//快排

public class QuickSort {
    public static void main(String[] args) {
        //输入一串数字去试试这个方法
        //Scanner in = new Scanner(System.in);
        int[] arr = {7,8,12,22,45,3};
        quickSort(arr,0, arr.length-1);
        //增强for输出
        for (Object o :arr) {
            System.out.print(o + " ");
        }
        //直接输出
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }


    }
    //主要方法
    public static void quickSort(int[] arr,int left,int right){
        //进行判断，左边索引比右边大就直接return
        if (left > right){
            return;
        }
        //定义变量保存基准书
        int base = arr[left];
        //定义变量i，指向最左边和最右边
        int i = left,j = right;
        //当i和j不相同的时候进入while判断
        while (i != j){
            //从右往左检索比基准数小的，检索到比基准数小的就停下，如果检索到比基准数大的或者相等的，就继续
            while (arr[j] >= base && i < j){
                j--;//j从右往左移动
            }
            while (arr[i] <=base && i < j){
                i++;//i从左往右移动
            }
            //i和j停下后交换i和j的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //如果while条件不成立则跳出循环，就交换基准数和相遇位置
        arr[left] = arr[i];
        //把基准数赋值给相遇位置的元素,左边的都比他小右边的都比他大
        arr[i] = base;
        quickSort(arr,left,i-1);//排左边
        quickSort(arr,left+1,right);//排右边
    }
}

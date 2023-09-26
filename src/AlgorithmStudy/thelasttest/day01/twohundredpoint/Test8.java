package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 数组二叉树：
 *  输入一行数组的内容，数组的每个元素都是正整数，元素间用空格分割，第一个元素是根节点的值，数组的第n个元素对应第n个下标值，0不算，树最多可以有7层
 *  输出：从根节点到最小叶子节点的路径上各个节点的值
 * */
public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] arr = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(getleafvalue(arr));
    }

    private static String getleafvalue(Integer[] arr) {
        int n = arr.length - 1;
        //最小叶子节点的值
        int min = Integer.MAX_VALUE;
        //最小叶子的索引
        int minindex = -1;
        //求解最小叶子节点的值和索引
        for (int i = n; i >=1 ; i--) {
            if (arr[i] != -1){
                if (i*2+1 <=n && arr[i*2+1] != -1)
                    continue;
                if (i*2+2 <=n && arr[i*2+2] != -1)
                    continue;
                if (min > arr[i]){
                    min = arr[i];
                    minindex = i;
                }
            }
        }
        //定义路径path
        LinkedList<Integer> path = new LinkedList<>();
        path.addFirst(min);
        //寻找父节点
        while (minindex != 0){
            int f = (minindex -1)/2;
            path.addFirst(arr[f]);
            minindex = f;
        }
        StringJoiner sj = new StringJoiner(" ");
        for (Integer  val: path)
            sj.add(val + "");
        return sj.toString();
    }
}

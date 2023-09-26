package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 描述：给定完全二叉树，找出二叉树中所有的非叶子节点部分，然后遍历输出
 * 输入：一串整数序列的字符串
 * 输出：非叶子部分的树结构
 * */
@SuppressWarnings({"all"})
public class Test7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] arr = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(getLeaf(arr));
    }

    private static String getLeaf(Integer[] arr) {
        if (arr.length == 1)
            return arr[0] + "";
        ArrayList<Integer> res = new ArrayList<>();
        dfs(arr,0,res);
        StringJoiner sj = new StringJoiner(" ");
        for (Integer re :res) {
            sj.add(re + "");
        }
        return sj.toString();
    }

    private static void dfs(Integer[] arr, int root, ArrayList<Integer> res) {
        int left = root*2+1;
        int right = root*2 + 2;
        if (arr.length > left){
            dfs(arr,left,res);
            if (arr.length > right)
                dfs(arr,right,res);
            res.add(arr[root]);
        }
    }
}

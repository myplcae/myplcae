package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day11;

import java.util.*;

/**
 * 现有n种砝码，重量互不相等，分别为 m1,m2,m3…mn
 * 每种砝码对应的数量为 x1,x2,x3...xn 。现在要用这些砝码去称物体的重量(放在同一侧)，问能称出多少种不同的重量。
 * 输入：测试数据
 * 输出：利用给定的砝码可以称出的不同的重量数
 * */
public class HJ41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //砝码种类
        int n = in.nextInt();
        //初始化数组去存砝码重量和数量
        int[] weight = new int[n];
        int[] num = new int[n];
        //开始输入
        for (int i = 0; i < n; i++) {
            weight[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            num[i] = in.nextInt();
        }
        //放到集合
        List<Integer> listfama = new ArrayList<>();
        for (int i = 0; i < weight.length; i++) {
            int j = 0;
            while (j < num[i]){//问题
                j++;
                listfama.add(weight[i]);
            }
        }
        //新建set存放砝码重量
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int i = 0; i < listfama.size(); i++) {
            //临时变量去接收砝码重量
            int tempweight = listfama.get(i);
            //需要一个临时集合
            List<Integer> templist = new ArrayList<>();
            //遍历set
            for (int number : set) {
                templist.add(number + tempweight);
            }
            for (int number : templist) {
                set.add(number);
            }
        }
        System.out.println(set.size());
        in.close();
    }
}

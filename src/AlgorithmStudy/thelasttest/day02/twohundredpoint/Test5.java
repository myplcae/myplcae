package src.AlgorithmStudy.thelasttest.day02.twohundredpoint;

import java.util.*;

/**
 * 最少面试官数：某公司组织一场招聘会，假设由于人数和场地的限制，每次面试的人时长不等，并且已经安排，面试采用一对一方式，为了高效完成招聘请计算需要多少面试官
 * 输入：第一行为面试官人数，第二行为总的面试场次
 * 输出：面试官数量
 * */
public class Test5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        System.out.println(getInterviewer(m,n,arr));
    }

    private static long getInterviewer(int m, int n, int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        ArrayList<LinkedList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new LinkedList<>());
        for (int[] arrs : arr) {
            int s = arrs[0];
            int e = arrs[1];

            for (LinkedList<Integer> list1 : list) {
                //面试官面试次数
                if (list1.size() < m && (list1.size() == 0 || list1.getLast() < s)){
                    list1.add(e);
                    break;
                }
            }

        }
        return list.stream().filter(list1->list1.size() > 0).count();
    }
}

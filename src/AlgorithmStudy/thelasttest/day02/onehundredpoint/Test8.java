package src.AlgorithmStudy.thelasttest.day02.onehundredpoint;

import java.util.*;

/**
 * 找出经过特定点的路径长度
 * 输入：输入一个字符串，都是大写字母组成，每个相邻的距离都是1
 * 输入一个字符串表示必经的点，每个点可以过多次
 * 输出：经过这些必过点的最小距离是多少
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String all = in.next();
        String must = in.next();
        System.out.println(getdistance(all, must));
    }

    private static int getdistance(String all, String must) {
        HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for (char ch : must.toCharArray()) {
            set.add(ch);
        }
        for (int i = 0; i < all.length(); i++) {
            char c = all.charAt(i);
            if (set.contains(c)) {//如果set中包含这个字符则添加进map中
                map.putIfAbsent(c, new ArrayList<>());
                map.get(c).add(i);//添加这个元素的下标
            }
        }
        int[] ans = {Integer.MAX_VALUE};
        dfs(0, must, map, new LinkedList<>(), ans);
        return ans[0];

    }

    private static void dfs(int index, String must, HashMap<Character, ArrayList<Integer>> map, LinkedList<Integer> path, int[] ans) {
        if (path.size() == must.length()) {
            int dis = path.get(0);//起点
            for (int i = 1; i < path.size(); i++) {
                dis += Math.abs(path.get(i) - path.get(i - 1));
            }
            ans[0] = Math.min(ans[0], dis);
            return;
        }
        for (int i = index; i < must.length(); i++) {
            ArrayList<Integer> list = map.get(must.charAt(i));
            for (Integer idx : list) {
                path.add(idx);
                dfs(i + 1, must, map, path, ans);
                path.removeLast();
            }

        }
    }
}

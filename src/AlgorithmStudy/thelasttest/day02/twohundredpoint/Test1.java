package src.AlgorithmStudy.thelasttest.day02.twohundredpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 描述：目录删除
 *  输入描述：输入的第一行为父子关系表的长度m；
 *          接下来的m行为m个父子关系对
 *          最后一行是待删除的ID
 *          序列中的元素用空格分割
 * */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[][] relation = new int[m][2];
        for (int i = 0; i < m; i++) {
            relation[i][0] = in.nextInt();
            relation[i][1] = in.nextInt();
        }
        int del = in.nextInt();
        System.out.println(getdelete(m,relation,del));
    }

    private static String getdelete(int m, int[][] relation, int del) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        //添加值到哈希表里
        for (int[] rel : relation) {
            int child = rel[0];
            int father = rel[1];
            map.putIfAbsent(father,new ArrayList<>());
            map.get(father).add(child);
        }
        if(del == 0){
            return "";
        }
        ArrayList<Integer> res = new ArrayList<>();
        dfs(map,0,del,res);
        res.sort((a,b)->a-b);
        StringJoiner sj = new StringJoiner(" ");
        for (Integer v : res) {
            sj.add(String.valueOf(v));
        }
        return sj.toString();

    }

    private static void dfs(HashMap<Integer, ArrayList<Integer>> map, int node, int del, ArrayList<Integer> res) {
        if (map.containsKey(node)){
            ArrayList<Integer> children = map.get(node);
            for (Integer child : children) {
                if (child != del){
                    res.add(child);
                    dfs(map,child,del,res);
                }
            }

        }
    }
}

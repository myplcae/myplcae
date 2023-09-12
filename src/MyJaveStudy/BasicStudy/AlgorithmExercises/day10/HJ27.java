package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day10;

import java.util.*;

/**
 * 查找兄弟单词
 * 描述：定义一个单词的“兄弟单词”为：交换该单词字母顺序（注：可以交换任意次），而不添加、删除、修改原有的字母就能生成的单词。
 * 兄弟单词要求和原来的单词不同。例如： ab 和 ba 是兄弟单词。 ab 和 ab 则不是兄弟单词。
 * 现在给定你 n 个单词，另外再给你一个单词 x ，让你寻找 x 的兄弟单词里，按字典序排列后的第 k 个单词是什么？
 * 注意：字典中可能有重复单词。
 * 输入：输入只有一行。 先输入字典中单词的个数n，再输入n个单词作为字典单词。 然后输入一个单词x 最后后输入一个整数k
 * 输出：第一行输出查找到x的兄弟单词的个数m 第二行输出查找到的按照字典顺序排序后的第k个兄弟单词，没有符合第k个的话则不用输出。
 * */
public class HJ27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //将接受到的字符串转成数组
        String[] arr = str.split(" ");
        //拿到字典单词个数
        int a = Integer.parseInt(arr[0]);
        //初始化一个list存字典单词
        List<String> list = new ArrayList<>();
        //遍历arr放到list里面
        for (int i = 1; i < a+1; i++) {
            list.add(arr[i]);
        }
        //拿出要比较的单词
        String x = arr[arr.length-2];
        int k = Integer.parseInt(arr[arr.length-1]);
        //遍历list
        //存放兄弟单词
        List<String> dList = new ArrayList<>();
        for (String dstr : list) {
            if (isbrother(x,dstr)){
                dList.add(dstr);
            }
        }
        System.out.println(dList.size());
        if (dList.size() == 0 || k > dList.size()){
            return;
        }
        Collections.sort(dList);
        System.out.println(dList.get(k-1));
    }
    //判断是不是兄弟函数
    public static boolean isbrother(String str1,String str2){
        if ((str1.length() != str2.length()) || (str1.equals(str2))){
            return false;
        }
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i <chars1.length ; i++) {
            if (chars1[i] != chars2[i]){
                return false;
            }
        }
        return true;
    }
}

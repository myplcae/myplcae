package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 输入：单词的初始索引位置
 * 输入：单词的个数
 * 输出：一个字符串表示拼接后的字符串
 * */
public class Test9 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in).useDelimiter("\n");
        int k = in.nextInt();//起始索引位置
        int n = in.nextInt();//单词的个数
        String[] words = new String[n];//最后的结果单词
        //遍历添加进结果单词
        for(int i = 0;i<n;i++)
            words[i] = in.next();//装载单词
        System.out.println(getResult(k,n,words));
    }

    private static String getResult(int k, int n, String[] words) {
        ArrayList<String> chain = new ArrayList<>();//定义一个list去存结果
        chain.add(words[k]);
        words[k] = null;
        HashMap<Character, LinkedList<String>> prefix = new HashMap<>();
        for (String word : words) {
            if (word != null){
                char c = word.charAt(0);
                prefix.putIfAbsent(c,new LinkedList<>());
                prefix.get(c).add(word);
            }
        }
        for (Character c : prefix.keySet()) {
            //比较器比较
            prefix.get(c).sort((a, b) -> a.length()!=b.length()?b.length()-a.length():a.compareTo(b));
        }

        while (true){
            String tail = chain.get(chain.size() - 1);
            char c = tail.charAt(tail.length() - 1);

            if (prefix.containsKey(c)){
                chain.add(prefix.get(c).removeFirst());//删除首字母
            }else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : chain)
            sb.append(s);
        return sb.toString();

    }
}

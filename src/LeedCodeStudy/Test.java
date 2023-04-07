package src.LeedCodeStudy;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String s1 = in.nextLine().toUpperCase();
            String s2 = in.nextLine();
            char[] chars1 = s1.toCharArray();
            char[] chars2 = s1.toCharArray();
            //定义数组
            LinkedHashSet<Character> set = new LinkedHashSet();
            //通过遍历装载参数
            for(int i =0; i< chars1.length;i++){
                set.add(chars1[i]);
            }
            int k = 0;
            while(set.size() < 26){
                char a = (char)('A'+k);
                set.add(a);
                k++;
            }
            ArrayList<Character> list = new ArrayList<>(set);
            StringBuffer sb = new StringBuffer();
            for(int i = 0;i<chars2.length;i++){
                if(chars2[i] == ' '){
                    sb.append(chars2[i]);
                }else if(chars2[i] < 'a'){
                    int n = (int)(chars2[i] - 'A');
                    char c = list.get(n);
                    sb.append(c);
                }else{
                    int n = (int)(chars2[i] - 'a');
                    char c = (char)(list.get(n) + 'a' - 'A');
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
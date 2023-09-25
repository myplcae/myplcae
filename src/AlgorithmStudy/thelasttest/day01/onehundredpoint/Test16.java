package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 输入描述：第一行一个字符串，只包含大写字母
 *          第二行为k的值
 * 输出描述：连续出现第k多的字母的次数，如果无解则输出-1
 * */
public class Test16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int a = in.nextInt();
        System.out.println(getNum(str,a));
    }

    private static int getNum(String str, int a) {
        str += "0";
        HashMap<Character, Integer> count = new HashMap<>();
        char b = str.charAt(0);
        int len = 1;
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (b==c){
                len++;
            }else {
                if (!count.containsKey(b) || count.get(b) < len){
                    count.put(b,len);
                }
                len = 1;
                b = c;
            }
        }
        Integer[] arr = count.values().toArray(new Integer[0]);
        if (a > arr.length)
            return -1;
        else {
            Arrays.sort(arr,(x,y)->y-x);//也是Arrays.sort的方法排序
            return arr[a-1];
        }
    }
}

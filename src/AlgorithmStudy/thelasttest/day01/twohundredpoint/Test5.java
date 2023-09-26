package src.AlgorithmStudy.thelasttest.day01.twohundredpoint;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 数据分类
 * 输入描述：输入12个数据，空格分割，第一个数据为c，剩余10个是需要分类的数据
 *  输出描述：输出最多数据的有效类型有多少个数据
 * */
public class Test5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int c = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = in.nextInt();
        System.out.println(getEffectiveNum(c,d,arr));
    }

    private static int getEffectiveNum(int c, int d, int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        Arrays.stream(arr).map(a->{
            String str = Integer.toHexString(a);
            if (str.length()%2 !=0){
                str = "0" + str;
            }
            int sum = 0;
            for (int i = 0; i < str.length()-1; i+=2) {
                sum += Integer.parseInt(str.substring(i,i+2),16);//
            }
            int t = sum%d;
            if (t < c) {
                return t;
            }else {
                return -1;
            }
        }).forEach(t->{
            if (t != -1){
                count.put(t,count.getOrDefault(t,0) + 1);
            }
        });
        return count.values().stream().max((x,y)->x-y).orElse(0);
    }
}

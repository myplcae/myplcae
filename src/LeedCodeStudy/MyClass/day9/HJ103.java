package src.LeedCodeStudy.MyClass.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Redraiment是走梅花桩的高手。Redraiment可以选择任意一个起点，从前到后，但只能从低处往高处的桩子走。他希望走的步数最多，你能替Redraiment研究他最多走的步数吗？
 * 输入：数据共2行，第1行先输入数组的个数，第2行再输入梅花桩的高度
 * 输出：输出一个结果
 * */
public class HJ103 {

    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int[] arr = new int[a];
            for(int i = 0;i<a;i++){
                int val = in.nextInt();
                arr[i] = val;
            }
            getMaxLength(arr);
        }
        for(int i = 0;i< list.size();i++){
            System.out.println(list.get(i));
        }
    }

    private static void getMaxLength(int[] arr) {

        int[] ins = new int[arr.length-1];
        ins[0] = arr[0];
        int xx = 0;
        for(int i = 1;i<arr.length;i++){
            int val = arr[i];
            if(ins[xx] < val){
                xx++;
                ins[xx] = val;
            }else if(ins[xx] > val){
                for(int j = 0;j<= xx;j++){
                    if(ins[j] >= val){
                        ins[j] = val;
                        break;
                    }
                }
            }
        }
        list.add(xx+1);
    }
}

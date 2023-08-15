package src.LeedCodeStudy.MyClass.day7;

import java.util.*;

/**
 * 给定一个正整数N代表火车数量，0<N<10，接下来输入火车入站的序列，一共N辆火车，每辆火车以数字1-9编号，火车站只有一个方向进出，同时停靠在火车站的列车中，只有后进站的出站了，
 * 先进站的才能出站。
 * 要求输出所有火车出站的方案，以字典序排序输出。
 * 输入：第一行输入一个正整数N（0 < N <= 10），第二行包括N个正整数，范围为1到10。
 * 输出：输出以字典序从小到大排序的火车出站序列号，每个编号以空格隔开，每个输出序列换行
 * */
public class HJ77 {

    //用来封装结果的参数result
    static List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        //输入
        Scanner in= new Scanner(System.in);
        while (in.hasNext()){
            result.clear();
            //定义输入的参数
            int a = in.nextInt();//代表有火车数量
            int[] b = new int[a];//代表进出站人数
            //定义一个栈来存储进出站人数和排序
            Stack<Integer> stack = new Stack<>();
            //遍历输入进出站人数并且添加进栈
            for (int i = 0; i < a; i++) {
                b[i] = in.nextInt();
            }
            //用来计算结果的方法pitted,一共有五个参数：进出站人数b,顺序位i，栈stack，空格符号str，序号n
            pitted(b,0,stack,"",0);
            //对结果进行排序
            Collections.sort(result);
            for (String str:result){
                System.out.println(str);
            }
        }
        in.close();
    }
    //计算方法pitted
    private static void pitted(int[] b, int i, Stack<Integer> stack, String str, int n) {
        //1、如果货车均出栈则保存结果
        if (n == b.length){
            result.add(str);
        }
        //2、栈非空出栈的情况，序号加1
        if (!stack.empty()){
            int m = stack.pop();
            pitted(b,i,stack,str+m+" ",n+1);
            stack.push(m);
        }
        //3、如果序号小于进出站人数恢复栈
        if (i<b.length){
            stack.push(b[i]);
            pitted(b,i+1,stack,str,n);
            stack.pop();
        }
    }
}

package src.LeedCodeStudy.MyClass.day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 给出4个1-10的数字，通过加减乘除运算，得到数字为24就算胜利,除法指实数除法运算,
 * 运算符仅允许出现在两个数字之间,本题对数字选取顺序无要求，但每个数字仅允许使用一次，且需考虑括号运算
 * 允许数字重复，如3 3 4 4为合法输入，此输入一共有两个3，但是每个数字只允许使用一次，则运算过程中两个3都被选取并进行对应的计算操作。
 * 输入:读入4个[1,10]的整数，数字允许重复，测试用例保证无异常数字
 * 输出：对于每组案例，输出一行表示能否得到24点，能输出true，不能输出false
 * */
public class HJ67 {
    private static int[] arr;//用于接收传入的4个整数
    private static int[] visit;//用于判断对应序号的整数有没有被使用。


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            arr = new int[4];
            visit = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(get24(0, 0));
        }
    }

    private static boolean get24(int cnt, int tmpres) {
        //第一种4个4,直接就是成功
        if (cnt == 4 && tmpres == 4) {
            return true;
        }
        //还没开始运算的情况
        if (cnt == 0) {
            //对于还没开始运算的情况，接收的第一个数值直接作为tmpres
            for (int i = 0; i < 4; i++) {
                visit[i] = 1;
                if (get24(1, arr[i])) {
                    return true;
                }
                visit[i] = 0;//每一轮循环都要把访问记录恢复
            }
            //所有数字都没整出来24，说明挣不出来
            return false;
        }
        if(cnt == 2){
            //对于已经在两个数值参加运算的情况，要考虑两种可能
            //1、另两个数字参加运算后再和当前结果运算
            int a = 0,b=0;//剩下两个数字取到a,b中
            for(int i = 0;i<4;i++){
                if(visit[i] ==0){
                    if(a==0){
                        a = arr[i];
                    }else{
                        b= arr[i];
                    }
                }
            }
            //对所有可能的ab运算结果进行判断
            for(double n:getAnyRes(a,b)){
                for(double m:getAnyRes(tmpres,n)){
                    if(m==24){
                        return true;
                    }
                }
            }
            //2、当前结果与第三个数值参加运算
            for(int i = 0;i<4;i++){
                if(visit[i]==0){
                    visit[i] = 1;
                    //加和乘
                    if(get24(3,tmpres+arr[i]) || get24(3,tmpres*arr[i])||
                            get24(3,tmpres-arr[i])||get24(3,arr[i]-tmpres)){
                        return true;
                    }
                    if(tmpres !=0 && get24(3,arr[i]/tmpres)||arr[i]!=0 && get24(3,tmpres/arr[i])){
                        return true;
                    }
                    visit[i] = 0;
                }
            }
            return false;
        }
        if(cnt ==1 || cnt ==3){
            for(int i = 0;i<4;i++){
                if(visit[i] == 0){
                    visit[i] = 1;
                    if(get24(cnt+1,tmpres+arr[i])||get24(cnt+1,tmpres*arr[i])||//加和乘计算
                            get24(cnt+1,tmpres-arr[i])||get24(cnt+1,arr[i]-tmpres)){//减法计算
                        return true;
                    }
                    if(tmpres!=0 && get24(cnt+1,arr[i]/tmpres)||
                            arr[i]!=0 && get24(cnt+1,tmpres/arr[i])){//除法计算
                        return true;
                    }
                    visit[i]=0;
                }
            }
        }
        return false;
    }

    private static List<Double> getAnyRes(double a, double b) {
        List<Double> res = new ArrayList<Double>();
        res.add(a+b);
        res.add(a*b);
        res.add(a-b);
        res.add(b-a);
        if(a!=0){
            res.add(b/a);
        }
        if(b!=0){
            res.add(a/b);
        }
        return res;
    }
}

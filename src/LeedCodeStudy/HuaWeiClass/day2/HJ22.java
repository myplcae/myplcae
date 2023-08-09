package src.LeedCodeStudy.HuaWeiClass.day2;

import java.util.Scanner;

/**
 * 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶,小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
 * 输入：输入文件最多包含 10 组测试数据，每个数据占一行，仅包含一个正整数 n（ 1<=n<=100 ），表示小张手上的空汽水瓶数。
 * n=0 表示输入结束，你的程序不应当处理这一行。
 * 输出：对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。如果一瓶也喝不到，输出0。
 * */
public class HJ22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //如果输入的是0，则直接退出
        while (in.hasNext()){
            //定义瓶子
            int num = in.nextInt();
            if (num == 0){
                break;
            }else {
                //定义方法计算瓶子
                countPinzi(num,0);
            }
        }
    }

    private static void countPinzi(int num, int count) {
        int chuShu = num / 3;
        int yuShu = num % 3;
        //这么什么好说的，应该都看得懂
        count = count + chuShu;
        num = chuShu + yuShu;
        //如果除数加余数是1，则借不了汽水，因为喝了你也还不了
        if (num == 1) {
            System.out.println(count);
            return;
        }
        //如果余数加除数是2或者3，那么你可以直接换汽水，或者借一瓶汽水，喝完再还
        if (num == 2 || num == 3) {
            count++;
            System.out.println(count);
            //如果以上情况都不是，接着递归
        } else {
            countPinzi(num, count);
        }
    }
}

package src.LeedCodeStudy.MyClass.day5;

import java.util.Scanner;

/**
 * MP3 Player因为屏幕较小，显示歌曲列表的时候每屏只能显示几首歌曲，用户要通过上下键才能浏览所有的歌曲。为了简化处理，假设每屏只能显示4首歌曲，光标初始的位置为第1首歌。
 * 现在要实现通过上下键控制光标移动来浏览歌曲列表，控制逻辑如下：
 * 歌曲总数<=4的时候，不需要翻页，只是挪动光标位置。
 * 光标在第一首歌曲上时，按Up键光标挪到最后一首歌曲；光标在最后一首歌曲时，按Down键光标挪到第一首歌曲。
 * 输入：1 输入歌曲数量
 *      2 输入命令 U或者D
 * 输出：1 输出当前列表
 *      2 输出当前选中歌曲
 * */
public class HJ64 {
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int a = in.nextInt();
            String str = in.next();
            //定义一个方法用来输出结果
            getFinalesult(str,a);
        }
    }

    private static void getFinalesult(String str, int a) {
        //首先需要定义部分需要的参数：起始位置、光标
        int start = 1;//开始
        int end = Math.min(a,4);//结束
        int cursor = 1;//光标
        //开始遍历计算
        for (int i = 0; i < str.length(); i++) {
            //定义U和D的运动方式
            if (str.charAt(i) == 'U') {
                cursor = (cursor - 1 - 1 + a) % a + 1;
            } else if (str.charAt(i) == 'D') {
                cursor = cursor % a + 1;
            }

            //判断窗口位置是否需要改变
            if (cursor < start) {
                start = cursor;
                end = start + 3;
            } else if (cursor > end) {
                end = cursor;
                start = end - 3;
            }
        }
        //遍历输出最后的那一串数
        for (int i = start; i <= end; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        //光标位置
        System.out.println(cursor);
    }
}

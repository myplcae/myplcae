package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day11;

import java.util.Scanner;
import java.util.Stack;

/**
 * 定义一个二维数组 N*M ，它表示一个迷宫，其中的1表示墙壁，0表示可以走的路，只能横着走或竖着走，不能斜着走，要求编程序找出从左上角到右下角的路线。
 * 入口点为[0,0],既第一格是可以走的路。
 * 输入：输入两个整数，分别表示二维数组的行数，列数。再输入相应的数组，其中的1表示墙壁，0表示可以走的路。数据保证有唯一解,不考虑有多解的情况，即迷宫只有一条通道。
 * 输出：左上角到右下角的最短路径
 * */
public class HJ43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            //数组的总行数
            int a = in.nextInt();
            //数组的总列数
            int b = in.nextInt();
            //初始化迷宫
            int[][] arr = new int[a][b];
            //装载参数
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            Stack<String> stack = new Stack<>();
            getWay(arr,0,0,a,b,stack);
            while (!stack.isEmpty()){
                System.out.println(stack.pop());
            }
            //这样输出会有一个问题就是提交代码的用例不通过因为跟代码默认的路线走法不相同，因此这里使用stack输出
//            for (int i = 0; i < a; i++) {
//                for (int j = 0; j < b; j++) {
//                    if (arr[i][j] == 2){
//                        System.out.println("(" + i + "," + j + ")");
//                    }
//                }
//            }

        }
    }
    //走迷宫的方法
    public static boolean getWay(int[][] arr,int i,int j,int a,int b,Stack<String> stack){
        if (arr[a-1][b-1] == 2){
            return true;
        }else {
            //判断arr[i][j]是不是等于0，如果等于0说明没有走过
            if (arr[i][j] == 0){
                //先假定可以走通
                arr[i][j] = 2;
                //往上走
                if (i - 1 >= 0 && getWay(arr,i-1,j,a,b,stack)){
                    stack.push("(" + i + "," + j + ")");
                    return true;
                    //往右走
                } else if (j + 1 < b && getWay(arr,i,j+1,a,b,stack)) {
                    stack.push("(" + i + "," + j + ")");
                    return true;
                    //往下走
                } else if (i + 1< a && getWay(arr,i+1,j,a,b,stack)) {
                    stack.push("(" + i + "," + j + ")");
                    return true;
                    //往左走
                } else if (j - 1 < b && getWay(arr,i,j-1,a,b,stack)) {
                    stack.push("(" + i + "," + j + ")");
                    return true;
                }else {
                    arr[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }
}

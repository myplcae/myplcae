package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day13;

import java.util.Scanner;

/**
 * 24点游戏
 * */
public class HJ67 {
    static int[] nums = new int[4];
    static boolean[] visit = new boolean[4];
    static int flag = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //多组输入
        while (in.hasNext()){
            String[] arr = in.nextLine().split(" ");//空格分割
            //遍历插值
            for (int i = 0; i < 4; i++)
                //这里需要先定义一个长度为4的数组，因为要把输入的值插入这个数组
                nums[i] = Integer.parseInt(arr[i]);
            dfs(0,0);//用来判断能不能凑成24点的方法
            System.out.println(flag == 1);
        }
    }

     static boolean dfs(int u, float temp) {//这里除法会有小数，因此用float
        //终止条件为输入的四个参数能够计算得到24
        if (temp == 24 && u ==4 ){
            flag = 1;
            return true;
        }
        //遍历去计算24点
//        for (int j = 0; j < 4; j++) {
//            if (visit[j] == false){
//                visit[j] = true;
//                //加减乘除这些数字
//                if (dfs(i + 1,temp + num[i]) || dfs(i+1,temp - num[i]) || dfs(i+1,temp*num[i])||dfs(i+1,temp/num[i])){
//                    return true;
//                }
//                visit[i] = false;
//            }
//        }
         for(int i = 0; i < 4; i ++){
             if(visit[i] == false){
                 visit[i] = true;
                 // 加减乘除当前数字num[i]
                 if( dfs(u + 1, temp + nums[i]) ||
                         dfs(u + 1, temp - nums[i])  ||
                         dfs(u + 1,temp * nums[i]) ||
                         dfs(u + 1, temp / nums[i])){
                     return true;
                 }
                 // 相当于回溯
                 visit[i] = false;
             }
         }
        return false;
    }
}

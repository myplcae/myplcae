package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day1;

import java.util.Scanner;

/**
 * 输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）
 * 输入：正整数
 * 输出：改输入的每个质数
 * 思路：质数的定义
 * */
public class HJ6 {
      //测试用例不能全部通过
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        long x = in.nextLong();
//        //遍历去求这个整数的质数
//        for (int i = 2;i< x;i++){
//            while (x%i == 0){
//                System.out.print(i+" ");
//                x/= i;
//            }
//        }
//        System.out.println(x == 1?"":x+" ");
//    }
    //改进，直接用string去接收输入的参数，不用原来的long
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          String str = in.nextLine();
          // 注意 hasNext 和 hasNextLine 的区别
          int num = Integer.parseInt(str);
          StringBuilder sb = new StringBuilder();
          for (int i = 2; i <= Math.sqrt(num); i++) {
              if (num % i == 0) {
                  sb.append(i).append(" ");
                  num = num / i;
                  i--;
              }
          }
          sb.append(num).append(" ");
          System.out.println(sb.append(" "));
      }
}

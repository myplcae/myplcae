package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day13;

import java.util.Scanner;
import java.util.Stack;

/**
 * 描述：矩阵乘法的运算量与矩阵乘法的顺序强相关。
 *   例如：A是一个50×10的矩阵，B是10×20的矩阵，C是20×5的矩阵
 *       计算A*B*C有两种顺序：((AB)C)或者(A(BC))，前者需要计算15000次乘法，后者只需要3500次。
 *       编写程序计算不同的计算顺序需要进行的乘法次数。
 * 输入：输入多行，先输入要计算乘法的矩阵个数n，每个矩阵的行数，列数，总共2n的数，最后输入要计算的法则
 *      计算的法则为一个字符串，仅由左右括号和大写字母（'A'~'Z'）组成，保证括号是匹配的且输入合法！
 * 输出：输出需要进行的乘法次数
 * */
public class HJ70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//矩阵的个数
        int[][] arr = new int[a][2];
        for (int i = 0; i < a; i++) {
            arr[i][0] = in.nextInt();//矩阵的行数
            arr[i][1] = in.nextInt();//矩阵的列数
        }
        String s = in.next();//输入的乘法顺序规则
        Stack<Integer> stack = new Stack<>();//把输入的矩阵存到栈中
        //定义常量
        int sum = 0;
        //遍历入栈计算
        for (int i = s.length()-1,j = a-1; i >=0 ; i--) {
            //如果是字母就把相应的行数和列数入栈
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                stack.push(arr[j][1]);
                stack.push(arr[j][0]);
                j--;
            } else if (s.charAt(i) == '(') {// 括号：推出计算
                int x0 = stack.pop(),y0 = stack.pop();//矩阵尺寸x0*y0
                int x1 = stack.pop(),y1 = stack.pop();// 矩阵尺寸x1*y1
                sum += x0*y0*y1;// 两个矩阵的乘法次数为x0*y0*y1或x0*x1*y1（其中y0==x1）
                stack.push(y1);// 把相乘后得到的矩阵列数入栈
                stack.push(x0);// 把相乘后得到的矩阵行数入栈
            }
        }
        System.out.println(sum);
    }
}

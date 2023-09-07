package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day5;

import java.util.Scanner;
import java.util.Stack;

/**
 * 矩阵乘法的运算量与矩阵乘法的顺序强相关。
 * A是一个50×10的矩阵，B是10×20的矩阵，C是20×5的矩阵
 * 计算A*B*C有两种顺序：((AB)C)或者(A(BC))，前者需要计算15000次乘法，后者只需要3500次。
 * 编写程序计算不同的计算顺序需要进行的乘法次数。
 * 输入：输入多行，先输入要计算乘法的矩阵个数n，每个矩阵的行数，列数，总共2n的数，最后输入要计算的法则
 *      计算的法则为一个字符串，仅由左右括号和大写字母（'A'~'Z'）组成，保证括号是匹配的且输入合法！
 *输出：输出需要进行的乘法次数
 * */
public class HJ70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String ll = in.nextLine();
            int n = Integer.parseInt(ll);
            int[][] juzhen = new int[n][2];
            for (int i = 0; i < n; i++) {
                String[] temp = in.nextLine().split(" ");
                juzhen[i][0] = Integer.parseInt(temp[0]);
                juzhen[i][1] = Integer.parseInt(temp[1]);
            }
            String faze = in.nextLine();

            System.out.println(function(juzhen, faze));
        }
    }
    public static int function(int[][] juzhen, String yusuan) {
        int result = 0;
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < yusuan.length(); i++) {
            if (yusuan.charAt(i) == '(') {

            } else if (yusuan.charAt(i) == ')') {
                int[] lastjuzhen = stack.pop();
                int[] nearjuzhen = stack.pop();
                result = result + lastjuzhen[0] * lastjuzhen[1] * nearjuzhen[0];
                stack.push(new int[] {nearjuzhen[0], lastjuzhen[1]});

            } else {
                stack.push(juzhen[yusuan.charAt(i) - 'A']);
            }
        }
        return result;
    }
}

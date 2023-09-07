package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 计票统计:请实现一个计票统计系统。你会收到很多投票，其中有合法的也有不合法的，请统计每个候选人得票的数量以及不合法的票数。
 * 输入：第一行输入候选人的人数n，第二行输入n个候选人的名字（均为大写字母的字符串），第三行输入投票人的人数，第四行输入投票。
 * 输出：按照输入的顺序，每行输出候选人的名字和得票数量（以" : "隔开，注：英文冒号左右两边都有一个空格！），最后一行输出不合法的票数，格式为"Invalid : "+不合法的票数。
 * */
public class HJ94 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            //定义一些参数先
            int numA = in.nextInt();//候选人数
            in.nextLine();//换行
            String[] arrA = in.nextLine().split(" ");//候选人名称
            int numB = in.nextInt();//投票人数
            in.nextLine();//换行
            String[] arrB = in.nextLine().split(" ");//投票数
            //定义map装载参数
            Map<String,Integer> map = new HashMap<>();
            //定义非法票数
            int Invalid = 0;
            //定义stringbuild用来封装结果集
            StringBuilder result = new StringBuilder();
            //开始遍历
            for (int i = 0; i < numA; i++) {
                map.put(arrA[i],0);
            }
            //计数
            for (int i = 0; i < numB; i++) {
                if (!map.containsKey(arrB[i])){
                    Invalid++;
                }else {
                    Integer num = map.get(arrB[i]);
                    map.put(arrB[i],num+1);
                    }
                }
            //遍历输出结果
            for (String s : arrA){
                result.append(s);
                result.append(" : ");
                result.append(map.get(s));
                result.append("\n");//换行
            }
            result.append("Invalid : ");
            result.append(Invalid);
            System.out.println(result);

        }
    }
}

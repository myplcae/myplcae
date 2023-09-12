package src.MyJaveStudy.BasicStudy.AlgorithmExercises.day10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
@SuppressWarnings({"all"})
public class HJ17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /**
         * 初始化初始横坐标：abscissa；
         *         纵坐标：ordinate
         * */
        int abscissa = 0;
        int ordinate = 0;
        //接受字符串
        String str = in.nextLine();
        //分割字符串
        String[] arrs = str.split(";");
        //初始化一个合法字符串集合封装合法
        List<Character> list = Arrays.asList('A','W','S','D');
        //判断是不是符合规范
        for (String astr : arrs) {
            if (astr == null || astr.length() <2 || astr.length() >3){
                continue;
            }
            Character a = astr.charAt(0);
            if (!list.contains(a)){
                continue;
            }
            int b = 0;
            try {
                b = Integer.parseInt(astr.substring(1));
            }catch (Exception e){
                continue;
            }
            switch (a){
                case 'A':abscissa -= b;
                break;
                case 'D':abscissa += b;
                break;
                case 'S':ordinate -= b;
                break;
                case 'W':ordinate += b;
                break;
            }
        }
        System.out.println(abscissa+"，" +ordinate);
    }
}

package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.Scanner;

/**
 * 输入描述：字符串：表示记录仪中的数据
 * 输出描述：字符串，表示最远足迹到达的坐标
 * */
public class Test20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getmostfar(in.nextLine()));
    }

    private static String getmostfar(String s) {
        //定义常量
        int maxfar = 0;
        String ans = "(0,0)";//结果常量
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                l = i+1;
            } else if (c== ')') {
                String[] pos = s.substring(l,i).split(",");
                if (pos[0].charAt(0) == '0' || pos[1].charAt(0) == '0')
                    continue;
                int x = Integer.parseInt(pos[0]);
                int y = Integer.parseInt(pos[1]);
                if (x <= 0|| x>=1000 || y<0 || y>= 1000)
                    continue;
                int far = x*x + y*y;
                if (far > maxfar){
                    maxfar = far;
                    ans = "(" + x + "," + y + ")";
                }
            }
        }
        return ans;
    }
}

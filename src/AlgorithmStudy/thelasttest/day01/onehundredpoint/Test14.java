package src.AlgorithmStudy.thelasttest.day01.onehundredpoint;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

/**
 * 输入：第一行：表示待解码的信源tag
 *      第二行：表示待解码的16进制码流，信源组成为：tag+len+value
 * */
public class Test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String target = in.nextLine();
        String[] stream = in.nextLine().split(" ");
        System.out.println(getval(stream,target));
    }

    private static String getval(String[] stream, String target) {
        int i = 0;//初始化蚕食
        while (i < stream.length){
            String tag = stream[i++];
            //定义两个临时变量去获取要解码的字符串
            String tmp1 = stream[i++];
            String tmp2 = stream[i++];
            int len = Integer.parseInt(tmp2+tmp1,16);//转二进制
            ArrayList<String> val = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                val.add(stream[i++]);
            }
            if (tag.equals(target)){
                StringJoiner sj = new StringJoiner(" ");
                for (String s:val)
                    sj.add(s);
                return sj.toString();
            }
        }
        return null;
    }
}
